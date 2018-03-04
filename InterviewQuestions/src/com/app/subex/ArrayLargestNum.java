package com.app.subex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayLargestNum {
	public String arrange(ArrayList<Integer> list){
		@SuppressWarnings("unused")
		String largestNumber = "0";
		int[] nums = new int[list.size()];
		for(int i=0; i < nums.length; i++){
			nums[i] = list.get(i);
		}
		String[] arr = new String[nums.length];
	    for(int i=0; i<nums.length; i++){
	        arr[i]=String.valueOf(nums[i]);
	    }
	 
	    Arrays.sort(arr, new Comparator<String>(){
	        public int compare(String a, String b){
	            return (b+a).compareTo(a+b);
	        }
	    });
	 
	    StringBuilder sb = new StringBuilder();
	    for(String s: arr){
	        sb.append(s);
	    }
	    while(sb.charAt(0)=='0'&&sb.length()>1)
	        sb.deleteCharAt(0);
		return largestNumber=sb.toString();
	}
	public static void main(String[] args) {
		ArrayLargestNum aln = new ArrayLargestNum();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(54);
		al.add(546);
		al.add(548);
		al.add(60);
		al.add(0);
		
		String number = aln.arrange(al);
		System.out.println("Largest Number :"+number);

	}

}
