package com.pack.pages;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoweUPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[contains(text(),'sharath')]")
	private WebElement namesh;
	
	@FindBy(xpath="//div[contains(text(),'Sett')]")
	private WebElement setting;
	
	@FindBy(xpath="//a[@href='/ProcessImage/List'][@title='Process Images']")
	private WebElement processimg;
	
	
	public PoweUPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void settings() throws InterruptedException {
		
		namesh.click();
		Thread.sleep(1122);
		setting.click();

		Thread.sleep(1122);
	String	actualtext="Process Images";
		if(actualtext.equals(processimg.getText())){
			 System.out.println("he is power user");
						
		}
		processimg.click();
			Thread.sleep(2222);
			
		 
	}
	
	
	
	
	
}
