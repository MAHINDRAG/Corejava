package com.app.functioninterface.impl;

import com.app.functioninterface.Sayable;

public class FuncationalInterfaceExample implements Sayable{

	public static void main(String[] args) {
		FuncationalInterfaceExample fiExample = new FuncationalInterfaceExample();
		fiExample.say("Hello, Good Morning");
		fiExample.doIt();

	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void doIt() {
		System.out.println("This is doit Method");
		Sayable.super.doIt();
	}
	
	@Override
	public void say(String msg) {
		System.out.println("Message :"+msg.toString());
	}

}
