package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		Integer arr[]={78,35,45,65,59,12,87,3,25};
		System.out.print("Before sorting :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n After sorting :");
		Arrays.sort(arr);//sorting Array
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		//converting an array into List(collection)
		List l=Arrays.asList(arr);
		System.out.print("\n collection :"+l);
		ArrayList<Integer> al=new ArrayList<Integer>(l);
		al.add(100);
		System.out.println("\n ArrayList :"+al);
		
		
	}

}
