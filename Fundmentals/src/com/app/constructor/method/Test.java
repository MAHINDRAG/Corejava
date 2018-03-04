package com.app.constructor.method;

public class Test {
	Test(){
		
	}
	static void Test(){
		//this(); //Here 's the error. constructor call
	}
 public static void main(String[] args) {
	Test();
}
}
