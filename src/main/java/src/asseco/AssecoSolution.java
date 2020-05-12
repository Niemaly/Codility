package src.asseco;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class AssecoSolution {
    public int solution(int[] A) {


        if(Arrays.stream(A).max().isPresent() && Arrays.stream(A).max().getAsInt()<0){
            return 1;
        }else if (Arrays.stream(A).min().isPresent() && Arrays.stream(A).min().getAsInt()>1){
            return 1;
        } else{
            Arrays.sort(A);
            for (int i = 1 ; i< Arrays.stream(A).max().getAsInt(); i++){
                int finalI = i;
                IntPredicate notInArray = number -> number == finalI;
                if (Arrays.stream(A).noneMatch(notInArray)){
                    return finalI;
                }
            }
        }
        return Arrays.stream(A).max().getAsInt()+1;

    }
}
