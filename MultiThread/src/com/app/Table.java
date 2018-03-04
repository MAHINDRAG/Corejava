package com.app;

public class Table {

	public  void print(int n){
		synchronized(this){
			for(int i=1;i<=5;i++){
				try{
					Thread.sleep(500);
				}catch(Exception e){
					e.printStackTrace();
				}
				System.out.println(i*n);
			}
		}
	}
}
