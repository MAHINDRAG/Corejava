package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	Connection con=null;
	String driver=null;
	String password=null;
	String username=null;
	String connectionUrl=null;
	public Connection getConnection(){
		driver = DBProperties.getDriver();
		username = DBProperties.getUsername();
		password = DBProperties.getPassword();
		connectionUrl = DBProperties.getConnectionUrl();
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(connectionUrl,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;		
	}
}
