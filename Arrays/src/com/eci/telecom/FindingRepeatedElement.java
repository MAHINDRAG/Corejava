
package com.eci.telecom;

import java.util.Scanner;

public class FindingRepeatedElement {
	
	public int repeatedElement(int[] arr){
		int value = 0;
		for(int i=0;i<arr.length;i++){
		  for(int j=i+1;j<arr.length;j++){
			  if(arr[i]==arr[j]){
				  value = arr[i];
			  }
		  }
		}
		return value;		
	}
    
	public static void main(String[] args) {
		//int array[]={1,2,3,4,5,6,7,8,9,9,10};  //Static Way
		@SuppressWarnings("resource")  // Dynamic way
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Array length :");
		int length = sc.nextInt();
		int array[] = new int[length];
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		for(int j:array){
			System.out.print(j+"\t");
		}
		FindingRepeatedElement fre = new FindingRepeatedElement();
		int element =fre.repeatedElement(array);
		System.out.println("\nRepeated Element :"+element);
		
	}
}
