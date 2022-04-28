import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.function.FromDouble;

public class Test {

    public static void main(String[] args) {
        NArray<Double, double[]> array = NArray.of(new double[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        array.map((FromDouble.ToDouble) a -> Math.pow(a, 0.5), true);

        System.out.println(array);
        System.out.println(array.slice(IntVector.of(1, 1), IntVector.of(3, 3)));
        System.out.println(array.slice(IntVector.of(1, 1), IntVector.of(3, 3)).flatten());
    }

}
