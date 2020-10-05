package com.dyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dyanyog.common.WebDriverFactory;

public class AddEmpPage {
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="middleName")
	WebElement middleName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="chkLogin")
	WebElement chkloginDetails;
	
	@FindBy(id="user_name")
	WebElement empUserName;
	
	@FindBy(id="user_password")
	WebElement empPassword;
	
	@FindBy(id="re_password")
	WebElement empConfirmPassword;
	
	@FindBy(id="btnSave")
	WebElement empSaveBtn;
	
	public AddEmpPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public AddEmpPage addEmpUser(String strFirstName, String strMiddleName, String strLastName, String strEmpUserName, String strEmpPassword, String strEmpConfirmPassword)
	{
		firstName.sendKeys(strFirstName);
		middleName.sendKeys(strMiddleName);
		lastName.sendKeys(strLastName);
		chkloginDetails.click();
		empUserName.sendKeys(strEmpUserName);
		empPassword.sendKeys(strEmpPassword);
		empConfirmPassword.sendKeys(strEmpConfirmPassword);
		empSaveBtn.click();
		return new AddEmpPage();
	}
	

}
