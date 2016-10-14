package com.hrms.actions;

import org.testng.Reporter;

import com.hrms.pages.LoginPage;

public class LoginActions {
	
	public static void loginExecute(String uname,String pwd) {
		
		try{
		LoginPage.findEmailId_Txt_BX().sendKeys(uname);
		LoginPage.findPassword_Txt_Bx().sendKeys(pwd);
		LoginPage.findSubnit_Btn().submit();
		}
		catch(Exception e)
		{
			Reporter.log("Login tab not found");
		}
	}

}
