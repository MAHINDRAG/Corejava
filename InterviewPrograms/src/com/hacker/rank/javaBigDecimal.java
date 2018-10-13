package com.hacker.rank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class javaBigDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		String s[] = new String[n];
		for(int i=0;i<s.length;i++){
			s[i] = sc.next();
		}
		Arrays.sort(s,0,n,new Comparator<Object>() {
			@Override
			public int compare(Object a1, Object a2) {
				BigDecimal bigDecimal1 = new BigDecimal((String) a1);
				BigDecimal bigDecimal2 = new BigDecimal((String) a2);
				return bigDecimal2.compareTo(bigDecimal1);
			}
		});

		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}

}
