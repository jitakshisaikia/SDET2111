package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericutil.WebDriver_Utility;

public class HomePage extends WebDriver_Utility
{
	WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactslink;

	public WebElement getContactslink() {
		return contactslink;
	}

	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;

	public WebElement getOrglink() {
		return orglink;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutlogo;

	public WebElement getsignoutlogo() {
		return signoutlogo;
	}

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;

	public WebElement getsignout() {
		return signout;
	}

	public void logoutfromApp() throws InterruptedException 
	{
		Thread.sleep(2000);
		movetoelement(driver, signoutlogo);
		signout.click();

	}
}
