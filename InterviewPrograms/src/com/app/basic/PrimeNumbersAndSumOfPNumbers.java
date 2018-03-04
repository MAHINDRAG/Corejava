package com.app.basic;

import java.util.Scanner;

public class PrimeNumbersAndSumOfPNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a length of PrimeNumbers :");
		int num=sc.nextInt();
		int sum=0,count=0;
		for(int i=2;i<=num;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					count=1;
					break;
				}else{
					count=0;
				}
			}if(count==0){
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("sum :"+sum);
	}

}
