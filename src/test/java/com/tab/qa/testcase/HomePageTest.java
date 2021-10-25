package com.tab.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.tab.qa.Testbase.BaseClass;
import com.tab.qa.pages.HomePage;
import com.tab.qa.pages.LoginPage;

public class HomePageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;

	// create a constructor for homepageTestclass

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority=1)
	public void verifyHomeTitleTest() {
		String title = homepage.verifyHomePageTitle();
		Assert.assertEquals(title, "1Tab - Admin", "Home page titled is not matched");

	}

	@Test(priority=2)
	public void verifyAddNewButton() {
		String expected = "ADD NEW";
		String actual = homepage.addNew.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}

	@Test(priority=3)
	public void verifyAddDashboard() {
		String expected = "Dashbaord";
		String actual = homepage.dashbaord.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}

	@Test(priority=4)
	public void verifyInventory() {
		String expected = "Inventory";
		String actual = homepage.Inventory.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}

	@Test(priority=5)
	public void verifyVendor() {
		String expected = "Vendor";
		String actual = homepage.vendor.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}

	@Test(priority=6)
	public void verifySalesOrder() {
		String expected = "Sales Order";
		String actual = homepage.SalesOrder.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}

	@Test(priority=7)
	public void verifyProductSearch() {
		String actual = "Product Search";
		String expected = homepage.Product_Search.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}

	@Test(priority=8)
	public void VerifyDelivery() {
		String expected = "Delivery";
		String actual = homepage.Delivery.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}

	@Test(priority=9)
	public void verifyHealthArticle() {
		String expected = "HealthArticle";
		String actual = homepage.healthArticle.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}
	@Test(priority=10)
	public void verifyUserAccount() {
		String expected = "User Account";
		String actual = homepage.UserAccount.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}
	
	@Test(priority=11)
	public void verifyCreateOrder() {
		String expected = "Create Order";
		String actual = homepage.CreateOrder.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + actual);
	}
	
	@Test(priority=12)
	public void verifyCopyright() {
		String expected = "Copyright© 2021 1Tab.com All Rights Reserved.";
		String actual = homepage.copyright.getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Display the add new button --------" + expected);
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
