package com.ec.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ec.base.TestBase;

public class ListenerClass extends TestBase implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		captureScreenshot(driver, result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		captureScreenshot(driver, result.getName());
	}
	
	
	public void captureScreenshot(WebDriver driver, String name) {
		
		TakesScreenshot tcs= (TakesScreenshot) driver;
		File source=tcs.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\monal\\eclipse-workspace\\E-commerceProject\\ScreenShots\\"+name+".png");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
