package Week_04;

public class FrogJumpOne {
 
	
	public static int solution(int X,int[] A)
	{
		int steps = X;
        boolean[] bitmap = new boolean[steps+1];
        for(int i = 0; i < A.length; i++){
            if(!bitmap[A[i]]){
                bitmap[A[i]] = true;
                steps--;
                if(steps == 0) return i;
            }
        }
        return -1;
		 
	}
	public static int solution2(int X,int[] A)
	{
		int steps = X;
        int[] count = new int[steps+1];
        for(int i = 0; i < A.length; i++){
            if(count[A[i]]==0){
            	count[A[i]] = 1;
                steps--;
                if(steps == 0) return i;
            }
        }
        return -1;
		 
	}
	public static void main(String[] args) {
		int ar[]= {1,3,1,4,2,3,5,2};
		int X = 5;
		int res= solution2(X,ar);
		System.out.println(res);
	}
}
