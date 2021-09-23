package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  
{
	WebDriver driver;

	public  LoginPage(WebDriver driver) // rule 2
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='user_name']")  //rule 3 
	private WebElement usernametxtfld;

	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordtxtfld;

	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsernametxtfld() {				// rule 4
		return usernametxtfld;
	}

	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}



	public void loginintoApp(String username,String password) 
	{
		usernametxtfld.sendKeys(username);
		passwordtxtfld.sendKeys(password);
		loginbtn.click();

	}


	public void loginintoApp() 
	{
		usernametxtfld.sendKeys("admin");
		passwordtxtfld.sendKeys("12345");
		loginbtn.click();
	}
}
