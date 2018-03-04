package com.eci.telecom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Sample {
	
	public static void main(String[] args) {
	  BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	  try {
		FileReader file = new FileReader("D:/sample");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	}

}
