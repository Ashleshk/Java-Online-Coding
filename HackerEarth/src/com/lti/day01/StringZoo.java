package com.lti.day01;

import java.util.Scanner;

public class StringZoo {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str= sc.next();
			int z=0,o=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='z'||str.charAt(i)=='Z')
					z++;
				if(str.charAt(i)=='o'||str.charAt(i)=='O')
					o++;
		
			}
			if(o==2*z && str.length()<21)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
}
