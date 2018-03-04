package com.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LogLoader {

	private static Properties properties = null;
	private static Logger logger = LoggerFactory.getLogger(LogLoader.class);
	private static final String LOG_PROPERTIES = "log4j.properties";
	private static FileReader file = null;
	private LogLoader() {      
    	properties = new Properties();
    	try {
    		System.out.println("Enterd into Load Method");
			file = new FileReader("src/main/resources/db.properties");
			properties.load(file);
			logger.info("Path:",LOG_PROPERTIES);
			System.out.println("Properties file {} has been loaded successfully:"+LOG_PROPERTIES);
		} catch (FileNotFoundException e) {
			logger.error("error "+e);
		} catch (IOException e) {
			logger.error("error "+e);
		}catch (Exception e) {
		    logger.info("Exception: "+e);
		}finally {
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static LogLoader loadLogs(){
    	return new LogLoader();
    }
	
	public static void main(String[] args) {
	  new LogLoader();	
	}
}
