package com.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException, ParseException 
	{
FileReader inputfile = new FileReader("../SDET_19/SDET19.json");
		
		//Parsing the JSON into JAVA 
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(inputfile);
		
		//type cast the object and just read the data
		HashMap jobj = (HashMap) obj;
		
	//	String value = jobj.get("username").toString();
		
		
		WebDriver driver = new ChromeDriver();
	
		//Go to URL
		driver.get( jobj.get("url").toString());
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Enter UN
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(jobj.get("username").toString());
		//Enter Password
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(jobj.get("password").toString());
		driver.findElement(By.id("submitButton")).click();
	}

}
