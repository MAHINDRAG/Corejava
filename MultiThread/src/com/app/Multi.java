package com.app;
public class Multi extends Thread{
	public void run(){
		System.out.println("Thread is running");
	}
	public void start(){
		super.start();
	  System.out.println("Start Method");
	}
public static void main(String args[]){
	Multi t1=new Multi();
	t1.start();
	System.out.println("Main Thread");
	
}
}
