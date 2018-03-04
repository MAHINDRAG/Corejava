package com.app.oops.inheritance;

public class InterfaceTest implements Interface1 , Interface2{

	@Override
	public void methodOne() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		Interface1 i1 = new InterfaceTest();
		i1.methodOne();
		i1.msg1();
		Interface1.msg();
		Interface1 i2 = new InterfaceTest();
		i2.methodOne();
	}

}
