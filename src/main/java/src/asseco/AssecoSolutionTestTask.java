package src.asseco;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class AssecoSolutionTestTask {
    public int solution(int[] A) {


        if(Arrays.stream(A).max().isPresent() && Arrays.stream(A).max().getAsInt()<0){
            return 1;
        }else if (Arrays.stream(A).min().isPresent() && Arrays.stream(A).min().getAsInt()>1){
            return 1;
        } else{
            Arrays.sort(A);
            int b[] = Arrays.copyOfRange(A, Arrays.binarySearch(A,0),Arrays.binarySearch(A, Arrays.stream(A).max().getAsInt()));

            if (b[b.length] != b.length+1){



            }

        }
        return Arrays.stream(A).max().getAsInt()+1;

    }

    int[] byHalf(int index, int[] array){
        if (index+1 != array[index]){
            return Arrays.copyOfRange(array,0, index);
        }
        return Arrays.copyOfRange(array,index, array.length);
    }
}
