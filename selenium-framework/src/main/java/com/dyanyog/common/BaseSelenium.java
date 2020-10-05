package com.dyanyog.common;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners({IInvokedListnerImpl.class})
public class BaseSelenium {

	@DataProvider(name="loginDataFromExcel",parallel=true)
	public String[][] getDataFromExcel() throws Exception
	{
		return ExcelReader.getExcelTableArray("C:\\Selenium\\ExcelSheet.xlsx","Sheet1");
	}
	
	
	@DataProvider(name="loginData")
	public String[][] getArrayData()
		{
		String[][] loginData = {{ "admin","admin123"},
								{"supriya","supriya123"}
								};               //Declaration & Initialization
		return loginData;	
		}
	
	@DataProvider(name="loginDataFromCSV")
	public String[][] getDataFromCSV()
	{
		String csvFile = "C:\\Selenium\\read.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";

		String[][] loginData = new String [2][2];   //Decaration only
		int i = 0;
		
		try {
			FileReader fr = new FileReader(csvFile); // Copy file from HD to RAM
			br = new BufferedReader(fr); // Read file from RAM
			while ((line = br.readLine()) != null) 
			{
				String[] data = line.split(csvSplitBy);
				loginData[i] = data;
				System.out.println(line);
				i = i+1;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("After catch block");
		return loginData;
	}
}
