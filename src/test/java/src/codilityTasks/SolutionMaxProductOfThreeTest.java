package src.codilityTasks;

import src.codilityTasks.maxProductOfThree.SolutionMaxProductOfThree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionMaxProductOfThreeTest {
    public SolutionMaxProductOfThreeTest() {
    }

    private static Stream<Arguments> provideValuesForMaxProductOfThree() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 0, 5, 6}, 60),
                Arguments.of(new int[]{-5, 5, -5, 4}, 125)

        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForMaxProductOfThree")
    public void shouldReturnMaxProductOfThree(int[] input, int expected) {
        SolutionMaxProductOfThree solutionMaxProductOfThree = new SolutionMaxProductOfThree();
        Assertions.assertTrue(solutionMaxProductOfThree.solution(input) == expected);

    }
}