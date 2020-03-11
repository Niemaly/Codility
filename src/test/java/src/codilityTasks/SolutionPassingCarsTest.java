package src.codilityTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.codilityTasks.passingCars.SolutionPassingCars;

import java.util.stream.Stream;

public class SolutionPassingCarsTest {
    public SolutionPassingCarsTest() {
    }

    private static Stream<Arguments> provideValuesForPassingCars() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 1, 0, 0, 0, 0, 1}, 9),
                Arguments.of(new int[]{0, 1, 0, 1, 1}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForPassingCars")
    public void shouldReturnNumberOfPassingCars(int[] input, int expected) {
        SolutionPassingCars solutionPassingCars = new SolutionPassingCars();
        Assertions.assertTrue(solutionPassingCars.solution(input) == expected);

    }
}