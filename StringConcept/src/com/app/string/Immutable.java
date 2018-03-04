package com.app.string;

public class Immutable {

	final String pandcardNumber;

	public Immutable(String pandcardNumber) {
		super();
		this.pandcardNumber = pandcardNumber;
	}

	public String getPandcardNumber() {
		return pandcardNumber;
	}
	public static void main(String[] args) {
		Immutable im = new Immutable("BPNP");
		im = new Immutable("B");
		//im.pandcardNumber = "BP";
		System.out.println(im.getPandcardNumber());
		Immutable im1 = new Immutable("BPN");
		System.out.println(im1.getPandcardNumber());
	}
}
