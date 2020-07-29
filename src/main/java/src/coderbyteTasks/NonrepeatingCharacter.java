package src.coderbyteTasks;


import java.util.HashMap;
import java.util.Map;


public class NonrepeatingCharacter {

    public static String solution(String input) {

        Map<Character, Integer> map = new HashMap<>();

        for (char e : input.toCharArray()){
            if (map.containsKey(e))
                map.put(e,map.get(e)+1);
            else {
                map.put(e, 1);
            }
        }

        for (int i = 0 ; i <=input.length(); i++){
            if (map.get(input.charAt(i))<2)
                return Character.toString(input.charAt(i));
        }

        return "";
    }




    public static String solution2(String input) {

       char character = (char) input.chars()
                .boxed()
                .filter(e -> !input.replaceFirst(Character.toString(Character.highSurrogate(e)), "")
                        .contains(Character.toString(Character.highSurrogate(e))))
               .findFirst().get().intValue();

        return Character.toString(character);

    }



}
