package com.example.demo.utils;
import java.sql.*;
import java.util.Properties;
import java.io.*;
public class ConnectionUtils {

	                  
	public static Connection getMySqlConnection() {
		
		Connection con = null;
		
		try {
			
			InputStream inStream = new FileInputStream(new File("DataBaseConnection.properties"));
			
			Properties prop = new Properties();
			
			prop.load(inStream);
			
			con = 
					DriverManager.getConnection(
							prop.getProperty("datasource.url"),
							prop.getProperty("datasource.username"),
							prop.getProperty("datasource.password"));
			
			
		} catch (SQLException | IOException e ) {
			
			e.printStackTrace();
		}
		
		return con;
		
				
	}
	
}
