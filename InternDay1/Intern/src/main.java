import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		
		
		int[] arrays=new int[8];
		
		Doldur(arrays);
		
		for (int i : arrays) {
			System.out.print(i+" ");
		}
		System.out.println();
		Tek(arrays);
		
		
		
	}
	
	public static int[] Doldur(int[] arrays) {
		
		Random random=new Random();
		
		for(int i=0;i<arrays.length;i++) 
		{
			arrays[i]=random.nextInt(100);
			
		}
		
		return arrays;
	}
	public static List<Integer> Tek(int[] arrays){
		
		List<Integer> arrays2=new ArrayList<Integer>(); 
		
		for(int i=0;i<arrays.length;i++) 
		{
			
			if(arrays[i]%2==1) 
			{
				arrays2.add(arrays[i]);
			}
		}
		for (int i : arrays2) {
			System.out.print(i+" ");
		}
		
		 return arrays2;
	}

}
