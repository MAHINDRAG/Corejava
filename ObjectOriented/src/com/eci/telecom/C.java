package com.eci.telecom;

public class C implements B{

	@Override
	public void print() {
		System.out.println("Good Morning");		
	}

	public static void main(String[] args) {
		
		B b = new C();
		b.print();
		b.test();
		C c = new C();
		c.print();
		A a = new C();
		a.print();
		a.test();
	}

	@Override
	public void test() {
	  System.out.println("TEST");
	}
}
