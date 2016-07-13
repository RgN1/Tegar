package com.pack.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContHeiPag {
	WebDriver driver;
@FindBy(xpath="//div[@class='name basic']")
private List<WebElement> contenthei;

@FindBy(xpath="//span[text()='Nodes']")
private WebElement nodes;
@FindBy(xpath="//input[@id='title'] [@class='normal']")
private WebElement namenode;

@FindBy(xpath="//li[@class='select2-selection__choice']")
private List<WebElement> approvers;

@FindBy(xpath="//div[contains(text(),'Edit')]")
private WebElement nodeedit;
@FindBy(xpath="(//input[@class='select2-search__field'])[3]")
private WebElement contributedit;
@FindBy(xpath="//li[@class='select2-results__option select2-results__option--highlighted']")
private WebElement selecthighltd;

@FindBy(xpath="//div[contains(text(),'Save')]")
private WebElement save;
@FindBy(xpath="//div[contains(text(),'@gieom.com')]")
private  WebElement admingim;
@FindBy(xpath="//div[contains(text(),'Log Off')]")
private  WebElement logof;
public ManageContHeiPag(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void heirarchycontent() throws InterruptedException
{
	if(contenthei.size()>0)
	{
		System.out.println("heirarchy is present");
	}
for(int i=0;i<contenthei.size();i++)
{
String actual="EY Content";
	if(contenthei.get(i).getText().equals(actual)){
		
		contenthei.get(i).click();
		Thread.sleep(1222);
		nodes.click();
		Thread.sleep(1222);
		String actual1="Nodes";
		if(namenode.getText().equals(actual1)){
			
			System.out.println("working");
		}
		
		
		if(approvers.size()>0)
		{
			
			System.out.println("approvers are present");
		}
		
		
		
	}
}


}
public void heirarchycontentEdit() throws InterruptedException
{
	if(contenthei.size()>0)
	{
		System.out.println("heirarchy is present");
	}
for(int i=0;i<contenthei.size();i++)
{
String actual="EY Content";
String expect=null;	
expect=contenthei.get(i).getText();
if(expect.equals(actual)){
		
		contenthei.get(i).click();
		Thread.sleep(1222);
		nodes.click();
		Thread.sleep(1222);
		String actual1="Nodes";
		String expect1=namenode.getText();
		if(expect1.equals(actual1)){
			
			System.out.println("working");
		}
		
		nodeedit.click();
		Thread.sleep(1222);
		contributedit.sendKeys("sha");
		Thread.sleep(2222);
		selecthighltd.click();
		Thread.sleep(1222);
		save.click();
		Thread.sleep(1222);
		admingim.click();
		Thread.sleep(1222);
		logof.click();
	}
}


}





}
