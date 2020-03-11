package src.codilityTasks.task;

public class SolutionBinaryAB {

    public int solution(int A, int B) {
        String str = Long.toBinaryString((long)A*B);
        return (int) str.chars().filter(e-> e=='1').count() ;
    }
}
