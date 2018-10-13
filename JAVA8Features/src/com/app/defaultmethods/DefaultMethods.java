package com.app.defaultmethods;

public class DefaultMethods implements Sayble{

	@Override
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	
	@Override
	public void say() {
		Sayble.super.say();
		System.out.println("This is implementation class say method");
	}
	
	@Override
	public void say(String msg) {
		Sayble.super.say();
		System.out.println("This is implementation class say method with one Arg:"+msg);
	}
	
	
	
	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say();
		dm.sayMore("Work is worship");
		Sayble.sayLouder("I Want to become a good Architect in sofware industry");
	}

	

}
