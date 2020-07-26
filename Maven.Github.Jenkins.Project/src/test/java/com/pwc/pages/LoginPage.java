package com.pwc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{

	@FindBy(xpath = "//input[@name='email' and @id='email']") WebElement uname;

	@FindBy(xpath = "//input[@name='pass' and @id='pass']")   WebElement pass;

	@FindBy(xpath = "//*[@value='Log In']") WebElement login;

	 public void loginFB(String appUsername, String appPassword)
	{
		  try { Thread.sleep(3000); } catch (Exception e) { e.getMessage(); }
		  uname.sendKeys(appUsername); pass.sendKeys(appPassword); login.click();	 

	}

}
