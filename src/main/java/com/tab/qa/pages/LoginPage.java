package com.tab.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tab.qa.Testbase.BaseClass;


public class LoginPage extends BaseClass{
	
	//--- store all web element pages wise
	
	@FindBy(id="user_input")
	public WebElement username;	
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	public WebElement lgn_btn;
	
	@FindBy(xpath="//*[@class='img-fluid w-100']")
	public WebElement tab_logo;
	



   public LoginPage()
     {
	    PageFactory.initElements(driver, this);
     }
   
   
   public String gettitle()
   {
	  return driver.getTitle();
   }
   
   public boolean logo()
   {
	  return tab_logo.isDisplayed();
	   
   }
   
   public HomePage Login(String un,String pwd) throws InterruptedException
	{
	    driver.findElement(By.id("user_input")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		lgn_btn.click();
     	Thread.sleep(5000);		
		return  new HomePage();
    	
//		Thread.sleep(3000);
//		username.sendKeys(prop.getProperty(un));
//	    password.sendKeys(prop.getProperty(pwd));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
//   	//js.executeScript("arguments[0].click();", lgn_btn);
//		lgn_btn.click();
//     	Thread.sleep(5000);		
//		return  new HomePage();
	}
   
   

}

