package com.dyanyog.page;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dyanyog.common.WebDriverFactory;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[text()='( Username : Admin | Password : admin123 )']")
	WebElement loginHint;
	
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	/*
	public LoginPage(String strUserName, String strPassword)
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
		login(strUserName,strPassword);
	}
	
	public LoginPage(String strUserName, int strPassword)
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
		//login(strUserName,strPassword);
	}
	
	public LoginPage(int strPassword, String strUserName)
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
		//login(strUserName,strPassword);
	}
	*/
	public HomePage login(String strUserName, String strPassword)
	{
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginBtn.click();
	    HomePage hp = new HomePage();
		return hp;
	}
	
	public LoginPage printFont()
	{
		System.out.println(loginHint.getCssValue("color"));
		System.out.println(loginHint.getCssValue("font-size"));
		System.out.println(loginHint.getCssValue("font-family"));
		return this;
	}
	
	public LoginPage printLinks()
	{
		List<WebElement> links = WebDriverFactory.getDriver().findElements(By.tagName("a"));
		links.forEach(link->System.out.println(link.getAttribute("href")));     //lambda 
		
		//for(int i=0;i<20;i++)
		
		for(WebElement link:links)
		{
			System.out.println(link.getAttribute("href"));
		}
		
		ListIterator<WebElement> itr = links.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getAttribute("href"));
		}
		
		return this;
	}

}
