package src.codilityTasks.smallestIntThatisNotInArray;

import java.util.Arrays;

public class SmallestIntInArray {

    int integer = 1;

    public int solution(int[] A) {

        try {
            Arrays.stream(A).sorted().forEach(e -> {
                if (e == integer) {
                    ++integer;
                }else if(e>0 && e>integer){
                    throw new RuntimeException();
                }
            });

        } catch (RuntimeException e) {
            return integer;
        }
        return integer;
    }
}
