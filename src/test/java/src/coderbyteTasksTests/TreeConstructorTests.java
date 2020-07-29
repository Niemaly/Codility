package src.coderbyteTasksTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.coderbyteTasks.TreeConstructor;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreeConstructorTests {

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}, "true"),
                Arguments.of(new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"}, "false"),
                Arguments.of(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)", "(999,555)"}, "false")

        );
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void should(String [] input, String expected) {
        TreeConstructor treeConstructor = new TreeConstructor();
        assertTrue(treeConstructor.solution(input).equals(expected));

    }



}
