import nested.SolutionNested;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionNestedTest {
    public SolutionNestedTest() {
    }

    private static Stream<Arguments> provideValuesForNestingTask() {
        return Stream.of(

                Arguments.of("", 1),
                Arguments.of("()()()()()", 1),
                Arguments.of("(((((()()()()(((((())))))()()())))))", 1),
                Arguments.of("()()(()()()", 0),
                Arguments.of("()))", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForNestingTask")
    public void shouldReturnOneIfCorrectNestedAndZeroIfNot(String input, int expected) {
        SolutionNested solutionNested = new SolutionNested();
        Assertions.assertTrue(solutionNested.solution(input) == expected);

    }
}