package com.app.synchronization;

public class Addition {

	public synchronized int sum(int a,int b){
		int result = a + b;
		return result;
	}
}
