package src.asseco;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class AssecoSolutionTask2 {

    public int solution(int[] A) {

        List<Integer> uniquePlacesArray = Arrays.stream(A).distinct().boxed().collect(Collectors.toList());
        int uniquePlaces = uniquePlacesArray.size();

        Stack<Integer> stack = new Stack();
        int min = 1000000;

        Arrays.stream(A).forEach(e ->{

            if (stack.empty() || !stack.containsAll(Arrays.asList(uniquePlacesArray))) {
                stack.push(e);
            } else{
                if (stack.elementAt(0)==stack.peek()){
                    stack.remove(0);
                }
            }

        });

        return 0;
    }




}
