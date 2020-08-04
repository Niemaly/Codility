package src.hackerrankCodemotion;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongBinaryOperator;

public class Result1 {
    public Long minStart(List<Integer> arr) {


        AtomicLong sum = new AtomicLong(0L);
        AtomicLong minStart = new AtomicLong(1L);
        AtomicBoolean setStart = new AtomicBoolean(false);

        LongBinaryOperator longBinaryOperator1 = (x, y) ->
        {
            return x * y;
        };

        arr.stream().forEach(e -> {
            if(sum.get()+e==0){
                sum.addAndGet(e+1);
                minStart.addAndGet(1);
            }else if(sum.get()+e<0){
                sum.addAndGet(e);
                minStart.addAndGet(sum.get()*(-1));
                if (setStart.get()) {
                    sum.accumulateAndGet(-1, longBinaryOperator1);
                }else{
                    sum.addAndGet(minStart.get());
                    setStart.set(true);
                }
            }else {
                sum.addAndGet(e);
            }
            System.out.println("e= " + e + "  \t sum =" + sum.get() + "\t min start = " + minStart.get());

        });

        return minStart.get();

    }
}

