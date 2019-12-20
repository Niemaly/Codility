package task;

import java.util.Arrays;

public class SolutionBinaryAB {

    public int solution(int A, int B) {

        String str = Long.toBinaryString((long)A*B);

        int number=0;

        for (char el: str.toCharArray()) {
            if (el=='1')
                number++;
        }

        return number ;
    }
}
