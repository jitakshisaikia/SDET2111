package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BC_AC 
{

	
	
	
	@BeforeClass
	public void launch_browser() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Browser Launch Successful"); //1
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		System.out.println("Browser Closed Successful");
	}
	@BeforeMethod
	public void logintoApp() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Login Successful"); //1
	}

	@Test
	public void test1() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Org created successfully"); //3
	}
	@Test
	public void test2() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Contact created successfully");
	}
	
	@AfterMethod
	public void logout() 
	{
		System.out.println("Logged out successfully");//4
	}
	
}
