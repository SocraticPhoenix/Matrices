package io.github.socraticphoenix.matrix.handlers;

import io.github.socraticphoenix.matrix.function.FromDouble;

public class DoubleRowHandler implements RowHandler<Double, double[], 
        FromDouble.ToDouble,
        FromDouble.ToObject, FromDouble.ToVoid, FromDouble.ToBoolean,
        FromDouble.ToByte, FromDouble.ToShort, FromDouble.ToChar,
        FromDouble.ToInt, FromDouble.ToLong, FromDouble.ToFloat,
        FromDouble.ToDouble,

        FromDouble.AndDouble.ToDouble,
        FromDouble.AndDouble.ToObject, FromDouble.AndDouble.ToBoolean,
        FromDouble.AndDouble.ToByte, FromDouble.AndDouble.ToShort,
        FromDouble.AndDouble.ToChar, FromDouble.AndDouble.ToInt,
        FromDouble.AndDouble.ToLong, FromDouble.AndDouble.ToFloat,
        FromDouble.AndDouble.ToDouble,
        
        FromDouble.AndObject.ToDouble,
        FromDouble.AndObject.ToObject, FromDouble.AndObject.ToBoolean,
        FromDouble.AndObject.ToByte, FromDouble.AndObject.ToShort,
        FromDouble.AndObject.ToChar, FromDouble.AndObject.ToInt,
        FromDouble.AndObject.ToLong, FromDouble.AndObject.ToFloat,
        FromDouble.AndObject.ToDouble,

        FromDouble.AndBoolean.ToDouble,
        FromDouble.AndBoolean.ToObject, FromDouble.AndBoolean.ToBoolean,
        FromDouble.AndBoolean.ToByte, FromDouble.AndBoolean.ToShort,
        FromDouble.AndBoolean.ToChar, FromDouble.AndBoolean.ToInt,
        FromDouble.AndBoolean.ToLong, FromDouble.AndBoolean.ToFloat,
        FromDouble.AndBoolean.ToDouble,

        FromDouble.AndByte.ToDouble,
        FromDouble.AndByte.ToObject, FromDouble.AndByte.ToBoolean,
        FromDouble.AndByte.ToByte, FromDouble.AndByte.ToShort,
        FromDouble.AndByte.ToChar, FromDouble.AndByte.ToInt,
        FromDouble.AndByte.ToLong, FromDouble.AndByte.ToFloat,
        FromDouble.AndByte.ToDouble,

        FromDouble.AndShort.ToDouble,
        FromDouble.AndShort.ToObject, FromDouble.AndShort.ToBoolean,
        FromDouble.AndShort.ToByte, FromDouble.AndShort.ToShort,
        FromDouble.AndShort.ToChar, FromDouble.AndShort.ToInt,
        FromDouble.AndShort.ToLong, FromDouble.AndShort.ToFloat,
        FromDouble.AndShort.ToDouble,

        FromDouble.AndChar.ToDouble,
        FromDouble.AndChar.ToObject, FromDouble.AndChar.ToBoolean,
        FromDouble.AndChar.ToByte, FromDouble.AndChar.ToShort,
        FromDouble.AndChar.ToChar, FromDouble.AndChar.ToInt,
        FromDouble.AndChar.ToLong, FromDouble.AndChar.ToFloat,
        FromDouble.AndChar.ToDouble,

        FromDouble.AndInt.ToDouble,
        FromDouble.AndInt.ToObject, FromDouble.AndInt.ToBoolean,
        FromDouble.AndInt.ToByte, FromDouble.AndInt.ToShort,
        FromDouble.AndInt.ToChar, FromDouble.AndInt.ToInt,
        FromDouble.AndInt.ToLong, FromDouble.AndInt.ToFloat,
        FromDouble.AndInt.ToDouble,

        FromDouble.AndLong.ToDouble,
        FromDouble.AndLong.ToObject, FromDouble.AndLong.ToBoolean,
        FromDouble.AndLong.ToByte, FromDouble.AndLong.ToShort,
        FromDouble.AndLong.ToChar, FromDouble.AndLong.ToInt,
        FromDouble.AndLong.ToLong, FromDouble.AndLong.ToFloat,
        FromDouble.AndLong.ToDouble,

        FromDouble.AndFloat.ToDouble,
        FromDouble.AndFloat.ToObject, FromDouble.AndFloat.ToBoolean,
        FromDouble.AndFloat.ToByte, FromDouble.AndFloat.ToShort,
        FromDouble.AndFloat.ToChar, FromDouble.AndFloat.ToInt,
        FromDouble.AndFloat.ToLong, FromDouble.AndFloat.ToFloat,
        FromDouble.AndFloat.ToDouble,

        FromDouble.AndDouble.ToDouble,
        FromDouble.AndDouble.ToObject, FromDouble.AndDouble.ToBoolean,
        FromDouble.AndDouble.ToByte, FromDouble.AndDouble.ToShort,
        FromDouble.AndDouble.ToChar, FromDouble.AndDouble.ToInt,
        FromDouble.AndDouble.ToLong, FromDouble.AndDouble.ToFloat,
        FromDouble.AndDouble.ToDouble> {

    @Override
    public int hashCode(double[] row, int from, int to) {
        int res = 0;
        for (int i = from; i < to; i++) {
            long bits = Double.doubleToLongBits(row[i]);
            res = 31 * res + (int) (bits ^ (bits >>> 32));
        }
        return res;
    }

    @Override
    public String toString(double[] row, int from, int to) {
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
    public boolean equals(double[] rowA, int fromA, int toA, double[] rowB, int fromB) {
        for (int i = fromA; i < toA; i++) {
            if (rowA[i] != rowB[fromB + (i - fromA)]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Double get(double[] row, int index) {
        return row[index];
    }
    
    public double getDouble(double[] row, int index) {
        return row[index];
    }
    
    @Override
    public Double set(double[] row, int index, Double value) {
        return row[index] = value;
    }
    
    public double setDouble(double[] row, int index, double value) {
        return row[index] = value;
    }

    @Override
    public void move(double[] srcRow, int srcIndex, double[] dstRow, int dstIndex) {
        dstRow[dstIndex] = srcRow[srcIndex];
    }

    @Override
    public void swap(double[] srcRow, int srcIndex, double[] dstRow, int dstIndex) {
        double temp = dstRow[dstIndex];
        dstRow[dstIndex] = srcRow[srcIndex];
        srcRow[srcIndex] = temp;
    }

    @Override
    public void map(double[] row, int from, int to, Object[] dst, int start, FromDouble.ToObject fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, FromDouble.ToVoid fn) {
        for (int i = from; i < to; i++) {
            fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, boolean[] dst, int start, FromDouble.ToBoolean fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, byte[] dst, int start, FromDouble.ToByte fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, short[] dst, int start, FromDouble.ToShort fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, char[] dst, int start, FromDouble.ToChar fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, int[] dst, int start, FromDouble.ToInt fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, long[] dst, int start, FromDouble.ToLong fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, float[] dst, int start, FromDouble.ToFloat fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] row, int from, int to, double[] dst, int start, FromDouble.ToDouble fn) {
        for (int i = from; i < to; i++) {
            dst[start + (i - from)] = fn.apply(row[i]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndObject.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndObject.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndObject.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndObject.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndObject.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndObject.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndObject.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndObject.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, Object[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndObject.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndBoolean.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndBoolean.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndBoolean.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndBoolean.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndBoolean.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndBoolean.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndBoolean.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndBoolean.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, boolean[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndBoolean.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndByte.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndByte.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndByte.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndByte.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndByte.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndByte.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndByte.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndByte.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, byte[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndByte.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndShort.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndShort.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndShort.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndShort.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndShort.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndShort.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndShort.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndShort.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, short[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndShort.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndChar.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndChar.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndChar.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndChar.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndChar.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndChar.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndChar.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndChar.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, char[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndChar.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndInt.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndInt.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndInt.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndInt.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndInt.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndInt.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndInt.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndInt.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, int[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndInt.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndLong.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndLong.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndLong.ToByte fn) {

        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndLong.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndLong.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndLong.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndLong.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndLong.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, long[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndLong.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndFloat.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndFloat.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndFloat.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndFloat.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndFloat.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndFloat.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndFloat.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndFloat.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, float[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndFloat.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, FromDouble.AndDouble.ToObject fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, FromDouble.AndDouble.ToBoolean fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, FromDouble.AndDouble.ToByte fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, short[] dst, int start, FromDouble.AndDouble.ToShort fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, char[] dst, int start, FromDouble.AndDouble.ToChar fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, int[] dst, int start, FromDouble.AndDouble.ToInt fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, long[] dst, int start, FromDouble.AndDouble.ToLong fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, float[] dst, int start, FromDouble.AndDouble.ToFloat fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }

    @Override
    public void map(double[] srcA, double[] srcB, int fromA, int toA, int fromB, double[] dst, int start, FromDouble.AndDouble.ToDouble fn) {
        for (int i = fromA; i < toA; i++) {
            dst[start + (i - fromA)] = fn.apply(srcA[i], srcB[fromB + (i - fromA)]);
        }
    }
}
