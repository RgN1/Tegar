package com.pack.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcesImLiPag {
	WebDriver driver;
	@FindBy(xpath="//a[@href='/ProcessImage/List'][@title='Process Images']")
	private WebElement procimli ;
	@FindBy(xpath="//td[text()='Reviewed']")
	private List<WebElement> reviewvd ;
	
	
	public ProcesImLiPag(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void listp() {
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		/*try{
			procimli.click();

		}catch(Exception NoSuchElementException){System.out.println("element not found ");}
*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		

	if(reviewvd.size()>=1)
	{System.out.println("review present");}
	else{System.out.println("review not present");}

		
		
		
	}
	
	
	
	
	
}
