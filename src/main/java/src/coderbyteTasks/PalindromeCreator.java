package src.coderbyteTasks;

import java.lang.reflect.Array;
import java.util.*;
import java.util.jar.Attributes;
import java.util.stream.Collectors;

public class PalindromeCreator {

    public String palindromeCreator(String str) {
        if(isPalindrome(str))
            return "palindrome";

        StringBuffer stringBuilder = new StringBuffer(str);
        stringBuilder.reverse();

        String reversedString = stringBuilder.toString();

        String answer1 = mistakeCather(str, reversedString);
        String answer2 = mistakeCather(reversedString, str);

        if (answer1.length()<answer2.length()){
            return answer1;
        } else {
            return answer2;
        }
    }

    private String mistakeCather(String str, String str2){
        String mistakes ="";

        StringBuilder stringBuilder = new StringBuilder(str2);

        int x = stringBuilder.length();

        for (int i = 0; i < x-1; i++) {

            if (str.charAt(i)!=stringBuilder.charAt(i)){


                mistakes+=stringBuilder.charAt(i);
                stringBuilder.deleteCharAt(i);
                x = stringBuilder.length();

                if (stringBuilder.length()<3){
                    return "not possible";
                }

                if (isPalindrome(stringBuilder.toString())){
                    return mistakes;
                }else if (mistakes.length()>2){
                    return "not possible";
                }
                i-=1;
            }
        }
        return "";
    }

    private boolean isPalindrome(String str) {
        for (int i = 0; i <str.length()/2 ; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }


}
