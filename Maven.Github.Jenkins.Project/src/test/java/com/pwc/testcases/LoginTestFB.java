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
       //System.out.println("FB page is displaying= "+driver.getTitle());
		
	LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
	loginPage.loginFB( config.getDataFromConfig("username"), config.getDataFromConfig("password"));
		
	}
	
	}
