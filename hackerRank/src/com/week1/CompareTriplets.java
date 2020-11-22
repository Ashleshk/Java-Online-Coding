package com.week1;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List res = new ArrayList();
        int ac=0,bc=0;
        
        for (int i = 0; i < 3; i++) {
             if(a.get(i)>b.get(i))
             {
                ac++;  
             }
             else if(a.get(i)<b.get(i))
             {
                 bc++;
             }
             else
             {

             }
        }
        res.add(ac);
        res.add(bc);
        return res;

    }
	static long aVeryBigSum(long[] ar) {
        long Sum=0;
        for(int i =0;i<ar.length;i++)
        {
            Sum += ar[i];
        }
        return Sum;
    }
}
