package io.github.socraticphoenix.matrix.handlers;

import io.github.socraticphoenix.matrix.Type;

public interface RowHandlers {

    ObjectRowHandler OBJECT = new ObjectRowHandler();

    BoolRowHandler BOOLEAN = new BoolRowHandler();

    DoubleRowHandler DOUBLE = new DoubleRowHandler();

    static RowHandler from(Class<?> type) {
        return from(Type.from(type));
    }

    static RowHandler from(int type) {
        switch (type) {
            case Type.BOOLEAN:
                return BOOLEAN;
            case Type.BYTE:
            case Type.SHORT:
            case Type.CHAR:
            case Type.INT:
            case Type.LONG:
            case Type.FLOAT:
            case Type.DOUBLE:
                return DOUBLE;

            case Type.OBJECT:
            default:
                return OBJECT;
        }
    }



}
