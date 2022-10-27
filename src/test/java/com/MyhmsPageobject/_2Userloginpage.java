package com.MyhmsPageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _2Userloginpage {
	
	// create object for webdriver
	 WebDriver ldriver;
		
		public _2Userloginpage(WebDriver rdriver) {
	ldriver=rdriver;		
		
		PageFactory.initElements(rdriver, this);
		
		}
		//identify webelements
		@FindBy(name = "username")
	   WebElement Username;
		
		@FindBy(name = "password")
		   WebElement Password;
		
		@FindBy(name = "submit")
		   WebElement Login;
		
		@FindBy(linkText = "Logout")WebElement logout;
		
		//identify Action on webelement
		
		public void UserName(String UN) {
			Username.sendKeys(UN);
		}
		public void Password(String PWD) {
			Password.sendKeys(PWD);
			
		}
		
		public void clickonLogin() {
			Login.click();
		}
		
		public void clickonLogout() {
			logout.click();
		}
		}
