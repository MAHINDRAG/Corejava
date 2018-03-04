package com.app.stream;

import java.util.stream.Stream;

public class JavaStreamExample {

	public static void main(String[] args) {
		Stream.iterate(1, element->element+1)
			  .filter(element->element%5==0)
			  .limit(2).forEach(System.out::println);
	}
	
	public static void main(String arg){
		
	}
}
