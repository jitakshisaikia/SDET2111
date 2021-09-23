package com.genericutil;

import java.util.Date;
import java.util.Random;

public class JavaUtil {

	/**
	 * This Mtd is going to generate Random Number
	 * @return random number till 1000
	 */
	public int  createrandonNum() 
	{
		Random r=new Random();
		return  r.nextInt(1000);

	}
	
	Date dateobj = new  Date();
	String currentdate = dateobj.toString();
	String[] arr = currentdate.split(" ");
	
	/**
	 * Get Month
	 * @return
	 */
	public String getday() 
	{	
		return arr[0];
	}
	/**
	 * Get Current Month
	 * @return
	 */
	public String getmonth() {

		return arr[1];
	}

	/**
	 * Get Current Date
	 * @return
	 */
	public String getCurrentDate()
	{

		String day = arr[0];
		String month = arr[1];
		String todaysdate = arr[2];
		String year=arr[5];
		return day+" "+month+" "+todaysdate+" "+year;	

	}


}
