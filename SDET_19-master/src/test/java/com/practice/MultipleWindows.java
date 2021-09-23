package com.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 class MultipleWindows {
	@Test
	public void multiplewindow() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//
		//		String parentwindow= driver.getWindowHandle();
		//		System.out.println("Title of Parent window = "+driver.getTitle()+parentwindow);


		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		//Iterator<String> it = windows.iterator();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) 
		{

			String window=it.next();
			System.out.println(driver.switchTo().window(window).getTitle());
			if(driver.getTitle().contains("Genpact")) 
			{
			
				break;
			}

		}



	}
}
