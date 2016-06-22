package com.pack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.libraries.ExcelLibrary;

public class LoginPage {

	
	WebDriver driver;
	@FindBy(xpath="//input[@id='UserName']")
	private WebElement username;
	
	
	@FindBy(xpath="//input[@id='Password'][@class='normal']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement subm;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Login(String un,String ps)
	{
		//ExcelLibrary exc=new ExcelLibrary();
		
		username.sendKeys(un);
		pass.sendKeys(ps);
		subm.click();
		
	}
	
	
	
	
	
}
