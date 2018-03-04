package com.app.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		try {
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream("src/abc.properties");
			p.load(fis);
			System.out.println("Data:"+p);
			System.out.println("2484 :"+p.getProperty("2484"));
			Enumeration<Object> e = p.elements();
			while(e.hasMoreElements()){
				System.out.println(e.nextElement());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("===============================");
		try {
			Properties p = new Properties();
			FileOutputStream fos = new FileOutputStream("src/xyz.properties");
			p.setProperty("Colagate", "100");
			p.setProperty("Soap", "50");
			p.store(fos, "File updated by Mahindra");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
