package src.hackerrankCodemotionTests.arraysTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.hackerrankCodemotion.arrays.RotateLeft;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RotLeftTests {

    private static Stream<Arguments> provideData() {

        return Stream.of(
                Arguments.of(new int [] {1, 2, 3, 4, 5}, new int[]{5, 4}, new int[] {5, 1, 2, 3, 4}),
                Arguments.of(new int [] {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51}, new int[]{20, 10},
                        new int[] {77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77})

        );
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnArrayThatIsRotatedLeftNTimes(int[] inputA,int [] inputB , int[] expected) {
        RotateLeft result = new RotateLeft();
        assertTrue(Arrays.equals(result.rotLeft(inputA, inputB),expected));

    }
}
