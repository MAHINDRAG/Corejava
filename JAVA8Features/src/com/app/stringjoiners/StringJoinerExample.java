package com.app.stringjoiners;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner stringJoiner1 = new StringJoiner(",");
		stringJoiner1.setEmptyValue("It is empty");
		System.out.println(stringJoiner1);
		stringJoiner1.add("Mahindra");
		stringJoiner1.add("Karthik");
		stringJoiner1.add("Sudheer");
		stringJoiner1.add("vinayak");
		System.out.println("StringJoiner using Delimiter:"+stringJoiner1); 
		int length = stringJoiner1.length();
		System.out.println("String Joiner Length:"+length);
		
		StringJoiner stringJoiner2 = new StringJoiner(",","[","]");
		stringJoiner2.add("Mahindra");
		stringJoiner2.add("Karthik");
		stringJoiner2.add("Sudheer");
		stringJoiner2.add("vinayak");
		System.out.println("StringJoiner using Delimiter Prefix and Suffix:"+stringJoiner2); 
		
		StringJoiner stringJoiner3 = new StringJoiner(":","[","]");
		stringJoiner3.add("Dhanu");
		stringJoiner3.add("Prasad");
		stringJoiner3.add("Kalyan");
		stringJoiner3.add("Raghava");
		
		StringJoiner merge1 = stringJoiner2.merge(stringJoiner3);
		System.out.println("Merging two StringJoiners:"+merge1);
		
		StringJoiner merge2 = stringJoiner1.merge(stringJoiner3);
		System.out.println("Merging two StringJoiners:"+merge2);
		
		String str = stringJoiner3.toString();
		System.out.println("String Joiner as String type:"+str);
		
	}
}
