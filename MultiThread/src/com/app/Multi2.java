
package com.app;

public class Multi2 implements Runnable{


	public void run() {
		System.out.println("Thread is running");
	}
	public void run(int n){
		System.out.println("Arg method");
	}
	public static void main(String[] args) {
		Multi2 t2=new Multi2();
		Thread t1=new Thread(t2);
		t1.start();
		t1.start();
		Multi2 t3=new Multi2();
		t1=new Thread(t3);
		t1.start();

	}

}
