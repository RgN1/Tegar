package com.pack.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pack.pages.EditDetaPage;
import com.pack.pages.LoginPage;
import com.pack.pages.PoweUPage;
import com.pack.pages.ProcesImLiPag;
import com.pack.pages.PublishDetaPage;

public class PubishProcessTe extends BaseClass{
//WebDriver driver;
@Test	
public void testpublish() throws InterruptedException{
	String un=lib.getdat("Sheet1", 1, 1);
	String pwd=lib.getdat("Sheet1", 1, 2);
	
	LoginPage lp=new LoginPage(driver);
		lp.Login(un, pwd);
		
		
		PoweUPage pg=new PoweUPage(driver);
		pg.settings();
		
		PublishDetaPage lisim=new PublishDetaPage(driver);
		lisim.publish();
		
		}
	
	
}
