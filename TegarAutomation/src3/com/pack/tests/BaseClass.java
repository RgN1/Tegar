package com.pack.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pack.libraries.ExcelLibrary;

public class BaseClass {

	static WebDriver driver;
	ExcelLibrary lib=new ExcelLibrary();
	
	
	@BeforeClass
	public void launching()
	{
		String browse=lib.getdat("Sheet3", 1, 1);
		String url=lib.getdat("Sheet1", 1, 0);
		if(browse.equals("firefox")){
		driver=new FirefoxDriver();
		
			
		}else if(browse.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
			
			driver=new ChromeDriver();
		}else if(browse.equals("ie")){
System.setProperty("webdriver.ie.driver", "exefiles/IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
		}
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		
		
	}
	
	@AfterClass
	public void quit()
	{
		
		driver.quit();
	}
	
	
}
