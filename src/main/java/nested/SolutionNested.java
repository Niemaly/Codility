package nested;

import java.util.Stack;

public class SolutionNested {
    public int solution(String S) {

        Stack<Character> bracketStack= new Stack<>();

        char[] charArray =S.toCharArray();
        int length = charArray.length;

        for (int i = 0; i <length ; i++) {
            if (i==0) {
                bracketStack.push(charArray[0]);
            }else if (!bracketStack.empty()&&openClose(bracketStack.peek(),charArray[i])) {
                bracketStack.pop();
            }else{
                if (!bracketStack.empty()&&!openClose(bracketStack.peek(), charArray[i])&&(charArray[i]==')'))
                    return 0;

                bracketStack.push(charArray[i]);

            }

        }


        if (bracketStack.empty())
            return  1;


        return 0;



    }


    public boolean openClose(char bracketOpened, char bracketClosed){
        if (bracketOpened =='('&& bracketClosed==')')
            return true;

        return false;
    }
}
