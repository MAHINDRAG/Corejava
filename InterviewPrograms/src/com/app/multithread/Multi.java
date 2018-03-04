package com.app.multithread;

public class Multi extends Thread{

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
	public void start(){
		System.out.println("Start Method");
	}
	public static void main(String[] args) {
		Multi t = new Multi();
		t.start();
		for(int i=0;i<5;i++){
			System.out.println("Main Thread");
		}
	}
}
