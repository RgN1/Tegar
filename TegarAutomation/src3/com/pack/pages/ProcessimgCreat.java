package com.pack.pages;

import java.sql.Driver;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.libraries.ExcelLibrary;

public class ProcessimgCreat {
WebDriver driver;
	@FindBy(xpath="//a[text()='Create New']")
	private WebElement createbut;
	
	@FindBy(xpath="//div[@id='businessEntity_chosen']")
	private WebElement businessent;
	
	@FindBy(xpath="//div[@class='chosen-drop']")
	private WebElement chosendrop;
	
	@FindBy(xpath="//ul[@class='chosen-results']")
	private WebElement chosenresults;
	
	@FindBy(xpath="//input[@class='normal detailList']")
	private WebElement normaldetailList;
	@FindBy(xpath="//span[contains(text(),'This name already exists')]")
	private  List<WebElement> errortext;
	@FindBy(xpath="//input[@class='normal detailList valid']")
	private  WebElement detailListvalid;
	@FindBy(xpath="//textarea[@id='Description']")
	private  WebElement describeaboutcash;
	

	@FindBy(xpath="//span[@class='select2-selection__placeholder']")
	private  WebElement select2selection_placeholder;
	@FindBy(xpath="//input[@class='select2-search__field']")
	private  WebElement select2searchfield;
	@FindBy(xpath="//ul[@id='select2-owner-results']")
	private  WebElement select2ownerresults;
	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--highlighted']")
	private  WebElement select2resultsoptionhighlighted;
	@FindBy(xpath="//input[@id='ReviewDate']")
	private  WebElement ReviewDate;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private  WebElement ui_datepickermonth;
	@FindBy(xpath="//option[@value='6']")
	private  WebElement monthoption;
	@FindBy(xpath="//a[@class='ui-state-default'][text()='17']")
	private  WebElement uistatedefault;
	@FindBy(xpath="//input[@id='Expires']")
	private  WebElement epiredate;
	@FindBy(xpath="//option[@value='8']")
	private  WebElement expirymon;
	@FindBy(xpath="//a[@class='ui-state-default'][text()='17']")
	private  WebElement expirydate;
	@FindBy(xpath="//input[@id='Image']")
	private  WebElement imagese;
	
	@FindBy(xpath="//div[@class='checkbox blockMiddle']")
	private  WebElement review;
	
	@FindBy(xpath="//div[2][@class='checkbox blockMiddle']")
	private  WebElement bypass;
	@FindBy(xpath="//button[@id='btnSave']")
	private  WebElement savebut;
	
	public ProcessimgCreat(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void creteprocei() throws InterruptedException
	{
		ExcelLibrary exce=new ExcelLibrary();
		createbut.click();
		//((Object) driver.findElement(By.xpath("//select[@id='businessEntity']"))).selectByVisibleText("KPMG");;
		// driver.findElement(By.xpath("//li[contains(text(),'KPMG')]")).sendKeys("KPMG");;
		// new Select(driver.findElement(By.xpath("//select[@id='businessEntity']"))).selectByVisibleText("KPMG");
		Thread.sleep(2222);
		businessent.click();
		 
		// Actions action=new Actions(driver);
		// action.moveToElement("//li[contains(text(),'KPMG')]");
		 
		 chosendrop.click();
		chosenresults.click();
		normaldetailList.sendKeys(exce.getdat("Sheet1",1,3));
		 
		
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		
		
		
		for(int i=2;i<=exce.rowcount();i++)
		 
		{	
		Thread.sleep(2222);
		
		
		
		 
		    		        if(errortext.size()>0){
		        	
		        	//driver.findElement(By.xpath("//input[@class='normal detailList']")).clear();
		    		        	detailListvalid.clear();
		    		        	detailListvalid.sendKeys(exce.getdat("Sheet1",i,3));
		    		        	actions.sendKeys(Keys.TAB).perform();
		        	//Thread.sleep(2222);	
		        }else{break;}
		        
		}       
		 
		describeaboutcash.sendKeys("describes about cash ");
		select2selection_placeholder.click();
		
		 select2searchfield.sendKeys("sharath_c@gieom.com");
		 
		select2ownerresults.click();	
		 Thread.sleep(1111);
	select2resultsoptionhighlighted.click();
		
	
	
/////////for review date///	
	ReviewDate.click();
//	driver.findElement(By.xpath("//input[@id='ReviewDate']")).sendKeys("11 August, 2016");;
	
	
	ui_datepickermonth.click();
	monthoption.click();
	
uistatedefault.click();
	//driver.findElement(By.xpath("//button[@class='ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all']")).click();
/////////for valid until///
epiredate.click();
	
	Thread.sleep(2222);
	
	
	ui_datepickermonth.click();
	expirymon.click();
	
	expirydate.click();
	
	imagese.sendKeys("C:\\Users\\Admin\\Downloads\\1311.png");
	Thread.sleep(3222);
	
	review.click();
	bypass.click();
	//driver.findElement(By.xpath("//input[@id='SelfApprove']")).click();
	savebut.click();
	
	//driver.navigate().back();
	//driver.findElement(By.xpath("//input[@class='normal detailList']")).click();
	
	Thread.sleep(2222);
	Assert.assertEquals("0.1",
		driver.findElement(By.xpath("//div[@class='text blockMiddle'][text()='0.1']")).getText() );
	
	Assert.assertEquals("Approved",
			driver.findElement(By.xpath("//div[@class='text blockMiddle'][text()='Approved']")).getText() );
	
	}
	
}
