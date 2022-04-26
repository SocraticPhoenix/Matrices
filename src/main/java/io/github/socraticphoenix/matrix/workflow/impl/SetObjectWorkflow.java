package io.github.socraticphoenix.matrix.workflow.impl;

import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.workflow.TransformWork;
import io.github.socraticphoenix.matrix.workflow.Workflow;

import java.lang.reflect.Array;

public class SetObjectWorkflow implements Workflow<TransformWork> {

    public TransformWork apply(TransformWork work, IntVector point, Object value) {
        Object array = work.array();
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }

        if (value != null && value.getClass().isArray()) {
            IntVector shape = work.shape().slice(point.size(), work.shape().size());
            CopyWorkflow.deepCopy(value, array, shape);
            return work;
        } else {
            Array.set(array, point.get(point.size() - 1), value);
        }
        return work;
    }

    @Override
    public TransformWork apply(TransformWork work, boolean inPlace, Object... args) {
        return apply(work, arg(args, 0, IntVector.class, "point"),
                            arg(args, 1, Object.class, "value"));
    }

}
