package com.Myhms.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.MyhmsPageobject._5SearchRegistrationPage;
@Listeners(com.Myhms.utilities.ExtentListnerClass.class)
public class TC_SearchRegistration extends BaseClass{

	@Test(priority = 1)
	
	public void clickonRegistration() {
	
	TC_adminpage pg=new TC_adminpage();
	pg.clickonRegistration();
	
	}
		@Test(priority = 2)
	public void varifySearchRregistration() {
		
		_5SearchRegistrationPage pg5=new _5SearchRegistrationPage(driver);
		pg5.clickonSearch_Registration();
		pg5.SearchKeyword("sourabh");
		pg5.SearchSubmit();
		
	}
	@Test(priority = 3)
		public void varifySearchRregistrationsuccessfull() throws IOException {
		String msg = driver.getTitle();
		
			if(msg.equalsIgnoreCase("Search Result")) {
			System.out.println("SearchRregistrationsuccessfull");
            	
		
	
}else {
	
	captureScreenshot(driver, "varifySearchRregistrationsuccessfull");
	
	Assert.assertTrue(false);}
	}
}