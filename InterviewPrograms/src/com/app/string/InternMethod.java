package com.app.string;

public class InternMethod {
	public static void main(String[] args) {
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference is different  
		System.out.println(s2==s3);//true because reference is same
		System.out.println(s3);
		
		char ch[]={'a','b','c'};
		String s = new String(ch);
		System.out.println(s);
	}

}
