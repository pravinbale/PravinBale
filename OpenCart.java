package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpenCart {
	public static WebDriver dr;
  @Test(priority = 1)
  public void home() {
	  System.setProperty("webdriver.chrome.driver","D:\\pravin\\Selenium data\\chromedriver-win32\\chromedriver.exe");
		 dr = new ChromeDriver();
		dr.get("https://www.opencart.com/index.php?route=account/register");
		dr.manage().window().maximize();
		System.out.println(dr.getCurrentUrl());
	  
  }
  
  @Test(priority = 2)
  public void Register() {
	  dr.findElement(By.id("input-username")).sendKeys("pravinbale");
	  dr.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("pravin");
	  dr.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("bale");
	  dr.findElement(By.xpath("//input[@id='input-email']")).sendKeys("mr.xpravin2k17@gmail.com");  
	  Select country = new Select(dr.findElement(By.id("input-country")));
	  country.selectByVisibleText("India");
	  dr.findElement(By.xpath("//input[@id='input-password']")).sendKeys("pravin123");
	  dr.findElement(By.xpath("//body/div[@id='account-register']/div[@id='register']/div[1]/div[1]/form[1]/div[7]/button[1]")).click();
  }
  
  @Test(priority = 3)
  public void login() {		  
	  
		WebElement we1 = dr.findElement(By.xpath("//input[@id='input-email']"));
		we1.sendKeys("mr.xpravin2k17@gmail.com"); 
		System.out.println(we1.getAttribute("values"));
	
		WebElement we2 = dr.findElement(By.xpath("//input[@id='input-password']"));
		we2.sendKeys("pravin123");
		System.out.println(we2.getAttribute("values"));	
		
		dr.findElement(By.xpath("//body/div[@id='account-login']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]")).click();
  }
}
