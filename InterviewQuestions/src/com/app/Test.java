package com.app;

public class Test {
	public static void main(String args[]){ 	
		String s1 = "SITHA";
		String s2 = "RAMA";
		System.out.println(s1.charAt(0) > s2.charAt(0));
		
		
		String test = "a1b2c3"; 
        String[] tokens = test.split("\\d"); 
        for(String s: tokens) 
                System.out.print(s); 
	}
}
