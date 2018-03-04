package com.app.object;

public interface Welcome {

	static int cube(int x){return x*x*x;} 
	default void msg(){System.out.println("default method");} 
	public static void main(String[] args) {
		
	}

}
