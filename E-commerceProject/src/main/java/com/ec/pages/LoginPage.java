package com.ec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ec.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(linkText="Sign In")
	private WebElement signin;
	@FindBy(xpath="//input[@id=\"email\"]")
	private WebElement lemail;
	@FindBy(xpath="//input[@id=\"pass\"]")
	private WebElement lpwd;
	@FindBy(xpath="//button[@class=\"action login primary\"]")
	private WebElement sbutton;
	@FindBy(xpath="//span[@class=\"base\"]")
	private WebElement ltitle;
	@FindBy(linkText="Forgot Your Password?")
	private WebElement forgotlink;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyLogin(String email,String pass) {
		signin.click();
		lemail.sendKeys(email);
		lpwd.sendKeys(pass);
		sbutton.click();
	}
	public String verifyLoginTitle() {
		String Title=ltitle.getText();
		return Title;
	}
	public boolean verifyforgotlink() {
		boolean b=forgotlink.isEnabled();
		return b;
	}
	
public HomePage home() {
	
	return new HomePage(driver);
	
}
	

}
