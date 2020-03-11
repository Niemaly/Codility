package src.codilityTasks.maxSliceSum;

import java.util.Arrays;
import java.util.Stack;


public class MaxSliceSum {

    int maxSum=0;

    public int solution(int[] A){


        if (Arrays.stream(A).max().isPresent() && Arrays.stream(A).max().getAsInt()<0){
            return Arrays.stream(A).max().getAsInt();
        }

        if (Arrays.stream(A).min().isPresent() && Arrays.stream(A).min().getAsInt()>0){
            return Arrays.stream(A).sum();
        }

        int [] array = sumAllElementSameSign(A);

        Stack<Integer> stack = new Stack<>();

       Arrays.stream(array).forEach(e->{

           if (stack.empty() && e>0){
               stack.push(e);

               isItBigger(e);

           }else if(!stack.empty()){
               if (stack.peek()+e>0){
                   stack.push(stack.pop()+e);
                   isItBigger(stack.peek());
               }else {
                   stack.pop();
               }

           }

       });


            return maxSum;

    }

    private void isItBigger(int e) {
        if (e>maxSum){
            maxSum=e;
        }
    }


    public int[] sumAllElementSameSign(int[] A){
        Stack<Integer> stack = new Stack();
        Arrays.stream(A).forEach(e->{

            if (stack.empty()) {
                stack.push(e);
            }else {
                if ((e == 0) || (e > 0 && stack.peek() > 0) || (e < 0 && stack.peek() < 0)){
                    stack.push(stack.pop()+e);
                }else {
                    stack.push(e);
                }
            }
        });

        int [] newArray = new int[stack.size()];

        while (!stack.empty()){
            newArray[stack.size()-1] = stack.pop();
        }

        return newArray;
    }



}
