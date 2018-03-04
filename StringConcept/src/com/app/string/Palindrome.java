package com.app.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	   static String str2="";
	   static String str1=null;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Any String :");
	    str1=br.readLine();
		
		for(int i=0;i<str1.length();i++){
			char ch=str1.charAt(i);
			str2=ch+str2;
		}
		if(str1.equals(str2))
		System.out.println("Given String is palindrome");
		else
			System.out.println("Given string is not palindrome ");
	}

}
