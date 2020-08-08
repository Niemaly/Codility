package src.hackerrankCodemotion.arrays;

public class HourglassSum {
    public int hourglassSum(int[][] arr) {

        int sum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-1; j++) {

                int sum2 = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]
                        +arr[i][j]
                        +arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];

                if (sum2>sum){
                    sum=sum2;
                }

            }
        }
        return sum;
    }
}
