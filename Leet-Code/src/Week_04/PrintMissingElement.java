package Week_04;

import java.util.Arrays;

public class PrintMissingElement {
	
	public static int printMissingElement(int[] A) {
		Arrays.sort(A);
		int val=1;
		for(int i:A)
		{	if(val==i)
				val++;
		}
		return val;
	}
	
	public static void main(String[] args) {
		int ar[] = {1,2,4,5};
		int res= printMissingElement(ar);
		System.out.println(res);
	}
}
