package com.app.singleton;

import com.app.singleton.HelloWorld.B;

public class Addition {
	
	public static void main(String[] args) {
		int result = SingletonDemo.getObject().sum(10, 20);
		System.out.println("Result :"+result);
		B b = new B();
		System.out.println(b.a);
	}
	
	

}
