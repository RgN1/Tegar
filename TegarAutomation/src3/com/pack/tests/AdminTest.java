package com.pack.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pack.pages.AdminSetting;
import com.pack.pages.LoginPage;
import com.pack.pages.ManageContHeiPag;
import com.pack.pages.ManageorganiPag;
import com.pack.pages.SiteSettPage;

public class AdminTest extends BaseClass {
//WebDriver driver;
	@Test(enabled=false)
	public void admintest() throws InterruptedException, IOException 
	{
		String un=null;
    	String pwd=null;
    	int cun=lib.rowcountAd();
			LoginPage lp=new LoginPage(driver);
		
		
		
		
		AdminSetting ach=new AdminSetting(driver);
    	for(int i=1;i<=cun;i++){
		System.out.println(un);
		System.out.println(pwd);
		un=lib.getdatad("Sheet2", i, 0);
		pwd=lib.getdatad("Sheet2", i, 1);
		lp.Login(un, pwd);
    	Thread.sleep(2222);
		ach.admichk(i,lib);
    	}
	}
	
	@Test
	public void organstructts() throws InterruptedException, IOException 
	{
		String un=lib.getdatad("Sheet2", 1, 0);

    	String pwd=lib.getdatad("Sheet2", 1, 1);
    	int cun=lib.rowcountAd();
			LoginPage lp=new LoginPage(driver);
		lp.Login(un, pwd);
		Thread.sleep(2222);
		SiteSettPage stpg=new SiteSettPage(driver);
		stpg.organizeStruct();
		Thread.sleep(1222);
		ManageorganiPag manorg=new ManageorganiPag(driver);
		manorg.organizeStructcre();
		
		
    	
	}
	@Test(enabled=false)
	public void managecontenthei() throws InterruptedException, IOException 
	{
		String un=lib.getdatad("Sheet2", 1, 0);

    	String pwd=lib.getdatad("Sheet2", 1, 1);
    	int cun=lib.rowcountAd();
			LoginPage lp=new LoginPage(driver);
		lp.Login(un, pwd);
		Thread.sleep(2222);
		SiteSettPage stpg=new SiteSettPage(driver);
		stpg.managecontenthei();
		Thread.sleep(1222);
		ManageContHeiPag manorg=new ManageContHeiPag(driver);
		manorg.heirarchycontentEdit();
		
		
    	
	}
	
	
	
}
