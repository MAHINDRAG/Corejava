package com.app.kodiak;

import java.util.ArrayList;
import java.util.List;

 interface Test1 {	
	public void testMethod() throws Exception;
}	
class Test2 implements Test1{
	@Override
	public void testMethod() throws Exception {
		System.out.println("Test");
	}
}

public class Test{
	public static void main(String[] args) {
		Test1 t2 = new Test2();
		//t2.testMethod();
	}
}
