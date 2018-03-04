package com.app.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter String :");
		String str=br.readLine();
		StringBuffer sf=new StringBuffer(str).reverse();
		System.out.println(sf);
		
	}

}