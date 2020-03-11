package codewarsTests;

import src.codewars.codeWarsSpiralTask.CodeWarsNumbersSpiral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class CodeWarsNumbersSpiralTest {
    public CodeWarsNumbersSpiralTest() {
    }

    private static Stream<Arguments> provideValuesForCodeWarsTaskWithSpiral() {
        return Stream.of(
                Arguments.of(3, new int[][]{
                        {1, 2, 3},
                        {8, 9, 4},
                        {7, 6, 5}
                        })

        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForCodeWarsTaskWithSpiral")
    public void shouldReturnSumOfColumnInSquareNumberSpiral(int number, int [][] expected ) {
        CodeWarsNumbersSpiral codeWarsNumbersSpiral = new CodeWarsNumbersSpiral();
        Assertions.assertTrue(Arrays.equals(codeWarsNumbersSpiral.createSpiral(number), expected));

    }
}