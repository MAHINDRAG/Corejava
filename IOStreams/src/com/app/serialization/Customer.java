package com.app.serialization;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	int customerId;
    String customerName;
    String mobileNo;
    transient String city;
	public Customer(int customerId, String customerName, String mobileNo, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.city = city;
	}
    
    

}
