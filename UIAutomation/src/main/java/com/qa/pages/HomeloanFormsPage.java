package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class HomeloanFormsPage extends TestBase {
	
	
	//page factory: Object Repository
		
		//validation of Call Center call back form
		@FindBy(xpath="//h1[@id='Page1']")
		WebElement callBackForm;
		
		
		//consider option as yes or no
		@FindBy(xpath="//span[contains(text(),'No')]")
		WebElement optionYesNo;
		
		
		//enter firstName
		@FindBy(xpath="//input[@id='field-page-Page1-aboutYou-firstName']")
		WebElement enterFirstName;
		
		
		//enter lastName
		@FindBy(xpath="//input[@id='field-page-Page1-aboutYou-lastName']")
		WebElement enterLastName;
		
		
		//enter Phone Number
		@FindBy(xpath="//input[@id='field-page-Page1-aboutYou-phoneNumber']")
		WebElement phoneNumber;
		
		
		//enter email id 
		@FindBy(xpath="//input[@id='field-page-Page1-aboutYou-email']")
		WebElement emailId;
		
		
		//Initializing page objects
		public HomeloanFormsPage() {
			PageFactory.initElements(driver, this);
		}

		public String verifyHomeLoanFormsPageTitle() {
			return driver.getTitle();
		}
		
		public boolean verifyHomeLoanFormsPageConfirm() {
			return callBackForm.isDisplayed();
		}
		
		public ConfirmPage enterFormDetailsAndSubmit(String firstName, String lastName, String state, String phoneNo, String email) throws InterruptedException {
			
			optionYesNo.click();
			enterFirstName.sendKeys(firstName);
			enterLastName.sendKeys(lastName);
			enterLastName.sendKeys(Keys.TAB);
			
			
			Thread.sleep(1000);			
			driver.findElement(By.id("page-Page1-aboutYou-state")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("field-page-Page1-aboutYou-state")).sendKeys(Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.id("field-page-Page1-aboutYou-state")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			phoneNumber.sendKeys(phoneNo);
			Thread.sleep(1000);
			emailId.sendKeys(email);
			Thread.sleep(1000);
			emailId.sendKeys(Keys.TAB);
			Thread.sleep(1000);	
			driver.findElement(By.id("page-Page1-btnGroup-submitBtn")).sendKeys(Keys.ENTER);
			return new ConfirmPage();
		}		
}
