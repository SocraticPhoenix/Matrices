package io.github.socraticphoenix.matrix.workflow;

import java.util.function.BiFunction;

public interface InitialWorkflow<T> extends Workflow<T> {

    @Override
    default <K> InitialWorkflow<K> andThen(Workflow<K> workflow, Object... nextArgs) {
        return andThen(workflow, (a, w) -> nextArgs);
    }

    @Override
    default <K> InitialWorkflow<K> andThen(Workflow<K> workflow, BiFunction<Object[], T, Object[]> nextArgs) {
        return (work, plc, args) -> {
            T res = apply(work, plc, args);
            if (res instanceof TransformWork trn) {
                return workflow.apply(trn, true, nextArgs.apply(args, res));
            } else {
                return workflow.apply(work, true, nextArgs.apply(args, res));
            }
        };
    }

}
