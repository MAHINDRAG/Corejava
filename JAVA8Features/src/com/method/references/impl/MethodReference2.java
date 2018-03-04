package com.method.references.impl;

public class MethodReference2 {

	public static void threadStatus(){
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
	       Thread t = new Thread(MethodReference2::threadStatus);
	       t.start();
	}
}
