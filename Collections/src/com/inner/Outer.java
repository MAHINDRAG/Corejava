package com.inner;

public class Outer {

	int x =10 ;
	static int y = 20;
	public void methodTwo(){
		System.out.println("Outer Class");
		Inner i = new  Inner();
		i.methodOne();
	}
	class Inner{
		public void methodOne(){
			System.out.println("Inner class");
			System.out.println(x+" "+y);
		}
	}
	public static void main(String[] args) {
		Outer o =new Outer();
		Outer.Inner i = o.new Inner();
		i.methodOne();

		Outer.Inner o1 = new Outer().new Inner();
		o1.methodOne();

		Inner o2 = new Outer().new Inner();
		o2.methodOne();

		new Outer().new Inner().methodOne();
	}

}
