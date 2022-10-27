package com.MyhmsPageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _1firstpage {
// create object for webdriver
 WebDriver ldriver;
	
	public _1firstpage(WebDriver rdriver) {
ldriver=rdriver;		
	
	PageFactory.initElements(rdriver, this);
	
	}
	//identify webelements
	@FindBy(linkText = "HMS")
   WebElement HMS;
	//identify Action on webelement
	
	public void clickonHMS() {
		HMS.click();
	}
	
}
