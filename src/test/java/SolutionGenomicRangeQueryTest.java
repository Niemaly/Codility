import genomicRangeQuery.SolutionGenomicRangeQuery;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class SolutionGenomicRangeQueryTest {
    public SolutionGenomicRangeQueryTest() {
    }

    private static Stream<Arguments> provideValuesForGenomicRangeQuery() {
        return Stream.of(
                Arguments.of("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}, new int[]{2, 4, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForGenomicRangeQuery")
    public void shouldReturnArrayOfMinGenom(String input, int[] P, int[] Q, int[] expected) {
        SolutionGenomicRangeQuery solutionGenomicRangeQuery = new SolutionGenomicRangeQuery();
        Assertions.assertTrue(Arrays.equals(solutionGenomicRangeQuery.solution(input, P, Q), expected));

    }
}