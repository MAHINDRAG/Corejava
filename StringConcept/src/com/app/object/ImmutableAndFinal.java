package com.app.object;

public class ImmutableAndFinal {

	public static void main(String[] args) {
		
		final String s2 = "can't change";
		System.out.println(s2);
		String s3 = "Mahindra";
		s3.replace("Mahin", "Mahi");
		System.out.println(s3);
		String st = new String("Ashok");
		String st2 = "Ashok";
		System.out.println(st.equals(st2)+" :"+(st==st2));
		
	}
}
