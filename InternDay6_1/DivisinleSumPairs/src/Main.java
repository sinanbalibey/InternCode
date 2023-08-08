import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);

        Result.divisibleSumPairs(6,3,arr);

    }

}
class Result {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int a=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ar.get(i)+ar.get(j)%k==0){
                    System.out.println(ar.get(i)+" "+ar.get(j));
                    System.out.println(a);
                }
            }
        }

        return a;
    }

}