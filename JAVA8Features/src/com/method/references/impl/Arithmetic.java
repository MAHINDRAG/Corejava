package com.method.references.impl;

import java.util.function.BiFunction;

public class Arithmetic {

	public static int add(int a,int b){
		return a+b;
	}
	
	public static float add(int a, float b){
		return a+b;
	}
	
	public int substraction(int a, int b){
		return a-b;
	}
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = Arithmetic::add;
		Integer result= biFunction.apply(20, 30);
		System.out.println("Result :"+result);
		
		BiFunction<Integer, Float, Float> biFunction1 = Arithmetic::add;
		Float fresult = biFunction1.apply(20, 30.2f);
		System.out.println("Result :"+fresult);
		
		BiFunction<Integer, Integer, Integer> biFunction3 =new Arithmetic()::substraction;
		Integer subtractionResult = biFunction3.apply(45, 20);
		System.out.println("SubtractionResult:"+subtractionResult);
	}
}
