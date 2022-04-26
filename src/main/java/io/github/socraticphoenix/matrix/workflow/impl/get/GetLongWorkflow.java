package io.github.socraticphoenix.matrix.workflow.impl.get;

import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.workflow.TransformWork;
import io.github.socraticphoenix.matrix.workflow.Workflow;

import java.lang.reflect.Array;

public class GetLongWorkflow implements Workflow<Long> {

    public long apply(TransformWork work, IntVector point) {
        Object array = work.array();
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }

        return ((long[]) array)[point.get(point.size() - 1)];
    }

    @Override
    public Long apply(TransformWork work, boolean inPlace, Object... args) {
        return apply(work, arg(args, 0, IntVector.class, "point"));
    }

}
