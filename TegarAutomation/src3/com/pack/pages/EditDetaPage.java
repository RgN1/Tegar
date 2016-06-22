package com.pack.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditDetaPage {

	WebDriver driver;
	String string;
	String string2;
	String string3;
	@FindBy(xpath="//td[contains(text(),'Draft')]/../td[1]")
	private List<WebElement> draft;
	
	@FindBy(xpath="(//div[@class='text blockMiddle'])[1]")
	private WebElement prdata1;
	@FindBy(xpath="(//div[@class='text blockMiddle'])[3]")
	private WebElement prdata2;
	@FindBy(xpath="(//div[@class='text blockMiddle'])[4]")
	private WebElement prdata3;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	private WebElement edit;
	
	@FindBy(css="a[class='paginate_button next']")
	private WebElement nextbut;
	
	
	
	public EditDetaPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void draftdetai() throws InterruptedException{
		
		if(draft.size()>0){
		
			draft.get(0).click();
		}else{
			nextbut.click();
			Thread.sleep(2222);
		draft.get(0).click();
		}
		//Assert.assertEquals("Process Images", driver.findElement(By.xpath("//a[@href='/ProcessImage/List'][@title='Process Images']")).getText());
		 //System.out.println("he is power user");
		
		
		string=prdata1.getText();
		
		 string2=prdata2.getText();
		
		  string3=prdata3.getText();
		
		Thread.sleep(2222);
		
		
		edit.click();
		
		Thread.sleep(2222);
		
	}
	

	
	
	
	
}
