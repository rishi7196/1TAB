package com.tab.qa.testcase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.tab.qa.Testbase.BaseClass;
import com.tab.qa.pages.Category;
import com.tab.qa.pages.HomePage;
import com.tab.qa.pages.LoginPage;
import com.tab.qa.util.TestUtils;

public class CategoryTest extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	Category category;
	TestUtils testutil;
	String sheetName = "Category";

	public CategoryTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException 		{
			initialization();
			loginpage = new LoginPage();
			homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
			homepage.Add_btn.click();

		}
	
	@Test
	public void verifyCureentUrl()
	{
		category.getCurrentUrl();
	}
	
	@DataProvider
	public Object[][] getVendorTestData(){
		Object data[][] = TestUtils.getTestData(sheetName);
		return data;
	}
	@Test(priority=4, dataProvider="getVendorTestData")
	public void AddNewCategory(String name , String text, String two) throws InterruptedException
	{
		homepage.Add_btn.click();
        Thread.sleep(2000);
        homepage.vendorHome.click();
		category.AddNewCategory(name, text, two);
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
