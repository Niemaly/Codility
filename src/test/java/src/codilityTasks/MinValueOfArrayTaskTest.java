package src.codilityTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.codilityTasks.task.SolutionMinValueOfArray;

import java.util.stream.Stream;

public class MinValueOfArrayTaskTest {
    public MinValueOfArrayTaskTest() {
    }

    private static Stream<Arguments> provideDataForMinValueOfArrayTask() {
        return Stream.of(

                Arguments.of(new int[]{1, 2, 5, 10, 8, 20}, 1),
                Arguments.of(new int[]{-100, 12, -200, 0}, -200),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{0, 0, 0, 0, 0, 1}, 0),
                Arguments.of(new int[]{}, 0)

        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForMinValueOfArrayTask")
    public void shouldReturnSmallestIntMinValueOfArrayTask(int[] input, int expected) {
        SolutionMinValueOfArray sol = new SolutionMinValueOfArray();
        Assertions.assertTrue(sol.solution(input) == expected);
    }
}