package com.tab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tab.qa.Testbase.BaseClass;

public class ProductPage extends BaseClass{
	
	@FindBy(name="product_name")
	public WebElement product_name;
	
	@FindBy(xpath="//*[@class='toggle']")//this is comman xpath so that i dont right duplication code here
	public WebElement toggle;
	
	@FindBy(xpath="//*[text()='BrandName1']")
	public WebElement brand_name;
	
	@FindBy(xpath="//*[@class='highlighted']")
	public WebElement type_btn;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	public WebElement marketer;
	
	@FindBy(xpath="//*[text()='ABBOTT HEALTHCARE (ORTHO)']")
	public WebElement manufature;
	
	@FindBy(name="maximum_retail_price")
	public WebElement maxium_price;
	
	@FindBy(name="purchase_price")
	public WebElement purchase_price;
	
	@FindBy(name=" profit_margin_percentage")
	public WebElement profit_btn;
	
	@FindBy(name="hsn")
	public WebElement hsn_number;

	@FindBy(name="igst")
	public WebElement igst;
	

	@FindBy(xpath="//*[@class='multiple']")
	public WebElement category;
	

	@FindBy(xpath="//*[text()='Band Aids']")
	public WebElement category1;
	

	@FindBy(xpath="//*[@type='submit']")
	public WebElement save_btn;
	
	public ProductPage()
    {
	    PageFactory.initElements(driver, this);
    }
	
	
  
	
	
	
	
	
	
	

}
