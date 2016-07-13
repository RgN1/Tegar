package com.pack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageorganiPag {
WebDriver driver;
@FindBy(xpath="//span[contains(text(),'GIEOM Business Consulting')]")
private WebElement gieombu;
@FindBy(xpath="//span[contains(text(),'EY')]")
private WebElement entity;
@FindBy(xpath="//span[@class='organizationStructureName'][@data-bind='text:title']/../../../../../ul[@id='region']")
private WebElement area;
@FindBy(xpath="//span[@class='organizationStructureName'][@data-bind='text:title']/../../../../../ul[@id='operatingUnit']")
private WebElement unit;
@FindBy(xpath="//div[contains(text(),'Edit')]")
private WebElement editbt;
@FindBy(css="textarea[id='description']")
private WebElement descr;
@FindBy(css="input[id='code']")
private WebElement code;
@FindBy(xpath="//textarea[@id='address'][@class='normal']")
private WebElement adress;
@FindBy(css="textarea[id='additionalInformation']")
private WebElement addiinfo;
@FindBy(xpath="//div[contains(text(),'Save')]")
private WebElement save;
@FindBy(xpath="//div[contains(text(),'@gieom.com')]")
private  WebElement admingim;
@FindBy(xpath="//div[contains(text(),'Log Off')]")
private  WebElement logof;


	public ManageorganiPag(WebDriver driver) {
	
		
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void organizeStructcre() throws InterruptedException
	{
		gieombu.click();
		
		entity.click();
		area.click();
		Thread.sleep(1222);
		unit.click();
		editbt.click();
		Thread.sleep(2222);
		//editbt.sendKeys("");
		descr.sendKeys("cabot ");
		code.sendKeys("1233");
		adress.sendKeys("bangalore 35");
		addiinfo.sendKeys("if any information to be filled");
		Thread.sleep(1222);
		save.click();
		System.out.println("saved succesfully");
		Thread.sleep(1222);
		admingim.click();
		Thread.sleep(1222);
		logof.click();
	}
	
	
	
	
	
	
}
