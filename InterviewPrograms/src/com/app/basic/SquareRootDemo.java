package com.app.basic;

import java.util.Scanner;

public class SquareRootDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num=scan.nextInt();
		//System.out.println("Square root of "+num+" is :"+Math.sqrt(num));
		double result=calculateSqrt(num);
		System.out.println("Square root of "+num+" is :"+result);
	}
	
	/*public static double calculateSqrt(int number) {
		double t;
		double squareRoot = number / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
	}*/
	 public static double calculateSqrt (int n) {
		    double rootValue = 1.00;
		    double num = n;
		    for (int i = 0; i < n; i++) {
		        rootValue = 0.5 * (rootValue + num/rootValue);
		    }   
		    //To make only 3 digit available after decimal point
		    int returnValue = (int)(rootValue * 1000);  
		    rootValue = returnValue;
		    rootValue /=1000;
		    System.out.println("Root Value Calculated : " + rootValue);
		    System.out.println("Root Value By InBuild Method Method : " + Math.sqrt(n));
		    return rootValue;
		     
		    }
}
