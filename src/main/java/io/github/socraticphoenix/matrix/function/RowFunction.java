package io.github.socraticphoenix.matrix.function;

public interface RowFunction<A, R> {

    R apply(A row, int start, int end);

}
