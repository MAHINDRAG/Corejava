package com.app.covain;

 interface BooInterface1 {
	 final class Booclass{
		 static int b=90;
	 }

}
  class TestBoo implements BooInterface1{
	 public static void main(String[] args) {
		System.out.println(BooInterface1.Booclass.b);
	}
 }
