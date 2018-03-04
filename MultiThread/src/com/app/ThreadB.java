package com.app;

public class ThreadB extends Thread{

	int total = 0;
	public void run(){
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			System.out.println("Child thread starts calculation");
			for(int i=1;i<=100;i++){
				total = total + i;
			}
			System.out.println("Child Thread giving notification");
			this.notify();
			System.out.println("Hai");
		}
		
	}
}
