import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.function.FromBoolean;
import io.github.socraticphoenix.matrix.function.FromDouble;

public class Test {

    public static void main(String[] args) {
        NArray<Double, double[]> a = new NArray<>(new double[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        NArray<Double, double[]> b = new NArray<>(new double[][] {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        });

        NArray<Double, double[]> c = new NArray<>(new double[][] {
                {1, 2, 3},
                {4, 5, 6}
        });

    }

    private static void time(Runnable op) {
        long curr = System.currentTimeMillis();
        op.run();
        long now = System.currentTimeMillis() - curr;

        long secs = (now / 1000) % 60;
        long ms = now - (secs * 1000);
        System.out.println("Took: " + secs + " second(s) and " + ms + " millis");
    }

}
