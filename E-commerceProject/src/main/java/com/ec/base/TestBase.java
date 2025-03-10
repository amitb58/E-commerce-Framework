package com.ec.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.ec.utility.ActionsOP;
@Listeners(com.ec.utility.ListenerClass.class)
public class TestBase {
	public static WebDriver driver;
	
	@BeforeSuite
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monal\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		ActionsOP.actioninit(driver);
		
	}
	

}
