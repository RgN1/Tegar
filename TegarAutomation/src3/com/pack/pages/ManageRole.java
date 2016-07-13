package com.pack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageRole {
WebDriver driver;
	@FindBy(xpath="(//span[text()='EY'])[1]")
	private WebElement busnent;
	
	@FindBy(xpath="//a[@class='btn floatRight'][text()='Create New']")
	private WebElement creatn;
	
	
	public ManageRole(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createrol() throws InterruptedException
	{
		busnent.click();
		creatn.click();
		Thread.sleep(1222);
		
	}
	
	
	
	
}
