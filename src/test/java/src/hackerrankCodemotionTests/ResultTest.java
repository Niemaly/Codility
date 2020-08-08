package src.hackerrankCodemotionTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.hackerrankCodemotion.Result1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultTest {

    private static Stream<Arguments> provideData() {

        int[] table = new int[]{-4 ,3,2,1};
        int[] table1 = new int[]{-4 ,3,-2,-2,-2,1};
        int[] table2 = new int[]{-4 ,3,-2,-2,-2,2,1};
        int[] table3 = new int[]{3,-6,5,-2,1};
        int[] table4 = new int[]{-5,4,-2,3,1,-1,-6,-1,0,5};
        int[] table5 = new int[]{-5,4,-2,3,1,-1,-6,-1,0,-5};

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        List<Integer> f = new ArrayList<>();
        List<Integer> g = new ArrayList<>();

        Arrays.stream(table).forEach(e->a.add(e));
        Arrays.stream(table1).forEach(e->b.add(e));
        Arrays.stream(table2).forEach(e->c.add(e));
        Arrays.stream(table3).forEach(e->d.add(e));
        Arrays.stream(table4).forEach(e->f.add(e));
        Arrays.stream(table5).forEach(e->g.add(e));


        return Stream.of(
                Arguments.of(a, 5L),
                Arguments.of(b, 7L),
                Arguments.of(c, 7L),
                Arguments.of(d, 4L),
                Arguments.of(f, 8L),
                Arguments.of(g, 13L)

        );
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void should(List<Integer> input, Long expected) {
        Result1 result = new Result1();
        assertTrue(result.minStart2(input)==(expected));

    }


}
