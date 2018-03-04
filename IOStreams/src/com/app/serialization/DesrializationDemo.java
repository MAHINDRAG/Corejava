package com.app.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesrializationDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Deserialization Started");
			FileInputStream fis = new FileInputStream("D:/DBJars/customer.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			Object obj = in.readObject();
			Customer c = (Customer) obj;
			System.out.println("ID:"+c.customerId+",Name:"+c.customerName+",MobNo:"+c.mobileNo+",City:"+c.city);
		    in.close();
		    fis.close();
		    System.out.println("Deserialization Ended");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
