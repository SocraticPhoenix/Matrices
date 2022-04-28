package io.github.socraticphoenix.matrix.function;

public interface RowConsumer<A> {

    void apply(A row, int start, int end);

}
