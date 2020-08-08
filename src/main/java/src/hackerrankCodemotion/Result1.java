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
                    sum.addAndGet(1);
                }else{
                    sum.addAndGet(minStart.get());
                    setStart.set(true);
                }
            }else {
                sum.addAndGet(e);
            }
            System.out.println("e= " + e + "  \t sum =" + sum.get() + "\t min start = " + minStart.get());

        });

        if (arr.get(arr.size()-1)<0){
            return minStart.get()+1L;
        }

        return minStart.get();

    }


    public Long minStart2(List<Integer> arr) {

        AtomicLong sum = new AtomicLong(0L);
        AtomicLong min = new AtomicLong(1L);

        arr.stream().forEach(e->{
            sum.addAndGet(e);

            if (sum.get()<0){
                min.addAndGet(sum.get()*-1);
                sum.set(1);
            }
            if (sum.get() == 0){
                min.addAndGet(1);
                sum.set(1);
            }
            System.out.println("e = " + e + "\t sum = " + sum + "\t min =" + min);
        });

        if (arr.get(arr.size()-1)<0){
            return min.get()+1L;
        }
        return min.get();

    }

}

