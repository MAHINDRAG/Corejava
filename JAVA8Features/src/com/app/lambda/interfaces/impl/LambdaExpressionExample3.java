package com.app.lambda.interfaces.impl;

import com.app.lambda.interfaces.Sayable;

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		Sayable s = ()->{
			return "I have nothing to say";
			
		};
		System.out.println(s.say());
	}
}
