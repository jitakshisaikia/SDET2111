package com.Vtiger;

import org.testng.annotations.Test;

import com.genericutil.BaseClass;
import com.genericutil.WebDriver_Utility;
import com.objectrepo.ContactInfoPage;
import com.objectrepo.ContactOrg_popup;
import com.objectrepo.CreateContactPage;
import com.objectrepo.HomePage;


public class CreateContact_OrgTest extends BaseClass
{
	
	@Test(groups= {"Regression Test"},retryAnalyzer = com.genericutil.RetryAnalyzer.class)
	public void createContactTest() throws Throwable {
	
		
		WebDriver_Utility wdu = new WebDriver_Utility();

		HomePage hp = new HomePage(driver);
		hp.getContactslink().click();

		ContactInfoPage cp = new ContactInfoPage(driver);
		cp.getCreatecontactsimg().click();

		CreateContactPage cc= new  CreateContactPage(driver);
		cc.getLastNameEdt().sendKeys("sharma");

		cc.getOrganizationLookUpImage().click();

		wdu.switchwindow(driver, "Accounts");

		ContactOrg_popup popup = new ContactOrg_popup(driver);
		popup.selectExistingOrg(driver);

		wdu.switchwindow(driver, "VTiger");

		cc.getSaveBtn().click();

	}
}
