package com.dyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dyanyog.common.WebDriverFactory;

public class HomePage {
	
	@FindBy(id="welcome")
	WebElement welcomeText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimTab;
	
	public HomePage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public HomePage verifyWelcomeText(String strExpectedWelcomeText)
	{
		Assert.assertEquals(welcomeText.getText(), strExpectedWelcomeText);
		return this;
	}
	
	public AdminPage navigateToAdminPage()
	{
		adminTab.click();
		return new AdminPage();
	}
	
	public ViewEmpPage navigateToViewEmpPage()
	{
		pimTab.click();
		return new ViewEmpPage();
	}
	

}
