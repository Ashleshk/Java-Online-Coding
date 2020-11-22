package com.week1;

import java.util.*;

public class GradesROund {
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
	    	
	    	List<Integer> ans = new ArrayList<Integer>();
	        for(int marks:grades){
	            if(marks < 38 || marks % 5 <= 2){
	                ans.add(marks);
	            }else if(marks % 5 > 2){
	                int add = 5 -(marks % 5);
	                ans.add(marks + add);
	            }
	        }
	        return ans;
	    }
    public static void main(String[] args)  {
        List<Integer> ar = new ArrayList<Integer>();
         ar.add(73) ;
         ar.add(67) ;
         ar.add(38);
         ar.add(33);
        List<Integer> res=gradingStudents(ar);
        System.out.println(res);
        
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt(); 
        double y = scan.nextDouble();
        scan.nextLine(); 
        String s = scan.nextLine();
        

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + y);
        System.out.println("Int: " + s);
    }
}
