package com.Myhms.testcases;

import org.testng.annotations.Test;

import com.MyhmsPageobject._1firstpage;
import com.MyhmsPageobject._2Userloginpage;
import com.MyhmsPageobject._3adminPage;

public class TC_adminpage extends BaseClass{

	@Test
	public void clickonRegistration(){
		//openURL
				driver.get(url);
				logger.info("url opened");
				_1firstpage pg=new _1firstpage(driver);
				pg.clickonHMS();
				
				_2Userloginpage pg2=new _2Userloginpage(driver);
				pg2.UserName("admin");
				pg2.Password("admin");
				pg2.clickonLogin();
				
				
				_3adminPage pg3= new _3adminPage(driver);
				pg3.clickonRegistration();
				
	}
	
}
