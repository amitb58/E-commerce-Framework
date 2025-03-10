package com.ec.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ec.base.TestBase;
import com.ec.pages.HomePage;

public class HomeTest extends TestBase{
	
	
	
	public HomePage hp;
	@BeforeClass
	public void init() {
		hp=new HomePage(driver);
	}
	@Test(priority=0)
	public void validateLogo() {
		
		
	Assert.assertTrue(hp.verifyLogo());	
		
	}
	@Test(priority=1)
	public void validateWlcmText() {
		Assert.assertEquals(hp.verifywlcmText(), "Welcome, Ami bed!");
	}
	@Test(priority=2)
	public void validateHover() {
		hp.verifyhover();
	}

}
