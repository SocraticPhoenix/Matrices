package io.github.socraticphoenix.matrix.handlers;

import io.github.socraticphoenix.matrix.RowHandler;
import io.github.socraticphoenix.matrix.function.FromBoolean;
import io.github.socraticphoenix.matrix.function.FromObject;

public class BoolRowHandler implements RowHandler<Boolean, boolean[],
        FromBoolean.ToBoolean,
        FromBoolean.ToObject, FromBoolean.ToVoid, FromBoolean.ToBoolean,
        FromBoolean.ToByte, FromBoolean.ToShort, FromBoolean.ToChar,
        FromBoolean.ToInt, FromBoolean.ToLong, FromBoolean.ToFloat,
        FromBoolean.ToDouble,

        FromBoolean.AndBoolean.ToBoolean,
        FromBoolean.AndBoolean.ToObject, FromBoolean.AndBoolean.ToBoolean,
        FromBoolean.AndBoolean.ToByte, FromBoolean.AndBoolean.ToShort,
        FromBoolean.AndBoolean.ToChar, FromBoolean.AndBoolean.ToInt,
        FromBoolean.AndBoolean.ToLong, FromBoolean.AndBoolean.ToFloat,
        FromBoolean.AndBoolean.ToDouble,

        FromBoolean.AndObject.ToBoolean,
        FromBoolean.AndObject.ToObject, FromBoolean.AndObject.ToBoolean,
        FromBoolean.AndObject.ToByte, FromBoolean.AndObject.ToShort,
        FromBoolean.AndObject.ToChar, FromBoolean.AndObject.ToInt,
        FromBoolean.AndObject.ToLong, FromBoolean.AndObject.ToFloat,
        FromBoolean.AndObject.ToDouble,

        FromBoolean.AndBoolean.ToBoolean,
        FromBoolean.AndBoolean.ToObject, FromBoolean.AndBoolean.ToBoolean,
        FromBoolean.AndBoolean.ToByte, FromBoolean.AndBoolean.ToShort,
        FromBoolean.AndBoolean.ToChar, FromBoolean.AndBoolean.ToInt,
        FromBoolean.AndBoolean.ToLong, FromBoolean.AndBoolean.ToFloat,
        FromBoolean.AndBoolean.ToDouble,

        FromBoolean.AndByte.ToBoolean,
        FromBoolean.AndByte.ToObject, FromBoolean.AndByte.ToBoolean,
        FromBoolean.AndByte.ToByte, FromBoolean.AndByte.ToShort,
        FromBoolean.AndByte.ToChar, FromBoolean.AndByte.ToInt,
        FromBoolean.AndByte.ToLong, FromBoolean.AndByte.ToFloat,
        FromBoolean.AndByte.ToDouble,

        FromBoolean.AndShort.ToBoolean,
        FromBoolean.AndShort.ToObject, FromBoolean.AndShort.ToBoolean,
        FromBoolean.AndShort.ToByte, FromBoolean.AndShort.ToShort,
        FromBoolean.AndShort.ToChar, FromBoolean.AndShort.ToInt,
        FromBoolean.AndShort.ToLong, FromBoolean.AndShort.ToFloat,
        FromBoolean.AndShort.ToDouble,

        FromBoolean.AndChar.ToBoolean,
        FromBoolean.AndChar.ToObject, FromBoolean.AndChar.ToBoolean,
        FromBoolean.AndChar.ToByte, FromBoolean.AndChar.ToShort,
        FromBoolean.AndChar.ToChar, FromBoolean.AndChar.ToInt,
        FromBoolean.AndChar.ToLong, FromBoolean.AndChar.ToFloat,
        FromBoolean.AndChar.ToDouble,

        FromBoolean.AndInt.ToBoolean,
        FromBoolean.AndInt.ToObject, FromBoolean.AndInt.ToBoolean,
        FromBoolean.AndInt.ToByte, FromBoolean.AndInt.ToShort,
        FromBoolean.AndInt.ToChar, FromBoolean.AndInt.ToInt,
        FromBoolean.AndInt.ToLong, FromBoolean.AndInt.ToFloat,
        FromBoolean.AndInt.ToDouble,

        FromBoolean.AndLong.ToBoolean,
        FromBoolean.AndLong.ToObject, FromBoolean.AndLong.ToBoolean,
        FromBoolean.AndLong.ToByte, FromBoolean.AndLong.ToShort,
        FromBoolean.AndLong.ToChar, FromBoolean.AndLong.ToInt,
        FromBoolean.AndLong.ToLong, FromBoolean.AndLong.ToFloat,
        FromBoolean.AndLong.ToDouble,

        FromBoolean.AndFloat.ToBoolean,
        FromBoolean.AndFloat.ToObject, FromBoolean.AndFloat.ToBoolean,
        FromBoolean.AndFloat.ToByte, FromBoolean.AndFloat.ToShort,
        FromBoolean.AndFloat.ToChar, FromBoolean.AndFloat.ToInt,
        FromBoolean.AndFloat.ToLong, FromBoolean.AndFloat.ToFloat,
        FromBoolean.AndFloat.ToDouble,

        FromBoolean.AndDouble.ToBoolean,
        FromBoolean.AndDouble.ToObject, FromBoolean.AndDouble.ToBoolean,
        FromBoolean.AndDouble.ToByte, FromBoolean.AndDouble.ToShort,
        FromBoolean.AndDouble.ToChar, FromBoolean.AndDouble.ToInt,
        FromBoolean.AndDouble.ToLong, FromBoolean.AndDouble.ToFloat,
        FromBoolean.AndDouble.ToDouble> {

    @Override
    public int hashCode(boolean[] row, int from, int to) {
        int res = 0;
        for (int i = from; i < to; i++) {
            res = 31 * res + (row[i] ? 1231 : 1237);
        }
        return res;
    }

    @Override
    public String toString(boolean[] row, int from, int to) {
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = from; i < to; i++) {
            sb.append(row[i]);
            if (i < to - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }

    @Override
    public boolean equals(boolean[] rowA, int fromA, int toA, boolean[] rowB, int fromB) {
        for (int i = fromA; i < toA; i++) {
            if (rowA[i] != rowB[fromB + (i - fromA)]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean get(boolean[] row, int index) {
        return row[index];
    }

    public boolean getBoolean(boolean[] row, int index) {
        return row[index];
    }

    @Override
    public Boolean set(boolean[] row, int index, Boolean value) {
        return row[index] = value;
    }

    public boolean setBoolean(boolean[] row, int index, boolean value) {
        return row[index] = value;
    }

    @Override
    public void move(boolean[] srcRow, int srcIndex, boolean[] dstRow, int dstIndex) {
        dstRow[dstIndex] = srcRow[srcIndex];
    }

    @Override
    public void swap(boolean[] srcRow, int srcIndex, boolean[] dstRow, int dstIndex) {
        boolean temp = dstRow[dstIndex];
        dstRow[dstIndex] = srcRow[srcIndex];
        srcRow[srcIndex] = temp;
    }

    @Override
    public void map(boolean[] row, int from, int to, Object[] dst, int start, FromBoolean.ToObject fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, FromBoolean.ToVoid fn) {
        for (int i = from; i < to; i++) {
            fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, boolean[] dst, int start, FromBoolean.ToBoolean fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, byte[] dst, int start, FromBoolean.ToByte fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, short[] dst, int start, FromBoolean.ToShort fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, char[] dst, int start, FromBoolean.ToChar fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, int[] dst, int start, FromBoolean.ToInt fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, long[] dst, int start, FromBoolean.ToLong fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, float[] dst, int start, FromBoolean.ToFloat fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] row, int from, int to, double[] dst, int start, FromBoolean.ToDouble fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndObject.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndObject.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndObject.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndObject.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndObject.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndObject.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndObject.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndObject.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, Object[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndObject.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndBoolean.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndBoolean.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndBoolean.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndBoolean.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndBoolean.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndBoolean.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndBoolean.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndBoolean.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, boolean[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndBoolean.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndByte.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndByte.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndByte.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndByte.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndByte.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndByte.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndByte.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndByte.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, byte[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndByte.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndShort.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndShort.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndShort.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndShort.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndShort.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndShort.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndShort.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndShort.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, short[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndShort.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndChar.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndChar.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndChar.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndChar.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndChar.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndChar.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndChar.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndChar.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, char[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndChar.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndInt.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndInt.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndInt.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndInt.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndInt.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndInt.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndInt.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndInt.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, int[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndInt.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndLong.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndLong.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndLong.ToByte fn) {

        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndLong.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndLong.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndLong.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndLong.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndLong.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, long[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndLong.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndFloat.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndFloat.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndFloat.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndFloat.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndFloat.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndFloat.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndFloat.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndFloat.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, float[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndFloat.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromBoolean.AndDouble.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromBoolean.AndDouble.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromBoolean.AndDouble.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromBoolean.AndDouble.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromBoolean.AndDouble.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromBoolean.AndDouble.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromBoolean.AndDouble.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromBoolean.AndDouble.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(boolean[] srcA, double[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromBoolean.AndDouble.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }
}
