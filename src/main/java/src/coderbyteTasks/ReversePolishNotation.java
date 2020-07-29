package src.coderbyteTasks;

import java.util.Stack;

public class ReversePolishNotation {


    public String solution(String str) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <str.length() ; i++) {

            char character = str.charAt(i);

            if (Character.isSpaceChar(character)){
                continue;
            }

            if (character == '*'){
                int number = stack.pop();
                int number2 = stack.pop();
                stack.push(number*number2);
                continue;
            }
            if (character == '/'){
                int number = stack.pop();
                int number2 = stack.pop();
                stack.push(number2/number);
                continue;
            }
            if (character == '+'){
                int number = stack.pop();
                int number2 = stack.pop();
                stack.push(number+number2);
                continue;
            }
            if (character == '-'){
                int number = stack.pop();
                int number2 = stack.pop();
                stack.push(number2-number);
                continue;
            }

            if (Character.isDigit(character)){
                int number;

                StringBuilder fullNumber = new StringBuilder(character);
                for (int j = i; j <str.length() ; j++) {
                    if (Character.isDigit(str.charAt(j))){
                        fullNumber.append(str.charAt(j));
                    }else {
                        number = Integer.parseInt(fullNumber.toString());
                        stack.push(number);
                        i=j;

                        break;
                    }
                }
            }
        }
        return stack.pop().toString();
    }
}
