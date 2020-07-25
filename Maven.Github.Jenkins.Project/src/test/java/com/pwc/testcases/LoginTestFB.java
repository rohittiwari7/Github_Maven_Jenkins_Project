package com.pwc.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pwc.pages.BaseClass;
import com.pwc.pages.LoginPage;

public class LoginTestFB extends BaseClass
{
	@Test
	public void loginApp( ) 
	{    
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginFB( excel.getStringData("login", 0, 0), excel.getStringData("login", 0, 1));
	}
	
	}
