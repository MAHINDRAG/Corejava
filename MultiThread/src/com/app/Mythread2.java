package com.app;

public class Mythread2 extends Thread{
	Table t;
	Mythread2(Table t){
		this.t = t;
	}
	public void run(){
		t.print(100);
	}
	public static void main(String[] args) {
        Table obj = new Table();
        Mythread1 t1 = new Mythread1(obj);
        Mythread2 t2 = new Mythread2(obj);
        t1.start();
        t2.start();
	}
}
