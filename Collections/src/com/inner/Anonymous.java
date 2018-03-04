package com.inner;

public class Anonymous {
	public void taste(){
		System.out.println("Spicy");
	}
    public static void main(String[] args) {
		Anonymous a  = new Anonymous(){
		  public void taste(){
			  System.out.println("Salt");
		  }
		};
		a.taste();
	}
}
