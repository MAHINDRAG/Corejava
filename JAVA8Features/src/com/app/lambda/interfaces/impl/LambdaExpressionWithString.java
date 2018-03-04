package com.app.lambda.interfaces.impl;

import com.app.lambda.interfaces.StringLength;

public class LambdaExpressionWithString {

	public static void main(String[] args) {
		printLength(s->s.length());
		StringLength str = s -> s.length();
		System.out.println(str.getLength("Mahi"));
	}
	
	public static void printLength(StringLength l){
		System.out.println("Length :"+l.getLength("Hello World"));
	}
}
