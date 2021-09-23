package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTitleOrg extends Extent20 {
	@Test
	public void getOrgtitle() {
	
		test=reports.createTest("getOrgtitle123");
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//		String actualTitle=driver.getTitle();
		Assert.assertEquals(false, true);
	}

}
