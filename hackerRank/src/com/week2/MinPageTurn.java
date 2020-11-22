package com.week2;

import java.util.Scanner;

public class MinPageTurn {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		System.out.println(Math.min(n/2-p/2, p/2));
	}
}
