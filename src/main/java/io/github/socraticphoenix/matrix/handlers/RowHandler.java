package io.github.socraticphoenix.matrix.handlers;

public interface RowHandler<T, A, TO_SELF,
        TO_OBJECT, TO_VOID, TO_BOOL, TO_BYTE, 
        TO_SHORT, TO_CHAR, TO_INT, TO_LONG, 
        TO_FLOAT, TO_DOUBLE,

        AND_SELF_TO_SELF,
        AND_SELF_TO_OBJECT, AND_SELF_TO_BOOL, AND_SELF_TO_BYTE,
        AND_SELF_TO_SHORT, AND_SELF_TO_CHAR, AND_SELF_TO_INT,
        AND_SELF_TO_LONG, AND_SELF_TO_FLOAT, AND_SELF_TO_DOUBLE,

        AND_OBJECT_TO_SELF,
        AND_OBJECT_TO_OBJECT, AND_OBJECT_TO_BOOL, AND_OBJECT_TO_BYTE,
        AND_OBJECT_TO_SHORT, AND_OBJECT_TO_CHAR, AND_OBJECT_TO_INT,
        AND_OBJECT_TO_LONG, AND_OBJECT_TO_FLOAT, AND_OBJECT_TO_DOUBLE,

        AND_BOOL_TO_SELF,
        AND_BOOL_TO_OBJECT, AND_BOOL_TO_BOOL, AND_BOOL_TO_BYTE,
        AND_BOOL_TO_SHORT, AND_BOOL_TO_CHAR, AND_BOOL_TO_INT,
        AND_BOOL_TO_LONG, AND_BOOL_TO_FLOAT, AND_BOOL_TO_DOUBLE,

        AND_BYTE_TO_SELF,
        AND_BYTE_TO_OBJECT, AND_BYTE_TO_BOOL, AND_BYTE_TO_BYTE,
        AND_BYTE_TO_SHORT, AND_BYTE_TO_CHAR, AND_BYTE_TO_INT,
        AND_BYTE_TO_LONG, AND_BYTE_TO_FLOAT, AND_BYTE_TO_DOUBLE,

        AND_SHORT_TO_SELF,
        AND_SHORT_TO_OBJECT, AND_SHORT_TO_BOOL, AND_SHORT_TO_BYTE,
        AND_SHORT_TO_SHORT, AND_SHORT_TO_CHAR, AND_SHORT_TO_INT,
        AND_SHORT_TO_LONG, AND_SHORT_TO_FLOAT, AND_SHORT_TO_DOUBLE,

        AND_CHAR_TO_SELF,
        AND_CHAR_TO_OBJECT, AND_CHAR_TO_BOOL, AND_CHAR_TO_BYTE,
        AND_CHAR_TO_SHORT, AND_CHAR_TO_CHAR, AND_CHAR_TO_INT,
        AND_CHAR_TO_LONG, AND_CHAR_TO_FLOAT, AND_CHAR_TO_DOUBLE,

        AND_INT_TO_SELF,
        AND_INT_TO_OBJECT, AND_INT_TO_BOOL, AND_INT_TO_BYTE,
        AND_INT_TO_SHORT, AND_INT_TO_CHAR, AND_INT_TO_INT,
        AND_INT_TO_LONG, AND_INT_TO_FLOAT, AND_INT_TO_DOUBLE,

        AND_LONG_TO_SELF,
        AND_LONG_TO_OBJECT, AND_LONG_TO_BOOL, AND_LONG_TO_BYTE,
        AND_LONG_TO_SHORT, AND_LONG_TO_CHAR, AND_LONG_TO_INT,
        AND_LONG_TO_LONG, AND_LONG_TO_FLOAT, AND_LONG_TO_DOUBLE,

        AND_FLOAT_TO_SELF,
        AND_FLOAT_TO_OBJECT, AND_FLOAT_TO_BOOL, AND_FLOAT_TO_BYTE,
        AND_FLOAT_TO_SHORT, AND_FLOAT_TO_CHAR, AND_FLOAT_TO_INT,
        AND_FLOAT_TO_LONG, AND_FLOAT_TO_FLOAT, AND_FLOAT_TO_DOUBLE,

        AND_DOUBLE_TO_SELF,
        AND_DOUBLE_TO_OBJECT, AND_DOUBLE_TO_BOOL, AND_DOUBLE_TO_BYTE,
        AND_DOUBLE_TO_SHORT, AND_DOUBLE_TO_CHAR, AND_DOUBLE_TO_INT,
        AND_DOUBLE_TO_LONG, AND_DOUBLE_TO_FLOAT, AND_DOUBLE_TO_DOUBLE> {

    int hashCode(A row, int from, int to);

    String toString(A row, int from, int to);

    boolean equals(A rowA, int fromA, int toA, A rowB, int fromB);

    T get(A row, int index);

    T set(A row, int index, T value);

    void move(A srcRow, int srcIndex, A dstRow, int dstIndex);

    void swap(A srcRow, int srcIndex, A dstRow, int dstIndex);
    
    //Unary mapping
    void map(A row, int from, int to, A dst, int start, TO_SELF fn);

    void map(A row, int from, int to, Object[] dst, int start, TO_OBJECT fn);

    void map(A row, int from, int to, TO_VOID fn);
    
    void map(A row, int from, int to, boolean[] dst, int start, TO_BOOL fn);

    void map(A row, int from, int to, byte[] dst, int start, TO_BYTE fn);

    void map(A row, int from, int to, short[] dst, int start, TO_SHORT fn);

    void map(A row, int from, int to, char[] dst, int start, TO_CHAR fn);

    void map(A row, int from, int to, int[] dst, int start, TO_INT fn);

    void map(A row, int from, int to, long[] dst, int start, TO_LONG fn);

    void map(A row, int from, int to, float[] dst, int start, TO_FLOAT fn);

    void map(A row, int from, int to, double[] dst, int start, TO_DOUBLE fn);
    
    //Binary mapping

    //A, A
    void map(A srcA, A srcB, int fromA, int toA, int fromB, A dst, int start, AND_SELF_TO_SELF fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_SELF_TO_OBJECT fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_SELF_TO_BOOL fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_SELF_TO_BYTE fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_SELF_TO_SHORT fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_SELF_TO_CHAR fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_SELF_TO_INT fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_SELF_TO_LONG fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_SELF_TO_FLOAT fn);

    void map(A srcA, A srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_SELF_TO_DOUBLE fn);

    //A, Object
    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_OBJECT_TO_SELF fn);

    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_OBJECT_TO_OBJECT fn);
    
    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_OBJECT_TO_BOOL fn);

    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_OBJECT_TO_BYTE fn);

    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_OBJECT_TO_SHORT fn);

    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_OBJECT_TO_CHAR fn);

    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_OBJECT_TO_INT fn);

    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_OBJECT_TO_LONG fn);

    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_OBJECT_TO_FLOAT fn);

    void map(A srcA, Object[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_OBJECT_TO_DOUBLE fn);
    
    //A, Bool
    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_BOOL_TO_SELF fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_BOOL_TO_OBJECT fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_BOOL_TO_BOOL fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_BOOL_TO_BYTE fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_BOOL_TO_SHORT fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_BOOL_TO_CHAR fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_BOOL_TO_INT fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_BOOL_TO_LONG fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_BOOL_TO_FLOAT fn);

    void map(A srcA, boolean[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_BOOL_TO_DOUBLE fn);
    
    //A, Byte
    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_BYTE_TO_SELF fn);
    
    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_BYTE_TO_OBJECT fn);

    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_BYTE_TO_BOOL fn);

    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_BYTE_TO_BYTE fn);

    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_BYTE_TO_SHORT fn);

    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_BYTE_TO_CHAR fn);

    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_BYTE_TO_INT fn);

    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_BYTE_TO_LONG fn);

    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_BYTE_TO_FLOAT fn);

    void map(A srcA, byte[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_BYTE_TO_DOUBLE fn);
    
    //A, Short
    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_SHORT_TO_SELF fn);
    
    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_SHORT_TO_OBJECT fn);

    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_SHORT_TO_BOOL fn);

    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_SHORT_TO_BYTE fn);

    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_SHORT_TO_SHORT fn);

    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_SHORT_TO_CHAR fn);

    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_SHORT_TO_INT fn);

    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_SHORT_TO_LONG fn);

    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_SHORT_TO_FLOAT fn);

    void map(A srcA, short[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_SHORT_TO_DOUBLE fn);
    
    //A, Char
    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_CHAR_TO_SELF fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_CHAR_TO_OBJECT fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_CHAR_TO_BOOL fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_CHAR_TO_BYTE fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_CHAR_TO_SHORT fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_CHAR_TO_CHAR fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_CHAR_TO_INT fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_CHAR_TO_LONG fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_CHAR_TO_FLOAT fn);

    void map(A srcA, char[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_CHAR_TO_DOUBLE fn);
    
    //A, Int
    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_INT_TO_SELF fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_INT_TO_OBJECT fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_INT_TO_BOOL fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_INT_TO_BYTE fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_INT_TO_SHORT fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_INT_TO_CHAR fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_INT_TO_INT fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_INT_TO_LONG fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_INT_TO_FLOAT fn);

    void map(A srcA, int[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_INT_TO_DOUBLE fn);
    
    //A, Long
    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_LONG_TO_SELF fn);
    
    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_LONG_TO_OBJECT fn);

    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_LONG_TO_BOOL fn);

    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_LONG_TO_BYTE fn);

    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_LONG_TO_SHORT fn);

    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_LONG_TO_CHAR fn);

    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_LONG_TO_INT fn);

    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_LONG_TO_LONG fn);

    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_LONG_TO_FLOAT fn);

    void map(A srcA, long[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_LONG_TO_DOUBLE fn);
    
    //A, Float
    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_FLOAT_TO_SELF fn);
    
    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_FLOAT_TO_OBJECT fn);

    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_FLOAT_TO_BOOL fn);

    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_FLOAT_TO_BYTE fn);

    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_FLOAT_TO_SHORT fn);

    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_FLOAT_TO_CHAR fn);

    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_FLOAT_TO_INT fn);

    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_FLOAT_TO_LONG fn);

    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_FLOAT_TO_FLOAT fn);

    void map(A srcA, float[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_FLOAT_TO_DOUBLE fn);
    
    //A, Double
    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, A dst, int start, AND_DOUBLE_TO_SELF fn);
    
    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, Object[] dst, int start, AND_DOUBLE_TO_OBJECT fn);

    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, boolean[] dst, int start, AND_DOUBLE_TO_BOOL fn);

    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, byte[] dst, int start, AND_DOUBLE_TO_BYTE fn);

    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, short[] dst, int start, AND_DOUBLE_TO_SHORT fn);

    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, char[] dst, int start, AND_DOUBLE_TO_CHAR fn);

    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, int[] dst, int start, AND_DOUBLE_TO_INT fn);

    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, long[] dst, int start, AND_DOUBLE_TO_LONG fn);

    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, float[] dst, int start, AND_DOUBLE_TO_FLOAT fn);

    void map(A srcA, double[] srcB, int fromA, int toA, int fromB, double[] dst, int start, AND_DOUBLE_TO_DOUBLE fn);
}

