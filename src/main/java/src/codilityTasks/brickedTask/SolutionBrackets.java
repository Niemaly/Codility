package src.codilityTasks.brickedTask;

import java.util.Stack;

public class SolutionBrackets {

    int roundBricked=0;
    int sharpBricked=0;
    int squareBricked=0;
    public int solution2(String S) {
        Stack<Character> bracketStack= new Stack<>();

        char[] charArray =S.toCharArray();
        int length = charArray.length;

        for (int i = 0; i <length ; i++) {
            if (i==0) {
                bracketStack.push(charArray[0]);
            }else if (!bracketStack.empty()&&openClose(bracketStack.peek(),charArray[i])) {
                bracketStack.pop();
            }else{
                if (!bracketStack.empty()&&!openClose(bracketStack.peek(), charArray[i])&&(charArray[i]==']'||charArray[i]=='}'||charArray[i]==')'))
                    return 0;

                bracketStack.push(charArray[i]);

            }

        }


        if (bracketStack.empty())
            return  1;


        return 0;
    }

    public boolean openClose(char bracketOpened, char bracketClosed){
        if (bracketOpened =='('&& bracketClosed==')'||bracketOpened =='['&&bracketClosed==']'||bracketOpened =='{'&&bracketClosed=='}')
             return true;

        return false;
    }

    public int solution(String S) {
        if(S.equals("")) {
            return 1;
        }

        if (S.length() % 2 != 0){
            return 0;
        }


        char [] charArray = S.toCharArray();


        for (char character: charArray) {

            switch (character){
                case '(':
                    roundBricked++;
                    break;
                case ')':
                    roundBricked--;
                    break;
                case '[':
                    squareBricked++;
                    break;
                case ']':
                    squareBricked--;
                    break;
                case '{':
                    sharpBricked++;
                    break;
                case '}':
                    sharpBricked--;
                    break;
                default:
                    return 0;
            }

            if (roundBricked<0 || sharpBricked<0 || squareBricked<0)
                return 0;

        }


        return 0;
    }





}
