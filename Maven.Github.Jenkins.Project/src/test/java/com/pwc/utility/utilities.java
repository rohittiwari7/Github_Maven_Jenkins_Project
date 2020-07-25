package com.pwc.utility;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class utilities 
{
	//Screenshot, timestamp, alerts, frames, window, sync issue, javascript executor
	
	
	public static void  captureScreenshots(WebDriver driver)
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des=new File("./Screenshots/App.png");
		
		try {
			FileHandler.copy(src, des);
		     } catch (Exception e) 
		   {
			e.getMessage();
		   }
		

		
	}

}
