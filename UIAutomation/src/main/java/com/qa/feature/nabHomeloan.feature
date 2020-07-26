Feature: NAB Home Loan enquire

Scenario: Validate User is able to enquire HomeLoan

	Given user opens browser
	Then user is on Home page
	Then user navigates from Home page to HomeloansPage
	Then user traverses from HomeloansPage to EnquireHomeLoansPage
	Then user selects HomeloansOption
	Then user provides homeloanEnquirer details in HomeloanFormsPage
	Then user validates ConfirmationPage
	