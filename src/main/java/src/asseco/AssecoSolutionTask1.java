package src.asseco;

import java.util.Arrays;

public class AssecoSolutionTask1 {

    public int solution(int N , int K) {
            if (N==0){
                return 1;
            }
            if (N>0 && K == 0){
                return N-1;
            }
            int answer = 0;

        for (int i = N ; i >= 0 ; i--){
            if (N != 1) {
                if (N % 2 == 0 && K>0) {
                    N = N / 2;
                    K--;
                    answer++;
                } else {
                    N--;
                    answer++;
                }
            }
        }
        return answer;
    }

}
