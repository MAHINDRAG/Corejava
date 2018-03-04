package com.app.scientific.games;

public class Arguments {
	
	public static void main(String[] args) {
		
		try{
			System.out.println("Hi "+args[0]+"Welcome to program");
		}catch(ArithmeticException e){
			System.out.println("Array Index out of bounds exception");
		}catch(Exception e){
			System.out.println("Runtime Exceptione");
		}
	}

}
