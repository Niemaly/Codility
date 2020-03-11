package src.codilityTasks.maxProfit;

import java.util.Arrays;

public class MaxProfit {
    public int solution(int[] A) {

        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();

        int minIndex = searchIndex(A, min);
        int maxIndex = searchIndex(A, max);

        if (min == max) {
            return 0;
        } else if (A.length < 2 || bol(A)) {
            return 0;
        } else if (minIndex < maxIndex) {
            return max - min;
        } else {
            if (maxIndex != 0 && minIndex != A.length - 1) {
                int number1 = solution(Arrays.copyOfRange(A, 0, maxIndex));
                int number2 = solution(Arrays.copyOfRange(A, minIndex, A.length - 1));

                return Integer.max(number1, number2);
            }
            return 0;
        }

    }



    private boolean bol(int[] A) {
        int [] B = new int[A.length];
        int [] C = new int[A.length];
        Arrays.sort(C);
        for (int i = 0; i < A.length; i++) {
            B[i] = C[A.length-1-i];
        }
        return Arrays.equals(A,B);
    }

    private int searchIndex(int [] A, int number){
        for (int i = 0; i < A.length; i++) {
            if (A[i] == number) {
                return i;
            }
        }
            return 0;
    }
}
