package com.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MMT_Calendar {

	@Test(dataProvider = "getvalues")
	public void selectCities(String src, String dest) throws InterruptedException {

		Date dateobj = new  Date();

		String currentdate = dateobj.toString();

		String[] arr = currentdate.split(" ");

		String day = arr[0];
		String month = arr[1];
		String todaysdate = arr[2];
		String year=arr[5];

		String MMT_DAte= day+" "+month+" "+todaysdate+" "+year;	

		System.out.println(MMT_DAte);

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		action.moveByOffset(10, 10).click().perform();

		driver.findElement(By.id("fromCity")).sendKeys(src);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='"+src+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("toCity")).sendKeys(dest);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='"+dest+"']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@aria-label='"+MMT_DAte+"']")).click();


	}


	@DataProvider
	public Object[][] getvalues() 
	{
		Object[] [] arr = new  Object[5] [2];

		arr[0][0]="BOM";
		arr[0][1]="PNQ";

		arr[1][0]="GOI";
		arr[1][1]="CCU";

		arr[2][0]="PNQ";
		arr[2][1]="MAA";

		arr[3][0]="DEL";
		arr[3][1]="BLR";

		arr[4][0]="HYD";
		arr[4][1]="CCU";

		return arr;

	}

}
