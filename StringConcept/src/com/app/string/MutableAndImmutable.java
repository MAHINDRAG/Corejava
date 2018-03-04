package com.app.string;

public class MutableAndImmutable {
	static int count=0;
	public int hashCode(){
		return count++;
	}
	public static void main(String[] args) {
		
		String s="Mahi";
		String s1=new String("Mahi");
		System.out.println("HashCode :"+s1.hashCode());
		System.out.println("HashCode :"+s.hashCode());
		
		
		/**
		 * using string literal
		 */
		String str="Mahindra";
		str.concat("Gopisetty");
		System.out.println(str);
		
		/**
		 * using new Operator
		 */
		
		System.out.println("using new Operator");
		String str1=new String("Techno");
		str1.concat("Tree");
		System.out.println(str1);
		
		/**
		 * using String Buffer
		 */
		
		StringBuffer sb=new StringBuffer("Adithya");
		sb.append("kancham");
		System.out.println(sb);
		
		/**
		 * using StringBuilder
		 * 
		 */
		StringBuilder sb1=new StringBuilder("Girish");
		sb1.append("kancham");
		System.out.println(sb1);
	}
}
