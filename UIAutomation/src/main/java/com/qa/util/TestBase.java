package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream fis= new FileInputStream("D:/NAL_SeleniumJava_Workspace/UIAutomation/"+
			"src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static void initialise() {
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chromebrw")) {
			//System.setProperty("webdriver.chrome.driver", prop.getProperty("driverPath") + "/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:/SeleniumSoftwares/Softwares/Selenium_Drivers/chromedriver.exe");
			
			driver= new ChromeDriver();
		}else if(browserName.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "D:/SeleniumSoftwares/Softwares/Selenium_Drivers/geckodriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
