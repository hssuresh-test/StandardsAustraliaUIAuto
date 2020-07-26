package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class NABHomepage extends TestBase {
	
	
	//page factory: Object Repository
	@FindBy(xpath="//a[@id='quick-login']")
	WebElement loginBtn;
	
	//nab logo
	@FindBy(xpath="//a[@id='logo']")
	WebElement nabLogo;
	
	//Parentmenu webelement
	@FindBy(xpath="//a[@class='menu-trigger'][contains(text(),'Personal')]")
	WebElement tabPersonal;
	
	//childmenu webelement
	@FindBy(xpath="//a[contains(@href,'/personal/home-loans?')]")
	WebElement menuHomeloans;
	
	//Initialize the page objects
	public NABHomepage() {
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateNABHomepage() {
		return nabLogo.isDisplayed();
	}
	
	public HomeloansPage Navigate(String parentmenu, String childmenu) {
		
		driver.get("https://www.nab.com.au/personal/home-loans?own_cid=20029-1");
		return new HomeloansPage();
	}
}
