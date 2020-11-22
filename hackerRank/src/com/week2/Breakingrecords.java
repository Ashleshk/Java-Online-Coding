package com.week2;

public class Breakingrecords {
	static int[] breakingRecords(int[] scores) {
        int max=scores[0];
        int rmax=0,rmin=0;
        int min=scores[0];
        for(int i=1;i<scores.length;i++)
        {
            if(max<scores[i])
            {
                max=scores[i];rmax++;
            }
            if(min>scores[i])
            {
                min=scores[i];rmin++;
            }
        }
        int[] res ={rmax,rmin};
        return res;
    }
	public static void main(String[] args) {
		int a[] = {3, 4, 21, 36 ,10 ,28 ,35 ,5, 24 ,42};
		int[] res = breakingRecords(a);
		for(int i:res)
			System.out.print(i+" ");
	}

}
