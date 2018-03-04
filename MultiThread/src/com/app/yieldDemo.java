package com.app;

public class yieldDemo extends Thread{
	public void run(){
		for(int i=6;i<10;i++){
			Thread.yield();
			System.out.println(i);
		}
		for(int i=11;i<15;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		yieldDemo y = new yieldDemo();
		y.start();
		for(int i=0;i<5;i++){
			Thread.yield();
			System.out.println(i);
		}
	}
}
