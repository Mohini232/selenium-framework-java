package com.dyanyog.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	
	//public static WebDriver dr;
	
	private static ThreadLocal<WebDriver> tl = new ThreadLocal<>();
	
	public static WebDriver getDriver()
	{
		return tl.get();
	}
	
	public static void setDriver(WebDriver dr) {
		
		tl.set(dr);
	}

}
