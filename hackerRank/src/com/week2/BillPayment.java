package com.week2;

import java.util.Scanner;

public class BillPayment {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int total = 0;
        
        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            if (i != k) total += price;
        }
        
        int charged = scanner.nextInt();
        
        System.out.println(total / 2 == charged ? "Bon Appetit" : charged - (total/2));
    }
}
