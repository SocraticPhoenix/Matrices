package io.github.socraticphoenix.matrix.workflow.impl;

import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.workflow.InitialWorkflow;
import io.github.socraticphoenix.matrix.workflow.TransformWork;

import java.lang.reflect.Array;

public class CopyWorkflow implements InitialWorkflow<TransformWork> {

    @Override
    public TransformWork apply(TransformWork work, boolean inPlace, Object... args) {
        if (inPlace) {
            return work;
        } else {
            Object res = NArray.createArray(work.shape(), work.component());
            deepCopy(work.array(), res, work.shape());
            return new TransformWork(res, work.shape(), work.component());
        }
    }

    public static void deepCopy(Object src, Object res, IntVector shape) {
        if (shape.size() == 1) {
            System.arraycopy(src, 0, res, 0, shape.get(0));
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                deepCopy(Array.get(src, i), Array.get(res, i), shape.slice(1, shape.size()));
            }
        }
    }
}
