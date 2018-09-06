package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class RegisterPage extends BaseClass {
	
	public static WebElement findExpButton() {
		
		try {
			element=driver.findElement(By.xpath("//button[@class='action-btn exp']"));
			Reporter.log("Exp Button found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Exp button not found");
		}
		return element;
	}
	
	public static WebElement findName_txt_bx() {
		try {
			element=driver.findElement(By.xpath("//input[@id='fname']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}
	
	public static WebElement findEmailId_txt_bx() {
		try {
			element=driver.findElement(By.xpath("//input[@class='email']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}
	
	public static WebElement findPassword_txt_bx() {
		try {
			element=driver.findElement(By.xpath("//input[@class='input ng-pristine ng-valid ng-valid-minlength ng-valid-maxlength clicked ng-touched']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}
	
	
	public static WebElement findMobileNo_txt_bx() {
		try {
			element=driver.findElement(By.xpath("//input[@name='number']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}
	
	public static WebElement findWorkExpYrs_txt_bx() {
		try {
			element=driver.findElement(By.xpath("//input[@name='expYear']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}
	
	public static WebElement findWorkExpMonths_txt_bx() {
		try {
			element=driver.findElement(By.xpath("//input[@name='expMonth']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}
	
	public static WebElement findUpload_Btn() {
		try {
			element=driver.findElement(By.xpath("//input[@name='uploadCV']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}
	
	public static WebElement findAgree_Check_Bx() {
		try {
			element=driver.findElement(By.xpath("//label[@for='term']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}
	
	public static WebElement findSubmit_Btn() {
		try {
			element=driver.findElement(By.xpath("//button[@class='primary-btn'][@ng-bind='status.submitButtonText']"));
			Reporter.log("Name text box found");
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Name text box not found");
		}
		return element;
	}

}
