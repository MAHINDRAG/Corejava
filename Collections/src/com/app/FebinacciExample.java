package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FebinacciExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n1=0,n2=1,n3,count;
	System.out.print("Enter the count :");
	count=Integer.parseInt(br.readLine());
	System.out.println(n1+" "+n2);
    for(int i=0;i<count;i++){
    	n3=n1+n2;
    	System.out.print(" "+n3);
    	n1=n2;
    	n2=n3;
    }
}
}