import io.github.socraticphoenix.matrix.IntVector;
import io.github.socraticphoenix.matrix.NArray;
import io.github.socraticphoenix.matrix.workflow.Workflows;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        NArray array = new NArray(new double[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        }, IntVector.of(4, 4), double.class);

        System.out.println(array.workInPlace(Workflows.GET_OBJECT, IntVector.of(1, 0)));

        System.out.println(Arrays.deepToString(array.toArray()));
    }

}
