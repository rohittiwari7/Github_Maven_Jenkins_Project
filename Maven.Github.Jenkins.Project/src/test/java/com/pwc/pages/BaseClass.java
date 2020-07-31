package com.pwc.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pwc.utility.BrowserFactory;
import com.pwc.utility.ConfigDataProvider;
import com.pwc.utility.ExcelDataProvider;
import com.pwc.utility.utilities;

public class BaseClass 
{
	public WebDriver driver;
	public ConfigDataProvider config;
	public ExcelDataProvider excel;
	
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setupSuite()
	{
		config=new ConfigDataProvider();
		//excel=new ExcelDataProvider();
		
		@SuppressWarnings("deprecation")
		ExtentHtmlReporter rhr=new ExtentHtmlReporter(new File("./Reports/report_"+utilities.timeDate()+".html"));
		report=new ExtentReports();
		report.attachReporter(rhr);
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
	public void tearDownMethod(ITestResult result)
	{
	if(result.getStatus()==ITestResult.SUCCESS)
	    {
	     utilities.captureScreenshots(driver);
	    }
	report.flush();
	}
   
}
