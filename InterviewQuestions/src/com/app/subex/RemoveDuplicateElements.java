package com.app.subex;

import java.util.ArrayList;


public class RemoveDuplicateElements {

	int removeDuplicates(ArrayList<Integer> list){
		
		@SuppressWarnings("unused")
		int newLenOfArray = 0;
		Object[] A = list.toArray();
		if(list.size()<=2)
			return newLenOfArray = list.size();
		int prev = 1, curr = 2;
		while(curr < list.size()){
			if(A[curr]==A[prev] && A[curr]==A[prev-1]){
				curr ++;
			}else{
				prev ++;
				A[prev] = A[curr];
				curr++;
			}
		}
		return newLenOfArray = prev+1;

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		
		RemoveDuplicateElements rde = new RemoveDuplicateElements();
		int length = rde.removeDuplicates(list);
		System.out.println("New Lenght :"+length);
	}
}
