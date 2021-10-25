package com.tab.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.tab.qa.Testbase.BaseClass;
import com.tab.qa.pages.HomePage;
import com.tab.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void LoginPageTitleTest() {
		String title = loginpage.gettitle();
		Assert.assertEquals(title, "1Tab - Admin");
		System.out.println("Print the title of login page::::::: " + title);
	}
    @Test(priority=2)
	public void LogoImage() {
		@SuppressWarnings("unused")
		boolean flag = loginpage.logo();
		Assert.assertTrue(true);
		System.out.println("Logo is present ---------------------->");
	}

	@Test(priority = 3)
	public void LoginTest() throws InterruptedException {
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		System.out.println("User logged in Sucessfully");

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
