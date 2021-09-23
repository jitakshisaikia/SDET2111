package com.genericutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.objectrepo.HomePage;
import com.objectrepo.LoginPage;


public class BaseClass
{
	public  WebDriver driver;
	public WebDriver_Utility wdu = new WebDriver_Utility();
	public FileUtility fileutility = new FileUtility();
	public static	WebDriver staticdriver;



	@BeforeSuite(groups = {"Smoke Test","Regression Test"})
	public void setup_JDBC_Report() 
	{
		System.out.println("=====JDBC Connection Done====");

	}

	@AfterSuite(groups = {"Smoke Test","Regression Test"})
	public void close_JDBC_Report() {

		System.out.println("=====JDBC Connection Closed====");
	}


	@Parameters("BROWSER")
	@BeforeClass(groups = {"Smoke Test","Regression Test"})
	public void launchBrowser(String BROWSER) throws IOException 
	{
		//String BROWSER = System.getProperty("browser");
		//String BROWSER =fileutility.readDatafrompropfile("browser");

		if(BROWSER.equalsIgnoreCase("Chrome")) 
		{
			driver= new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		else {
			driver= new ChromeDriver();
		}
		//String url = System.getProperty("URL");

		driver.get(fileutility.readDatafrompropfile("url"));
		wdu.maximizewindow(driver);
		wdu.pageloadtimeout(driver);
		staticdriver=driver;
	}

	@AfterClass(groups = {"Smoke Test","Regression Test"})
	public void closeBrowser() 
	{
		driver.close();
	}

	@BeforeMethod(groups = {"Smoke Test","Regression Test"})
	public void logintoVtiger() throws IOException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.loginintoApp();
	}

	@AfterMethod(groups = {"Smoke Test","Regression Test"})
	public void logoutVtiger(ITestResult result) throws InterruptedException, IOException
	{
		HomePage hp = new HomePage(driver);

		hp.logoutfromApp();

	}
	public static String getscreenshot( String name) throws IOException 
	{
		File srcfile =((TakesScreenshot) staticdriver).getScreenshotAs(OutputType.FILE);
		String destfile= System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest = new File(destfile) ;
		FileUtils.copyFile(srcfile,finaldest);

		return destfile;
	}

}
