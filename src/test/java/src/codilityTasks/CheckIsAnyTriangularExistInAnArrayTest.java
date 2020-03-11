package src.codilityTasks;

import src.codilityTasks.chackIsAnyTriangularExistInAnArray.CheckIsAnyTriangularExistInAnArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CheckIsAnyTriangularExistInAnArrayTest {
    public CheckIsAnyTriangularExistInAnArrayTest() {
    }

    private static Stream<Arguments> provideDataForTriangularTest() {
        return Stream.of(

                Arguments.of(new int[]{1, 2, 5, 10, 8, 20}, 1),
                Arguments.of(new int[]{1, 50, 2, 10, 5, 5, 5}, 0),
                Arguments.of(new int[]{1, 50, 2, -10, -50, -100, 5, 5, 5}, 0),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1, 2}, 0),
                Arguments.of(new int[]{4, 2, 3}, 1),
                Arguments.of(new int[]{1, 2, 3}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTriangularTest")
    public void shouldReturnOneIfItsTriangularInArrayAnd0IfThereIsNot(int[] input, int expected) {
        CheckIsAnyTriangularExistInAnArray solution2 = new CheckIsAnyTriangularExistInAnArray();

        Assertions.assertTrue(solution2.solution(input) == expected);

    }
}