package com.app;

public class Sorting {
	public static void bubbleSort(int[] arr){
		int n=arr.length;
		int k;
		for(int m=n;m>=0;m--){
			for(int i=0;i<n-1;i++){
				k=i+1;
				if(arr[i]>arr[k]){
					swapNumbers(i,k,arr);
				}
			}
			printNumbers(arr);
		}
		
	}
	private static void printNumbers(int[] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println("\n");
	}
	private static void swapNumbers(int i, int k, int[] arr) {
		int temp;
		temp=arr[i];
		arr[i]=arr[k];
		arr[k]=temp;
	}
	public static void main(String[] args) {
		int values[]={2,5,9,-8,3,69,-5};
		Sorting.bubbleSort(values);
		
	}

}
