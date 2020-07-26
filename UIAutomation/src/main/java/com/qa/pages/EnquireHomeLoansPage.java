package com.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class EnquireHomeLoansPage extends TestBase{
	
	EnquireHomeLoansPage eHLP;
	//page factory: Object Repository
	
	//Customer assistance directory
	@FindBy(xpath="//h1[contains(text(),'Customer assistance directory')]")
	WebElement custAssistDirectory;
	
	
	//Initializing page objects
		public EnquireHomeLoansPage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyEnquireHomeLoansPageTitle() {
			return driver.getTitle();
		}
		
		public HomeloanFormsPage selectHomeandClickNext() throws Exception{
			eHLP= new EnquireHomeLoansPage();
			eHLP.selectHomeLoansOption();
			eHLP.clickOnNext();	
			return new HomeloanFormsPage();
		}
		
	//Returns webelement shadow root element method
		public WebElement expandRootElement(WebElement element) {
			WebElement ele = (WebElement) ((JavascriptExecutor) driver)
					.executeScript("return arguments[0].shadowRoot", element);
			return ele;
		}
		
		//Shadow DOM Root element identification	
		public void selectHomeLoansOption() {
			
			WebElement root1 = driver.findElement(By.xpath("//div[@id='contact-form-shadow-root']"));
			WebElement shadowRoot = expandRootElement(root1);
			
			WebElement reqdEletoClick = shadowRoot.findElement(By.id("myRadioButton-0"));
			reqdEletoClick.click();
		}
		
		public void clickOnNext() throws Exception {
			Thread.sleep(4000);
			WebElement root1 = driver.findElement(By.xpath("//div[@id='contact-form-shadow-root']"));
			WebElement shadowRoot = expandRootElement(root1);
			
			WebElement reqdButtontoClick = shadowRoot.findElement(By.cssSelector("button[data-component-id='Button']"));
			
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", reqdButtontoClick);
				Thread.sleep(5000);
				
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    driver.close();
			    driver.switchTo().window(tabs2.get(0));

				driver.get("https://www.nab.com.au/common/forms/consumer-call-centre-request-a-callback?enquiryProduct1=Home%20loan%20enquiries&homeLoanTopic=New%20home%20loans");

		}
		
	

}
