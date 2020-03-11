package src.codilityTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.codilityTasks.smallestIntThatisNotInArray.SmallestIntInArray;

import java.util.stream.Stream;

public class SmallestIntThatIsNotInArrayTest {
    public SmallestIntThatIsNotInArrayTest() {
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 5),
                Arguments.of(new int[]{1}, 2),
                Arguments.of(new int[]{-1, -2, -3, -4}, 1),
                Arguments.of(new int[]{2, 3}, 1),
                Arguments.of(new int[]{1, 3, 6, 4, 1, 2}, 5)

        );
    }

    @ParameterizedTest
    @MethodSource("provideData")
    public void smallestIntThatIsNotInArrayTestShouldCheckIsNumberIsNotInArray(int[] input, int expected) {

        SmallestIntInArray sol = new SmallestIntInArray();
        Assertions.assertTrue(sol.solution(input) == expected);
    }
}