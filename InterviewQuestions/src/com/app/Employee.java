package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	public static void main(String[] args) {
		/*HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("name", "Mahindra");
		hm.put("name", "kadapa");
		hm.put("city", "Bangalore");
		hm.put("state", "AndhraPradesh");
		System.out.println(hm.get("state"));
		for(Map.Entry<String,String>  m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		
		List<String> list=new ArrayList<String>();
		list.add("Mahindra");
		list.add("kadapa");
		list.add("jana");
		list=new LinkedList<String>();
		list.add("Ram");
		list.add("Mahesh");
		list.add("Rajesh");
		list.add("20");
		//list.add(20);//List<String> is not applicable for the arguments (int)
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
