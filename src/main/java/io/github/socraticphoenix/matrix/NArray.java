package io.github.socraticphoenix.matrix;

import io.github.socraticphoenix.matrix.workflow.*;

import java.lang.reflect.Array;

public class NArray extends TransformWork {

    public NArray(IntVector shape, Class<?> type) {
        super(createArray(shape, type), shape, type);
        if (shape.size() == 0) {
            throw new IllegalArgumentException("Array cannot have 0 dimensions");
        }
    }

    public NArray(Object array, IntVector shape, Class<?> type) {
        super(array, shape, type);
    }

    public <T> T work(InitialWorkflow<T> work, Object... args) {
        return work.apply(this, false, args);
    }

    public <T> T workInPlace(Workflow<T> work, Object... args) {
        T res = work.apply(this, true, args);
        if (res instanceof TransformWork trn) {
            workInPlace(trn);
        }

        return res;
    }

    public NArray workInPlace(TransformWork work) {
        this.array = work.array();
        this.shape = work.shape();
        this.type = work.component();
        return this;
    }

    public <T> T toArray() {
        return (T) Workflows.COPY.apply(this, false).value().array;
    }

    @Override
    public NArray value() {
        return this;
    }

    public static Object createArray(IntVector shape, Class<?> type) {
        if (shape.size() == 0) {
            return getDefault(type);
        } else {
            return Array.newInstance(type, shape.toArray());
        }
    }

    public static Object getDefault(Class<?> type) {
        if (type.isPrimitive()) {
            if (type == boolean.class) {
                return false;
            } else if (type == byte.class) {
                return (byte) 0;
            } else if (type == short.class) {
                return (short) 0;
            } else if (type == char.class) {
                return (char) 0;
            } else if (type == int.class) {
                return 0;
            } else if (type == long.class) {
                return 0L;
            } else if (type == float.class) {
                return 0F;
            } else {
                return 0D;
            }
        } else {
            return null;
        }
    }

}
