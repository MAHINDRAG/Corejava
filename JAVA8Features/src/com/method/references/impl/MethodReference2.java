package com.method.references.impl;

public class MethodReference2 {

	public static void threadStatus(){
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		Thread t = new Thread(MethodReference2::threadStatus);
		t.start();
		Runnable r = MethodReference2::threadStatus;
		Thread t1 = new Thread(r);
		t1.start();
		
		//using lambda expression
		Runnable r2 = ()->{
			System.out.println("Thread Name:"+Thread.currentThread());
		};
		r2.run();
	}
}
