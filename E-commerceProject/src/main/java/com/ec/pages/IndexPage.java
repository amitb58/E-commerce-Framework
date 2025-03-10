package com.ec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	
	@FindBy(linkText="Create an Account")
	private WebElement sbutton;
	@FindBy(xpath="//input[@id=\"firstname\"]")
	private WebElement firstname;
	@FindBy(xpath="//input[@id=\"lastname\"]")
	private WebElement lastname;
	@FindBy(xpath="//input[@id=\"email_address\"]")
	private WebElement email;
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement pwd;
	@FindBy(xpath="//input[@id=\"password-confirmation\"]")
	private WebElement cnfrmpwd;
	@FindBy(xpath="//button[@class=\"action submit primary\"]")
	private WebElement cbutton;
	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
    public void verifysignup(String fname, String lname,String emailbox, String pwdbox, String cnfrmbox) {
    	sbutton.click();
    	firstname.sendKeys(fname);
    	lastname.sendKeys(lname);
    	email.sendKeys(emailbox);
    	pwd.sendKeys(pwdbox);
    	cnfrmpwd.sendKeys(cnfrmbox);
    	cbutton.click();
}
    

}
