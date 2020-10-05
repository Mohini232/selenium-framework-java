package com.dyanyog.test;

import org.testng.annotations.Test;

import com.dyanyog.common.BaseSelenium;
import com.dyanyog.page.AddUserPage;
import com.dyanyog.page.AdminPage;
import com.dyanyog.page.HomePage;
import com.dyanyog.page.LoginPage;

public class AddUserTest extends BaseSelenium{
	
	@Test
	public void verifyAddUserAdminEnabled()
	{
		LoginPage lp = new LoginPage();
		
		lp.login("Admin", "admin123")
			.verifyWelcomeText("Welcome Admin")
				.navigateToAdminPage()
					.navigateToAddUserPage()
						.addAdminUser("Fiona Grace", "User_"+System.currentTimeMillis(), "Mohini@1234", "Mohini@1234");
		
	}
	

}
