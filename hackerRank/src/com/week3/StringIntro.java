package com.week3;

import java.util.Scanner;

public class StringIntro {
	public static String getSmallestAndLargest(String s, int k) {
        
        String smallest = s.substring(0,k);
        String largest  = "";
        for(int i=0;i<s.length()-k+1;i++)
        {
            if(s.substring(i,i+k).compareTo(smallest) <0) 
                smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest) >0) 
                largest = s.substring(i,i+k); 
        }
        return smallest + "\n"+largest;
    }
	
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       /* String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
    */
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(S.substring(start,end));
        
       // Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        for(int i=A.length()-1;i>=0;i--)
        {
            B=B+A.charAt(i);
        }
        System.out.println(A.equalsIgnoreCase(B)?"Yes" :"No");
	}
}
