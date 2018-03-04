package com.app;

public class DaemonThread extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Thread is Daemon");
		}else{
			System.out.println("user Thread work ");
		}
	}
	public static void main(String[] args) {
		DaemonThread dt1=new DaemonThread();
		DaemonThread dt2=new DaemonThread();
		DaemonThread dt3=new DaemonThread();
		dt1.setDaemon(true);
		
		dt1.start();
		dt2.start();
	//	dt2.setDaemon(true);
		dt3.start();
	}
	
}