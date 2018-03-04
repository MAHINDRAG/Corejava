package com.app.synchronization;

public class Display {

	public synchronized void wish(String name){
		for(int i=0;i<3;i++)
		{
			System.out.print("good morning:");
			try{
				Thread.sleep(1000);	
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name);
			Addition addition = new Addition();
			int sum=addition.sum(10, 20);
			System.out.println("Sum :"+sum);
		}

	}
}
