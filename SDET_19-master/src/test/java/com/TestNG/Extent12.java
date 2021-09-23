package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.genericutil.AutoConstants;

public class Extent12 
{
	WebDriver driver = new ChromeDriver();
	ExtentHtmlReporter reporter; // This class is used to set path and do some config.
	ExtentReports reports; // Attach the reporter and set system info
	ExtentTest test; //To Create the entries in the class

	@BeforeSuite
	public void setup() {
		reporter= new ExtentHtmlReporter(AutoConstants.ExtentReportPath+".html");

		reporter.config().setDocumentTitle("SDET19");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Smoke");


		reports= new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("BuildNO", "1.2");
		reports.setSystemInfo("Env", "QA");
		reports.setSystemInfo("Platform", "Windows");
	}

	@Test
	public void test1() 
	{
		test=reports.createTest("test1");

		driver.get("https://mvnrepository.com/");

		System.out.println(driver.getTitle());



	}
	@Test
	public void test2() 
	{
		test=reports.createTest("test2");

		driver.get("https://mvnrepository.com/");

		System.out.println(driver.getTitle());

		System.out.println("New line");

	}

	@AfterSuite
	public void close() {
		reports.flush();
	}



}
