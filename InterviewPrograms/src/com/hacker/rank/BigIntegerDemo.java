package com.hacker.rank;

import java.util.Scanner;
import java.math.*;

/*
 * 
 * In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types 
 * like long integer.
 */
public class BigIntegerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String numOne = sc.nextLine();
        String numTwo = sc.nextLine();
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        System.out.println(bigNumOne.add(bigNumTwo));
        System.out.println(bigNumOne.multiply(bigNumTwo));		

	}

}
