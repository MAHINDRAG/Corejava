package com.arrays.sort;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int values[] = {10,20,30,4,8,7,2};
		System.out.println("primitive array before sorting");
		for(int num:values){
			System.out.print(num+"\t");
		}
		System.out.println();
		Arrays.sort(values);
		System.out.println("Array Search:"+Arrays.binarySearch(values,6));
		System.out.println("Array Search:"+Arrays.binarySearch(values,7));
		System.out.println("primitive array after sorting");
		for(int num:values){
			System.out.print(num+"\t");
		}
		System.out.println();
		String s[] = {"A","K","S","F"};
		System.out.println("Object array before sorting");
		for(String letters:s){
			System.out.print(letters+"\t");
		}
		System.out.println();
		Arrays.sort(s);
		System.out.println("String Search:"+Arrays.binarySearch(s,"Z"));
		System.out.println("String Search:"+Arrays.binarySearch(s,"S"));
		System.out.println("Object array after sorting");
		for(String letters:s){
			System.out.print(letters+"\t");
		}
		System.out.println();
		Arrays.sort(s,new MyComparator());
		System.out.println("Comparator Search:"+Arrays.binarySearch(s,"Z",new MyComparator()));//0
		System.out.println("Comparator Search:"+Arrays.binarySearch(s,"S",new MyComparator()));//-2
		System.out.println("Object array after sorting by Comparator:");
		for(String s1: s)
		{
			System.out.print(s1+"\t");
		}

	}
}
