package com.week1;

public class NumberLineJumpa {
	static String kangaroo(int x1, int v1, int x2, int v2) {
        String response = "NO";
        boolean canCatchUp = (v2 < v1);
        if(canCatchUp) {
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if(willIntersectOnLand) {
                response = "YES";
            }
        }

        return response;

    }
	public static void main(String[] args) {
		System.out.println(kangaroo(0,3,4,2));
		System.out.println(kangaroo(0, 2, 5, 3));
	}
}
