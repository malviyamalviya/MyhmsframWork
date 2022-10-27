package com.Myhms.testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyhmsPageobject._4PermanentRegistrationPage;

public class TC_PermanentRegistration extends BaseClass{

	@Test(priority = 1)
	public void verifyPR() {
		
		
		TC_adminpage pg=new TC_adminpage();
		pg.clickonRegistration();
		
		_4PermanentRegistrationPage pg4= new _4PermanentRegistrationPage(driver);
		pg4.selectPatientCategory("Self");
		pg4.selectRelation("Brother");
		pg4.selectTitle("Mr.");
		pg4.EnterMother_Maiden_Name("asaa");
		pg4.EnterFirstName("sourabh");
		pg4.SelectPatientIdentifier("AAdhar Card");
		pg4.EnterMiddleName("kumar");
		pg4.EnterIDnumber("452161564");
		pg4.EnterLastName("Malviya");
		pg4.EnterdateofBirth("15-12-1992");
		pg4.selectNATIONALITY("Indian");
		pg4.enterAge("30");
		pg4.selectVIP("No");
		pg4.selectGender("Male");
		pg4.selectEducation("B.Tech");
		pg4.selectMatrialStatus("Single");
		pg4.selectOccupation("Employee");
		pg4.selectReligion("Hindu");
		pg4.selectBlood_Group("A+");
		pg4.selectPrimary_Language("English");
		pg4.selectCitizenship("Indian");
		pg4.selectSenior_Citizen_Proof_Submited("No");
		pg4.enterAddress1("Shujalpur");
		pg4.enterAddress2("FreeGanj");
		pg4.enterPhone("9926060605");
	    pg4.enterEmail("xyz@gmail.com");
	    pg4.enterPin_or_Zip("465333");
	    pg4.selectCountry("India");
	    pg4.UploadPhoto("C:\\Users\\LENOVO\\OneDrive\\Desktop\\screenshot\\sbm.png");
	    pg4.ClickOnSavebutton();
	
	
	
	
	
	
	}
	@Test(priority = 2)
	public void verifySuccessFullPR() throws Exception {
		Thread.sleep(5000);
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		Assert.assertNotNull(msg);
		Thread.sleep(5000);
			
			driver.switchTo().alert().accept();
		}
	
	
	
}
