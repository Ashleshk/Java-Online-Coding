package com.week1;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a;
        int i=1;
       while(in.hasNext())
           {
           a=in.nextLine();
           System.out.println(i+" "+a);
           i++;
       }
    }
}
