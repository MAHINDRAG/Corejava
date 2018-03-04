package com.app.mcq;

class A implements Runnable{
	public void run(){
		try{
			for(int i=0;i<4;i++){
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName());
			}
		}catch(InterruptedException e){
		}
	}
}
public class Test4 {
	public static void main(String argv[]) throws Exception{
		A a = new A();
		Thread t = new Thread(a, "A");
		Thread t1 = new Thread(a, "B");
		t.start();
		t.join();
		t1.start();
	}
}
