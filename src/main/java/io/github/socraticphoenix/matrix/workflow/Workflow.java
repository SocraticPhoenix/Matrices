package io.github.socraticphoenix.matrix.workflow;

import io.github.socraticphoenix.matrix.NArray;

import java.util.function.BiFunction;

public interface Workflow<T> {

    T apply(TransformWork work, boolean inPlace, Object... args);

    default <K> Workflow<K> andThen(Workflow<K> workflow, Object... nextArgs) {
        return andThen(workflow, (a, w) -> nextArgs);
    }

    default <K> Workflow<K> andThen(Workflow<K> workflow, BiFunction<Object[], T, Object[]> nextArgs) {
        return (work, plc, args) -> {
            T res = apply(work, plc, args);
            if (res instanceof TransformWork trn) {
                return workflow.apply(trn, true, nextArgs.apply(args, res));
            } else {
                return workflow.apply(work, true, nextArgs.apply(args, res));
            }
        };
    }

    default  <T> T arg(Object[] args, int index, Class<T> type, String name, Object... def) {
        if (args.length <= index) {
            if (def.length != 0) {
                return (T) def[0];
            }
            throw new IllegalArgumentException("Missing argument " + name + " at index " + index + " of type " + type);
        } else {
            Object target = args[index];
            if (target == null) {
                return (T) NArray.getDefault(type);
            }

            if (!type.isInstance(target)) {
                throw new IllegalArgumentException("Expected argument " + name + " at index " + index + " to be of type " + type + " but it was " + target.getClass());
            }

            return (T) target;
        }
    }

}
