package io.github.socraticphoenix.matrix.handlers;

import io.github.socraticphoenix.matrix.RowHandler;
import io.github.socraticphoenix.matrix.function.*;

public class ObjectRowHandler implements RowHandler<Object, Object[],
        FromObject.ToObject, FromObject.ToVoid, FromObject.ToBoolean,
        FromObject.ToByte, FromObject.ToShort, FromObject.ToChar,
        FromObject.ToInt, FromObject.ToLong, FromObject.ToFloat,
        FromObject.ToDouble,

        FromObject.AndObject.ToObject, FromObject.AndObject.ToBoolean,
        FromObject.AndObject.ToByte, FromObject.AndObject.ToShort,
        FromObject.AndObject.ToChar, FromObject.AndObject.ToInt,
        FromObject.AndObject.ToLong, FromObject.AndObject.ToFloat,
        FromObject.AndObject.ToDouble,

        FromObject.AndBoolean.ToObject, FromObject.AndBoolean.ToBoolean,
        FromObject.AndBoolean.ToByte, FromObject.AndBoolean.ToShort,
        FromObject.AndBoolean.ToChar, FromObject.AndBoolean.ToInt,
        FromObject.AndBoolean.ToLong, FromObject.AndBoolean.ToFloat,
        FromObject.AndBoolean.ToDouble,

        FromObject.AndByte.ToObject, FromObject.AndByte.ToBoolean,
        FromObject.AndByte.ToByte, FromObject.AndByte.ToShort,
        FromObject.AndByte.ToChar, FromObject.AndByte.ToInt,
        FromObject.AndByte.ToLong, FromObject.AndByte.ToFloat,
        FromObject.AndByte.ToDouble,

        FromObject.AndShort.ToObject, FromObject.AndShort.ToBoolean,
        FromObject.AndShort.ToByte, FromObject.AndShort.ToShort,
        FromObject.AndShort.ToChar, FromObject.AndShort.ToInt,
        FromObject.AndShort.ToLong, FromObject.AndShort.ToFloat,
        FromObject.AndShort.ToDouble,

        FromObject.AndChar.ToObject, FromObject.AndChar.ToBoolean,
        FromObject.AndChar.ToByte, FromObject.AndChar.ToShort,
        FromObject.AndChar.ToChar, FromObject.AndChar.ToInt,
        FromObject.AndChar.ToLong, FromObject.AndChar.ToFloat,
        FromObject.AndChar.ToDouble,

        FromObject.AndInt.ToObject, FromObject.AndInt.ToBoolean,
        FromObject.AndInt.ToByte, FromObject.AndInt.ToShort,
        FromObject.AndInt.ToChar, FromObject.AndInt.ToInt,
        FromObject.AndInt.ToLong, FromObject.AndInt.ToFloat,
        FromObject.AndInt.ToDouble,

        FromObject.AndLong.ToObject, FromObject.AndLong.ToBoolean,
        FromObject.AndLong.ToByte, FromObject.AndLong.ToShort,
        FromObject.AndLong.ToChar, FromObject.AndLong.ToInt,
        FromObject.AndLong.ToLong, FromObject.AndLong.ToFloat,
        FromObject.AndLong.ToDouble,

        FromObject.AndFloat.ToObject, FromObject.AndFloat.ToBoolean,
        FromObject.AndFloat.ToByte, FromObject.AndFloat.ToShort,
        FromObject.AndFloat.ToChar, FromObject.AndFloat.ToInt,
        FromObject.AndFloat.ToLong, FromObject.AndFloat.ToFloat,
        FromObject.AndFloat.ToDouble,

        FromObject.AndDouble.ToObject, FromObject.AndDouble.ToBoolean,
        FromObject.AndDouble.ToByte, FromObject.AndDouble.ToShort,
        FromObject.AndDouble.ToChar, FromObject.AndDouble.ToInt,
        FromObject.AndDouble.ToLong, FromObject.AndDouble.ToFloat,
        FromObject.AndDouble.ToDouble> {

    @Override
    public Object get(Object[] row, int index) {
        return row[index];
    }

    @Override
    public Object set(Object[] row, int index, Object value) {
        return row[index] = value;
    }

    @Override
    public void move(Object[] srcRow, int srcIndex, Object[] dstRow, int dstIndex) {
        dstRow[dstIndex] = srcRow[srcIndex];
    }

    @Override
    public void swap(Object[] srcRow, int srcIndex, Object[] dstRow, int dstIndex) {
        Object temp = dstRow[dstIndex];
        dstRow[dstIndex] = srcRow[srcIndex];
        srcRow[srcIndex] = temp;
    }

    @Override
    public void map(Object[] row, int from, int to, Object[] dst, int start, FromObject.ToObject fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, FromObject.ToVoid fn) {
        for (int i = from; i < to; i++) {
            fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, boolean[] dst, int start, FromObject.ToBoolean fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, byte[] dst, int start, FromObject.ToByte fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, short[] dst, int start, FromObject.ToShort fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, char[] dst, int start, FromObject.ToChar fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, int[] dst, int start, FromObject.ToInt fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, long[] dst, int start, FromObject.ToLong fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, float[] dst, int start, FromObject.ToFloat fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] row, int from, int to, double[] dst, int start, FromObject.ToDouble fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndObject.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndObject.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndObject.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndObject.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndObject.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndObject.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndObject.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndObject.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, Object[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndObject.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndBoolean.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndBoolean.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndBoolean.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndBoolean.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndBoolean.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndBoolean.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndBoolean.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndBoolean.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, boolean[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndBoolean.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndByte.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndByte.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndByte.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndByte.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndByte.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndByte.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndByte.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndByte.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, byte[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndByte.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndShort.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndShort.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndShort.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndShort.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndShort.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndShort.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndShort.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndShort.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, short[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndShort.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndChar.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndChar.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndChar.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndChar.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndChar.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndChar.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndChar.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndChar.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, char[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndChar.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndInt.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndInt.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndInt.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndInt.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndInt.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndInt.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndInt.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndInt.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, int[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndInt.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndLong.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndLong.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndLong.ToByte fn) {

        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndLong.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndLong.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndLong.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndLong.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndLong.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, long[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndLong.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndFloat.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndFloat.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndFloat.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndFloat.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndFloat.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndFloat.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndFloat.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndFloat.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, float[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndFloat.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromObject.AndDouble.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromObject.AndDouble.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromObject.AndDouble.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromObject.AndDouble.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromObject.AndDouble.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromObject.AndDouble.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromObject.AndDouble.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromObject.AndDouble.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(Object[] srcA, double[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromObject.AndDouble.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }
}
