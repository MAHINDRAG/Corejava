package com.app.mcq;

public class Test  implements Runnable {
	public static void main(String[] args){
		/*
		 * Scenario1
		 * The program does not compile because this cannot be referenced in a static method.
		 */
		//Thread t = new Thread(this);
		//	t.start();

		/*
		 * Scenario2
		 * The program does not compile because the start() method is not defined in the Test class.
		 */

		//Test t1 = new Test();
		//t1.start();

		/**
		 * Scenario3
		 * The program compiles and runs and displays test.
		 */
		Test t = new Test();
	}
	public Test(){
		Thread t = new Thread(this);
		t.start();
	}
	public void run(){
		System.out.println("test");
	}
}
