package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        
        final long startTime = System.nanoTime();
        List<Integer> apple=new ArrayList<>();
        List<Integer> orange=new ArrayList<>();
        apple.add(1);
        apple.add(4);
        apple.add(4);
        orange.add(-3);
        orange.add(-2);
        orange.add(-4);
        Result.countApplesAndOranges3(7,10,4,12,apple,orange);
        
        final long duration = System.nanoTime() - startTime;
        
        System.out.println(duration);//nanosaniye
    }
    class Result{
        
        public static void countApplesAndOranges3(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
             int appleCount =0, orangeCount =0;

            for (Integer apple : apples) {
                if((a+apple)>=s && (a+apple <=t))
                    appleCount++;
            }

            for (Integer orange : oranges) {
                if((b+orange)>=s && (b+orange <=t))
                    orangeCount++;

            }

            System.out.println(appleCount +"\n"+orangeCount);
        }
    
        
        
    }
    
}
