package com.Myhms.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.Myhms.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
String url=readconfig.getBaseURL();
String Browser=readconfig.getBrowser();

public static WebDriver driver;
public static Logger logger;


@BeforeClass
public void setup() {
	switch(Browser.toLowerCase()) {
	
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	break;
	
	case "firefox":
	      WebDriverManager.firefoxdriver().setup();
	      driver=new FirefoxDriver();
	      break;
	
	case "edge":
	       WebDriverManager.edgedriver().setup();
	        driver=new EdgeDriver();
	        break;
	  default:      
	driver=null;
	break;
	}
	//implicite wait for 10 sec
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	//logging
	logger=LogManager.getLogger("Myhms");
}
@AfterClass
 public void teardown() {
	 driver.close();
	 driver.quit();
 }


public void captureScreenshot(WebDriver driver,String testName) throws IOException {
	//step1:convert web driver object into Takescreenshot
	
	TakesScreenshot screenshot =((TakesScreenshot)driver);
	
	//step2: call getScreenshotAs method to create image file
	
	File src = screenshot.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("D:\\library\\automationP\\Myhms\\Screenshot\\"+testName+".png");
	
	//Step3: copy image file to dest file
	
	FileUtils.copyFile(src, dest);
	
	
	
}

}
