package genomicRangeQuery;

import java.util.Arrays;

public class SolutionGenomicRangeQuery {
    private final int inpactA = 1;
    private final int inpactC = 2;
    private final int inpactG = 3;
    private final int inpactT = 4;

    public int[] solution(String S, int[] P, int[] Q) {

        int length= P.length;
        int firstIndex;
        int lastIndex;
        int [] genomicRangeQuery = new int [length];

        S =S.replaceAll("A","1")
                .replaceAll("C", "2")
                .replaceAll("G", "3")
                .replaceAll("T", "4");

        for (int i = 0;  i <length ; i++) {
            firstIndex=P[i];
            lastIndex=Q[i];

        String substring = S.substring(firstIndex, lastIndex+1);

            genomicRangeQuery[i]=returnImpact(substring);

        }

        return genomicRangeQuery;
    }


    int returnImpact(String substring){
        for (int i = 1; i <=4 ; i++) {
            if(substring.contains(Integer.toString(i)))
                return i;
        }
        return -1;
    }



    public int[] solution2(String S, int[] P, int[] Q) {

        int length= P.length;
        int firstIndex;
        int lastIndex;
        int [] genomicRangeQuery = new int [length];

        S =S.replaceAll("A","1")
                .replaceAll("C", "2")
                .replaceAll("G", "3")
                .replaceAll("T", "4");

        int [] intArray = S.chars().map(x-> x -'0').toArray();

        for (int i = 0;  i <length ; i++) {
            firstIndex=P[i];
            lastIndex=Q[i];

            genomicRangeQuery[i]=Arrays.stream(intArray,firstIndex,lastIndex+1).min().getAsInt();
        }

        return genomicRangeQuery;
    }
}
