package com.app.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
 
	private static final long serialVersionUID = 1L;
	String userName="Bhaskar";
	transient String pwd="kajal";
	private void writeObject(ObjectOutputStream os)throws Exception
	{
	os.defaultWriteObject();
	String epwd="123"+pwd;
	os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is)throws Exception{
	is.defaultReadObject();
	String epwd=(String)is.readObject();
	pwd=epwd.substring(3);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a1=new Account();
		System.out.println(a1.userName+"........."+a1.pwd);
		FileOutputStream fos=new FileOutputStream("D:/DBJars/abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.close();
		fos.close();
		FileInputStream fis=new FileInputStream("D:/DBJars/abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a2=(Account)ois.readObject();
		ois.close();
		fis.close();
		System.out.println(a2.userName+"........."+a2.pwd);
	}
}
