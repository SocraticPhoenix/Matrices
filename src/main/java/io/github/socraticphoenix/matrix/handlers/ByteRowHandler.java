package io.github.socraticphoenix.matrix.handlers;

import io.github.socraticphoenix.matrix.RowHandler;
import io.github.socraticphoenix.matrix.function.FromByte;

public class ByteRowHandler implements RowHandler<Byte, byte[],
        FromByte.ToObject, FromByte.ToVoid, FromByte.ToBoolean,
        FromByte.ToByte, FromByte.ToShort, FromByte.ToChar,
        FromByte.ToInt, FromByte.ToLong, FromByte.ToFloat,
        FromByte.ToDouble,

        FromByte.AndObject.ToObject, FromByte.AndObject.ToBoolean,
        FromByte.AndObject.ToByte, FromByte.AndObject.ToShort,
        FromByte.AndObject.ToChar, FromByte.AndObject.ToInt,
        FromByte.AndObject.ToLong, FromByte.AndObject.ToFloat,
        FromByte.AndObject.ToDouble,

        FromByte.AndBoolean.ToObject, FromByte.AndBoolean.ToBoolean,
        FromByte.AndBoolean.ToByte, FromByte.AndBoolean.ToShort,
        FromByte.AndBoolean.ToChar, FromByte.AndBoolean.ToInt,
        FromByte.AndBoolean.ToLong, FromByte.AndBoolean.ToFloat,
        FromByte.AndBoolean.ToDouble,

        FromByte.AndByte.ToObject, FromByte.AndByte.ToBoolean,
        FromByte.AndByte.ToByte, FromByte.AndByte.ToShort,
        FromByte.AndByte.ToChar, FromByte.AndByte.ToInt,
        FromByte.AndByte.ToLong, FromByte.AndByte.ToFloat,
        FromByte.AndByte.ToDouble,

        FromByte.AndShort.ToObject, FromByte.AndShort.ToBoolean,
        FromByte.AndShort.ToByte, FromByte.AndShort.ToShort,
        FromByte.AndShort.ToChar, FromByte.AndShort.ToInt,
        FromByte.AndShort.ToLong, FromByte.AndShort.ToFloat,
        FromByte.AndShort.ToDouble,

        FromByte.AndChar.ToObject, FromByte.AndChar.ToBoolean,
        FromByte.AndChar.ToByte, FromByte.AndChar.ToShort,
        FromByte.AndChar.ToChar, FromByte.AndChar.ToInt,
        FromByte.AndChar.ToLong, FromByte.AndChar.ToFloat,
        FromByte.AndChar.ToDouble,

        FromByte.AndInt.ToObject, FromByte.AndInt.ToBoolean,
        FromByte.AndInt.ToByte, FromByte.AndInt.ToShort,
        FromByte.AndInt.ToChar, FromByte.AndInt.ToInt,
        FromByte.AndInt.ToLong, FromByte.AndInt.ToFloat,
        FromByte.AndInt.ToDouble,

        FromByte.AndLong.ToObject, FromByte.AndLong.ToBoolean,
        FromByte.AndLong.ToByte, FromByte.AndLong.ToShort,
        FromByte.AndLong.ToChar, FromByte.AndLong.ToInt,
        FromByte.AndLong.ToLong, FromByte.AndLong.ToFloat,
        FromByte.AndLong.ToDouble,

        FromByte.AndFloat.ToObject, FromByte.AndFloat.ToBoolean,
        FromByte.AndFloat.ToByte, FromByte.AndFloat.ToShort,
        FromByte.AndFloat.ToChar, FromByte.AndFloat.ToInt,
        FromByte.AndFloat.ToLong, FromByte.AndFloat.ToFloat,
        FromByte.AndFloat.ToDouble,

        FromByte.AndDouble.ToObject, FromByte.AndDouble.ToBoolean,
        FromByte.AndDouble.ToByte, FromByte.AndDouble.ToShort,
        FromByte.AndDouble.ToChar, FromByte.AndDouble.ToInt,
        FromByte.AndDouble.ToLong, FromByte.AndDouble.ToFloat,
        FromByte.AndDouble.ToDouble> {

    @Override
    public Byte get(byte[] row, int index) {
        return row[index];
    }
    
    public byte getByte(byte[] row, int index) {
        return row[index];
    }
    
    @Override
    public Byte set(byte[] row, int index, Byte value) {
        return row[index] = value;
    }
    
    public byte setByte(byte[] row, int index, byte value) {
        return row[index] = value;
    }

    @Override
    public void move(byte[] srcRow, int srcIndex, byte[] dstRow, int dstIndex) {
        dstRow[dstIndex] = srcRow[srcIndex];
    }

    @Override
    public void swap(byte[] srcRow, int srcIndex, byte[] dstRow, int dstIndex) {
        byte temp = dstRow[dstIndex];
        dstRow[dstIndex] = srcRow[srcIndex];
        srcRow[srcIndex] = temp;
    }

    @Override
    public void map(byte[] row, int from, int to, Object[] dst, int start, FromByte.ToObject fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, FromByte.ToVoid fn) {
        for (int i = from; i < to; i++) {
            fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, boolean[] dst, int start, FromByte.ToBoolean fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, byte[] dst, int start, FromByte.ToByte fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, short[] dst, int start, FromByte.ToShort fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, char[] dst, int start, FromByte.ToChar fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, int[] dst, int start, FromByte.ToInt fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, long[] dst, int start, FromByte.ToLong fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, float[] dst, int start, FromByte.ToFloat fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] row, int from, int to, double[] dst, int start, FromByte.ToDouble fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndObject.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndObject.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndObject.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndObject.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndObject.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndObject.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndObject.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndObject.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, Object[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndObject.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndBoolean.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndBoolean.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndBoolean.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndBoolean.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndBoolean.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndBoolean.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndBoolean.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndBoolean.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, boolean[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndBoolean.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndByte.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndByte.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndByte.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndByte.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndByte.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndByte.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndByte.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndByte.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, byte[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndByte.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndShort.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndShort.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndShort.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndShort.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndShort.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndShort.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndShort.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndShort.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, short[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndShort.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndChar.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndChar.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndChar.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndChar.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndChar.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndChar.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndChar.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndChar.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, char[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndChar.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndInt.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndInt.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndInt.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndInt.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndInt.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndInt.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndInt.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndInt.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, int[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndInt.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndLong.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndLong.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndLong.ToByte fn) {

        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndLong.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndLong.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndLong.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndLong.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndLong.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, long[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndLong.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndFloat.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndFloat.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndFloat.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndFloat.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndFloat.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndFloat.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndFloat.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndFloat.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, float[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndFloat.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromByte.AndDouble.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromByte.AndDouble.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromByte.AndDouble.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromByte.AndDouble.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromByte.AndDouble.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromByte.AndDouble.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromByte.AndDouble.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromByte.AndDouble.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(byte[] srcA, double[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromByte.AndDouble.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }
}
