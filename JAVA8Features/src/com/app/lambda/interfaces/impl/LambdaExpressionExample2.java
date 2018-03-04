package com.app.lambda.interfaces.impl;

import com.app.lambda.interfaces.Drawable;

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		int width = 10;
		Drawable d = ()->{
			System.out.println("Drawing: "+width);
		};
		d.draw();
	}
}
