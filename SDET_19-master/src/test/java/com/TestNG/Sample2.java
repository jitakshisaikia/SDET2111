package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 
{
	@Test(groups= {"smokeTest"})
	public void sample2_test1() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Contact created successfully");
	}
	
	@Test(groups= {"RegressionTest"})
	public void sample2_test2() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Contact created with org successfully");
	}
	
	@Test(groups= {"RegressionTest"})
	public void sample2_test3() 
	{
		Assert.assertEquals(true, true);
		System.out.println("Contact created with Invoice successfully");
	}

}
