package com.inner;

public class Test {
	int x = 10;
	static int y = 10;

	public void methodOne(){
		class Inner{
			public void methodTwo(){
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.methodTwo();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.methodOne();
	}

}
