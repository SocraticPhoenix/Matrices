package io.github.socraticphoenix.matrix;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

public class IntVector {
    private int a, b;
    private int[] nums;

    public static IntVector of(int... vals) {
        return new IntVector(vals);
    }

    public static IntVector zeroes(int size) {
        return IntVector.of(new int[size]);
    }

    public IntVector(int[] nums) {
        this.nums = Arrays.copyOf(nums, nums.length);
        this.a = 0;
        this.b = nums.length;
    }

    private IntVector(int a, int b, int[] nums) {
        this.a = a;
        this.b = b;
        this.nums = nums;
    }

    public long product() {
        int prod = 1;
        for (int i = a; i < this.b; i++) {
            prod *= this.nums[i];
        }
        return prod;
    }

    public IntVector concat(int... vals) {
        int[] res = new int[this.size() + vals.length];
        for (int i = 0; i < this.size(); i++) {
            res[i] = this.get(i);
        }

        for (int i = 0; i < vals.length; i++) {
            res[i + this.size()] = vals[i];
        }

        return new IntVector(0,  res.length, res);
    }

    public IntVector concat(IntVector other) {
        int[] res = new int[this.size() + other.size()];
        for (int i = 0; i < this.size(); i++) {
            res[i] = this.get(i);
        }

        for (int i = 0; i < other.size(); i++) {
            res[i + this.size()] = other.get(i);
        }

        return new IntVector(0, res.length, res);
    }

    public IntVector add(IntVector other) {
        return map(other, (a, b) -> a + b);
    }

    public IntVector add(int scalar) {
        return map(a -> a + scalar);
    }

    public IntVector add(int index, int scalar) {
        return map(index, v -> v + scalar);
    }

    public IntVector subtract(IntVector other) {
        return map(other, (a, b) -> a - b);
    }

    public IntVector subtract(int scalar) {
        return map(a -> a - scalar);
    }

    public IntVector subtract(int index, int scalar) {
        return map(index, v -> v - scalar);
    }

    public IntVector set(int index, int value) {
        return map(index, v -> value);
    }

    public IntVector map(IntVector other, IntBinaryOperator op) {
        int[] result = new int[this.b - a];
        for (int i = 0; i < this.size(); i++) {
            result[i] = op.applyAsInt(this.get(i), other.get(i));
        }
        return new IntVector(0, result.length, result);
    }

    public IntVector map(IntUnaryOperator op) {
        int[] result = new int[this.b - a];
        for (int i = 0; i < this.size(); i++) {
            result[i] = op.applyAsInt(this.get(i));
        }
        return new IntVector(0, result.length, result);
    }

    public IntVector map(int index, IntUnaryOperator op) {
        int[] result = this.toArray();
        result[index] = op.applyAsInt(result[index]);
        return new IntVector(0, result.length, result);
    }

    private void check(IntVector other) {
        if (this.size() != other.size()) {
            throw new DimensionMismatchException(this.size() + " does not match " + other.size());
        }
    }

    public IntVector reverse() {
        int[] res = new int[this.size()];
        for (int i = this.b - 1, j = 0; i >= this.a; i--, j++) {
            res[j] = this.nums[i];
        }
        return new IntVector(0, res.length, res);
    }

    public int get(int index) {
        return this.nums[this.a + index];
    }

    public int size() {
        return this.b - this.a;
    }

    public IntVector slice(int start, int end) {
        if (start < 0 || end < start || start > size() || end > size()) {
            throw new DimensionMismatchException("Range [" + start + ", " + end + ") cannot be sliced from size " + this.size());
        }

        return new IntVector(start + a, end + a, this.nums);
    }

    public int[] toArray() {
        int[] array = new int[this.b - this.a];
        System.arraycopy(this.nums, this.a, array, 0, this.b - this.a);
        return array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = a; i < b; i++) {
            sb.append(this.nums[i]);

            if (i < b - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntVector intVector = (IntVector) o;
        if (this.size() == intVector.size()) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i) != intVector.get(i)) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (int i = a; i < b; i++) {
            result += this.nums[i] * 31;
        }
        return result;
    }

    public IntStream stream() {
        return StreamSupport.intStream(Spliterators.spliterator(new IntIterator(), this.size(),
                Spliterator.ORDERED | Spliterator.IMMUTABLE | Spliterator.NONNULL), false);
    }

    private class IntIterator implements PrimitiveIterator.OfInt {
        private int start = a;

        @Override
        public int nextInt() {
            return nums[start++];
        }

        @Override
        public boolean hasNext() {
            return start < b;
        }
    }

}
