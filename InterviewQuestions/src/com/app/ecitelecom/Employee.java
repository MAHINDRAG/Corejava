package com.app.ecitelecom;

import java.util.HashMap;

public class Employee {

	int id = 0 ;
	String name = null;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		 int value = 10;
		return value;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 40;
		System.out.println("E1 HashCode :"+e1.hashCode());
		Employee e2 = new Employee();
		e2.id = 50;
		System.out.println("E2 HashCode :"+e2.hashCode());
		System.out.println("Equals method comparison:"+e1.equals(e2));
		System.out.println("HashCode Comparision :"+(e1==e2));
		HashMap<Employee, String> hm = new HashMap<Employee,String>();
		hm.put(e1, "Mahindra");
		//hm.put(e2, "Mahindra");
		hm.put(e2, "Adithya");
		System.out.println(hm.get(e1)+"::"+hm.get(e2));
	}
	
	
	
}
