package com.app.basic;

import java.util.Scanner;

/*
          print like 
          *
          * *
          * * *
          * * * *
*/
public class StarsProgram {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of rows :");
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
