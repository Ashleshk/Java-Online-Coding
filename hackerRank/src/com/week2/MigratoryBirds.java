package com.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {
	static int migratoryBirds(int n,List<Integer> arr) {
	       
        int ary[] = new int[n];
        for(int i : arr )
            ary[i]++; 
        int max = 0,maxpos=0;
        for(int i = 0 ; i < n ; i++)
        {
            if(ary[i] > max)
            {
                max = ary[i];
                maxpos = i;
            }
        }
        return maxpos;
    }
	public static void main(String[] args) {
		List<Integer> ar =new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ;i<n;i++)
			ar.add(sc.nextInt());
		System.out.println("res:"+migratoryBirds(n, ar));
	}

}
