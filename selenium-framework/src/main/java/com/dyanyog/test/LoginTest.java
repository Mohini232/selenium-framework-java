package com.dyanyog.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dyanyog.common.BaseSelenium;
import com.dyanyog.common.IInvokedListnerImpl;
import com.dyanyog.page.HomePage;
import com.dyanyog.page.LoginPage;


public class LoginTest extends BaseSelenium{
	
	@Test(dataProvider= "loginDataFromExcel")
	public void verifyLoginUserSucessfully(String struserName, String strPassword) {
		
		LoginPage lp = new LoginPage();
		lp.printFont()
		   .printLinks()
		    .login(struserName,strPassword);
		     //.varifyWelcomeText("Welcome Linda");
		   
	}
}


