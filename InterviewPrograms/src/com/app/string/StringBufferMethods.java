package com.app.string;

public class StringBufferMethods {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("java Language");
		System.out.println("Length of String :"+s.length());
		System.out.println("Append of the String :"+s.append(" is simple"));
		System.out.println("Reverse Method :"+s.reverse());
		System.out.println("Delete CharAt Method :"+s.deleteCharAt(1));
		System.out.println("insert Method :"+s.insert(22, " and  independent language"));
	}

}
