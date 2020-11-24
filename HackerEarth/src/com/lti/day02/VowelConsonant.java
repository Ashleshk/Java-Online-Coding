package com.lti.day02;

import java.util.Scanner;

public class VowelConsonant {
	 public static void main(String args[] ) throws Exception {
         Scanner sc= new Scanner(System.in);
         int t= sc.nextInt();
         while(t-->0)
         {   int count=0;
             int n=sc.nextInt();
             String str=sc.next();
             char[] c = str.toCharArray();
             for(int i=0;i<c.length-1 ;i++)
             {
            	 if(c[i+1]=='a'||c[i+1]=='e'||c[i+1]=='i'||c[i+1]=='o'||c[i+1]=='u')
            		 count++;
             }
             System.out.println(count);
         }

    }
}
