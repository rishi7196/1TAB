package com.tab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tab.qa.Testbase.BaseClass;

public class HomePage extends BaseClass{
	
	
	@FindBy(id="navbarDropdownMenuLink")
	public WebElement Add_btn;
	
	@FindBy(xpath="//*[text()=' Add New ']")
	public WebElement addNew;
	
	@FindBy(xpath="(//*[text()='Dashboard'])[1]")
	public WebElement dashbaord;
	
	@FindBy(xpath="//*[text()='Vendor']")
	public WebElement Vendor;
	
	@FindBy(xpath="//*[text()=' Delivery ']")
	public WebElement Delivery;
	
	@FindBy(xpath="//*[text()=' Inventory ']")
	public WebElement Inventory;
	
	@FindBy(xpath="//*[text()=' Sales Order ']")
	public WebElement SalesOrder;
	
	@FindBy(xpath="(//*[@class='nav-link'])[7]")
	public WebElement healthArticle;
	
	@FindBy(xpath="//*[text()=' Product Search ']")
	public WebElement Product_Search;
	
	@FindBy(xpath="//*[text()=' User Account ']")
	public WebElement UserAccount; 
	
	@FindBy(xpath="(//*[@class='nav-link'])[11]")
	public WebElement CreateOrder;
	
	@FindBy(xpath="//*[text()='Copyright© 2021 1Tab.com All Rights Reserved.']")
	public WebElement copyright;
	
	 @FindBy(xpath="//*[text()='Vendor']")
	 public WebElement vendorHome;
	
	@FindBy(xpath="//a[@href='#/pharmacy/inventory/products/product?type=add']")
	public WebElement Product_btn;
	
	@FindBy(xpath="(//a[@class='nav-link'])[5]")
	public WebElement vendor;
	
	@FindBy(xpath="//*[text()='Vendor Listing']")
	public WebElement vendor_listing;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	public WebElement drop_down_btn;
	
	@FindBy(xpath="//*[text()='Vendor ID']")
	public WebElement vendor_Id;
	
	@FindBy(xpath="(//*[@type='text'])[2]")
	public WebElement serach_text_field;
	
	 //initlization of home page class object
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyAddNewBtn()
	{
		return Add_btn.isDisplayed();
	}
	
	public VendorPage clickVendorBtn() throws InterruptedException
	{
		vendor.click();
		Thread.sleep(2000);
		vendor_listing.click();
		return new VendorPage();
	}
	
	
}
