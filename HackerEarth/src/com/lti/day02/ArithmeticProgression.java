package com.lti.day02;

import java.util.Scanner;

public class ArithmeticProgression {
	 public static void main(String args[] ) throws Exception {
	       
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        while(t-->0)
	        {
	            int a =s.nextInt();
	            int b =s.nextInt();
	            int c =s.nextInt();
	            int res =((Math.abs((c-b)-(b-a)))+1)/2;
	            System.out.println(res);
	        }

	    }
}
