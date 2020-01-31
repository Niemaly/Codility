import maxProfit.MaxProfit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaxProfitTest {
    public MaxProfitTest() {
    }

    private static Stream<Arguments> provideValuesForMaxProfit() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 1, 5}, 4),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, 0),
                Arguments.of(new int[]{23171, 21011, 21123, 21366, 21013, 21367}, 356),
                Arguments.of(new int[]{2, 3}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForMaxProfit")
    public void shouldReturnMaxProfit(int[] input, int expected) {
        MaxProfit maxProfit = new MaxProfit();
        Assertions.assertTrue(maxProfit.solution(input) == expected);

    }
}