package com.arrays.sort;

public class Derived {
  static int x = 100;
	static{
		x = x-- + --x;
	}
	{
		x = x++ - ++x;
	}
	public static void main(String[] args) {
		Derived d = new Derived();
		System.out.println(d.x);
	}
}
