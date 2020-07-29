package src.asseco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForAssecoTask1 {


    private static Stream<Arguments> provideDataForTaskNr1() {


        return Stream.of(
                Arguments.of(8, 0, 7),
                Arguments.of(0, 0, 1),
                Arguments.of(0, 100, 1),
                Arguments.of(18, 2, 6),
                Arguments.of(10, 10, 4)

        );
    }


    @ParameterizedTest
    @MethodSource("provideDataForTaskNr1")
    public void should(int inputN, int inputK, int expected) {
        AssecoSolutionTask1 assecoSolutionTask1 = new AssecoSolutionTask1();
        assertTrue(assecoSolutionTask1.solution(inputN, inputK) == expected);

    }




}
