package src.codilityTasks.cookies;

import java.util.HashSet;
import java.util.Set;

public class CookieEater {

    public int solution(int N, int M) {
        int countCookies = 0;

        int[] cookieArray = new int [N];
        boolean run = true;
        int i = 0;

            while(run){
                i=i+M;

                if (i>=N){ i= i % N; }

                if (cookieArray[i]!=1){
                    cookieArray[i]=1;
                    countCookies++;
                } else{
                    run=false;
                    return countCookies;
                }
            }

            return  -1;
    }

    public int solution2(int N, int M) {
        int countCookies = 0;
        Set<Integer>  set= new HashSet<>();
        boolean run = true;
        int i = 0;

        if (N % M == 0)
            return N/M;

        while(run){
            i=i+M;

            if (i>=N){ i = i % N; }

            if (!set.contains(i)){
                set.add(i);
                countCookies++;
            } else{
                run=false;
                return countCookies;
            }
        }

        return  -1;
    }


}
