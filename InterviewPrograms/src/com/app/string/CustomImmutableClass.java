package com.app.string;

import java.util.Date;

public final class CustomImmutableClass {
	/**
	 * Integer class is immutable as it does not provide any setter to change its content
	 * */
	private final Integer immutableField1;
	/**
	 * String class is immutable as it also does not provide setter to change its content
	 * */
	private final String immutableField2;
	/**
	 * Date class is mutable as it provide setters to change various date/time parts
	 * */
	private final Date mutableField;

	//Default private constructor will ensure no unplanned construction of class
	private CustomImmutableClass(Integer immutableField1, String immutableField2, Date date) {
		super();
		this.immutableField1 = immutableField1;
		this.immutableField2 = immutableField2;
		this.mutableField = new Date(date.getTime());
	}
	/**
	 * Integer class is immutable so we can return the instance variable as it is 
	 */
	public Integer getImmutableField1() {
		return immutableField1;
	}
	/**
	 * String class is also immutable so we can return the instance variable as it is
	 */
	public String getImmutableField2() {
		return immutableField2;
	}
	/**
	 * Date class is mutable so we need a little care here.
	 * We should not return the reference of original instance variable.
	 * Instead a new Date object, with content copied to it, should be returned.
	 * */
	public Date getMutableField() {
		return new Date(mutableField.getTime());
	}

	@Override
	public String toString() {
		return "CustomImmutableClass [immutableField1=" + immutableField1 + ", immutableField2=" + immutableField2
				+ ", mutableField=" + mutableField + "]";
	}

	public static void main(String[] args) {
         CustomImmutableClass c = new CustomImmutableClass(100, "test", new Date());
                              c = new CustomImmutableClass(1001, "tested", new Date());
       /*  c.immutableField1 = 450;
         c.immutableField2 = "MAHI";
         c.mutableField = new Date();*/
         System.out.println("Data :"+c);
         
	}

}
