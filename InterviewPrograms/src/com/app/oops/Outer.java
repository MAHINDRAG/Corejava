package com.app.oops;

public class Outer {
	int x=10;
	static int y=20;	
	class Inner{
		public void show(){
			System.out.println("HAI");
			System.out.println(x);//10
			System.out.println(y);//20
		}
	}
	/*
	 * Accessing Inner class from instance Block
	 */
	public void move(){
		Inner i2=new Inner();
		i2.show();
	}
	/*  
	 * Accessing from Static Block
	 */
	public static void main(String[] args) {
		/*
		 * Method1
		 */
		Outer o=new  Outer();
		o.move();
		Outer.Inner i=o.new Inner();
     	i.show();
		/*
		 * Method2
		 */
		Outer.Inner i1=new Outer().new Inner();
		i.show();
	}
	

}
