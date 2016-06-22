package com.pack.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Secon {
public static void main(String[] args) {
	System.out.println("dsdjh");
	WebDriver driver=new FirefoxDriver();
	 driver.get("file:///E:/selenium/testc1.html");
	    driver.findElement(By.cssSelector("input[type=\"user\"]")).clear();
	    driver.findElement(By.cssSelector("input[type=\"user\"]")).sendKeys("wew");
	    driver.findElement(By.cssSelector("input[type=\"password\"]")).clear();
	    driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("erwe");
	    driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
	   // driver.findElement(By.name("hello")).clear();
	    driver.findElement(By.name("hello")).sendKeys("C:\\Users\\Admin\\Desktop\\FourthCl.txt");
}
}
