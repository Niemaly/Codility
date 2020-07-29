package src.coderbyteTasksTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.coderbyteTasks.ReversePolishNotation;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReversePolishNotationTests {

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("1 1 + 1 + 1 +", "4"),
                Arguments.of("4 5 + 2 1 + *", "27"),
                Arguments.of("2 3 + 5 *", "25"),
                Arguments.of("2 7 + 3 / 14 3 - 4 * + 2 /", "23"),
                Arguments.of("2 12 + 7 /", "2")
        );
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnAnswerForTheGivenPostfixExpression(String input, String expected) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        assertTrue(reversePolishNotation.solution(input).equals(expected));

    }
}
