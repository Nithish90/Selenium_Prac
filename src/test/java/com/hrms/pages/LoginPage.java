package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class LoginPage extends BaseClass{
	
public static WebElement findEmailId_Txt_BX() {
		
		try {
			element=driver.findElement(By.id("eLogin"));
			Reporter.log("Exp Button found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Exp button not found");
		}
		return element;
	}

public static WebElement findPassword_Txt_Bx() {
	
	try {
		element=driver.findElement(By.id("pLogin"));
		Reporter.log("Exp Button found");
	} catch (Exception e) {
		// TODO: handle exception
		Reporter.log("Exp button not found");
	}
	return element;
}

public static WebElement findSubnit_Btn() {
	
	try {
		element=driver.findElement(By.className("blueBtn"));
		Reporter.log("Exp Button found");
	} catch (Exception e) {
		// TODO: handle exception
		Reporter.log("Exp button not found");
	}
	return element;
}

}
