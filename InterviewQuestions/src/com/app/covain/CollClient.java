package com.app.covain;

import java.util.HashSet;

public class CollClient {
	public static void main(String[] args) {
		HashSet mymap=new HashSet();
		String s1=new String("mahi");
		String s2=new String("mahi");
		NameBean s3=new NameBean("abcdef");
		NameBean s4=new NameBean("abcdef");
		mymap.add(s1);
		mymap.add(s2);
		mymap.add(s3);
		mymap.add(s4);
		System.out.println(mymap);
		
	}

}
