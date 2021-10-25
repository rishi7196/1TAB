package com.tab.qa.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tab.qa.Testbase.BaseClass;
import com.tab.qa.pages.HomePage;
import com.tab.qa.pages.LoginPage;
import com.tab.qa.pages.ProductPage;

public class ProductTest extends BaseClass {
	
	LoginPage loginpage;
	HomePage homepage;
	ProductPage productpage;
	
	public ProductTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage= new LoginPage();
			
	}

	@Test(priority = 1)
	public void LoginTest() throws InterruptedException {

		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));		
		Thread.sleep(4000);
		homepage.Add_btn.click();
		homepage.Product_btn.clear();
		

	}

}
