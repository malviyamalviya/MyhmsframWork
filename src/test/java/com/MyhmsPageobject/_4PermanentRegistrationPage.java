package com.MyhmsPageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class _4PermanentRegistrationPage {
//object create for webdriver
WebDriver Idriver;
 public _4PermanentRegistrationPage(WebDriver rdriver) {
	Idriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
	//identify webelements
@FindBy(name = "PATIENT_CAT")
WebElement PatientCategory;

@FindBy(name = "RELATION")WebElement Relation;
@FindBy(name = "TITLE")WebElement Title;
@FindBy(name = "MOTHER_NAME")WebElement Mother_s_Maiden_Name;		
@FindBy(name = "PNT_NAME")WebElement First_Name;
@FindBy(name = "PAT_IDENTITY")WebElement Patient_Identifier;
@FindBy(name = "MIDDLE_NAME")WebElement Middle_Name;
@FindBy(name = "LAST_NAME")WebElement Last_Name;
@FindBy(name = "PAT_IDENTITY_PROOF")WebElement PAN_Voter_ID_AADAR_Nos;
@FindBy(name = "DOB")WebElement DOB;
@FindBy(name = "NATIONALITY")WebElement Nationality;
@FindBy(name = "AGE")WebElement Age;
@FindBy(name = "IS_MLC")WebElement VIP;
@FindBy(name = "SEX")WebElement Gender;
@FindBy(name = "EDUCATION")WebElement Education;
@FindBy(name = "MTRL_STATUS")WebElement Marital_Status;
@FindBy(name = "OCCUPATION")WebElement Occupation;
@FindBy(name = "RELIGION")WebElement Religion;
@FindBy(name = "BLOOD_GRP_CODE")WebElement Blood_Group;
@FindBy(name = "PLANGUAGE")WebElement Primary_Language	;
@FindBy(name = "CITIZENSHIP")WebElement Citizenship;
@FindBy(name = "SC_PROOF")WebElement Senior_Citizen_Proof_Submited;
@FindBy(name = "ADDRESS1")WebElement Address1;
@FindBy(name = "ADDRESS2")WebElement Address2;
@FindBy(name = "MOBILE_NO")WebElement Phone;
@FindBy(name = "EMAIL_ID")WebElement Email;
@FindBy(name = "ZIP")WebElement Pin_or_Zip;
@FindBy(name = "COUNTRY_CODE")WebElement Country;
@FindBy(name="image")WebElement ChooseFile;
@FindBy(name="submit")WebElement Save;

//identify Action on webelement
public void selectPatientCategory(String PC) {
	Select obj=new Select(PatientCategory);
	obj.selectByVisibleText(PC);
}
public void selectRelation(String R) {
	Select obj=new Select(Relation);
	obj.selectByVisibleText(R);
}
public void selectTitle(String TiTle) {
	Select obj=new Select(Title);
	obj.selectByVisibleText(TiTle);
}
public void EnterMother_Maiden_Name(String MN) {
	Mother_s_Maiden_Name.sendKeys(MN);
}
public void EnterFirstName(String FirstNAME) {
	First_Name.sendKeys(FirstNAME);
}
public void SelectPatientIdentifier(String PatientIdentifier) {
	Select obj=new Select(Patient_Identifier);
	obj.selectByVisibleText(PatientIdentifier);
}
public void EnterMiddleName(String EnterMIDDLEname) {
	Middle_Name.sendKeys(EnterMIDDLEname);
}

public void EnterIDnumber(String PAN__Voter_ID_AADAR_Nos) {
	PAN_Voter_ID_AADAR_Nos.sendKeys(PAN__Voter_ID_AADAR_Nos);
}
public void EnterLastName(String LastName) {
	Last_Name.sendKeys(LastName);
}
public void EnterdateofBirth(String DD_MM_YYYY) {
	DOB.sendKeys(DD_MM_YYYY);
	
}

public void selectNATIONALITY(String Nationalitye) {
Select obj=new Select(Nationality);
obj.selectByVisibleText(Nationalitye);

}

public void enterAge(String AGE) {
	Age.sendKeys(AGE);
}

public void selectVIP(String vip) {
	Select obj=new Select(VIP);
	obj.selectByVisibleText(vip);
	
}
 
public void selectGender(String gender) {
	Select obj=new Select(Gender);
	obj.selectByVisibleText(gender);
}

public void selectEducation(String EDU) {
	Select obj=new Select(Education);
obj.selectByVisibleText(EDU);
	
}


public void selectMatrialStatus(String MS) {
	Select obj=new Select(Marital_Status);
obj.selectByVisibleText(MS);
	
}
public void selectOccupation(String occu) {
	Select obj=new Select(Occupation);
obj.selectByVisibleText(occu);
	
}
public void selectReligion(String Relig) {
	Select obj=new Select(Religion);
obj.selectByVisibleText(Relig);
	
}
public void selectBlood_Group(String bloodG) {
	Select obj=new Select(Blood_Group);
obj.selectByVisibleText(bloodG);
	
}
public void selectPrimary_Language(String PL) {
	Select obj=new Select(Primary_Language);
obj.selectByVisibleText(PL);
	
}
public void selectCitizenship(String Citizen) {
	Select obj=new Select(Citizenship);
obj.selectByVisibleText(Citizen);
	
}
public void selectSenior_Citizen_Proof_Submited(String Senior) {
	Select obj=new Select(Senior_Citizen_Proof_Submited);
obj.selectByVisibleText(Senior);
	
}
public void enterAddress1(String ADD1) {
	Address1.sendKeys(ADD1);
}
public void enterAddress2(String ADD2) {
	Address2.sendKeys(ADD2);
}
public void enterPhone(String PHONE) {
	Phone.sendKeys(PHONE);
}
public void enterEmail(String email) {
	Email.sendKeys(email);
}
public void enterPin_or_Zip(String zip) {
	Pin_or_Zip.sendKeys(zip);
}

public void selectCountry(String CN) {
	Select obj=new Select(Country);
	obj.selectByVisibleText(CN);
}
public void UploadPhoto(String path) {
	ChooseFile.sendKeys(path);	
}
public void ClickOnSavebutton() {
	Save.click();
}
}