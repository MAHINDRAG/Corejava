package com.app;

public class Mythread1 extends Thread{
	Table t;
	Mythread1(Table t){
		this.t=t;
	}
	public void run(){
		t.print(5);
	}
}
