package com.app.object;

import java.util.StringTokenizer;

public class StringTokenzierDemo {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("My name is Mahindra");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		String msg = "MynameisMahindra.WelcomeTojava";
		String submsg1 = msg.substring(0, 2);
		System.out.println(submsg1);
	}
}
