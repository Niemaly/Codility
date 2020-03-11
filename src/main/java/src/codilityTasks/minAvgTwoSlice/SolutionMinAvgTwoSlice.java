package src.codilityTasks.minAvgTwoSlice;

import java.util.Arrays;

public class SolutionMinAvgTwoSlice {

    public int solution2(int[] A){
        double min = 10000;
        double avg = 10000;
        int minIndex=0;
        int absoluteMinimum = Arrays.stream(A).min().getAsInt();
        double avgAllA = Arrays.stream(A).average().getAsDouble();
        double d;

        for (int i = 0; i <A.length-1 ; i++) {
            for (int j = i+1; j <= i+2 ; j++) {

                if(j==A.length)
                    break;

                if (A[i] > avgAllA && A[j] > avgAllA)
                    continue;


                d= chackAvg(Arrays.stream(A,i,j+1).toArray());
                if (d<avg){
                    avg = d;
                    if (avg<min){
                        min = avg;
                        minIndex = i;

                        if (min==absoluteMinimum)
                            return i;

                    }
                }
                System.out.println("i = "+i+ " j = " + j + " avg = " + avg + " minIndex =  " + minIndex );
            }

        }
        return minIndex;
    }


    public int solution(int[] A) {

        double min=10000;
        double avg=10000;
        int minIndex=-1;

        for (int i = 0; i < A.length; i++) {
            if ( i+1<A.length && (A[i]<avg || A[i+1]<avg)) {
                for (int j = i + 1; j < A.length; j++) {

                    if (avg > chackAvg(Arrays.stream(A, i, j + 1).toArray())) {
                        avg = chackAvg(Arrays.stream(A, i, j + 1).toArray());
                        if (avg < min) {
                            min = avg;
                            minIndex = i;
                            if (min == -10000){return minIndex;}

                        } else {
                            break;
                        }
                    }
                }
            }

        }



        return minIndex;
    }

    double chackAvg(int... numbers){
        return Arrays.stream(numbers).average().getAsDouble();
    }

}
