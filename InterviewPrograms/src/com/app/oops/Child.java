package com.app.oops;

public class Child extends Covariantkeywword {

	Child get(){
		return this;
	}
	void message(){
		System.out.println("welcome to covariant return type");
	}  
	public static void main(String[] args) {
		new Child().get().message();

	}
}
