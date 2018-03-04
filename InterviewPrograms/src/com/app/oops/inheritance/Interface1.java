package com.app.oops.inheritance;

public interface Interface1 {
	
	
    public void methodOne();
     static void msg(){
    	System.out.println("Static block");
    }
     
    default void msg1(){
    	System.out.println("Default method");
    }
    public static void main(String[] args) {
		System.out.println("main method");
		Interface1.msg();
	}
}
