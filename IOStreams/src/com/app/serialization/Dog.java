package com.app.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog extends Animal implements Serializable{
	Dog(){
		System.out.println("Dog constructor called");
	}

	private static final long serialVersionUID = 1L;
	int j=20;
	public static void main(String[] args)throws Exception{
		Dog d1=new Dog();
		System.out.println(d1.i+"........"+d1.j);
		FileOutputStream fos=new FileOutputStream("D:/DBJars/abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.close();
		fos.close();
		FileInputStream fis=new FileInputStream("D:/DBJars/abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		ois.close();
		fis.close();
		System.out.println(d2.i+"........"+d2.j);
	}
}
