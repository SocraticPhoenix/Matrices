package io.github.socraticphoenix.matrix.workflow.impl;

import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.workflow.InitialWorkflow;
import io.github.socraticphoenix.matrix.workflow.TransformWork;
import io.github.socraticphoenix.matrix.workflow.Workflow;

import java.lang.reflect.Array;

public class GetObjectWorkflow implements InitialWorkflow<Object> {

    public Object apply(TransformWork work, IntVector point) {
        Object array = work.array();
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }

        Object result = Array.get(array, point.get(point.size() - 1));
        if (result != null && result.getClass().isArray()) {
            IntVector shape = work.shape().slice(point.size(), work.shape().size());
            Object copy = NArray.createArray(shape, work.component());
            CopyWorkflow.deepCopy(result, copy, shape);
            return copy;
        }
        return result;
    }

    @Override
    public Object apply(TransformWork work, boolean inPlace, Object... args) {
        return apply(work, arg(args, 0, IntVector.class, "point"));
    }

}
