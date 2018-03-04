package com.app.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author MAHINDRA
 * In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5
 */
public class FibonacciSeries {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=1,num3;
		System.out.println("Enter loop Count value :");
		int count=Integer.parseInt(br.readLine());
		System.out.print(num1+" "+num2+" ");
		for(int i=2;i<count;i++){
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
	}

}
