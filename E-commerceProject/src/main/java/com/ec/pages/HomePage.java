package com.ec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ec.base.TestBase;
import com.ec.utility.ActionsOP;

public class HomePage  {
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/a/img")
	private WebElement logo;
	@FindBy(xpath="//span[@class=\"logged-in\"]")
	private WebElement wlcmText;
	@FindBy(xpath="//li[@class=\"level0 nav-2 category-item level-top parent ui-menu-item\"]")
	private WebElement wbutton;
	@FindBy(xpath="//li[@class=\"level0 nav-3 category-item level-top parent ui-menu-item\"]")
	private WebElement mbutton;
	@FindBy(xpath="//li[@class=\"level0 nav-4 category-item level-top parent ui-menu-item\"]")
	private WebElement gbutton;
	@FindBy(xpath="//li[@class=\"level0 nav-5 category-item level-top parent ui-menu-item\"]")
	private WebElement tbutton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLogo() {
	boolean b=	logo.isDisplayed();
	return b;
	}
	public String verifywlcmText() {
	String text=	wlcmText.getText();
	return text;
	}
	public void verifyhover() {
		ActionsOP.Mousehover(wbutton);
		ActionsOP.Mousehover(mbutton);
		ActionsOP.Mousehover(gbutton);
		ActionsOP.Mousehover(tbutton);
	}
	

}
