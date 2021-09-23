package com.TestNG;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Sample1 
{
	@Test(groups= {"smokeTest"})
	public void test1() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Org created successfully");
	}

	@Test(groups= {"RegressionTest"})
	public void test2() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Org created with Website successfully");
	}
	
	@Test(groups= {"RegressionTest"})
	public void test3() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Org created with DD successfully");
	}


}
