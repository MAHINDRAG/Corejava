package com.app.string;

public class ArrayParameter {
	int[] getarray(){
		int arr[]={10,20,30,40};
		return arr;

	}
	public static void main(String[] args) {
		ArrayParameter ap=new ArrayParameter();
		int[] arr=ap.getarray();
		for(int v:arr){
			System.out.println(v);
		}

	}
}

