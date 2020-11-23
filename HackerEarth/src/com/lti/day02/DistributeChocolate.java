package com.lti.day02;

import java.util.Scanner;

public class DistributeChocolate {
	public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long c=sc.nextLong();
            long n=sc.nextLong();
            long k=c/n;
            long min=(n*(n+1)/2);
            if(c<min)
               System.out.println(c);
            else
               System.out.println((c-min)%n);

        }

   }
}
