package com.app.kodiak;
/**
 * 
 * @author Mahindra Gopisetty
 * Description : This Class indicates how many String objects are 
 * Created at the end of the line 5.
 * 
 */
public class CountOfStringObjects {

	public static void main(String[] args) {
		String s1 = "one";// one here ..: one
		String s2 = s1 + "two"; //two here ...:two and onetwo
		s1.concat("three");//two here ..: three and onethree
		s2.concat(s1);//one here ..:onetwoone
		s1 +="four";//this is line 5 .//two here ..: four and onefour
		System.out.println("My Answer is Eight..");
	}
}
