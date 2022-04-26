package io.github.socraticphoenix.matrix.workflow.impl;

import io.github.socraticphoenix.matrix.DimensionMismatchException;
import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.workflow.InitialWorkflow;
import io.github.socraticphoenix.matrix.workflow.TransformWork;

import java.lang.reflect.Array;

public class SliceWorkflow implements InitialWorkflow<TransformWork> {

    public TransformWork apply(TransformWork work, boolean inPlace, IntVector start, IntVector end) {
        if (start.size() > work.shape().size() || end.size() > work.shape().size()) {
            throw new IllegalArgumentException("Start and end points must have size less than or equal to shape");
        }

        start = start.concat(IntVector.zeroes(work.shape().size() - start.size()));
        end = end.concat(work.shape().slice(end.size(), work.shape().size()));

        IntVector shape = end.subtract(start);

        if (shape.stream().anyMatch(i -> i < 0)) {
            throw new DimensionMismatchException("Starting point " + start + " must be less than ending point " + end);
        }

        if (work.shape().subtract(shape).stream().anyMatch(i -> i < 0)) {
            throw new DimensionMismatchException("Ending point " + end + " or starting point " + start + " not in shape " + work.shape());
        }
        Object res = slice(NArray.createArray(shape, work.component()), work.array(), start, shape, inPlace);
        return new TransformWork(res, shape, work.component());
    }

    private Object slice(Object res, Object array, IntVector start, IntVector shape, boolean inPlace) {
        if (shape.size() == 1) {
            if (inPlace && start.get(0) == 0 && shape.get(0) == Array.getLength(array)) {
                return array;
            } else {
                System.arraycopy(array, start.get(0), res, 0, shape.get(0));
            }
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                Object sub = Array.get(array, i + start.get(0));
                Array.set(res, i, slice(Array.get(res, i), sub,
                        start.slice(1, start.size()),
                        shape.slice(1, shape.size()), inPlace));
            }
        }
        return res;
    }

    @Override
    public TransformWork apply(TransformWork work, boolean inPlace, Object... args) {
        return apply(work, inPlace,
                arg(args, 0, IntVector.class, "start"),
                arg(args, 1, IntVector.class, "end"));
    }

}
