package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Debug1 {

public void loginVtiger(WebDriver driver)
{
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("12345");
	
	driver.findElement(By.id("submitButto")).click();

	}

}
