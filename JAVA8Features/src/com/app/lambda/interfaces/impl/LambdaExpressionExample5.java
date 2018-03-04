package com.app.lambda.interfaces.impl;

import com.app.lambda.interfaces.MathOperation;

public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		
		// Multiple parameters in lambda expression  
		// Lambda expression without return keyword. 
		MathOperation m = (a,b)->a+b;
		System.out.println("Result1 :"+m.add(12, 15));
		
		// Multiple parameters with data type in lambda expression  
		MathOperation m1 = (int a,int b)->a+b;
		System.out.println("Result2 :"+m1.add(15, 15));
		
		// Lambda expression with return keyword
		MathOperation m2 = (a,b)->{
			return a+b;
		};
		System.out.println("Result3 :"+m2.add(89, 48));
	}
}
