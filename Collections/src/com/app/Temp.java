package com.app;

public class Temp {
	
	@Override
	public String toString() {
		return "Temp";
	}
	
	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize() method called");
	}

}
