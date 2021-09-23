package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");


		driver.switchTo().frame("iframeResult");

		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr[*]"));

		//List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr[*]/td"));

		for (int i = 2; i <=rows.size(); i++)
		{
			for (int j = 1; j <=3; j++) 
			{
				System.out.print(" "+	driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
			}
			System.out.println();
		}
		
		
	}

}
