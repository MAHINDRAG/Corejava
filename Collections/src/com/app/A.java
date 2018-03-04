package com.app;

import java.util.ArrayList;
import java.util.List;

public class A {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
        int i = 10;
        li.add(10);
        int j = li.get(0);
        System.out.println(j);
	}
}
