package com.app.subex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ListAll2CompoundWords {

	public static void main(String[] args){

		try {
			FileReader file1 = new FileReader("C:/Users/DELL/Downloads/File1");
			FileReader file2 = new FileReader("C:/Users/DELL/Downloads/File2");
			Properties p = new Properties();
			p.load(file1);
			p.load(file2);
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}
