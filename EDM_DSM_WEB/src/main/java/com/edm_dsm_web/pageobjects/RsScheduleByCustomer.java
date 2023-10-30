package com.edm_dsm_web.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edm_dsm_web.actiondriver.ActionDrivers;
import com.edm_dsm_web.base.BaseEDM;

import jdk.internal.org.jline.utils.Log;

public class RsScheduleByCustomer extends BaseEDM {
	ActionDrivers action = new ActionDrivers();
	@FindBy(xpath = "//a[normalize-space()='Schedule now']")
	private WebElement schedulenow;
	@FindBy(id = "ownitselect")
	private WebElement areyouownerofthehome;
	@FindBy(id = "rentalpropertyselect")
	private WebElement rentalpropertyselect;
	@FindBy(id = "sqfootinput")
	private WebElement approxsquarefootage;
	@FindBy(id = "Continue")
	private WebElement rsschedulecontinuebtn;
	@FindBy(id = "AllAreas")
	private WebElement allareaofmyhome;
	@FindBy(id = "Continue")
	private WebElement rsschedulecontinuebtn1;
	@FindBy(xpath = "//button[normalize-space()='Schedule in-person appointment']")
	private WebElement scheduleinpersonappoinment;
	@FindBy(xpath = "//button[normalize-space()='Schedule virtual appointment']")
	private WebElement schedulevirtualappoinment;
	@FindBy(xpath = "//input[@value='FromDate']")
	private WebElement appointmentfromdate;
	@FindBy(id = "txtToDate")
	private WebElement appointmenttodate;
	@FindBy(xpath = "//input[@name='Refresh']")
	private WebElement appointmentrefreshbtn;
	@FindBy(xpath = "//tbody/tr[3]/td[3]/a[1]")
	private WebElement appoinmenttimeselect;
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement confirmscheduleokbtn;
	@FindBy(id = "drpPaymentMehodList")
	private WebElement paymentmethoddropdown;
	@FindBy(id = "inputNumber")
	private WebElement creditcardnumber;
	@FindBy(id = "inputCVV")
	private WebElement cvv;
	@FindBy(id = "drpExpMonthList")
	private WebElement expirymonthdropdown;
	@FindBy(id = "drpExpYearList")
	private WebElement expiryyeardropdown;
	@FindBy(id = "inputPaymentName")
	private WebElement nameoncreditcard;
	@FindBy(id = "inputAddress1")
	private WebElement billingaddress;
	@FindBy(id = "inputCity")
	private WebElement city;
	@FindBy(id = "drpState")
	private WebElement statedropdown;
	@FindBy(id = "inputZip")
	private WebElement zipcode;
	@FindBy(id = "btnContinue1")
	private WebElement paymentcontinue;
	@FindBy(xpath = "//a[@class='k-button k-title']")
	private WebElement clickOnCalenderMonth;
	@FindBy(id = "btnconfirm")
	private WebElement scheduleConfirmBtn;
	@FindBy(xpath = "//h2[normalize-space()='Your appointment is set!']")
	private WebElement yourappoinmentissettext;


	public RsScheduleByCustomer() {
		PageFactory.initElements(getDriver(), this);
	}

	public void rsSchedule(String select, String select1, String sqfoot) throws InterruptedException {
		action.moveToElement(getDriver(), schedulenow);
		action.JSClick(getDriver(), schedulenow);
		Thread.sleep(2000);
		action.click(getDriver(), areyouownerofthehome);
		action.selectByVisibleText(select, areyouownerofthehome);
		action.click(getDriver(), rentalpropertyselect);
		action.selectByVisibleText(select1, rentalpropertyselect);
		action.type(approxsquarefootage, sqfoot);
		action.JSClick(getDriver(), rsschedulecontinuebtn);
		action.click(getDriver(), allareaofmyhome);
		action.JSClick(getDriver(), rsschedulecontinuebtn1);

	}

	public void rsScheduleInPerson(String fromdate, String todate) {
		action.JSClick(getDriver(), scheduleinpersonappoinment);
//		action.moveToElement(getDriver(), appointmentfromdate);
//		action.JSClick(getDriver(), appointmentfromdate);
//		action.selectByValue(appointmentfromdate, fromdate);
//		action.moveToElement(getDriver(), appointmenttodate);
//		action.JSClick(getDriver(), appointmenttodate);
//		action.selectByValue(appointmenttodate,todate);
//		action.fluentWait(getDriver(), appointmentrefreshbtn);
		action.click(getDriver(), appointmentrefreshbtn);
		action.JSClick(getDriver(), appoinmenttimeselect);
		action.switchToFrameByIndex(getDriver(), 0);
		action.click(getDriver(), confirmscheduleokbtn);

	}

	public void rsNewScheduleInPersonAppoinment(String month, String date, String time) throws InterruptedException {
		action.JSClick(getDriver(), scheduleinpersonappoinment);
		Thread.sleep(15000);
		action.explicitWait(getDriver(), clickOnCalenderMonth);
		action.click(getDriver(), clickOnCalenderMonth);
		Thread.sleep(3000);
		List<WebElement> calenderMonth = getDriver().findElements(By.className("k-link"));
		for (WebElement elem : calenderMonth)
//			System.out.println("Element text:" + elem.getText());
			if (elem.getText().contains(month)) {
				
				elem.click();
			}
		Thread.sleep(3000);
		List<WebElement> calenderDate = getDriver().findElements(By.className("k-link"));
		for (WebElement elem : calenderDate)
			if (elem.getText().contains(date)) {
				elem.click();
			}
		Thread.sleep(5000);
		List<WebElement> calenderTime = getDriver().findElements(By.className("divClass"));
		for (WebElement elem : calenderTime)
			if (elem.getText().contains(time)) {
				elem.click();
			}
		action.explicitWait(getDriver(), scheduleConfirmBtn);
		action.JSClick(getDriver(), scheduleConfirmBtn);
		Thread.sleep(10000);
	}
	public void rsNewScheduleVirtualAppoinment(String month, String date, String time) throws InterruptedException {
		action.JSClick(getDriver(), schedulevirtualappoinment);
		Thread.sleep(15000);
		action.explicitWait(getDriver(), clickOnCalenderMonth);
		action.click(getDriver(), clickOnCalenderMonth);
		Thread.sleep(3000);
		List<WebElement> calenderMonth = getDriver().findElements(By.className("k-link"));
		for (WebElement elem : calenderMonth)
			if (elem.getText().contains(month)) {
				
				elem.click();
			}
		Thread.sleep(3000);
		List<WebElement> calenderDate = getDriver().findElements(By.className("k-link"));
		for (WebElement elem : calenderDate)
			if (elem.getText().contains(date)) {
				elem.click();
			}
		Thread.sleep(5000);
		List<WebElement> calenderTime = getDriver().findElements(By.className("divClass"));
		for (WebElement elem : calenderTime)
			if (elem.getText().contains(time)) {
				elem.click();
			}
		action.explicitWait(getDriver(), scheduleConfirmBtn);
		action.JSClick(getDriver(), scheduleConfirmBtn);
		Thread.sleep(10000);
	}
	public void rsPayment(String paymentmethod, String crditnum, String cvvnum, String expirymonth, String expiryyeare,
			String namecredit, String billaddress, String billcity, String billstate, String billzipcode)
			throws InterruptedException {
		action.explicitWait(getDriver(), paymentmethoddropdown);
		action.click(getDriver(), paymentmethoddropdown);
		action.selectByVisibleText(paymentmethod, paymentmethoddropdown);
		action.type(creditcardnumber, crditnum);
		action.type(cvv, cvvnum);
		action.click(getDriver(), expirymonthdropdown);
		action.selectByVisibleText(expirymonth, expirymonthdropdown);
		action.click(getDriver(), expiryyeardropdown);
		action.selectByValue(expiryyeardropdown, expiryyeare);
		action.type(nameoncreditcard, namecredit);
		action.type(billingaddress, billaddress);
		action.type(city, billcity);
		action.JSClick(getDriver(), statedropdown);
		action.selectByVisibleText(billstate, statedropdown);
		action.type(zipcode, billzipcode);
		action.moveToElement(getDriver(), paymentcontinue);
		action.JSClick(getDriver(), paymentcontinue);

	}

	public boolean rsscheduleValidation(WebDriver driver) throws Throwable {
		boolean rsschedule = action.isDisplayed(driver, paymentmethoddropdown);
		return rsschedule;
	}

	public boolean rspaymentValidation(WebDriver driver) {
		boolean rspaymentvalidation = action.isDisplayed(driver, yourappoinmentissettext);
		return rspaymentvalidation;
	}

}
