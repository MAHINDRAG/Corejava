package com.app.lambda.interfaces.impl;

import com.app.lambda.interfaces.Drawable;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		int width = 10;
		Drawable d = new Drawable() {			
			@Override
			public void draw() {
				System.out.println("Drawing: "+width);
			}
		};
		d.draw();
	}
}
