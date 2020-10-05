package com.dyanyog.test;

import org.testng.annotations.Test;

import com.dyanyog.common.BaseSelenium;
import com.dyanyog.page.LoginPage;

public class AddEmpTest extends BaseSelenium{
	
	@Test
	public void verifyAddEmpSuccessfully()
	{
		LoginPage lp = new LoginPage();
		lp.login("Admin", "admin123")
			.navigateToViewEmpPage()
				.navigateToAddEmpPage()
					.addEmpUser("Mohini","Test","Test","User_"+System.currentTimeMillis(),"Mohini@1234","Mohini@1234");
	}

}
