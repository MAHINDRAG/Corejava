package com.app;

public class joinMethodDemo extends Thread{
	@Override
	public void run() {
		super.run();
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		joinMethodDemo j = new joinMethodDemo();
		j.start();
		try {
			j.join(7000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int k=6;k<10;k++){
           System.out.println(k);
		}
	}
}
