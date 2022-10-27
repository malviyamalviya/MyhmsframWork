package com.MyhmsPageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _5SearchRegistrationPage {

	//object create for webdriver

	WebDriver Idriver;
	
	// make constructor
	
	public _5SearchRegistrationPage(WebDriver rdriver){
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//identify webelement
	
	@FindBy(linkText = "Search Registration")WebElement Search_Registration;
	@FindBy(xpath = "//input[@type='text']")WebElement serachBox;
	@FindBy(xpath = "//input[@type='submit']")WebElement Search;
	
	//identify Action on webelement
	
	
	public void clickonSearch_Registration() {
		Search_Registration.click();
	}
	
	
	public void SearchKeyword(String Name) {
		serachBox.sendKeys(Name);
	}	

	public void SearchSubmit() {
	Search.submit();
}
}
