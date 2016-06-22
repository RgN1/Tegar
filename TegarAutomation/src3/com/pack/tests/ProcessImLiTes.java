package com.pack.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pack.pages.LoginPage;
import com.pack.pages.PoweUPage;
import com.pack.pages.ProcesImLiPag;

public class ProcessImLiTes extends BaseClass {

	@Test
	public  void testproclist() throws InterruptedException {
	String un=lib.getdat("Sheet1", 1, 1);
	String pwd=lib.getdat("Sheet1", 1, 2);
	
	
	
	
	LoginPage lp=new LoginPage(driver);
	lp.Login(un,pwd);
	
	
	PoweUPage pg=new PoweUPage(driver);
	pg.settings();
	
	ProcesImLiPag lisim=new ProcesImLiPag(driver);
	lisim.listp();
	
	
}
	
	
	
	
}
