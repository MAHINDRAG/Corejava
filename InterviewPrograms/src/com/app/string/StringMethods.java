package com.app.string;

public class StringMethods {
	public static void main(String[] args) {
		String str1="Mahindra";
		String str2="MAHINDRA";
		String str="c";
		System.out.println("Length of The String :"+str1.length());
		System.out.println("Concat of the String :"+str1.concat(" is an IT Officer"));
		System.out.println("Character of the String :"+str1.charAt(2));
		System.out.println("Lower Case of the String :"+str1.toLowerCase());
		System.out.println("UpperCase of the String :"+str1.toUpperCase());
		System.out.println("Equals of the String :"+str1.equals(str2));
		System.out.println("Equals Ignore case of the String :"+str1.equalsIgnoreCase(str2));
		System.out.println("String Starts with Method :"+str1.startsWith("M"));
		System.out.println("String Ends with Method :"+str1.endsWith("A"));
		System.out.println("Replace Method :"+str1.replace("a", "A"));
		System.out.println("Compare Method :"+str.compareTo("C"));
		System.out.println("Compare Method :"+str.compareTo("f"));
		System.out.println("Compare Method :"+str.compareTo("c"));
		System.out.println("CompareIgnoreCase Method :"+str.compareTo("C"));
		System.out.println("Index of the Character :"+str1.indexOf('a'));
		System.out.println("Index of the Character :"+str1.indexOf("a"));
		System.out.println("Index of the Character :"+str1.indexOf('a',3));
		System.out.println("Index of the Character :"+str1.indexOf("a",3));
		System.out.println("Last Index of the Character :"+str1.lastIndexOf('a'));
		System.out.println("Last Index of the Character :"+str1.lastIndexOf("a"));
		System.out.println("Sub String of the Method :"+str1.substring(3));
		System.out.println("Sub String of the Method :"+str1.substring(3,7));
		System.out.println("Trim Method :"+str1.trim());
	}

}
