package com.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBProperties {

	private static final Logger logger = LoggerFactory.getLogger(DBProperties.class);
	private static final Properties PROPERTIES = new Properties();
	private static final String DB_PROPERTIES = "db.properties";
	private static FileReader file = null;
	private static Boolean isPropertiesFileLoaded = true;
	static {
        logger.info("Entred :: DBProperties");
        load();
    }
	public static Boolean load(){
		try {
			System.out.println("Enterd into Load Method");
			file = new FileReader("src/main/resources/db.properties");
			PROPERTIES.load(file);
			System.out.println("Properties file {} has been loaded successfully:"+DB_PROPERTIES);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("Exit from Load Method");
		return isPropertiesFileLoaded;		
	}
	
	public static String getDriver(){
		logger.info("Driver:"+System.getProperty("Driver"));
		System.out.println("Driver:"+PROPERTIES.getProperty("Driver"));
		return PROPERTIES.getProperty("Driver");
	}
	
	public static String getConnectionUrl(){
		return PROPERTIES.getProperty("ConnectionUrl");
	}
	
	public static String getUsername(){
		return PROPERTIES.getProperty("Username");
	}
	
	public static String getPassword(){
		return PROPERTIES.getProperty("Password");
	}
	
	public static void main(String[] args) {
		DBProperties.getDriver();
	}
}
