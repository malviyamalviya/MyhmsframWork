package com.Myhms.testcases;

import org.testng.annotations.*;


import com.MyhmsPageobject._2Userloginpage;
import com.MyhmsPageobject._1firstpage;

public class TC_userLoginPage extends BaseClass{

	@Test
	public void verfyLogin() {
		//openURL
		driver.get(url);
		logger.info("url opened");
		_1firstpage pg=new _1firstpage(driver);
		pg.clickonHMS();
		
		_2Userloginpage pg2=new _2Userloginpage(driver);
		pg2.UserName("admin");
		pg2.Password("admin");
		pg2.clickonLogin();
		
	}
	
}
