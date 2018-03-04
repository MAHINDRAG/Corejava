package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicateCharacter {
	
	 static String removeDuplicateChars(String str){
		char[] c=str.toCharArray();
		int length=c.length;
		for(int i=0;i<length;i++){
			
			  for(int j=i+1;j<length;j++){
				  if(c[i]==c[j]){
					  int test=j;
					  for(int k=j+1;k<length;k++){
						  c[test]=c[k];
						  test++;
					  }
					  length--;
					  j--;
					  
				  }
			  }
		}
		return String.copyValueOf(c).substring(0,length);
	 }
	
	public static void main(String[] args) throws IOException {
		RemoveDuplicateCharacter rdc=new RemoveDuplicateCharacter();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter String :");
		String str=br.readLine();
		String str1=removeDuplicateChars(str);
		System.out.println("String :"+str1);
		
	}

	

}
