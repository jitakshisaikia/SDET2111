package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DB_UpdateRow {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try
		{
		//Step 1: Register to database
	    Driver driverRef = new Driver();
	    DriverManager.registerDriver(driverRef);
	    
	    //Step 2: get connection with database- provide database name
	     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/patil", "root", "admin");
	    
	    //Step 3: issue create statement
	    Statement stat = conn.createStatement();
	  
	    //Step 4: Execute any query - provide table name
	    int result = stat.executeUpdate("insert into fruits values('5','Mangos','q');");//execution stopped
	    if(result == 1)
	    {
	    	System.out.println("query successfull- 1 row added");
	    }
	    else
	    {
	    	System.out.println("query failed");
	    }
		}
		catch(Exception e)
		{
			
		}
	    
	    //Step 5: close the database
		finally {
			conn.close();
			System.out.println("database connection closed successfully");
		}
	    
	    
	}

	}


