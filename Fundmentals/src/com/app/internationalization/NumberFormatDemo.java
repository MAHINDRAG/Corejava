package com.app.internationalization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {

		Double d = 123623.758;
		NumberFormat numberFormat1 = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Italy fromat "+numberFormat1.format(d));
		NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.CHINA);
		System.out.println("CHINA fromat "+numberFormat2.format(d));
		NumberFormat numberFormat3 = NumberFormat.getInstance(Locale.US);
		System.out.println("US fromat "+numberFormat3.format(d));
		NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US notation is:"+numberFormat4.format(d));
		System.out.println("full form is :"+DateFormat.getDateInstance(0).format(new Date()));
		System.out.println("long form is :"+DateFormat.getDateInstance(1).format(new Date()));
		System.out.println("medium form is :"+DateFormat.getDateInstance(2).format(new Date()));
		System.out.println("short form is :"+DateFormat.getDateInstance(3).format(new Date()));
		System.out.println("ITALY style is :"+DateFormat.getDateInstance(0,Locale.ITALY).format(new Date()));
		System.out.println("ITALY style is :"+DateFormat.getDateTimeInstance(0, 0, Locale.ITALY).format(new Date()));
	}

}
