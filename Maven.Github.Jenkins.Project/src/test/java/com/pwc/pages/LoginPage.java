package com.pwc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	 @FindBy(name="username")  WebElement uname;
	 
	  @FindBy(name="password")  WebElement pass;
	  
	  @FindBy(xpath="//*[@value='Login']")  WebElement login;
	 

	public void loginFB(String appUsername, String appPassword) 
	{
           try {
			Thread.sleep(3000);
		} catch (Exception e)
           {
			e.getMessage();
		}
		
		  uname.sendKeys(appUsername); 
		  pass.sendKeys(appPassword); 
		  login.click();
		 

	}

}
