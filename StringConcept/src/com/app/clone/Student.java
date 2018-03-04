package com.app.clone;

public class Student implements Cloneable{

	private Integer id;
	private String name;
	
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) {
		try {
			Student s1 = new Student(10, "Mahi");
			Student s2 = (Student) s1.clone();
			System.out.println("S1 Object - ID:"+s1.id+", Name:"+s1.name);
			System.out.println("S2 Object - ID:"+s2.id+", Name:"+s2.name);
			s2.id = 100;
			s2.name = "Vasu";
			System.out.println("S1 Object - ID:"+s1.id+", Name:"+s1.name);
			System.out.println("S2 Object - ID:"+s2.id+", Name:"+s2.name);
			s1.id = 1000;
			s1.name = "karthik";
			s2 = (Student) s1.clone();
			System.out.println("S1 Object - ID:"+s1.id+", Name:"+s1.name);
			System.out.println("S2 Object - ID:"+s2.id+", Name:"+s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
