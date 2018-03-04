package com.app.lambda.interfaces.impl;

import com.app.lambda.interfaces.GreetingService;

public class LambdaExpressionWithFinalVariable {
	final static String salutation = "Hello!";
	public static void main(String[] args) {
		GreetingService greetingService = message ->
			System.out.println(salutation + message);
		greetingService.sayMessage(" Mahindra");
	}
}
