package com.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData_Propfile {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis = new FileInputStream("../SDET_19/src/test/resources/CommonData.properties");	
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("browser");
		System.out.println(value);
	}

}
