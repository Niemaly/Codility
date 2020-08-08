package src.hackerrankCodemotion.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotateLeft {
    public int[] rotLeft(int[] a, int[] d) {

        List<Integer> collect = Arrays.stream(a)
                .boxed()
                .skip(d[1])
                .collect(Collectors.toList());

        collect.addAll(Arrays.stream(a).limit(d[1]).boxed().collect(Collectors.toList()));

        return collect.stream().mapToInt((Integer i) -> i.intValue()).toArray();

    }
}
