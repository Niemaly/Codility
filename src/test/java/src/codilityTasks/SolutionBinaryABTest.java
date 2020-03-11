package src.codilityTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.codilityTasks.task.SolutionBinaryAB;

import java.util.stream.Stream;

public class SolutionBinaryABTest {
    public SolutionBinaryABTest() {
    }

    private static Stream<Arguments> provideABForABBinaryStream() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(0, 0, 0),
                Arguments.of(3, 7, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideABForABBinaryStream")
    public void shouldReturnSumBinaryReprezentationAB(int A, int B, int expected) {
        SolutionBinaryAB solutionBinaryAB = new SolutionBinaryAB();
        Assertions.assertTrue(solutionBinaryAB.solution(A, B) == expected);

    }
}