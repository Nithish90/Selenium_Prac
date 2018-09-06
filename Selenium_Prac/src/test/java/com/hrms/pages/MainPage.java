package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class MainPage extends BaseClass {
	
	public static WebElement findLogin()
	{
		try
		{
		element=driver.findElement(By.className("mTxt"));
		Reporter.log("Login button found");
		}
		catch(Exception e)
		{
			Reporter.log("Login button not found");
		}
		return element;
	}
	
	public static WebElement findRegisterNow() {
		
		try {
			element=driver.findElement(By.partialLinkText("Register Now"));
			Reporter.log("Register link found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Link not found");
		}
		
		return element;
		
	}

}
