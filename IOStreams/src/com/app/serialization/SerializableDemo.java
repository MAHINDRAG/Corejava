package com.app.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {
		Customer c = new Customer(123456, "Mahindra", "8147844352", "kadapa");
		System.out.println("Serialization Started");
		try {
			FileOutputStream fos = new FileOutputStream("D:/DBJars/customer.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(c);
			out.flush();
			out.close();
			fos.close();
			System.out.println("Serialization ended");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
