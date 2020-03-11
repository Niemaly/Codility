package src.codewars.codeWarsSpiralTask;

public class CodeWarsNumbersSpiral {

    public int[][] createSpiral(int number) {

        int[][] spiral = new int[number][number];

        boolean top = true;
        boolean right = false;
        boolean bottom = false;
        boolean left = false;
        int element = 1;
        int start = 0;
        int stop = number;

        for (int j = start; j < stop; j++) {

            for (int i = start; i <stop ; i++) {

                if (top){
                    spiral[start][i] = element;
                    element++;
                    if (i==stop){
                        top=false;
                        right =true;
                    }
                }
                if (right){
                    spiral[j][stop] = element;
                    element++;
                    if (i==stop){
                        right=false;
                        bottom=true;
                    }
                }
                if (bottom){
                    spiral[i][j] = element;
                    element++;
                }
                if (left){
                    spiral[i][j] = element;
                    element++;
                }


            }
            stop--;
            start++;
        }

        for (int el[]: spiral
             ) {
            for (int e: el
                 ) {
                System.out.print( e + " ");
            }
            System.out.println("");

        }


        return null;
    }


}
