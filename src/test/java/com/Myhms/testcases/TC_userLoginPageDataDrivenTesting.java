package com.Myhms.testcases;

import java.io.IOException;

import org.testng.annotations.*;
import com.MyhmsPageobject._2Userloginpage;

import junit.framework.Assert;

import com.Myhms.utilities.ReadExcelFile;
import com.MyhmsPageobject._1firstpage;

public class TC_userLoginPageDataDrivenTesting extends BaseClass{

	@Test(dataProvider = "LogindataProvider")
	public void verfyLogin(String userName, String password) throws IOException {
		//openURL
		driver.get(url);
		logger.info("url opened");
		_1firstpage pg=new _1firstpage(driver);
		pg.clickonHMS();
		
		_2Userloginpage pg2=new _2Userloginpage(driver);
		pg2.UserName(userName);
		pg2.Password(password);
		pg2.clickonLogin();
	     String msg = driver.getTitle();	 
	     
	   if(msg.equalsIgnoreCase("Master Page")) {
		   
				System.out.println("verfyLogin");
	            	
				   pg2.clickonLogout();

		
	}else {
		
		captureScreenshot(driver, "vverfyLogin");
		
		Assert.assertTrue(false);
		}
	   
	   
		}
	
		
	
	@DataProvider(name="LogindataProvider")
	public String [][] LogindataProvider(){
		String fileName = System.getProperty("user.dir") + "\\TestDataExcel\\MyhmsData.xlsx";
	      
		
		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginPage2");
		int ttlColumns=ReadExcelFile.getColCount(fileName, "LoginPage2");
		
		
		String data[][]=new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++) {
			
			for(int j=0;j<ttlColumns;j++) {
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginPage2", i, j);
			
			
			}
			
		}
		return data;
		
	}
	
}
