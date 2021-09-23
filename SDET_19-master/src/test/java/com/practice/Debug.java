package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		Debug1 d1 = new Debug1();
		d1.loginVtiger(driver);
	}

}
