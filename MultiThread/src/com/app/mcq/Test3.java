package com.app.mcq;

public class Test3 extends Thread{

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.run();
		t.start();
		
	}
	
	public void run(){
		System.out.println("run-test");
	}
}
