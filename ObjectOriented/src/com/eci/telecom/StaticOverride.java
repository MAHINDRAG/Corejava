package com.eci.telecom;

public class StaticOverride extends StaticOverload{

	public static void add(){
		
	}
	
	public static void main(String[] args) {
		StaticOverride.add();
		int result = StaticOverride.sum();
		System.out.println("RES :"+result);
	}
	
	public static int sum(){
		try{
			int a = 10;
			int b = 20;
			int c = a/0;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return 5;
		}
	}
}
