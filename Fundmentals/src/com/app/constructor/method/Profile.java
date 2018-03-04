package com.app.constructor.method;

public class Profile {
	private Profile(int w) { // line 1
		System.out.print(w);
	}
	/*public static Profile() { // line 5
		*//**
		 * won't be compile because of line 5 , constructor can't be static
		 *//*
		System.out.print (10);
	}*/
	public static void main(String[] args) {
      Profile obj = new Profile(50);
	}
}
