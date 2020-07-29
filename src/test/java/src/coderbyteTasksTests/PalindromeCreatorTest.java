package src.coderbyteTasksTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import src.coderbyteTasks.PalindromeCreator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCreatorTest {


    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("mmop", "not possible"),
                Arguments.of("kjjjhjjj", "k"),
                Arguments.of("aba", "palindrome"),
                Arguments.of("abcbaa", "a"),
                Arguments.of("mama", "m")



        );
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnPalindrmeAfterRemove1or2LettersOrWordPalindromeIfItAlreadyIsItOrLettersThatItHasToRemove(String input, String expected) {
        PalindromeCreator palindromeCreatorTest1 = new PalindromeCreator();
        assertTrue(palindromeCreatorTest1.palindromeCreator(input).equals(expected));

    }
}
