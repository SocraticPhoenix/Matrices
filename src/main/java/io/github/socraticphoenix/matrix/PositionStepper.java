package io.github.socraticphoenix.matrix;

import java.util.Arrays;

public class PositionStepper {
    private IntVector end;

    private int[] counter;

    public PositionStepper(IntVector shape) {
        this.end = shape;
        this.counter = new int[shape.size()];
    }

    public PositionStepper(IntVector start, IntVector end) {
        this.end = end;
        this.counter = start.toArray();
    }

    public boolean hasNext() {
        for (int i = 0; i < this.counter.length; i++) {
            if (this.counter[i] >= this.end.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void moveNext() {
        this.counter[this.counter.length - 1] += 1;
        for (int i = this.counter.length - 1; i > 0; i--) {
            if (this.counter[i] >= this.end.get(i)) {
                this.counter[i] = 0;
                this.counter[i - 1] += 1;
            } else {
                break;
            }
        }
    }

    public IntVector snapshot() {
        return IntVector.of(this.counter);
    }

    public int[] current() {
        return this.counter;
    }

    public void reset() {
        Arrays.fill(this.counter, 0);
    }

}
