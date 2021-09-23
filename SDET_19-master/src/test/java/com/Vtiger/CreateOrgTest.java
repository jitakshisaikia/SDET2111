package com.Vtiger;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericutil.BaseClass;
import com.genericutil.JavaUtil;
import com.genericutil.WebDriver_Utility;
import com.objectrepo.CreateOrgPage;
import com.objectrepo.HomePage;
import com.objectrepo.OrgInfoPage;

@Listeners(com.genericutil.ListnerS.class)

public class CreateOrgTest  extends BaseClass
{

	@Test(groups= {"Smoke Test"})
	public void createOrg() throws IOException, InterruptedException
	{

		HomePage hp = new HomePage(driver);
		JavaUtil jv = new JavaUtil();
		CreateOrgPage cop = new CreateOrgPage(driver);

		hp.getOrglink().click();
		OrgInfoPage op = new OrgInfoPage(driver);
		op.getCreateOrgImage().click();

		int randomnum=jv.createrandonNum();

		String orgname="SONY_TYSS"+randomnum;

		cop.getOrgname().sendKeys(orgname);

		cop.getSaveorgbtn().click();

		String actualOrgName=driver.findElement(By.id("dtlview_Organization Name")).getText();

		Assert.assertEquals(actualOrgName, orgname);
	}

	@Test(groups= {"Regression Test"})
	public void createOrg_withDD() 
	{

		HomePage hp = new HomePage(driver);
		JavaUtil jv = new JavaUtil();
		WebDriver_Utility wdu = new WebDriver_Utility();
		CreateOrgPage cop = new CreateOrgPage(driver);

		hp.getOrglink().click();
		OrgInfoPage op = new OrgInfoPage(driver);
		op.getCreateOrgImage().click();

		int randomnum=jv.createrandonNum();

		String orgname="SONY_TYSS"+randomnum;

		cop.getOrgname().sendKeys(orgname);

		wdu.select_DD(cop.getIndustry(), "Technology");

		wdu.select_DD(cop.getType(), "Analyst");

		wdu.select_DD(cop.getRating(), "Active");

		cop.getSaveorgbtn().click();

		Assert.assertEquals(false, true);

	}
}