package com.app.lambda.interfaces.impl;

import com.app.lambda.interfaces.Sayable1;

public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		Sayable1 s1 = (name) ->{
			return "Good Morning :"+name;
			
		};
		Sayable1 s2 = name ->{
			return "Good Evening :"+name;
		};
		// You can pass multiple statements in lambda expression
		Sayable1 s3 = name ->{
			String str1 = "I Would like to say ";
			String str2 = str1 + name;
			return str2;
		};
		System.out.println(s1.say("Mahindra"));
		System.out.println(s2.say("Gopisetty"));
		System.out.println(s3.say("time is precious"));
	}
}
