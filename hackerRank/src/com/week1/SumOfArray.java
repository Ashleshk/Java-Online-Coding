package com.week1;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum;
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum=a;
            for(int j=0;j<n;j++)
            {   sum+=b*Math.pow(2,j);
                System.out.print(sum+" ");
            }
        }
        in.close();
         
    }
}
