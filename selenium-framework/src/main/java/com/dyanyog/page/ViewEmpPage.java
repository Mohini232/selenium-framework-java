package com.dyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dyanyog.common.WebDriverFactory;

public class ViewEmpPage {
	
	@FindBy(id="btnAdd")
	WebElement addEmpBtn;
	
	public ViewEmpPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public AddEmpPage navigateToAddEmpPage()
	{
		addEmpBtn.click();
        return new AddEmpPage();
	}

}
