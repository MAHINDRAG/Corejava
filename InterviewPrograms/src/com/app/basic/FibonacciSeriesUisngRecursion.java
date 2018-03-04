package com.app.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeriesUisngRecursion {
	static int num1=0,num2=1,num3;
	static void printFibonacci(int count){    
	    if(count>0){    
	         num3 = num1 + num2;    
	         num1 = num2;    
	         num2 = num3;    
	         System.out.print(" "+num3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter loop Count value :");
		int count=Integer.parseInt(br.readLine());
		System.out.print(num1+" "+num2+" ");
		printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	}
}
