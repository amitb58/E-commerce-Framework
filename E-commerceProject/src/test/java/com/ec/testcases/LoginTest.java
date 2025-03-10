package com.ec.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ec.base.TestBase;
import com.ec.pages.LoginPage;
import com.ec.utility.DataReadWrite;

public class LoginTest extends TestBase {
	public LoginPage lp;
	
	
	@Test(priority=3)
	public void validateLogin() throws IOException {
		 lp=new LoginPage(driver);
		 String email=DataReadWrite.readData(4, 0);
		 String pwd=DataReadWrite.readData(5, 0);
		 
		 lp.verifyLogin(email,pwd);
		 lp.home();
		
	}
	@Test(priority=0)
	public void validateTitle() {
		
		Assert.assertEquals(lp.verifyLoginTitle(), "Customer Login");
		
	}
	@Test(priority=1)
	public void validateForgotLink() {
		Assert.assertTrue(lp.verifyforgotlink());
	}
	

}
