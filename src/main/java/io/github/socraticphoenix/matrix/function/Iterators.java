package io.github.socraticphoenix.matrix.function;

import java.util.Iterator;
import java.util.function.Consumer;

public interface Iterators {

    interface Boolean extends Iterator<java.lang.Boolean> {
        boolean nextPrim();

        default void forEachRemaining(FromBoolean.ToVoid action) {
            while (hasNext()) {
                action.apply(nextPrim());
            }
        }

        @Override
        default void forEachRemaining(Consumer<? super java.lang.Boolean> action) {
            if (action instanceof FromBoolean.ToVoid primAction) {
                forEachRemaining(primAction);
            } else {
                forEachRemaining((FromBoolean.ToVoid) action::accept);
            }
        }

        @Override
        default java.lang.Boolean next() { return nextPrim(); }
    }

    interface Byte extends Iterator<java.lang.Byte> {
        byte nextPrim();

        default void forEachRemaining(FromByte.ToVoid action) {
            while (hasNext()) {
                action.apply(nextPrim());
            }
        }

        @Override
        default void forEachRemaining(Consumer<? super java.lang.Byte> action) {
            if (action instanceof FromByte.ToVoid primAction) {
                forEachRemaining(primAction);
            } else {
                forEachRemaining((FromByte.ToVoid) action::accept);
            }
        }

        @Override
        default java.lang.Byte next() { return nextPrim(); }
    }
    
    interface Short extends Iterator<java.lang.Short> {
        short nextPrim();

        default void forEachRemaining(FromShort.ToVoid action) {
            while (hasNext()) {
                action.apply(nextPrim());
            }
        }

        @Override
        default void forEachRemaining(Consumer<? super java.lang.Short> action) {
            if (action instanceof FromShort.ToVoid primAction) {
                forEachRemaining(primAction);
            } else {
                forEachRemaining((FromShort.ToVoid) action::accept);
            }
        }

        @Override
        default java.lang.Short next() { return nextPrim(); }
    }

    interface Char extends Iterator<java.lang.Character> {
        char nextPrim();

        default void forEachRemaining(FromChar.ToVoid action) {
            while (hasNext()) {
                action.apply(nextPrim());
            }
        }

        @Override
        default void forEachRemaining(Consumer<? super java.lang.Character> action) {
            if (action instanceof FromChar.ToVoid primAction) {
                forEachRemaining(primAction);
            } else {
                forEachRemaining((FromChar.ToVoid) action::accept);
            }
        }

        @Override
        default java.lang.Character next() { return nextPrim(); }
    }

    interface Int extends Iterator<java.lang.Integer> {
        int nextPrim();

        default void forEachRemaining(FromInt.ToVoid action) {
            while (hasNext()) {
                action.apply(nextPrim());
            }
        }

        @Override
        default void forEachRemaining(Consumer<? super java.lang.Integer> action) {
            if (action instanceof FromInt.ToVoid primAction) {
                forEachRemaining(primAction);
            } else {
                forEachRemaining((FromInt.ToVoid) action::accept);
            }
        }

        @Override
        default java.lang.Integer next() { return nextPrim(); }
    }

    interface Long extends Iterator<java.lang.Long> {
        long nextPrim();

        default void forEachRemaining(FromLong.ToVoid action) {
            while (hasNext()) {
                action.apply(nextPrim());
            }
        }

        @Override
        default void forEachRemaining(Consumer<? super java.lang.Long> action) {
            if (action instanceof FromLong.ToVoid primAction) {
                forEachRemaining(primAction);
            } else {
                forEachRemaining((FromLong.ToVoid) action::accept);
            }
        }

        @Override
        default java.lang.Long next() { return nextPrim(); }
    }

    interface Float extends Iterator<java.lang.Float> {
        float nextPrim();

        default void forEachRemaining(FromFloat.ToVoid action) {
            while (hasNext()) {
                action.apply(nextPrim());
            }
        }

        @Override
        default void forEachRemaining(Consumer<? super java.lang.Float> action) {
            if (action instanceof FromFloat.ToVoid primAction) {
                forEachRemaining(primAction);
            } else {
                forEachRemaining((FromFloat.ToVoid) action::accept);
            }
        }

        @Override
        default java.lang.Float next() { return nextPrim(); }
    }

    interface Double extends Iterator<java.lang.Double> {
        double nextPrim();

        default void forEachRemaining(FromDouble.ToVoid action) {
            while (hasNext()) {
                action.apply(nextPrim());
            }
        }

        @Override
        default void forEachRemaining(Consumer<? super java.lang.Double> action) {
            if (action instanceof FromDouble.ToVoid primAction) {
                forEachRemaining(primAction);
            } else {
                forEachRemaining((FromDouble.ToVoid) action::accept);
            }
        }

        @Override
        default java.lang.Double next() { return nextPrim(); }
    }
    
}
