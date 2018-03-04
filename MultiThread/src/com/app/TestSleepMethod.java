package com.app;

public class TestSleepMethod extends Thread{

	@Override
	public void run() {
		System.out.println("Run method:"+Thread.currentThread().getName()+":,priority"+Thread.currentThread().getPriority());
		super.run();
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
         TestSleepMethod t1 = new TestSleepMethod();
         TestSleepMethod t2 = new TestSleepMethod();
         TestSleepMethod t3 = new TestSleepMethod();
         t1.start();
         t2.start();
         t3.start();
         System.out.println("Main method:"+Thread.currentThread().getName()+":,priority"+Thread.currentThread().getPriority());
         for(int i=10;i<15;i++){
        	 System.out.println(i);
         }
	}
}
