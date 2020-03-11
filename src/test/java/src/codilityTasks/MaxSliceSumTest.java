package src.codilityTasks;

import src.codilityTasks.maxSliceSum.MaxSliceSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaxSliceSumTest {
    public MaxSliceSumTest() {
    }

    private static Stream<Arguments> provideValuesForMaxSliceSum() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, -6, 4, 0}, 5),
                Arguments.of(new int[]{1, 1, 1, 1}, 4),
                Arguments.of(new int[]{-10, -5, -2}, -2),
                Arguments.of(new int[]{-1, 6, -1, 6, -1, 6, -1, 6}, 21)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForMaxSliceSum")
    public void shouldReturnBiggestSliceSum(int[] input, int expected) {
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        Assertions.assertTrue(maxSliceSum.solution(input) == expected);

    }
}