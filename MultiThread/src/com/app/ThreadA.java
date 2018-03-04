package com.app;

public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("Main Thread trying to call wait method");
			b.wait();
			System.out.println("Main thread get notified");
			System.out.println(b.total);
		}
		
	}

}
