package com.tab.qa.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tab.qa.util.TestUtils;

public class BaseClass {
	
	 public	static WebDriver driver;
	 public static Properties prop;
	
	public BaseClass() {
		try
		{
			prop= new Properties();
			//System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\"
					+ "com\\tab\\qa\\config\\config.properties");
			prop.load(fis);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+"\\src\\main\\java\\chromedriver.exe"));
					
		     driver= new ChromeDriver();
		}
		 else if (browserName.endsWith("firefox")) {
			 
			 driver= new FirefoxDriver();
			
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);			
			driver.get(prop.getProperty("url"));
	}
}


