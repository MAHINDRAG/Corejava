
package com.app;
public class MethodOverriden{
	void show()throws ArithmeticException{
		System.out.println("parent class");
	}
}
class child extends MethodOverriden{
	void show()throws ArithmeticException{
		System.out.println("child class");
	}
	public static void main(String[] args) throws Exception {
		MethodOverriden m=new child();
		m.show();
	}
}