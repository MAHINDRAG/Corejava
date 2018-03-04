package com.app;

public class Generics<T> {
	T e;
	void add(T e){
		this.e=e;
	}
	T getValue(){
		return e;
	}
	void printArray(T[] array){
		for(T element:array){
			System.out.print(" "+element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Generics<Integer>  gen=new Generics<Integer>();
		gen.add(15);
		Integer i=gen.getValue();
		System.out.println(" Integer value :"+i);
		Generics<String> str=new Generics<String>();
		str.add("abc");
		String s=str.getValue();
		System.out.println(" Given String :"+s);
		Generics f=new Generics();
		f.add(23.6f);
		float f1=(float) f.getValue();
		System.out.println("Float value :"+f1);
		Integer[] iarray={1,22,332,52};
		Float[] farray={12.36f,56.36f,45.36f};
		System.out.println("Integer Array Values :");
		f.printArray(iarray);
		f.printArray(farray);
		
		
	}
}
