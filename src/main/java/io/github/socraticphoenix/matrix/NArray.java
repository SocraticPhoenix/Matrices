package io.github.socraticphoenix.matrix;

import io.github.socraticphoenix.matrix.handlers.RowHandlers;

import java.lang.reflect.Array;

public class NArray<T, A> {
    private Object array;
    private IntVector start;
    private IntVector end;

    private IntVector shape;
    Class<T> type;
    int typeCode;

    private RowHandler handler;

    public NArray(IntVector shape, Class<T> type) {
        this.shape = shape;
        this.type = type;
        this.typeCode = Type.from(type);
        this.handler = RowHandlers.from(this.typeCode);

        this.array = Array.newInstance(type, shape.toArray());
        this.start = IntVector.zeroes(shape.size());
        this.end = shape;
    }

    public NArray(Object array) {
        if (array == null || !array.getClass().isArray()) {
            throw new IllegalArgumentException("Array object must be an array");
        }

        this.shape = getShape(array);
        this.start = IntVector.zeroes(this.shape.size());
        this.end = this.shape;

        this.type = (Class<T>) getType(array);
        this.typeCode = Type.from(this.type);
        this.handler = RowHandlers.from(this.typeCode);

        this.array = Array.newInstance(this.type, this.shape.toArray());
        deepCopy(array, this.array, this.start, this.shape);
    }

    private NArray(Object array, IntVector start, IntVector end, IntVector shape, Class<T> type, int typeCode, RowHandler handler) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.shape = shape;
        this.type = type;
        this.typeCode = typeCode;
        this.handler = handler;
    }

    public static <T, A> NArray<T, A> empty(IntVector shape, Class<T> type) {
        return new NArray<>(shape, type);
    }

    public static <T, A> NArray<T, A> of(Object array) {
        return new NArray<>(array);
    }

    private static IntVector getShape(Object array) {
        IntVector shape = IntVector.of(Array.getLength(array));
        for (int i = 0; i < shape.get(0); i++) {
            Object sub = Array.get(array, i);
            if (sub != null && sub.getClass().isArray()) {
                IntVector subShape = getShape(sub);

                for (int j = 1; j < shape.size() && j - 1 < subShape.size(); j++) {
                    int finalJ = j;
                    shape = shape.map(j, k -> Math.max(k, subShape.get(finalJ - 1)));
                }

                shape = shape.concat(subShape.slice(shape.size() - 1, subShape.size()));
            }
        }
        return shape;
    }

    private static Class<?> getType(Object array) {
        Class<?> type = array.getClass();
        while (type.isArray()) type = type.getComponentType();
        return type;
    }

    public <K> K toArray() {
        return (K) copy().array;
    }

    public NArray<T, A> slice(IntVector start, IntVector end) {
        return new NArray<>(this.array, start.add(this.start), end.add(this.start), end.subtract(start), this.type,
                this.typeCode, this.handler);
    }

    public NArray<T, A> map(Object mapper) {
        Object copy = Array.newInstance(this.type, this.shape.toArray());
        deepMap(this.array, copy, this.start, IntVector.zeroes(this.shape.size()), this.shape, mapper);
        return new NArray<>(copy, IntVector.zeroes(this.shape.size()), this.shape, this.shape, this.type, this.typeCode, this.handler);
    }

    public NArray<T, A> map(Object mapper, boolean inPlace) {
        if (inPlace) {
            deepMap(this.array, this.array, this.start, this.start, this.shape, mapper);
            return this;
        } else {
            return map(mapper);
        }
    }

    private void deepMap(Object src, Object dst, IntVector srcStart, IntVector dstStart, IntVector shape, Object fn) {
        if (shape.size() == 1) {
            this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), dst, dstStart.get(0), fn);
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                deepMap(Array.get(src, i), Array.get(dst, i), srcStart.slice(1, srcStart.size()),
                        dstStart.slice(1, dstStart.size()), shape.slice(1, shape.size()), fn);
            }
        }
    }

    public NArray<T, A> flatten() {
        return resize(IntVector.of((int) this.shape.product()));
    }

    public NArray<T, A> resize(IntVector shape) {
        Object array = Array.newInstance(this.type, shape.toArray());
        deepResize(this.array, array, this.start, shape, this.shape, new int[this.shape.size()]);
        return new NArray<>(array, IntVector.zeroes(shape.size()), shape, shape, this.type, this.typeCode, this.handler);
    }

    private static Object deepResize(Object src, Object dst, IntVector start, IntVector shape, IntVector origShape, int[] pulled) {
        if (shape.size() == 1) {
            return copy(src, dst, start, shape, origShape, pulled);
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                Array.set(dst, i, deepResize(src, Array.get(dst, i), shape.slice(1, shape.size()), start, origShape, pulled));
            }
            return dst;
        }
    }

    private static Object copy(Object src, Object dst, IntVector start, IntVector shape, IntVector origShape, int[] pulled) {
        int count = 0;
        int size = shape.get(0);
        while (count < size) {
            Object arr = getArray(src, pulled);
            int len = Math.min(size, origShape.get(origShape.size() - 1) - pulled[pulled.length - 1]);
            if (len <= 0) {
                break;
            }

            System.arraycopy(arr, pulled[pulled.length - 1] + start.get(start.size() - 1), dst, count, len);

            pulled[pulled.length - 1] += len;
            rollover(origShape, pulled);

            count += len;
        }

        return dst;
    }

    private static void rollover(IntVector shape, int[] pulled) {
        for (int i = pulled.length - 1; i > 0; i--) {
            while (pulled[i] >= shape.get(i)) {
                pulled[i - 1] += 1;
                pulled[i] -= shape.get(i);
            }
        }
    }

    private static Object getArray(Object arr, int[] point) {
        for (int i = 0; i < point.length - 1; i++) {
            arr = Array.get(arr, point[i]);
        }
        return arr;
    }

    public NArray<T, A> copy() {
        Object copy = Array.newInstance(this.type, this.shape.toArray());
        deepCopy(this.array, copy, this.start, this.shape);
        return new NArray<>(copy, IntVector.zeroes(this.shape.size()), this.shape, this.shape, this.type,
                this.typeCode, this.handler);
    }

    private static void deepCopy(Object src, Object dst, IntVector start, IntVector shape) {
        if (shape.size() == 1) {
            System.arraycopy(src, start.get(0), dst, 0, Array.getLength(src));
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                deepCopy(Array.get(src, start.get(0) + i), Array.get(dst, i),
                        start.slice(1, start.size()), shape.slice(1, shape.size()));
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj != null && obj.getClass() == NArray.class) {
            NArray other = (NArray) obj;
            if (other.typeCode == this.typeCode && other.shape.equals(this.shape)) {
                return deepEquals(this.array, other.array, this.start, other.start, this.shape);
            }
        }
        return false;
    }

    private boolean deepEquals(Object src, Object dst, IntVector startSrc, IntVector startDst, IntVector shape) {
        if (shape.size() == 1) {
            return this.handler.equals(src, startSrc.get(0), startSrc.get(0) + shape.get(0),
                    dst, startDst.get(0));
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                if (!deepEquals(Array.get(src, i + startSrc.get(0)), Array.get(dst, i + startDst.get(0)), startSrc.slice(1, startSrc.size()),
                        startDst.slice(1, startDst.size()), shape.slice(1, shape.size()))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public int hashCode() {
        return deepHashCode(array, this.start, this.shape, 1);
    }

    private int deepHashCode(Object src, IntVector start, IntVector shape, int accum) {
        if (shape.size() == 1) {
            accum = accum * 31 + this.handler.hashCode(src, start.get(0), start.get(0) + shape.get(0));
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                accum = deepHashCode(Array.get(src, i + start.get(0)), start.slice(1, start.size()), shape.slice(1, shape.size()), accum);
            }
        }

        return accum;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        deepToString(this.array, this.start, this.shape, this.start.size(), builder);
        return builder.toString();
    }

    private void deepToString(Object src, IntVector start, IntVector shape, int dims, StringBuilder builder) {
        if (shape.size() == 1) {
            if (start.size() == dims) {
                builder.append("NArray<").append(this.type.getName()).append("> ");
            }
            builder.append(this.handler.toString(src, start.get(0), start.get(0) + shape.get(0)));
        } else {
            if (start.size() == dims) {
                builder.append("NArray<").append(this.type.getName()).append("> [\n");
            }

            for (int i = 0; i < shape.get(0); i++) {
                if (start.size() == dims) {
                    builder.append("  ");
                }

                deepToString(Array.get(src, i + start.get(0)), start.slice(1, start.size()), shape.slice(1, shape.size()),
                        dims, builder);

                if (start.size() == dims) {
                    builder.append("\n");
                } else if (i < shape.get(0) - 1) {
                    builder.append(", ");
                }
            }

            if (start.size() == dims) {
                builder.append("]");
            }
        }
    }

    public IntVector shape() {
        return this.shape;
    }
}
