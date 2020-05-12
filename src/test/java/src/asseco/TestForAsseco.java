package src.asseco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForAsseco {

    private static Stream<Arguments> provideDataForTaskNr1() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 6, 4, 1, 2}, 5),
                Arguments.of(new int[]{1, 2, 3}, 4),
                Arguments.of(new int[]{-1, -3}, 1)

        );
    }



    @ParameterizedTest
    @MethodSource("provideDataForTaskNr1")
    public void should(int[] input, int expected) {
        AssecoSolution assecoSolution = new AssecoSolution();
        assertTrue(assecoSolution.solution(input) == expected);

    }




}