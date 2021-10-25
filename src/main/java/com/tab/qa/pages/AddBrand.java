package com.tab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddBrand {
	
	/* store element object present of Brand page
	 * Author Rishi kumar
	 * 
	 */
	
	@FindBy(name="brand_name")
	public WebElement brandName;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	public WebElement drugLincesName;
	
	
	

}
