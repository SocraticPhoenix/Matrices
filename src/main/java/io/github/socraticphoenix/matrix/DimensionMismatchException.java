package io.github.socraticphoenix.matrix;

public class DimensionMismatchException extends RuntimeException {

    public DimensionMismatchException() {
    }

    public DimensionMismatchException(String message) {
        super(message);
    }

    public DimensionMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public DimensionMismatchException(Throwable cause) {
        super(cause);
    }

    public DimensionMismatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
