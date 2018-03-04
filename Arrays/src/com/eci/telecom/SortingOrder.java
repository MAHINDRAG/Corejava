package com.eci.telecom;

public class SortingOrder {
	public int[] arraySort(int[] arr){
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
               if(arr[i]<arr[j]){
            	 temp = arr[j];
            	 arr[j] = arr[i];
            	 arr[i] = temp;
               }
			}
		}
		return arr;		
	}

	public static void main(String[] args) {
		int array[] = {5,4,3,2,1,6};
		SortingOrder so = new SortingOrder();
		int result[] = so.arraySort(array);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+"\t");
		}
	}

}
