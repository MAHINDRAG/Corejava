package com.eci.telecom;

/**
 * 
 * @author Mahindra
 * Can a class extends itself ?
 *
 */
public class ABC{
	
	void sum(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum :"+c);
	}
  public static void main(String[] args) {
	ABC a = new ABC();
	a.sum();
}
}
