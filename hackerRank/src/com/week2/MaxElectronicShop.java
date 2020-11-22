package com.week2;

import java.util.Arrays;

public class MaxElectronicShop {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int max=-1;
        for(int i=keyboards.length-1;i>=0;i--)
        {
            for(int j=drives.length-1;j>=0;j--)
            {
                if(b>=(drives[j]+keyboards[i]) && max<(drives[j]+keyboards[i]))
                   max=drives[j]+keyboards[i];
            }
        }
        return max;
  }
	public static void main(String[] args) {
		int[] keyboards= {3 ,1};
		int[] drives= {5, 2, 8};
		int b =10 ;
		getMoneySpent(keyboards, drives, b);
	}

}
  

