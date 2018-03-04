package com.app;
 class simple1 extends Thread{
	public void run(){
		System.out.println("task one");
	}
}
 class simple2 extends Thread{
	public void run(){
		System.out.println("task two");
	}
}
public class TestMultitask1{
	public static void main(String[] args) {
		simple1 s1=new simple1();
		simple2 s2=new simple2();
		s1.start();
		s2.start();
	}
	
}
