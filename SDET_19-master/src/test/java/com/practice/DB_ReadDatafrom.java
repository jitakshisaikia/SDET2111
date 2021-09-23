package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DB_ReadDatafrom {

	public static void main(String[] args) throws SQLException 
	{
		//Step 1: Register to database
	    Driver driverRef = new Driver();
	    DriverManager.registerDriver(driverRef);
	    
	    //Step 2: get connection with database- provide database name
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/patil", "root", "admin");
	    
	    //Step 3: issue create statement
	    Statement stat = conn.createStatement();
	    
	    //Step 4: Execute any query - provide table name
	    ResultSet result = stat.executeQuery("select * from fruits;");
	    while(result.next())
	    {
	    	System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
	    }
	    
	    //Step 5: close the database
	    conn.close();
	}

}
