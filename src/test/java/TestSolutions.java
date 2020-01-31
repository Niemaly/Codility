
import maxSliceSum.MaxSliceSum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSolutions {


    private static Stream<Arguments> provideValuesForMaxSliceSum_sumAllElementSameSign() {
        return Stream.of(
                Arguments.of(new int[]{3,2,-6,4,0},         new int[]{5,-6,4}),
                Arguments.of(new int[]{1,1,1,1},         new int[]{4}),
                Arguments.of(new int[]{-10, -5, -2},         new int[]{-17}),
                Arguments.of(new int[]{-1,1},    new int[]{-1, 1}),
                Arguments.of(new int[]{1},    new int[]{1}),
                Arguments.of(new int[]{0, 0, 0, 0, 0},    new int[]{0})
        );
    }


    @ParameterizedTest
    @MethodSource("provideValuesForMaxSliceSum_sumAllElementSameSign")
    public void shouldReturnSumAllElementsWithSameSignInNewArray(int [] input, int [] expected){
        MaxSliceSum maxSliceSum = new MaxSliceSum();

        int [] array = maxSliceSum.sumAllElementSameSign(input);

        assertTrue(Arrays.equals(array, expected));

    }



}
