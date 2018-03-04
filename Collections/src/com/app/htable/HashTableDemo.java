package com.app.htable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		//ht.get(null);
		ht.put(100, "Girish");
		ht.put(102, null);
		ht.put(101, "Naresh");
		ht.put(101, "Girish");
		ht.put(103, "Mahindra");
		ht.put(104, "Adithya");
		ht.put(102, "Rayudu");
		ht.put(0, "");
		Set s=ht.keySet();
		System.out.println(s);
		System.out.println(ht.values());
		System.out.println(ht.containsValue("Mahindra"));
		/*System.out.println(ht.keySet());*/
		//ht.put(null, "Dhana");
		System.out.println(ht.isEmpty());
		
		System.out.println(ht.remove(101));
		System.out.println("Size :"+ht.size());
		for(Map.Entry<Integer,String> m : ht.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println("**************");
		Hashtable<String,String> ht1=new Hashtable<String,String>();
		ht1.put("Sachin", "cricketer");
		ht1.put("Naresh", "Student");
		ht1.put("Girish", "VolleyBallPlayer");
		for(Entry<String, String> m1:ht1.entrySet()){
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		System.out.println("***************");
		
		Hashtable<Employee,String> ht2=new Hashtable<Employee,String>();
		Employee emp6=new Employee();
		emp6.setEmpId(101);
		emp6.setEmpName("Mahindra");
		emp6.setEmpSal(1000.3);
		
		Employee emp1=new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Mahindra");
		emp1.setEmpSal(1000.3);
		
		Employee emp2=new Employee();
		emp2.setEmpId(103);
		emp2.setEmpName("Girish");
		emp2.setEmpSal(1090.3);
		
		Employee emp3=new Employee();
		emp3.setEmpId(102);
		emp3.setEmpName("Adithya");
		emp3.setEmpSal(1099.3);
		ht2.put(emp6, "Agriculture");
		ht2.put(emp1, "Software");
		ht2.put(emp2, "Electrical");
		ht2.put(emp3, "Designer");
		System.out.println(ht2.get(emp6));
		
		for(Entry<Employee, String> m3:ht2.entrySet()){
			System.out.println(m3.getKey()+" ,"+m3.getValue());
		}
		System.out.println("*************");
		Hashtable<Integer,Employee> ht3=new Hashtable<Integer,Employee>();
		Employee emp7=new Employee();
		emp7.setEmpId(101);
		emp7.setEmpName("Mahindra");
		emp7.setEmpSal(1000.3);
		
		Employee emp4=new Employee();
		emp4.setEmpId(101);
		emp4.setEmpName("Mahindra");
		emp4.setEmpSal(1000.3);
		
		Employee emp5=new Employee();
		emp5.setEmpId(103);
		emp5.setEmpName("Girish");
		emp5.setEmpSal(1090.3);
		ht3.put(500, emp7);
		ht3.put(501, emp4);
		ht3.put(106, emp5);
		System.out.println(ht3.get(500));
		
		
	}	
}
