package com.app.basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		/**
		 * Palindrome program for String and integer
		 */
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String :");
		String str1=sc.next();
		String str2="";
		for(int i=str1.length()-1;i>=0;i--){
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
		if(str1.equals(str2)){
			System.out.println("Entered  String is Palindrome ");
		}else{
			System.out.println("Entered  String is not a Palindrome");
		}
		
		System.out.print("Enter a Number :");
		int num=sc.nextInt();
		int num2=num;
		int rev=0;
		while(num>0){
			rev=rev*10+num%10;
			num=num/10;
		}
		if(num2==rev){
			System.out.println("Entered  Number is Palindrome ");
		}else{
			System.out.println("Entered  Number is not a Palindrome");
		}
		
	}

}
