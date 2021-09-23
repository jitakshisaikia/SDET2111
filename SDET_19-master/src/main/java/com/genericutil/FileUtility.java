package com.genericutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
/**
 * @author AMAR-G
 * This CLass is having Mtd related to file handling
 */
{


	/**
	 * @author AMAR-G
	 * This Mtd is Going to read data from Property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDatafrompropfile(String key) throws IOException 
	{

		FileInputStream fis = new FileInputStream(AutoConstants.propfile);	
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

}
