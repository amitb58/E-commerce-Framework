package com.ec.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ec.base.TestBase;

public class ActionsOP extends TestBase {
	
	public static Actions ac;
	
	
	public static void actioninit(WebDriver driver) {
		ac=new Actions(driver);
	}
	
	public static void Doubleclick(WebElement element) {
		 
		 ac.doubleClick(element).perform();
	}
	public static  void Rightclick(WebElement element) {
		ac.contextClick(element).perform();
	}
	public static void dragdrop(WebElement drag, WebElement drop) {
		ac.dragAndDrop(drag, drop).perform();
	}
	public static void slidder(WebElement element,int x, int y) {
		ac.clickAndHold(element).moveByOffset(x, y).perform();
	}
	public static void Mousehover(WebElement element ) {
		ac.moveToElement(element).perform();
	}

}
