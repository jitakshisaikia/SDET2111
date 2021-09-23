package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webtable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("12345");

		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		
		//Get all Organization name

				List<WebElement> orgname = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
		
				for (int i = 0; i < orgname.size(); i++)
				{
					String s1=orgname.get(i).getText();
		
					if(s1.equalsIgnoreCase("SDET_19"))
					{
						driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+i+"]/td[1]/input")).click();
						break;
					}
				}

		//		//Click on all check boxes
		//		List<WebElement> chkbox=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input"));
		//
		//		int count =0;
		//		System.out.println(chkbox.size());
		//		for (int i = 3; i <= chkbox.size()+1; i++)
		//		{
		//			driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+i+"]/td[1]/input")).click();
		//			count++;
		//		}
		//		System.out.println(count);
	}

}
