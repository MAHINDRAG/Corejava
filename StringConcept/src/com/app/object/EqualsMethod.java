package com.app.object;

public class EqualsMethod {
	int rno;
	String name;
	public EqualsMethod(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}
	public boolean equals(Object obj){
		EqualsMethod em=(EqualsMethod) obj;
		if(rno==em.rno && name==em.name){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		EqualsMethod s1 = new EqualsMethod(112, "Mahindra");
		EqualsMethod s2 = new EqualsMethod(111, "Mahi");
		System.out.println(s1.equals(s2)+" ,"+(s1==s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
