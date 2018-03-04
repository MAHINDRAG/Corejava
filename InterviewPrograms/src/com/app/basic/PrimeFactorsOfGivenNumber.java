package com.app.basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactorsOfGivenNumber {
	public static Set<Integer> primeFactors(int number) {
	    int n = number;
	    Set<Integer> factors = new HashSet<Integer>();
	    for (int i = 2; i <= n; i++) {
	      while (n % i == 0) {
	        factors.add(i);
	        n /= i;
	      }
	    }
	    return factors;
	}
    public static void main(String args[] ){
      Scanner input=new Scanner(System.in);
      System.out.print("PrimeFactors of :");
      int num=input.nextInt();
      for (Integer integer : primeFactors(num)) {
      System.out.println(integer+" ");
     }
   }
}