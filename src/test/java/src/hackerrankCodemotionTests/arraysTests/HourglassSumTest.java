package src.hackerrankCodemotionTests.arraysTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.hackerrankCodemotion.arrays.HourglassSum;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HourglassSumTest {

    private static Stream<Arguments> provideData() {

        String str = "-9 -9 -9 1 1 1 0 -9 0 4 3 2 -9 -9 -9 1 2 3 0 0 8 6 6 0 0 0 0 -2 0 0 0 0 1 2 4 0";
        int [] arr = Arrays.stream(str.split(" ")).flatMapToInt(e -> IntStream.of(Integer.parseInt(e))).toArray();
        int [][] arr2 = new int[5][6];
        int counter =0;
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 6; j++) {
                arr2[i][j] = arr[counter];
                counter++;
            }
        }
        return Stream.of(
                Arguments.of(new int [][]{
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}}, 19),
                Arguments.of(arr2,28)

        );
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnHighestHourglassSum(int[][] input, int expected) {
        HourglassSum result = new HourglassSum();
        assertTrue(result.hourglassSum(input)==(expected));

    }


}
