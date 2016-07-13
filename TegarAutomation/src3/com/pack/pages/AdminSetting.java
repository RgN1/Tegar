package com.pack.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.libraries.ExcelLibrary;

public class AdminSetting {
	WebDriver driver;
@FindBy(xpath="(//img[@class='sign'])[1]")
private WebElement settbutonim;
@FindBy(xpath="//div[contains(text(),'Settings')]")
private List<WebElement>  settings;
@FindBy(xpath="//a[contains(text(),'Manage System')]")
private  List<WebElement> managestm;
@FindBy(xpath="//div[contains(text(),'@gieom.com')]")
private  WebElement admingim;
@FindBy(xpath="//div[contains(text(),'Log Off')]")
private  WebElement logof;



public AdminSetting(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}


public void admichk(int i, ExcelLibrary lib) throws InterruptedException, IOException {
	// TODO Auto-generated method stub
System.out.println("inside admin");
	
	//ExcelLibrary excelLibrary=new ExcelLibrary();
	//int cun=ex.rowcountAd();
	
	/*
	String fil="E://selenium//admi.txt";
	FileInputStream fileInputStream=new FileInputStream(fil);
	Properties properties=new Properties();
	properties.load(fileInputStream);
	//WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://gieomci.southeastasia.cloudapp.azure.com/Admin");
	*/
	

	
settbutonim.click();
	
Thread.sleep(1222);

//driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
	


List<WebElement> hg=settings;
if(hg.size()>0){
	

hg.get(0).click();
//List<WebElement>      jhvhv=managestm;

	if(managestm.size()>0){	
		lib.SetExelDataad("Sheet2", i, 2,"admin");
	System.out.println(" admin");
} else{
	
	lib.SetExelDataad("Sheet2", i, 2,"not admin");
	System.out.println(" admin");

}

	Thread.sleep(2222);
admingim.click();


Thread.sleep(1222);
logof.click();
}else{
	
	
	lib.SetExelDataad("Sheet2", i, 2,"not admin");
	System.out.println(" not admin");

Thread.sleep(1222);
logof.click();
}


Thread.sleep(1222);	

	/*try{
	driver.findElement(By.xpath("//a[contains(text(),'Manage System')]"));
	driver.findElement(By.xpath("//a[contains(text(),'Manage Organization ')]"));
	}catch(Exception nosuchelementException){
		excelLibrary.SetExelData("Sheet1", i, 2,"not admin");
			
		System.out.println("not a admin");
	}
	*/

	
	
	
	
	
}
}
