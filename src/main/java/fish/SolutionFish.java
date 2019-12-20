package fish;

import java.util.Stack;

public class SolutionFish {

    public int solution2(int[] A, int[] B) {
        Stack<int []> stack = new Stack();

        for (int i = 0; i < A.length; i++) {
            if (stack.empty()) {
                stack.push(new int[]{A[i], B[i]});
                continue;
            }
                int[] fish = new int[]{A[i], B[i]};
                int[] fish2 = stack.peek();

                if (fish[1]==fish2[1]) {
                    stack.push(fish);
                } else {


                    while (fish2[1] == 1 && fish[1]==0 && fish[0] > fish2[0] ) {
                        stack.pop();

                        if (stack.empty()) {
                            stack.push(fish);
                            break;
                        }

                        fish2 = stack.peek();

                    }

                    if (fish[1]==fish2[1] || fish[1]==1) {
                        stack.push(fish);
                    }

                }

        }

            return stack.size();

    }




    public int solution(int[] A, int[] B) {

        Stack<int[]> stackWithFishes = new Stack<>();

        int length = A.length;

        for (int i = 0; i < length; i++) {
            int[] newFish = {B[i], A[i]};

            if (stackWithFishes.empty()) {
                stackWithFishes.push(newFish);

            }else {

                int[] currentFish = stackWithFishes.peek();

                if (checkIsFishesSwimSameDirection(currentFish, newFish)) {
                    stackWithFishes.push(newFish);
                    System.out.println(newFish[1]);

                } else {

                    while (newFish[0]==0 && currentFish[0]==1 && newFish[1]>currentFish[1]) {

                        if (stackWithFishes.empty()) {
                            stackWithFishes.push(newFish);
                            break;
                        }

                        stackWithFishes.pop();
                        currentFish = stackWithFishes.peek();
                    }

                }

            }

        }
        System.out.println(stackWithFishes.size());

        return stackWithFishes.size();
    }

    boolean checkIsFishesSwimSameDirection(int[] a, int[] b){
        if(a[0]==b[0])
            return  true;

        return false;
    }


}
