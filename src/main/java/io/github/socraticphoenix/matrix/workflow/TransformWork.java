package io.github.socraticphoenix.matrix.workflow;

import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;

public class TransformWork {
    protected Object array;
    protected IntVector shape;
    protected Class<?> type;

    public TransformWork(Object array, IntVector shape, Class<?> type) {
        this.array = array;
        this.shape = shape;
        this.type = type;
    }

    public NArray value() {
        return new NArray(this.array, this.shape, this.type);
    }

    public Object array() {
        return array;
    }

    public IntVector shape() {
        return shape;
    }

    public Class<?> component() {
        return type;
    }
}
