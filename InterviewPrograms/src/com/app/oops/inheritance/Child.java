package com.app.oops.inheritance;

public class Child extends Parent{

	public void methodTwo(){
		System.out.println("This is child class");
	}

	@Override
	public void methodOne() {
		super.methodOne();
	}

	public static void main(String[] args) {

	}
}
