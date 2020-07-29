package src.asseco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForAssecoTask2 {


    private static Stream<Arguments> provideDataForTaskNr2() {


        return Stream.of(
                Arguments.of(new int[]{2,1,1,3,2,1,1,3}, 3),
                Arguments.of(new int[]{1,1,1,1,1}, 1),
                Arguments.of(new int[]{10,9,2}, 3),
                Arguments.of(new int[]{7,5,2,7,2,7,4,7}, 6),
                Arguments.of(new int[]{1, 3}, 2)

        );
    }


    @ParameterizedTest
    @MethodSource("provideDataForTaskNr2")
    public void should(int[] input, int expected) {
        AssecoSolutionTask2 assecoSolutionTask2 = new AssecoSolutionTask2();
        assertTrue(assecoSolutionTask2.solution(input) == expected);

    }




}
