package src.coderbyteTasksTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import src.coderbyteTasks.NonrepeatingCharacter;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NoRepeatingCharTest {

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("abcdef", "a"),
                Arguments.of("hello world hi hey", "w")

        );
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void should(String input, String expected) {
        NonrepeatingCharacter noRepeatingCharacter = new NonrepeatingCharacter();
        assertTrue(noRepeatingCharacter.solution(input).equals(expected));

    }


}
