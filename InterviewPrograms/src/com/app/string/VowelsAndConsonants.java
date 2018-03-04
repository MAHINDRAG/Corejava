package com.app.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsAndConsonants {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String :");
		String name=br.readLine();
		System.out.print("Response :");
		for(int i=0;i<name.length();i++){
			char c=name.charAt(i);
			if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
				Character c2=Character.toUpperCase(c);	
				System.out.print(c2);
			}else{
				Character c3=Character.toLowerCase(c);
				System.out.print(c3);
			}
		}

	}

}
