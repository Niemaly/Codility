package task;


import java.util.Arrays;
import java.util.function.IntSupplier;

public class SolutionMinValueOfArray {

    public int solution(int[] A) {
        int ans =0;
        for (int i = 1; i < A.length ; i++) {
            if (ans > A[i] ) {
                ans = A[i];

            }
        }
        return Arrays.stream(A).min().orElseGet(()-> 0);
    }


}
