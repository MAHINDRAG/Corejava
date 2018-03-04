package com.app.hacker;

import java.util.Scanner;

public class Qseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double result=0;
		System.out.println("Enter three Numbers :"+a+", "+b+" , "+c);
		for(int i=1;i<c;i++){
			for(int j=0;j<i;j++){
				result=(a+Math.pow(2,j)*b);
			}
			System.out.println("Result :"+result);
		}
		
	}

}
