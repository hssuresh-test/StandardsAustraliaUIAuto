package com.qa.stepDefinition;

import static org.testng.Assert.assertEquals;

import com.qa.pages.ConfirmPage;
import com.qa.pages.EnquireHomeLoansPage;
import com.qa.pages.HomeloanFormsPage;
import com.qa.pages.HomeloansPage;

//import org.testng.Assert;

import com.qa.pages.NABHomepage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class NABHomePageSteps extends TestBase{

	NABHomepage nabHomepg;
	HomeloansPage homeloanpg;
	EnquireHomeLoansPage enquireHomeloanpg;
	HomeloanFormsPage homeloanFormspg;
	ConfirmPage confirmpg;

@Given("^user opens browser$")
public void user_opens_browser_with_url() throws Throwable {
    TestBase.initialise();
}

@Then("^user is on Home page$")
public void user_is_on_Home_page() throws Throwable {
	nabHomepg= new NABHomepage();
    String title = nabHomepg.validateHomePageTitle();
    Assert.assertEquals("NAB Personal Banking - insurance, loans, accounts, credit cards - NAB", title);
}

@Then("^user navigates from Home page to HomeloansPage$")
public void user_navigates_from_Home_page_to_HomeloansPage() throws Throwable {
	homeloanpg = nabHomepg.Navigate(prop.getProperty("Parentmenu"), prop.getProperty("childmenu"));
	
}

@Then("^user traverses from HomeloansPage to EnquireHomeLoansPage$")
public void user_traverses_from_HomeloansPage_to_EnquireHomeLoansPage() throws Throwable {
	String homeloanpgtitle = homeloanpg.verifyHomeLoanPageTitle();
	Assert.assertEquals("Home loans - View our flexible home loan options and calculators - NAB", homeloanpgtitle);
	
	enquireHomeloanpg = homeloanpg.clickOnEnquireNewHomeLoan();	
}

@Then("^user selects HomeloansOption$")
public void user_selects_HomeloansOption() throws Throwable {
	String enquirehomeloanpgtitle = enquireHomeloanpg.verifyEnquireHomeLoansPageTitle();
	//Assert.assertEquals("Customer assistance directory | We’re here to help - NAB", enquirehomeloanpgtitle);
	enquireHomeloanpg.selectHomeandClickNext();	
}

@Then("^user provides homeloanEnquirer details in HomeloanFormsPage$")
public void user_provides_homeloanEnquirer_details_in_HomeloanFormsPage() throws Throwable {
	homeloanFormspg=new HomeloanFormsPage();
  //String homeloanFormspgtitle = homeloanFormspg.verifyHomeLoanFormsPageTitle();
  //  Assert.assertEquals("Consumer Call Centre Request Callback Form - NAB", homeloanFormspgtitle);
    homeloanFormspg.enterFormDetailsAndSubmit(prop.getProperty("firstName"),prop.getProperty("lastName"),prop.getProperty("state"),prop.getProperty("phoneNo"),prop.getProperty("email"));
	//homeloanFormspg.enterFormDetailsAndSubmit("john","Elliot","NSW","0400100801","abc1@outlook.com");
}

@Then("^user validates ConfirmationPage$")
public void user_validates_ConfirmationPage() throws Throwable {
	confirmpg=new ConfirmPage();
	String confirmpgtitle = confirmpg.verifyConfirmPageTitle();
	Assert.assertEquals("Consumer Call Centre Request Callback Form - NAB", confirmpgtitle);
	Thread.sleep(1000);
	driver.quit();
}


	
}
