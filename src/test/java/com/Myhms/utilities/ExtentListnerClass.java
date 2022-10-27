package com.Myhms.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import freemarker.template.SimpleDate;

public class ExtentListnerClass implements ITestListener {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	
	public void configureReport() {
		
		ReadConfig readConfig=new ReadConfig();
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName="MyhmsTestReport-" + timestamp + ".html";
		
		htmlReporter=new ExtentSparkReporter("ExtentListenerReportDemo.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		
		//add system info and  details
		 reports.setSystemInfo("Machine", "TestPC1");
		 reports.setSystemInfo("OS", "Windows11");
		 reports.setSystemInfo("UserName", "Sourabh");
		 reports.setSystemInfo("Browser", readConfig.getBrowser());
	
	
		 //configuration to change look and feel
		 
		 htmlReporter.config().setDocumentTitle("ExtentListener Report demo");
		 htmlReporter.config().setReportName("TestExtent");
		 htmlReporter.config().setTheme(Theme.STANDARD);
		 htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	
	
	
	}
	
	
	
	
	
	

	@Override
	public void onStart(ITestContext Result) {
		configureReport();
		System.out.println("onstart method invoke...... ");	

	}
	
	@Override
	public void onFinish(ITestContext Result) {
		System.out.println("onfinish method invoke......... ");	
		reports.flush();
	}
	
	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("ontestfailure method invoke......... " + Result.getName());	
		test=reports.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("name of the test case failed" + Result.getName() + "TEST-FAILED", ExtentColor.RED));
	
	String screenshotPath="D:\\library\\automationP\\Myhms\\Screenshot\\"+Result.getName()+".png";
	File screenshotFile=new File(screenshotPath);
	
	if(screenshotFile.exists()) {
		test.fail("captureScreenshot is below:"+ test.addScreenCaptureFromPath(screenshotPath));
		
	}
	}
	
	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("on testskipped method invoke......... " + Result.getName());	
		test=reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("name of the test case skipped" +Result.getName() + "SKIPPED", ExtentColor.YELLOW));


	}
	@Override
	public void onTestStart(ITestResult Result) {
       System.out.println("ontestStart method Started...... " + Result.getName());	
       }

	@Override
	public void onTestSuccess(ITestResult Result) {
	       System.out.println("on testsuccess...... " + Result.getName());	
			test=reports.createTest(Result.getName());
			test.log(Status.PASS, MarkupHelper.createLabel("name of the test case Passed" +Result.getName() + "PASSED", ExtentColor.GREEN));

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}
	

}
