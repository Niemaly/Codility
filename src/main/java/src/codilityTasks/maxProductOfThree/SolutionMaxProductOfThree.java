package src.codilityTasks.maxProductOfThree;

import java.util.Arrays;

public class SolutionMaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[0]*A[1]*A[A.length-1]>A[A.length-1]*A[A.length-2]*A[A.length-3])
            return A[0]*A[1]*A[A.length-1];

        return A[A.length-1]*A[A.length-2]*A[A.length-3];
    }
}
