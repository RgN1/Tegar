package com.pack.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteSettPage {
WebDriver driver;
@FindBy(xpath="//a[contains(text(),'Manage Organization Structure')]")
private WebElement mangesys;

@FindBy(xpath="//div[contains(text(),'admin@')]")
private WebElement adminck;

@FindBy(xpath="//div[contains(text(),'Settings')]")
private WebElement settincl;

@FindBy(xpath="//a[contains(text(),'Manage Roles')]")
private WebElement manrole;
@FindBy(xpath="//a[contains(text(),'Manage Content Hierarchy')]")
private WebElement manconhei;

	public SiteSettPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public void organizeStruct() throws InterruptedException
	{
		adminck.click();
		Thread.sleep(1222);
		settincl.click();
		Thread.sleep(2222);
		mangesys.click();
		
	}
	public void managerole() throws InterruptedException
	{
		adminck.click();
		Thread.sleep(1222);
		settincl.click();
		Thread.sleep(2222);
		manrole.click();
		
	}
	public void managecontenthei() throws InterruptedException
	{
		adminck.click();
		Thread.sleep(1222);
		settincl.click();
		Thread.sleep(2222);
		manconhei.click();
		
	}
}
