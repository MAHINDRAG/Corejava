package com.app.defaultmethods;

public interface Sayble {

	default void say() {   //default method
		System.out.println("Hello this is default say method");
	}
	
	default void say(String msg) {
		System.out.println("Hello this is default methods with one arg");
	}
	
	void sayMore(String msg); //Abstract method
	
	static void sayLouder(String msg){ //static method
		System.out.println("Loudly Say "+msg);
	}
	

	
}
