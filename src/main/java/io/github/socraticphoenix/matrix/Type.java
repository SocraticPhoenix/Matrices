package io.github.socraticphoenix.matrix;

public interface Type {

    int OBJECT = 0;

    int BOOLEAN = 1;
    int BYTE = 2;
    int SHORT = 3;
    int CHAR = 4;
    int INT = 5;
    int LONG = 6;
    int FLOAT = 7;
    int DOUBLE = 8;

    static int from(Class<?> type) {
        if (type.isPrimitive()) {
            if (type == boolean.class) {
                return BOOLEAN;
            } else if (type == byte.class) {
                return BYTE;
            } else if (type == short.class) {
                return SHORT;
            } else if (type == char.class) {
                return CHAR;
            } else if (type == int.class) {
                return INT;
            } else if (type == long.class) {
                return LONG;
            } else if (type == float.class) {
                return FLOAT;
            } else if (type == double.class) {
                return DOUBLE;
            }
        }

        return OBJECT;
    }

}
