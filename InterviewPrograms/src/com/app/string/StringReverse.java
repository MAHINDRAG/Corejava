package com.app.string;

public class StringReverse {
	public static void main(String[] args) {
		/*
		 * Method1
		 */
		String str1="Mahindra";
		String str2="";
		for(int i=0;i<str1.length();i++){
			str2=str1.charAt(i)+str2;
		}
		System.out.println("String Reverse :"+str2);
		
		/*
		 * Method2
		 */
		StringBuffer s1=new StringBuffer("Mahindra");
		System.out.println("String Reverse :"+s1.reverse());
		
		/*
		 * Method3
		 */
		String str3="Mahindra";
		String s2=new StringBuffer(str3).reverse().toString();
		System.out.println("String Reverse :"+s2);
		
		/*
		 * Method4
		 */
		String str="Mahindra";
        String str4="";
        for(int i=str.length()-1;i>=0;i--){
        str4=str4+str.charAt(i);
   }
   System.out.println("Reverse String : "+str4);
	}

}
