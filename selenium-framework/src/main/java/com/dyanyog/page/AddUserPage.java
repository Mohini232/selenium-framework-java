package com.dyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dyanyog.common.WebDriverFactory;

public class AddUserPage {
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement adminEmpName;

	@FindBy(id="systemUser_userName")
	WebElement adminEmpUserName;
	
	@FindBy(id="systemUser_password")
	WebElement adminPassword;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement adminConfirmPassword;
	
	@FindBy(id="btnSave")
	WebElement saveBtn;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public AdminPage addAdminUser(String strAdminEmpname, String strAdminEmpUserName, String strAdminPassword, String strAdminConfirmPassword)
	{
		adminEmpName.sendKeys(strAdminEmpname);
		adminEmpUserName.sendKeys(strAdminEmpUserName);
		adminPassword.sendKeys(strAdminPassword);
		adminConfirmPassword.sendKeys(strAdminConfirmPassword);
		saveBtn.click();
		return new AdminPage();
		
	}
}
