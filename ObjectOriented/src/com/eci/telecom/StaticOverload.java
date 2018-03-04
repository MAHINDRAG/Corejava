package com.eci.telecom;

public class StaticOverload {
	public static void main(String[] args) {
		StaticOverload.add();
		StaticOverload.add(10);
	}
	public static void add(){
        System.out.println("zero Arguments");
	}
	public static void add(int b){
        System.out.println("Arag-1 with parameter");
	}

}
