package io.github.socraticphoenix.matrix.workflow.impl.get;

import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.workflow.InitialWorkflow;
import io.github.socraticphoenix.matrix.workflow.TransformWork;
import io.github.socraticphoenix.matrix.workflow.impl.CopyWorkflow;

import java.lang.reflect.Array;

public class GetIntWorkflow implements InitialWorkflow<Integer> {

    public int apply(TransformWork work, IntVector point) {
        Object array = work.array();
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }

        return ((int[]) array)[point.get(point.size() - 1)];
    }

    @Override
    public Integer apply(TransformWork work, boolean inPlace, Object... args) {
        return apply(work, arg(args, 0, IntVector.class, "point"));
    }

}
