package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ConfirmPage extends TestBase{
	
	//validation of Call Center call back form
			@FindBy(xpath="//h1[contains(text(),\"WE'VE RECEIVED YOUR REQUEST\")]")
			WebElement confirmRequest;
			
			public ConfirmPage(){
				PageFactory.initElements(driver, this);
			}
			
			public String verifyConfirmPageTitle() {
				return driver.getTitle();
			}

}
