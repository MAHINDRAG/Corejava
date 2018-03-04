package com.app.test;

/*
 * https://stackoverflow.com/questions/28388204/how-to-test-dao-methods-using-mockito
 */
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.app.ConnectionManager;
import com.app.DBProperties;
import com.app.InsertTest;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class TestInsert {

	@InjectMocks
	InsertTest insert = new InsertTest();
	@InjectMocks
	ConnectionManager connection = new ConnectionManager();
	@Mock
	Connection mockcon;
	@Mock
	PreparedStatement mockPreparedstmt;


	@Before
	public void setUp(){
		DBProperties dbProperties = Mockito.spy(DBProperties.class);
	}


	@SuppressWarnings("deprecation")
	@Test
	public void testInsertRecords() {
		Properties properties = new Properties();
		String path = "src/main/resources/db.properties";
		InputStream inputStream = null;
		String driver = properties.getProperty("Driver");
		String connectionUrl = properties.getProperty("ConnectionUrl");
		String username = properties.getProperty("Username");
		String password = properties.getProperty("Password");
		try {
			properties.load(inputStream);
			inputStream = new FileInputStream(path);
			Mockito.when(DBProperties.getDriver()).thenReturn(driver);
			Mockito.when(DBProperties.getConnectionUrl()).thenReturn(connectionUrl);
			Mockito.when(DBProperties.getUsername()).thenReturn(username);
			Mockito.when(DBProperties.getPassword()).thenReturn(password);
			connection = Mockito.mock(ConnectionManager.class);
			Mockito.when(connection.getConnection()).then(new Answer<Connection>() {
				@Override
				public Connection answer(InvocationOnMock invocation) throws Throwable {			      	
					return mockcon;
				}
			});

			Mockito.doNothing().when(mockPreparedstmt).setInt(1,Mockito.anyInt());
			Mockito.doNothing().when(mockPreparedstmt).setString(2,Mockito.anyString());
			Mockito.doNothing().when(mockPreparedstmt).setDouble(3,Mockito.anyDouble());
            Mockito.when(mockPreparedstmt.executeUpdate()).thenReturn(1);
            Assert.assertEquals(mockPreparedstmt.executeUpdate(), 1,0);
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (SQLException e) {				
			e.printStackTrace();
		}

	}

}
