package com.app.string;

public class NumberOfobjects {
	public static void main(String[] args) {
		String name="Hemanth";  // one here.... Hemanth
		String sname=name+"Khandal";//two here.... Khandal and HemantKhandal
		String s=sname+"java";//two here.... Java and HemantKhandalJava
		String ss=new String("Hemanth");// one here... Hemanth
		System.out.println("Hashcode :"+name.hashCode()+" Hashcode : "+ss.hashCode());
		
		String str1=new String("java");
		String str2=new String("java");
		String str3="java";
		String str4="java";
		String str5=str1;
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5));
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		System.out.println(str1==str5);
		
	}

}

