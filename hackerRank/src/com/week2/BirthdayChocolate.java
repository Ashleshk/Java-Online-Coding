package com.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChocolate {
	static int birthday(List<Integer> s, int d, int m) {
		int sum=0,ways=0;
		for(int i=0;i<m;i++)
			sum+=s.get(i);
		for(int i=0;i<s.size()-m+1;i++)
		{
			if(sum==d)
				ways++;
			if(i+m<s.size())
				sum = sum - s.get(i)+s.get(m+i);
		}
		
		return ways;
            
    }
	public static void main(String[] args) {
		List<Integer> ar =new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ;i<n;i++)
			ar.add(sc.nextInt());
		System.out.println("day :");
		int d =sc.nextInt();
		System.out.println("Month :");
		int m=sc.nextInt();
		
		System.out.println(birthday(ar, d, m));
		
	}
}	
