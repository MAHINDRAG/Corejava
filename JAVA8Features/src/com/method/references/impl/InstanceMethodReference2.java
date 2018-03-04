package com.method.references.impl;

import com.method.references.Sayable;

public class InstanceMethodReference2 {

	public void threadStatus(){
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		InstanceMethodReference2   instanceMethodReference2 = new InstanceMethodReference2();
		Sayable sayable = instanceMethodReference2::threadStatus;
		sayable.say();
		
		Sayable sayable2 = new InstanceMethodReference2()::threadStatus;
		sayable2.say();
	}
}
