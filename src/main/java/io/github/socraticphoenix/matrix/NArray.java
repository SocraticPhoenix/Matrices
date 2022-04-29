package io.github.socraticphoenix.matrix;

import io.github.socraticphoenix.matrix.function.FromAny;
import io.github.socraticphoenix.matrix.function.FromBoolean;
import io.github.socraticphoenix.matrix.function.FromByte;
import io.github.socraticphoenix.matrix.function.FromChar;
import io.github.socraticphoenix.matrix.function.FromDouble;
import io.github.socraticphoenix.matrix.function.FromFloat;
import io.github.socraticphoenix.matrix.function.FromInt;
import io.github.socraticphoenix.matrix.function.FromLong;
import io.github.socraticphoenix.matrix.function.FromObject;
import io.github.socraticphoenix.matrix.function.FromShort;
import io.github.socraticphoenix.matrix.function.Iterators;
import io.github.socraticphoenix.matrix.handlers.RowHandler;
import io.github.socraticphoenix.matrix.handlers.RowHandlers;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Optional;

public class NArray<T, A> {
    private Object array;
    private IntVector start;

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
    }

    public NArray(Object array) {
        if (array == null || !array.getClass().isArray()) {
            throw new IllegalArgumentException("Array object must be an array");
        }

        this.shape = getShape(array);
        this.start = IntVector.zeroes(this.shape.size());

        this.type = (Class<T>) getType(array);
        this.typeCode = Type.from(this.type);
        this.handler = RowHandlers.from(this.typeCode);

        this.array = Array.newInstance(this.type, this.shape.toArray());
        deepCopy(array, this.array, this.start, this.start, this.shape);
    }

    private NArray(Object array, IntVector start, IntVector shape, Class<T> type) {
        this.array = array;
        this.start = start;
        this.shape = shape;
        this.type = type;

        this.typeCode = Type.from(this.type);
        this.handler = RowHandlers.from(this.typeCode);
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

    public T get(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return (T) this.handler.get(array, point[point.length - 1]);
    }

    public T get(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return (T) this.handler.get(array, point.get(point.size() - 1));
    }

    public boolean getBool(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return ((boolean[]) array)[point[point.length - 1]];
    }

    public boolean getBool(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return ((boolean[]) array)[point.get(point.size() - 1)];
    }

    public byte getByte(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return ((byte[]) array)[point[point.length - 1]];
    }

    public byte getByte(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return ((byte[]) array)[point.get(point.size() - 1)];
    }

    public char getChar(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return ((char[]) array)[point[point.length - 1]];
    }

    public char getChar(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return ((char[]) array)[point.get(point.size() - 1)];
    }

    public short getShort(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return ((short[]) array)[point[point.length - 1]];
    }

    public short getShort(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return ((short[]) array)[point.get(point.size() - 1)];
    }

    public int getInt(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return ((int[]) array)[point[point.length - 1]];
    }

    public int getInt(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return ((int[]) array)[point.get(point.size() - 1)];
    }

    public long getLong(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return ((long[]) array)[point[point.length - 1]];
    }

    public long getLong(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return ((long[]) array)[point.get(point.size() - 1)];
    }

    public float getFloat(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return ((float[]) array)[point[point.length - 1]];
    }

    public float getFloat(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return ((float[]) array)[point.get(point.size() - 1)];
    }

    public double getDouble(int[] point) {
        Object array = this.array;
        for (int i = 0; i < point.length - 1; i++) {
            array = Array.get(array, point[i]);
        }
        return ((double[]) array)[point[point.length - 1]];
    }

    public double getDouble(IntVector point) {
        Object array = this.array;
        for (int i = 0; i < point.size() - 1; i++) {
            array = Array.get(array, point.get(i));
        }
        return ((double[]) array)[point.get(point.size() - 1)];
    }

    public static Iterator<IntVector> posIterator(IntVector start, IntVector end) {
        PositionStepper stepper = new PositionStepper(start, end);
        return new Iterator<>() {
            public boolean hasNext() { return stepper.hasNext(); }
            public IntVector next() {
                IntVector result = stepper.snapshot();
                stepper.moveNext();
                return result;
            }
        };
    }

    public Iterator<IntVector> posIterator() {
        return posIterator(IntVector.zeroes(this.shape.size()), this.shape);
    }

    public NArray<T, A> multiply(NArray<T, A> other, Object addition, Object multiplication) {
        return tensorContraction(IntVector.of(this.shape.size()), other, addition, multiplication);
    }

    public NArray<T, A> tensorContraction(IntVector axes, NArray<T, A> other, Object addition, Object multiplication) {
        IntVector shape = this.shape.slice(0, this.shape.size() - axes.size())
                .concat(other.shape.slice(axes.size(), other.shape.size()));

        IntVector contractions = axes.map(i -> this.shape.get(i - 1));
        NArray<T, A> res = NArray.empty(shape, this.type);
        Object temp = Array.newInstance(this.type, 1);

        posIterator(IntVector.zeroes(shape.size()), shape).forEachRemaining(pos ->
                posIterator(IntVector.zeroes(contractions.size()), contractions).forEachRemaining(contraction -> {
                    IntVector a = pos.slice(0, this.shape.size() - axes.size())
                            .concat(contraction);
                    IntVector b = contraction.reverse()
                            .concat(pos.slice(axes.size(), pos.size()));

                    this.handler.map(getArray(this.array, a),
                            getArray(other.array, b),
                            a.get(a.size() - 1),
                            a.get(a.size() - 1) + 1,
                            b.get(b.size() - 1),
                            temp,
                            0,
                            multiplication);

                    Object row = getArray(res.array, pos);
                    this.handler.map(temp,
                            row,
                            0, 1, pos.get(pos.size() - 1),
                            row,
                            pos.get(pos.size() - 1),
                            addition);
        }));

        return res;
    }

    public <K> Optional<K> reduce(Object mapper) {
        if (this.shape.product() == 0) {
            return Optional.empty();
        }

        Object res = null;
        switch (this.typeCode) {
            case Type.BOOLEAN -> {
                Iterators.Boolean iter = (Iterators.Boolean) iterator();
                FromBoolean.AndBoolean.ToBoolean fn = (FromBoolean.AndBoolean.ToBoolean) mapper;
                boolean accum = iter.nextPrim();
                while (iter.hasNext()) accum = fn.apply(accum, iter.nextPrim());
                res = accum;
            }
            case Type.BYTE -> {
                Iterators.Byte iter = (Iterators.Byte) iterator();
                FromByte.AndByte.ToByte fn = (FromByte.AndByte.ToByte) mapper;
                byte accum = iter.nextPrim();
                while (iter.hasNext()) accum = fn.apply(accum, iter.nextPrim());
                res = accum;
            }
            case Type.SHORT -> {
                Iterators.Short iter = (Iterators.Short) iterator();
                FromShort.AndShort.ToShort fn = (FromShort.AndShort.ToShort) mapper;
                short accum = iter.nextPrim();
                while (iter.hasNext()) accum = fn.apply(accum, iter.nextPrim());
                res = accum;
            }
            case Type.CHAR -> {
                Iterators.Char iter = (Iterators.Char) iterator();
                FromChar.AndChar.ToChar fn = (FromChar.AndChar.ToChar) mapper;
                char accum = iter.nextPrim();
                while (iter.hasNext()) accum = fn.apply(accum, iter.nextPrim());
                res = accum;
            }
            case Type.INT -> {
                Iterators.Int iter = (Iterators.Int) iterator();
                FromInt.AndInt.ToInt fn = (FromInt.AndInt.ToInt) mapper;
                int accum = iter.nextPrim();
                while (iter.hasNext()) accum = fn.apply(accum, iter.nextPrim());
                res = accum;
            }
            case Type.LONG -> {
                Iterators.Long iter = (Iterators.Long) iterator();
                FromLong.AndLong.ToLong fn = (FromLong.AndLong.ToLong) mapper;
                long accum = iter.nextPrim();
                while (iter.hasNext()) accum = fn.apply(accum, iter.nextPrim());
                res = accum;
            }
            case Type.FLOAT -> {
                Iterators.Float iter = (Iterators.Float) iterator();
                FromFloat.AndFloat.ToFloat fn = (FromFloat.AndFloat.ToFloat) mapper;
                float accum = iter.nextPrim();
                while (iter.hasNext()) accum = fn.apply(accum, iter.nextPrim());
                res = accum;
            }
            case Type.DOUBLE -> {
                Iterators.Double iter = (Iterators.Double) iterator();
                FromDouble.AndDouble.ToDouble fn = (FromDouble.AndDouble.ToDouble) mapper;
                double accum = iter.nextPrim();
                while (iter.hasNext()) accum = fn.apply(accum, iter.nextPrim());
                res = accum;
            }
            case Type.OBJECT -> {
                Iterator<T> iter = iterator();
                FromObject.AndObject.ToObject fn = (FromObject.AndObject.ToObject) mapper;
                Object accum = iter.next();
                while (iter.hasNext()) accum = fn.apply(accum, iter.next());
                res = accum;
            }
        }
        return Optional.ofNullable((K) res);
    }

    public <K> K reduce(Object mapper, K identity) {
        return (K) reduce(mapper).orElse(identity);
    }

    public <I extends Iterator<T>> I iterator() {
        PositionStepper stepper = new PositionStepper(this.shape);

        switch (this.typeCode) {
            case Type.BOOLEAN:
                return (I) new Iterators.Boolean() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public boolean nextPrim() {
                        boolean val = getBool(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
            case Type.BYTE:
                return (I) new Iterators.Byte() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public byte nextPrim() {
                        byte val = getByte(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
            case Type.SHORT:
                return (I) new Iterators.Short() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public short nextPrim() {
                        short val = getShort(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
            case Type.CHAR:
                return (I) new Iterators.Char() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public char nextPrim() {
                        char val = getChar(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
            case Type.INT:
                return (I) new Iterators.Int() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public int nextPrim() {
                        int val = getInt(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
            case Type.LONG:
                return (I) new Iterators.Long() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public long nextPrim() {
                        long val = getLong(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
            case Type.FLOAT:
                return (I) new Iterators.Float() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public float nextPrim() {
                        float val = getFloat(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
            case Type.DOUBLE:
                return (I) new Iterators.Double() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public double nextPrim() {
                        double val = getDouble(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
            case Type.OBJECT:
            default:
                return (I) new Iterator<T>() {
                    public boolean hasNext() { return stepper.hasNext(); }
                    public T next() {
                        T val = get(stepper.current());
                        stepper.moveNext();
                        return val;
                    }
                };
        }
    }

    public NArray<IntVector, IntVector[]> posMatrix() {
        NArray<IntVector, IntVector[]> matrix = NArray.empty(this.shape, IntVector.class);
        this.posIterator().forEachRemaining(i -> matrix.set(i, i));
        return matrix;
    }

    public NArray<T, A> transpose() {
        IntVector shape = this.shape.reverse();
        Object array = Array.newInstance(this.type, shape.toArray());
        PositionStepper stepper = new PositionStepper(this.shape);
        while (stepper.hasNext()) {
            Object src = this.array;
            Object dst = array;

            int[] point = stepper.current();
            for (int i = 0; i < point.length - 1; i++) {
                src = Array.get(src, point[i]);
                dst = Array.get(dst, point[point.length - (i + 1)]);
            }
            this.handler.move(src, point[point.length - 1], dst, point[0]);
            stepper.moveNext();
        }
        return new NArray<>(array, IntVector.zeroes(shape.size()), shape, this.type);
    }


    public NArray<T, A> flip(int axis) {
        if (axis < 1 || axis > this.shape.size()) {
            throw new DimensionMismatchException("Invalid axis " + axis + " for shape with " + this.shape.size() + " axes");
        }
        Object array = Array.newInstance(this.type, this.shape.toArray());
        deepFlip(this.array, array, this.start, IntVector.zeroes(this.shape.size()), this.shape, axis);
        return new NArray<>(array, IntVector.zeroes(this.shape.size()), this.shape, this.type);
    }

    private void deepFlip(Object src, Object dst, IntVector srcStart, IntVector dstStart, IntVector shape, int axis) {
        if (shape.size() == axis) {
            if (shape.size() == 1) {
                for (int i = 0; i < shape.get(0); i++) {
                    this.handler.move(src, i + srcStart.get(0), dst, shape.get(0) - (i + 1) + dstStart.get(0));
                }
            } else {
                for (int i = 0; i < shape.get(0); i++) {
                    deepCopy(Array.get(src, i + srcStart.get(0)), Array.get(dst, shape.get(0) - (i + 1) + dstStart.get(0)),
                            srcStart.slice(1, srcStart.size()), dstStart.slice(1, dstStart.size()),
                            shape.slice(1, shape.size()));
                }
            }
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                deepFlip(Array.get(src, i + srcStart.get(0)), Array.get(dst, i + dstStart.get(0)),
                        srcStart.slice(1, srcStart.size()), dstStart.slice(1, dstStart.size()),
                        shape.slice(1, shape.size()), axis);
            }
        }
    }


    public NArray<T, A> slice(IntVector start, IntVector end) {
        start = start.concat(IntVector.zeroes(this.start.size() - start.size()));
        end = end.concat(this.shape.slice(end.size(), this.shape.size()));

        return new NArray<>(this.array, start.add(this.start), end.subtract(start), this.type);
    }

    private void set(IntVector loc, T value) {
        Object arr = this.array;
        for (int i = 0; i < loc.size() - 1; i++) {
            arr = Array.get(arr, loc.get(i));
        }
        Array.set(arr, loc.get(loc.size() - 1), value);
    }

    public NArray<T, A> merge(NArray<T, A> data, IntVector loc) {
        IntVector shape = loc.add(data.shape).biMap(this.shape, Math::max);
        Object array = Array.newInstance(this.type, shape.toArray());
        deepCopy(this.array, array, this.start, IntVector.zeroes(shape.size()), shape);
        deepCopy(data.array, array, data.start, loc, data.shape);
        return new NArray<>(array, IntVector.zeroes(shape.size()), shape, this.type);
    }

    private static Class<?> mapperRet(Object mapper) {
        if (mapper instanceof FromAny.ToBoolean) {
            return boolean.class;
        } else if (mapper instanceof FromAny.ToByte) {
            return byte.class;
        } else if (mapper instanceof FromAny.ToChar) {
            return char.class;
        } else if (mapper instanceof FromAny.ToShort) {
            return short.class;
        } else if (mapper instanceof FromAny.ToInt) {
            return int.class;
        } else if (mapper instanceof FromAny.ToLong) {
            return long.class;
        } else if (mapper instanceof FromAny.ToFloat) {
            return float.class;
        } else if (mapper instanceof FromAny.ToDouble) {
            return double.class;
        } else if (mapper instanceof FromAny.ToVoid) {
            return void.class;
        }
        return Object.class;
    }

    public <K, V, G, M> NArray<K, V> biMap(NArray<G, M> other, Object mapper) {
        Class<?> type = mapperRet(mapper);
        int second = other.typeCode;
        Object copy = Array.newInstance(type, this.shape.toArray());
        deepMap(this.array, other.array, copy, this.start, other.start, IntVector.zeroes(this.shape.size()), this.shape, second, Type.from(type), mapper);
        return new NArray<>(copy, IntVector.zeroes(this.shape.size()), this.shape, (Class<K>) type);
    }

    private void deepMap(Object srcA, Object srcB, Object dst, IntVector srcStartA, IntVector srcStartB, IntVector dstStart, IntVector shape, int and, int to, Object fn) {
        if (shape.size() == 1) {
            switch (and) {
                case Type.BOOLEAN:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (boolean[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
                case Type.BYTE:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (byte[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
                case Type.SHORT:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (short[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
                case Type.CHAR:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (char[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
                case Type.INT:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (int[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
                case Type.LONG:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (long[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
                case Type.FLOAT:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (float[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
                case Type.DOUBLE:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (double[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
                case Type.OBJECT:
                    switch (to) {
                        case Type.BOOLEAN -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (boolean[]) dst, dstStart.get(0), fn);
                        case Type.BYTE -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (byte[]) dst, dstStart.get(0), fn);
                        case Type.SHORT -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (short[]) dst, dstStart.get(0), fn);
                        case Type.CHAR -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (char[]) dst, dstStart.get(0), fn);
                        case Type.INT -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (int[]) dst, dstStart.get(0), fn);
                        case Type.LONG -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (long[]) dst, dstStart.get(0), fn);
                        case Type.FLOAT -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (float[]) dst, dstStart.get(0), fn);
                        case Type.DOUBLE -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (double[]) dst, dstStart.get(0), fn);
                        case Type.OBJECT -> this.handler.map(srcA, (Object[]) srcB, srcStartA.get(0), srcStartA.get(0) + shape.get(0), srcStartB.get(0),
                                (Object[]) dst, dstStart.get(0), fn);
                    }
                    break;
            }
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                deepMap(Array.get(srcA, i + srcStartA.get(0)), Array.get(srcB, i + srcStartB.get(0)),
                        Array.get(dst, i + dstStart.get(0)), srcStartA.slice(1, srcStartA.size()),
                        srcStartB.slice(1, srcStartB.size()), dstStart.slice(1, dstStart.size()),
                        shape.slice(1, shape.size()), and, to, fn);
            }
        }
    }

    public <K, V> NArray<K, V> map(Object mapper) {
        Class<?> type = mapperRet(mapper);
        Object copy = Array.newInstance(type, this.shape.toArray());
        deepMap(this.array, copy, this.start, IntVector.zeroes(this.shape.size()), this.shape, Type.from(type), mapper);
        return new NArray<>(copy, IntVector.zeroes(this.shape.size()), this.shape, (Class<K>) type);
    }

    private void deepMap(Object src, Object dst, IntVector srcStart, IntVector dstStart, IntVector shape, int to, Object fn) {
        if (shape.size() == 1) {
            switch (to) {
                case Type.BOOLEAN:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (boolean[]) dst, dstStart.get(0), fn);
                    break;
                case Type.BYTE:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (byte[]) dst, dstStart.get(0), fn);
                    break;
                case Type.SHORT:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (short[]) dst, dstStart.get(0), fn);
                    break;
                case Type.CHAR:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (char[]) dst, dstStart.get(0), fn);
                    break;
                case Type.INT:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (int[]) dst, dstStart.get(0), fn);
                    break;
                case Type.LONG:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (long[]) dst, dstStart.get(0), fn);
                    break;
                case Type.FLOAT:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (float[]) dst, dstStart.get(0), fn);
                    break;
                case Type.DOUBLE:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (double[]) dst, dstStart.get(0), fn);
                    break;
                case Type.OBJECT:
                default:
                    this.handler.map(src, srcStart.get(0), srcStart.get(0) + shape.get(0), (Object[]) dst, dstStart.get(0), fn);
                    break;
            }
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                deepMap(Array.get(src, i + srcStart.get(0)), Array.get(dst, i + dstStart.get(0)), srcStart.slice(1, srcStart.size()),
                        dstStart.slice(1, dstStart.size()), shape.slice(1, shape.size()), to, fn);
            }
        }
    }

    public NArray<T, A> flatten() {
        return resize(IntVector.of((int) this.shape.product()));
    }

    public NArray<T, A> resize(IntVector shape) {
        NArray<T, A> res = NArray.empty(shape, this.type);
        PositionStepper srcStepper = new PositionStepper(this.shape);
        PositionStepper dstStepper = new PositionStepper(shape);

        while (srcStepper.hasNext() && dstStepper.hasNext()) {
            int[] a = srcStepper.current();
            int[] b = dstStepper.current();

            this.handler.move(getArray(this.array, a), a[a.length - 1],
                    getArray(res.array, b), b[b.length - 1]);

            srcStepper.moveNext();
            dstStepper.moveNext();
        }

        return res;
    }

    private static Object getArray(Object arr, int[] point) {
        for (int i = 0; i < point.length - 1; i++) {
            arr = Array.get(arr, point[i]);
        }
        return arr;
    }

    private static Object getArray(Object arr, IntVector point) {
        for (int i = 0; i < point.size() - 1; i++) {
            arr = Array.get(arr, point.get(i));
        }
        return arr;
    }

    public NArray<T, A> copy() {
        Object copy = Array.newInstance(this.type, this.shape.toArray());
        deepCopy(this.array, copy, this.start, IntVector.zeroes(this.shape.size()), this.shape);
        return new NArray<>(copy, IntVector.zeroes(this.shape.size()), this.shape, this.type);
    }

    private static void deepCopy(Object src, Object dst, IntVector srcStart, IntVector dstStart, IntVector shape) {
        if (shape.size() == 1) {
            System.arraycopy(src, srcStart.get(0), dst, dstStart.get(0), Array.getLength(src));
        } else {
            for (int i = 0; i < shape.get(0); i++) {
                int srcInd = srcStart.get(0) + i;
                int dstInd = dstStart.get(0) + i;

                if (srcInd < Array.getLength(src) && dstInd < Array.getLength(dst)) {
                    deepCopy(Array.get(src, srcInd), Array.get(dst, dstInd),
                            srcStart.slice(1, srcStart.size()), dstStart.slice(1, dstStart.size()),
                            shape.slice(1, shape.size()));
                }
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

    public long size() {
        return this.shape.product();
    }
}
