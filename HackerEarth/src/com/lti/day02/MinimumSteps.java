package com.lti.day02;

import java.util.Scanner;

public class MinimumSteps {
	 static int step(int k,int m,int n)
	    { 
	        int x;
	        if(k>=m)
	            return (k-m)/2+(k-m)%2;
	        if(m%n==0)
	            return (1+step(k,m/n,n));
	        else
	        {
	            x=(m/n+1)*n;
	            return ((x-m)/2+(x-m)%2+step(k,x,n));
	        }
	    }
	    public static void main(String args[] ) throws Exception {
	        
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        while(t-->0)
	        {
	            int  k=s.nextInt();
	            int  m=s.nextInt();
	            int  n=s.nextInt();
	            System.out.println(step(k,m,n));
	            System.out.println(-1);
	        }

	    }

}
