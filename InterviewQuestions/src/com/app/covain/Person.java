package com.app.covain;

public class Person {
  
	private String name;
	private int age;
	private String comment;
	public Person(String name, int age, String comment) {
		super();
		this.name = name;
		this.age = age;
		this.comment = comment;
	}
	public boolean equals(Object o){
		if(!(o instanceof Person))
			return false;
		Person p=(Person) o;
		return age==p.age && name.equals(p.name);
	}
}
