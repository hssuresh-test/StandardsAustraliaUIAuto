package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomeloansPage extends TestBase{

	
	//page factory: Object Repository
	//home loan page navigate confirm
	@FindBy(xpath="//div[@class='nabrwd-banner hidden-xs']//h1[@id='main-content']")
	WebElement homeloanpageConfirm;
	
	//EnquireHomeloanLink availability check
	@FindBy(xpath="//div[@class='nabrwd-banner hidden-xs']//p[contains(text(),'Enquire about a new loan')]")
	WebElement EnquireHomeloanLink;
	
	//Initializing page objects
	public HomeloansPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomeLoanPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyHomeLoanPageConfirm() {
		return homeloanpageConfirm.isDisplayed();
	}
	
	public EnquireHomeLoansPage clickOnEnquireNewHomeLoan() {
		EnquireHomeloanLink.click();		
		return new EnquireHomeLoansPage();
	}
}
