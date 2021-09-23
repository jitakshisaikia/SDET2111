package com.genericutil;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility 

/**
 * @author AMAR-G
 * 
 * This Class Contains All the webdriver methods which are reqd throughput the project
 * 
 */
{

	/**
	 * @author AMAR-G
	 * This Methos is going to select the value the form DD based on the String
	 * @param element
	 * @param text
	 */
	public void  select_DD(WebElement element,String text) 
	{
		Select select= new Select(element);
		select.selectByVisibleText(text);

	}

	public void maximizewindow(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}

	/**
	 * @author AMAR-G
	 * This method is going to wait for given element to be visible.
	 * @param driver
	 * @param element
	 */
	public void waitforvisiblity(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, AutoConstants.timeforexplicitwait);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is going to Wait and Click on the element
	 * @param driver
	 * @param element
	 */

	public void elementtobeclickable(WebDriver driver, WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, AutoConstants.timeforexplicitwait);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	/**
	 * It will check given page is loaded in time or not
	 * @param driver
	 */
	public void pageloadtimeout(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(AutoConstants.timeforimplicitwait,TimeUnit.SECONDS);
	}
	/**
	 * This method is going to select the option from DD based on Index
	 * @param element
	 * @param index
	 */
	public void  select_DD(WebElement element,int index) 
	{
		Select select= new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * This mtd is going to select value from dd based on element
	 * @param value
	 * @param element
	 */
	public void select_DD(String value, WebElement element)
	{
		Select select= new Select(element);
		select.selectByValue(value);
	}
	/**
	 * This Mtd is going to switch to frame based on index
	 * @param driver
	 * @param index
	 */
	public void switchframe(WebDriver driver, int index) 
	{
		driver.switchTo().frame(index);
	}
	/**
	 *  This Mtd is going to switch to frame based on Name or Id of frame
	 * @param driver
	 * @param nameorId
	 */

	public void switchframe(WebDriver driver,String nameorId) 
	{
		driver.switchTo().frame(nameorId);
	}

	/**
	 * This Mtd is going to switch to frame based on Webelement
	 * @param driver
	 * @param element
	 */
	public void switchframe(WebDriver driver,WebElement element) 
	{
		driver.switchTo().frame(element);
	}
	/**
	 * This mtd is going to perform mouse hover actionai
	 * @param driver
	 * @param element
	 */
	public void movetoelement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * this mtd is going to perform right click
	 * @param driver
	 * @param element
	 */
	public void rightclickonelement(WebDriver driver, WebElement element) 
	{
		Actions action = new Actions(driver);
		action.contextClick(element);
	}
	/**
	 * this mtd is going to perform drag and drop action
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void draganddrop(WebDriver driver, WebElement source,WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);
	} 

	/**
	 * this mtd is going to switch windoe based on the title
	 * @param driver
	 * @param title
	 */

	public void switchwindow(WebDriver driver, String title) 
	{

		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator=windowId.iterator();

		while(iterator.hasNext()) 
		{
			String window=iterator.next();
			String currenttitle= driver.switchTo().window(window).getTitle();
			if(currenttitle.contains(title)) 
			{	
				break;
			}

		}
	}

	/**
	 * accept alert pop up
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	/**
	 * dismiss alert pop up
	 * @param driver
	 */
	public void dissmisAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this will scroll to a particular web element
	 * @param driver
	 * @param element
	 */
	public void scrollToWebElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
	}

	/**
	 * used to wait for expected element in GUI based on Xpath
	 * @param element
	 * @throws Throwable
	 */
	public void waitAndClick(WebDriver driver , String xpath) throws Throwable {
		int count = 0;
		while(count < 40) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			}catch (Throwable e) {
				Thread.sleep(500);
				count++;
			}
		}
	}


}
