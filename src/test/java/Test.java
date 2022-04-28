import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.function.FromDouble;

public class Test {

    public static void main(String[] args) {
        NArray<Double, double[]> array = NArray.of(new double[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        System.out.println(array.map((FromDouble.ToObject<String>) a -> String.valueOf(a)));
        System.out.println(array.transpose());
        System.out.println(array.posMatrix());
    }

}
