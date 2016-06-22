package com.pack.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pack.libraries.ExcelLibrary;

public class EditProcessImaP {


	WebDriver driver;
	
	
	@FindBy(css="input[id='Name']")
	private WebElement Name;
	
	@FindBy(css="button[id='btnSave']")
	private WebElement save;
	@FindBy(xpath="(//div[@class='text blockMiddle'])[1]")
	private WebElement chdat1;
	@FindBy(xpath="(//div[@class='text blockMiddle'])[3]")
	private WebElement chdat2;
	@FindBy(xpath="(//div[@class='text blockMiddle'])[4]")
	private WebElement chdat3;
	@FindBy(css="div[id='btnSendForReview']")
	private WebElement btnSendForReview;
	@FindBy(css="input[class='select2-search__field']")
	private WebElement select2_search;
	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--highlighted']")
	private WebElement select2_results__option;
	@FindBy(css="input[id='ReviewByDate']")
	private WebElement ReviewByDate;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement ui_datepicker_month;
	@FindBy(xpath="//option[@value='7']")
	private WebElement value_7;
	@FindBy(xpath="//a[@class='ui-state-default'][text()='17']")
	private WebElement ui_state_default;
	@FindBy(css="textarea[id='Remarks']")
	private WebElement Remarks;
	@FindBy(xpath="(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[1]")
	private WebElement  ui_button_text_only;
	@FindBy(xpath="//span[contains(text(),'name already exists')]")
	private  List<WebElement> errortext;
	
	
	public EditProcessImaP(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void editting(ExcelLibrary exce) throws InterruptedException{
		EditDetaPage ed=new EditDetaPage(driver);
		Name.clear();
		
		Name.sendKeys("demo of the bank");
		
		 
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		
		
		
		for(int i=1;i<=exce.rowcount();i++)
		 
		{	
		Thread.sleep(2222);
		
		
		
		 
		    		        if(errortext.size()>0){
		        	
		        	//driver.findElement(By.xpath("//input[@class='normal detailList']")).clear();
		    		        	Name.clear();
		    		        	Name.sendKeys(exce.getdat("Sheet2",i,0));
		    		        	actions.sendKeys(Keys.TAB).perform();
		        	//Thread.sleep(2222);	
		        }else{break;}
		        
		}         
		 
		
		save.click();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		String new1=	chdat1.getText();
		
		String new22=chdat2.getText();
		
		String new3=chdat3.getText();
		
		if(new22.equals(ed.string2)){
			
			System.out.println("version not changed");
		}
		else{System.out.println("version  changed");}
		
		
//			System.out.println(format.pardate);new22.equals(date);		


		/*String[] stringne=ed.string.split(" ");
		String[] new1new=new22.split(" ");
		
	if(Integer.getInteger(new1new[0])==Integer.getInteger(stringne[0])){
		
		System.out.println("date changed");
	}*/

	btnSendForReview.click();
	
	
	select2_search.sendKeys("sha");
	select2_results__option.click();

	ReviewByDate.click();

	/////////review date

	ui_datepicker_month.click();
	value_7.click();

	ui_state_default.click();
	//driver.findElement(By.xpath("//button[@class='ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all']")).click();



	Remarks.sendKeys("process image is edited");

	ui_button_text_only.click();
		
		
	}
	
	
	
}
