package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent20 
{
	public WebDriver driver;

	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public 	ExtentTest test;
	@BeforeSuite
	public void setup()
	{
		reporter= new ExtentHtmlReporter("../SDET_19/ExtentReports20/SDET20.html");

		System.out.println("Before suite executed");
		reporter.config().setDocumentTitle("SDET");
		reporter.config().setTheme(Theme.DARK);
		reports= new ExtentReports();
		reports.attachReporter(reporter);

	}
	@BeforeClass
	public void launchBrowser() {
		driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closebrowser() 
	{
		driver.quit();
	}


	@BeforeMethod
	public void  loginintoApp() 
	{
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
	}

	@AfterMethod
	public void logout() 
	{
		System.out.println("Logout successful");

	}


	@AfterSuite
	public void closeSetup() 
	{
		reports.flush();
		System.out.println("Setup closed");

	}




}
