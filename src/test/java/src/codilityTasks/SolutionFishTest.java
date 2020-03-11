package src.codilityTasks;

import src.codilityTasks.fish.SolutionFish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionFishTest {
    public SolutionFishTest() {
    }

    private static Stream<Arguments> provideValuesForFishTask() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}, 2),
                Arguments.of(new int[]{2, 3}, new int[]{1, 0}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValuesForFishTask")
    public void shouldReturnNumberOfLivingFishes(int[] A, int[] B, int expected) {
        SolutionFish solutionFish = new SolutionFish();
        Assertions.assertTrue(solutionFish.solution2(A, B) == expected);

    }
}