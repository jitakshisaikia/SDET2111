package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTitleHome extends Extent20 {
	@Test
	public void getTitleforHome() {
		test=reports.createTest("getTitleforHome");
	
		String actualTitle=driver.getTitle();
	
		Assert.assertEquals(actualTitle, "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM");
//		
	
	}
}
