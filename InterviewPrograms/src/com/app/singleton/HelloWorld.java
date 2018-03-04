package com.app.singleton;

public class HelloWorld {
	
	public static class B{
		B(){
		}
		int a = 20;
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
	}
}
