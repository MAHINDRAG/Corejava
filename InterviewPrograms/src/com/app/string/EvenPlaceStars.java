package com.app.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenPlaceStars {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String :");
		String str=br.readLine();
		char[] strArray=str.toCharArray();
		for(int i=0;i<strArray.length;i++){
			if(i%2==0){
				@SuppressWarnings("unused")
				char c=strArray[i];
			}else{
				strArray[i]='*';
			}
		}
		System.out.println(strArray);
	}
}
