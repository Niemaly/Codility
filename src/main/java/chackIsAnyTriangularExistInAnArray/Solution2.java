package chackIsAnyTriangularExistInAnArray;

import java.util.*;


public class Solution2 {

    public int solution(int[] A){
        Arrays.sort(A);

        for(int i=0;i<A.length-2;i++){
            if(
                            ((long)A[i] + (long)A[i+1] > A[i+2]) &&
                            ((long)A[i+1] + (long)A[i+2] > A[i]) &&
                            ((long)A[i] + (long)A[i+2] > A[i+1])
            )
                return 1;
        }
        return 0;
    }


}
