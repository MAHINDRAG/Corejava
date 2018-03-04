package com.app.multithread;

class MyThread extends Thread{  
	public void run(){  
		System.out.println("shut down hook task completed..");  
	}  
}  
public class TestShutdown1{  
	public static void main(String[] args)throws Exception {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Runtime r=Runtime.getRuntime();  
		r.addShutdownHook(new MyThread());  
		System.out.println("Now main sleeping... press ctrl+c to exit"); 
		Thread.currentThread().setName("Bhaskar Thread");
		System.out.println(Thread.currentThread().getName());
		try{Thread.sleep(3000);}catch (Exception e) {}  
	}  
}  