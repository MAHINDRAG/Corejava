package com.app.mcq;
class B implements Runnable{
	public void run(){
		System.out.println("run-A");
	}
}
public class Test5 {

	public static void main(String[] args) {
		B b = new B();
		Thread t = new Thread(b);
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
		
	}
}
