package src.codilityTasks;

import src.codilityTasks.brickedTask.SolutionBrackets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionBracketsTest {
    public SolutionBracketsTest() {
    }

    private static Stream<Arguments> provideDataForBracketTask() {
        return Stream.of(

                Arguments.of("", 1),
                Arguments.of("{[()()]}", 1),
                Arguments.of("([)()]", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForBracketTask")
    public void shouldReturnOneIfBrick(String input, int expected) {
        SolutionBrackets solutionBrackets = new SolutionBrackets();

        Assertions.assertTrue(solutionBrackets.solution2(input) == expected);

    }
}