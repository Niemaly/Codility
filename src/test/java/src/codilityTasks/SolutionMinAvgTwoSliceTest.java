package src.codilityTasks;

import src.codilityTasks.minAvgTwoSlice.SolutionMinAvgTwoSlice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionMinAvgTwoSliceTest {
    public SolutionMinAvgTwoSliceTest() {
    }

    private static Stream<Arguments> provideValuesForMinAvgTwoSlice() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 2, 4, 5, 1, 5, 8}, 1),
                Arguments.of(new int[]{-220, -2, -32, -333333}, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12, 12, 13, 14, 15, 16, 17}, 0),
                Arguments.of(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, 8)

        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForMinAvgTwoSlice")
    public void shouldReturnMinAvgTwoSliceOfArray(int[] input, int expected) {
        SolutionMinAvgTwoSlice solutionMinAvgTwoSlice = new SolutionMinAvgTwoSlice();
        Assertions.assertTrue(solutionMinAvgTwoSlice.solution2(input) == expected);

    }
}