package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertTest {
	private static final Logger logger = LoggerFactory.getLogger(InsertTest.class);
	ConnectionManager connectionManager = new ConnectionManager();
	Scanner in=new Scanner(System.in);
	PreparedStatement ps=null;
	int num=0,id=0;
	double fee;
	String name;
	
	void insertRecords() throws SQLException{
		logger.info("Entered into InsertRecord Method:");
		Connection con = connectionManager.getConnection();
		ps=con.prepareStatement("insert into stdtab values(?,?,?)" );
		System.out.println("Enter number of Records :");
		num=in.nextInt();
		for(int j=1;j<=num;j++){
			System.out.println("Enter student"+j+" Id , Name and Fees");
			id=in.nextInt();
			name=in.next();
			fee=in.nextDouble();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, fee);
			ps.executeUpdate();
		}
		System.out.println(num+"Records successfully Inserted");
        logger.info("Exit from insert Record Method");   
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertTest test=new InsertTest();
		test.insertRecords();
	}
}
