package com.pwc.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.pwc.utility.BrowserFactory;
import com.pwc.utility.ConfigDataProvider;
import com.pwc.utility.ExcelDataProvider;
import com.pwc.utility.utilities;

public class BaseClass 
{
	public WebDriver driver;
	public ConfigDataProvider config;
	public ExcelDataProvider excel;
	public utilities utlity;

	@BeforeSuite
	public void setupSuite()
	{
		config=new ConfigDataProvider();
		//excel=new ExcelDataProvider();
	}
	
	
@Parameters({"browser","URL"})
@BeforeClass
	public void setup(String browser, String appURL) 
	{
		//driver=BrowserFactory.StartApplication(driver, config.getBrowser() , config.getAppURL() );
		
	// maven parameterization from pom.xml level
	 driver=BrowserFactory.StartApplication(driver, browser , appURL );
	}
   
	@AfterClass
	public void tearDown() 
	{
		BrowserFactory.quitBrowser(driver);	
	}
	
	
@AfterMethod
	public void tearDownMethod()
	{
	utilities.captureScreenshots(driver);	
	}

}
