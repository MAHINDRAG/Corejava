package com.eci.telecom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindingRepeatedElements {
	
	/*public int[] repeatedElements(int[] arr){
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					al.add(arr[i]);
				}
			}
		}
	    int[] duplicateElements = new int[al.size()];
	    for(int i=0;i<al.size();i++){
	    	duplicateElements[i]=al.get(i);
	    }
		return duplicateElements;		
	}
	
	public static void main(String[] args) {
		int array[]={1,2,2,3,4,5,6,6,7,7,8};
		FindingRepeatedElements fre = new FindingRepeatedElements();
		int[] duplicatedElements = fre.repeatedElements(array);
		System.out.print("Duplicate Elements:");
		for(int k:duplicatedElements){
			System.out.print(k+"\t");
		}
		
	}*/
	
	/**
	 * using collection
	 */
	
	public static void main(String[] args) {
		Integer array[]={1,2,2,3,4,5,6,6,7,7,8};
		List<Integer> list = Arrays.asList(array);
		ArrayList<Integer> al = new ArrayList<Integer>(list);
		System.out.println(al);
		Set<Integer> DuplicateValue = new HashSet<Integer>(al);
		for(Integer value:DuplicateValue){
		  System.out.println(value+":"+Collections.frequency(al, value));
		}
	}

}
