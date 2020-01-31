package codewarsTests;

import codeWarsSpiralTask.CodeWarsNumbersSpiral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CodeWarsNumbersSpiralTest {
    public CodeWarsNumbersSpiralTest() {
    }

    private static Stream<Arguments> provideValuesForCodeWarsTaskWithSpiral() {
        return Stream.of(
                Arguments.of(4, 2, 40),
                Arguments.of(4, 2, 22)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForCodeWarsTaskWithSpiral")
    public void shouldReturnSumOfColumnInSquareNumberSpiral(int number, int column, long expected) {
        CodeWarsNumbersSpiral codeWarsNumbersSpiral = new CodeWarsNumbersSpiral();
        Assertions.assertTrue(codeWarsNumbersSpiral.solution(number, column) == expected);

    }
}