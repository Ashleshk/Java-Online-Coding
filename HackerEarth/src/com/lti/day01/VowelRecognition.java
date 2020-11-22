package com.lti.day01;

import java.util.Scanner;

//Print the vowel sum of all Substring
public class VowelRecognition {
	public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++){
            String str = s.next();
            long sum = 0;
            long n = str.length();
            for(int j = 0;j<n;j++){

                    if(str.charAt(j) == 'a' || str.charAt(j) == 'e' ||str.charAt(j) == 'i' ||str.charAt(j) == 'o' ||str.charAt(j) == 'u' || str.charAt (j) == 'A' ||str.charAt(j) == 'E' ||str.charAt(j) == 'I' ||str.charAt(j) == 'O' ||str.charAt(j) == 'U'){

                        sum = sum + (n-j)*(j+1);

                    }

            } 

            System.out.println(sum);
        }
    }

}
