package com.edm_dsm_web.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edm_dsm_web.actiondriver.ActionDrivers;
import com.edm_dsm_web.base.BaseEDM;

import jdk.internal.org.jline.utils.Log;

public class RsCustomerRegistrationSteps extends BaseEDM {
	ActionDrivers action = new ActionDrivers();
	Actions act = new Actions(getDriver());
	@FindBy(id = "txtAddress1")
	private WebElement rswhatisyourhomeaddress;
	@FindBy(xpath = "//label[@class='col-form-label font-weight-nb']//following::input[2]")
	private WebElement rsbtnContinue;
	@FindBy(id = "ValidAddressVerify")
	private WebElement rsValidAddressVerify;
	@FindBy(xpath = "(//span[@class='smarty-tag-check'])[1]")
	private WebElement rssmartytagchecky;
	@FindBy(id = "ddlLPC")
	private WebElement selectlocalpowercompany;
	@FindBy(id = "btnSubmit")
	private WebElement rsbtnContinue1;
	@FindBy(id = "firstname")
	private WebElement rsstep2firstname;
	@FindBy(id = "lastname")
	private WebElement rsstep2lastname;
	@FindBy(id = "phoneno")
	private WebElement rsstep2phoneno;
	@FindBy(id = "email")
	private WebElement rsstep2email;
	@FindBy(id = "Check1")
	private WebElement rsstep2check1sms;
	@FindBy(id = "Check2")
	private WebElement rsstep2check1promo;
	@FindBy(id = "btnCreateAccount")
	private WebElement rsbtnContinue2;
	@FindBy(xpath = "//h2[normalize-space()='Appointment request received']")
	private WebElement appoinmentrequestreceived;

	public RsCustomerRegistrationSteps() {
		PageFactory.initElements(getDriver(), this);
	}

	public void nullDataValidationRsRegistrationStep1() {
		action.click(getDriver(), rsbtnContinue);

	}

	public void addressValidationRsRegistrationStep1(String homeaddress) {
		action.type(rswhatisyourhomeaddress, homeaddress);
		action.click(getDriver(), rssmartytagchecky);

	}

	public void RsRegistrationStep1Complete(String homeaddress, String companyname) throws InterruptedException {
		action.type(rswhatisyourhomeaddress, homeaddress);
		action.JSClick(getDriver(), rssmartytagchecky);
		Thread.sleep(3000);
		action.explicitWait(getDriver(), rsbtnContinue);
		action.click(getDriver(), rsbtnContinue);
		action.click(getDriver(), selectlocalpowercompany);
		action.selectByVisibleText(companyname, selectlocalpowercompany);
		action.explicitWait(getDriver(), rsbtnContinue1);
		action.click(getDriver(), rsbtnContinue1);
		// act.moveToElement(rsbtnContinue).doubleClick().build().perform();

	}

	public void RsRegistrationStep1_Step2Complete(String homeaddress, String companyname, String firstname, String lasttname,
			String phoneno, String email) throws InterruptedException {
		action.type(rswhatisyourhomeaddress, homeaddress);
		action.JSClick(getDriver(), rssmartytagchecky);
		Thread.sleep(3000);
		action.explicitWait(getDriver(), rsbtnContinue);
		action.click(getDriver(), rsbtnContinue);
		action.click(getDriver(), selectlocalpowercompany);
		action.selectByVisibleText(companyname, selectlocalpowercompany);
		action.explicitWait(getDriver(), rsbtnContinue1);
		action.click(getDriver(), rsbtnContinue1);
		action.type(rsstep2firstname, firstname);
		action.type(rsstep2lastname, lasttname);
		action.type(rsstep2phoneno, phoneno);
		action.type(rsstep2email, email);
		action.click(getDriver(), rsstep2check1sms);
		action.click(getDriver(), rsstep2check1promo);
		action.moveToElement(getDriver(), rsbtnContinue2);
		action.JSClick(getDriver(), rsbtnContinue2);
		Thread.sleep(2000);

	}

	public boolean nullDataAddressValidationMsgRsRegistrationStep1(WebDriver driver) throws Throwable {
		boolean nullDataValidation = action.isDisplayed(driver, rsValidAddressVerify);
		return nullDataValidation;
	}

	public boolean addressValidationMsgRsRegistrationStep1(WebDriver driver) throws Throwable {
		boolean addressValidation = action.isDisplayed(driver, rssmartytagchecky);
		return addressValidation;
	}

	public boolean rsRegistrationStep1CompleteValidation(WebDriver driver) throws Throwable {
		boolean rsRegistrationStep1 = action.isDisplayed(driver, rsstep2firstname);
		return rsRegistrationStep1;
	}

	public boolean rsRegistrationValidation(WebDriver driver) throws Throwable {
		boolean rsRegistrationValidation = action.isDisplayed(driver, appoinmentrequestreceived);
		return rsRegistrationValidation;
	}

}
