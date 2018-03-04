package com.app;

public class TestMultiPrority1 extends Thread {
	public void run(){  
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	}  
	public static void main(String args[]){  
		TestMultiPrority1 m1=new TestMultiPrority1();  
		TestMultiPrority1 m2=new TestMultiPrority1();  
		m1.setPriority(Thread.MIN_PRIORITY);  
		m2.setPriority(Thread.MAX_PRIORITY);  
		m1.start();  
		m2.start();  

	} 
}
