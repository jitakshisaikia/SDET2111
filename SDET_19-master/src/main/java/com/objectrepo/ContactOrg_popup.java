package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericutil.WebDriver_Utility;

public class ContactOrg_popup  extends WebDriver_Utility
{
	WebDriver driver;

	public ContactOrg_popup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchorgtxtfld;

	@FindBy(xpath="//input[@name='search']")
	private WebElement searchbtn;

	@FindBy(xpath="//a[text()='PAVAN123']")
	private WebElement selectorg;

	public WebElement getSearchorgtxtfld() {
		return searchorgtxtfld;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSelectorg() {
		return selectorg;
	}
	
	public void selectExistingOrg(WebDriver driver) throws Throwable {
		getSearchorgtxtfld().sendKeys("PAVAN123");
		getSearchbtn().click();
		Thread.sleep(4000);
		waitAndClick(driver, "//a[text()='PAVAN123']");
	}
	

}
