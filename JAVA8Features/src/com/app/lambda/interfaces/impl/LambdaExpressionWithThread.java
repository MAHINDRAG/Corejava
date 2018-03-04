package com.app.lambda.interfaces.impl;

public class LambdaExpressionWithThread {

	public static void main(String[] args) {
		//Thread Example with out Lambda
		System.out.println("** Thread Example with out Lambda **");
		Runnable r1 = new Runnable() {			
			@Override
			public void run() {
				System.out.println("Thread1 is Running");
			}
		};
		System.out.println("** Thread Example with Lambda **");
		Runnable r2 = ()->{
			System.out.println("Thread2 is running");
		};
		Thread t = new Thread(r1);
		t.start();
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
