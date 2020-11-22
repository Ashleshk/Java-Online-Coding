	package com.lti.day01;

import java.util.Scanner;

public class GoingToOffice {
	public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        long d = sc.nextInt();
        long oc = sc.nextInt();
        long of = sc.nextInt();
        long od = sc.nextInt();

        long cs = sc.nextInt();
        long cb = sc.nextInt();
        long cm = sc.nextInt();
        long cd = sc.nextInt();

        long online = oc+(d-of)*od;
        long classic = cb+(d/cs)*cm + cd*d;    
        if(online<=classic)
            System.out.println("Online Taxi");
        else
            System.out.println("Classic Taxi");
    }
}
