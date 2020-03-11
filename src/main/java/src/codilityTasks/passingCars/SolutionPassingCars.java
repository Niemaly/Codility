package src.codilityTasks.passingCars;

import java.util.Arrays;

public class SolutionPassingCars {

    public int solution(int[] A) {

        int max=0;
        int sum = 0;
        int length = A.length;
        boolean flag=true;

        for (int i = 0; i < length; i++) {

            if (flag &&A[i]==0){

                flag=false;
                max=Arrays.stream(A,i,length).sum();
                sum+=max;

            }else if (A[i] == 0) {
                sum += max;

                if (sum > 1000000000)
                    return -1;
            } else {
                max--;
            }

        }

        return sum;
    }
}
