package com.pack.pages;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PublishDetaPage {
	WebDriver driver;
	
	@FindBy(xpath="(//td[text()='Approved'])[2]/../td[4]")
	private WebElement approved;
	
	@FindBy(xpath="(//td[text()='Approved'])[2]/../td[1]")
	private WebElement approvedprocs;
	@FindBy(css="div[id='btnPublish']")
	private WebElement btnPublish;
	@FindBy(xpath="(//span[@class='fancytree-expander'])[1]")
	private WebElement fancytree_expander;
	@FindBy(xpath="(//span[@class='fancytree-expander'])[2]")
	private WebElement fancytree_expander2;
	@FindBy(xpath="//span[text()='United States']")
	private WebElement UnitedStates;
	@FindBy(xpath="(//span[text()='Any'])[1]")
	private WebElement any1;
	@FindBy(xpath="(//span[text()='Any'])[2]")
	private WebElement any2;
	@FindBy(css="button[class='btn ok addAudience floatRight']")
	private WebElement addAudience;
	@FindBy(xpath="(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[1]")
	private WebElement ui_widget;
	@FindBy(xpath="(//div[@class='text blockMiddle'])[3]")
	private WebElement text_blockMiddle;
	@FindBy(xpath="(//div[@class='text blockMiddle'])[1]")
	private WebElement dateacual;
	
	
	
	
	
	public PublishDetaPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void publish() throws InterruptedException{

		Thread.sleep(2222);
	String expect=approved.getText();
	if(expect.equals("Approved")){}
	System.out.println("approved");
	Thread.sleep(1222);
	
	approvedprocs.click();

	Thread.sleep(2222);
	btnPublish.click();
	Thread.sleep(2222);
	fancytree_expander.click();


	fancytree_expander2.click();
	UnitedStates.click();
	Thread.sleep(2222);
	any1.click(); 

	any2.click();
	addAudience.click();

	ui_widget.click();
Thread.sleep(2222);
	
	String  vers=   text_blockMiddle.getText();

	if(vers.equals("1.0")){
		
		System.out.println("version is correct");
		
	}

	else{
		
		System.out.println("version is wrong");
	}


	java.util.Date date = Calendar.getInstance().getTime();
	date.getDate();
	System.out.println(date.getDate());

	String dateactual=dateacual.getText();

	String[] spl=dateactual.split(" ");
	System.out.println(spl[0]);
	if(spl[1].equals(date.getDate())){System.out.println("date is modified");}else{System.out.println("date is not modified");}

	try{
	driver.findElement(By.cssSelector("li[class='innerList']"));
	}catch(Exception NoSuchElementException){}

	System.out.println("audiance not found");
	}

		
		
		
		
		
	}
	

	

