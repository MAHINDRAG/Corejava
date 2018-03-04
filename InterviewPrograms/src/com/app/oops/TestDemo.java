package com.app.oops;

interface interface1{
	int m1();
}

interface interface2{
	int m1();
}

public class TestDemo implements interface1,interface2{

	@Override
	public int m1() {
		System.out.println("Hai");
		return 0;
	}
	public static void main(String[] args) {
		TestDemo t=new TestDemo();
		t.m1();
	}
	

}
