package com.MyhmsPageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _3adminPage {

	// create object for webdriver
		 WebDriver ldriver;
			
			public _3adminPage(WebDriver rdriver) {
		ldriver=rdriver;		
			
			PageFactory.initElements(rdriver, this);
			
			}
			
	@FindBy(linkText = "Registration")
	WebElement Registration;
	
	public void clickonRegistration() {
		Registration.click();
	}
			
			
			
}
