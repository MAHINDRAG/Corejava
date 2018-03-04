package com.app.singleton;

public class SingletonDemo {
	static SingletonDemo d=null;
	/*
	 * Private Constructor
	 */
	private SingletonDemo(){
	}
	/*
	 * factory Method
	 */
	public static SingletonDemo getObject(){
		if(d==null){
			d=new SingletonDemo();
		}
		return d;
	}
	public static void main(String[] args) {
		SingletonDemo d1=SingletonDemo.getObject();
		SingletonDemo d2=SingletonDemo.getObject();
		System.out.println((d1==d2)+" "+d1.hashCode()+" "+d2.hashCode());
	}
	
	public int sum(int a, int b){
		int c = a + b;
		return c;
	}

}
