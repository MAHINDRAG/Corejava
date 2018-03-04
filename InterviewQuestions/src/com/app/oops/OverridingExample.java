package com.app.oops;

class Base1{
	int value = 0;
	Base1(){
		addValue();
	}
	void addValue(){
		System.out.println("Base:"+value);
		value += 10;
	}
	int getValue(){
		return value;
	}
}
class Derived1 extends Base1{
	Derived1(){
		addValue();
	}
	void addValue(){
		System.out.println("Derived1:"+value);
		value +=  20;
		System.out.println("Exit method");
		
	}
}


public class OverridingExample {

	public static void main(String[] args) {
		Base1 b = new Derived1();
		System.out.println(b.getValue());
	}
}
