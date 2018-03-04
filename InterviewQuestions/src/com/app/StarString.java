package com.app;

public class StarString {
	public static void main(String[] args) {
		String str="Ramana";
		for(int i=1;i<=str.length();i++){
			if(i%2==0){
				System.out.print("*");
			}else{
				System.out.print(str.charAt(i-1));
			}
		}
	}

}
