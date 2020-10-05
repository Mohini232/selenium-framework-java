package com.dyanyog.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedListnerImpl implements IInvokedMethodListener{

	
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		
		WebDriverFactory.getDriver().quit();
		
	}

	
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		
        WebDriver dr = new ChromeDriver();
         
	    dr.get("https://opensource-demo.orangehrmlive.com/");
	    
	    dr.manage().window().maximize();
	    
	    WebDriverFactory.setDriver(dr);
		
	}

}
