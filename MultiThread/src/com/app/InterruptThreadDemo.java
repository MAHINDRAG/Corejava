package com.app;

public class InterruptThreadDemo extends Thread{

	@Override
	public void run() {
		super.run();
		try{
			Thread.sleep(1000);
			System.out.println("Task");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		InterruptThreadDemo it = new InterruptThreadDemo();
		it.start();
		try{
			it.interrupt();	
		}catch (Exception e) {
			System.out.println("Exception handled:"+e);
		}
	}
	
	
}
