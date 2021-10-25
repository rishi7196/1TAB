package com.tab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tab.qa.Testbase.BaseClass;

public class Category extends BaseClass {

	/*
	 * Author Rishi kumar SDET Owner of Framework k.rishi@1tab.com
	 */

	@FindBy(xpath = "//*[@class='toggle ng-star-inserted']")
	public WebElement toggle_btn1;

	@FindBy(xpath = "//*[text()='Parent']")
	public WebElement Parent_btn;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement name;

	@FindBy(xpath = "(//*[@class='toggle ng-star-inserted'])[2]")
	public WebElement toggle_btn2;

	@FindBy(xpath = "//*[text()='Devices & Equipment']")
	public WebElement DevicesEquipment;

	@FindBy(xpath = "//textarea[@name='short_description']")
	public WebElement description_field;

	@FindBy(xpath = "//input[@name='popularity']")
	public WebElement popularity;

	@FindBy(xpath = "//*[text()='Save']")
	public WebElement save_btn;

	// initlize element
	public Category() {
		PageFactory.initElements(driver, this);
	}

	public void getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("current url is " + url);

	}

	public void AddNewCategory(String fname, String ftext, String two) {
		toggle_btn1.click();
		Parent_btn.click();
		name.sendKeys(fname);
		toggle_btn2.click();
		DevicesEquipment.click();
		description_field.sendKeys(ftext);
		popularity.sendKeys(two);
		save_btn.click();
	}
}
