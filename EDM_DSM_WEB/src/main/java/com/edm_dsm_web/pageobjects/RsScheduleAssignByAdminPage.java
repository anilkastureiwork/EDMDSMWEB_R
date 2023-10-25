package com.edm_dsm_web.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edm_dsm_web.actiondriver.ActionDrivers;
import com.edm_dsm_web.base.BaseEDM;

import jdk.internal.org.jline.utils.Log;

public class RsScheduleAssignByAdminPage extends BaseEDM {
	ActionDrivers action = new ActionDrivers();
	Actions act = new Actions(getDriver());
//	*************Admin Login data Validation***************
	@FindBy(id = "drpProgramList")
	private WebElement selectedProgramDrop;
	@FindBy(xpath = "//*[@id=\"Menu1_uxRadMenu\"]/ul/li[2]/a/span")
	private WebElement evalutionDrop;
	@FindBy(xpath = "//span[normalize-space()='Request']")
	private WebElement evalutionDropRequest;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_ProjectUniqueID\"]")
	private WebElement evalIDSearch;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[2]")
	private WebElement customerName;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[3]")
	private WebElement customerPhone;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[6]")
	private WebElement customerUtility;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[7]")
	private WebElement customerAddress;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[8]")
	private WebElement customerCity;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[9]")
	private WebElement customerState;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[10]")
	private WebElement customerZip;
	@FindBy(xpath = "(//span[@class='rmText'][normalize-space()='In Process'])[1]")
	private WebElement evalutionDropProgress;
	@FindBy(xpath = "(//span[@class='rmText'][normalize-space()='Scheduled'])[1]")
	private WebElement evalutionDropscheduled;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00_ctl04_uxAction\"]")
	private WebElement sheduleNow;
	@FindBy(id = "ctl00_Work_drpSchedulingType")
	private WebElement schedulingTypeDrp;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_btnAcctVal\"]")
	private WebElement scheduleNowContinueBtn;
	// ************* General Home Information Fields*******************
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtLPCAccntNo")
	private WebElement ghiAccount;
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtMeterNum")
	private WebElement ghiMeter;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbHomeType")
	private WebElement ghiHomeType;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbOwn")
	private WebElement ghiDoYouOwnIt;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbRentalProp")
	private WebElement ghiIsThisRentalProperty;
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtYearBuilt")
	private WebElement ghiYeareBuilt;
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtSqFt")
	private WebElement ghiSqrFootage;
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtNoOfOccupants")
	private WebElement ghiNoofOccupants;
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtNoOfBedRooms")
	private WebElement ghiNoOfBedrooms;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbFoundation")
	private WebElement ghiFoundation;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbOrientation")
	private WebElement ghiOrientation;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbHeatingType")
	private WebElement ghiPrimaryHeatingType;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbHeatingType2")
	private WebElement ghiTypeOfHeating;
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtNoOfHVACUnits")
	private WebElement ghiNoOfHVACUnits;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbWaterheatingType")
	private WebElement ghiWaterHeatingType;
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtNoOfWaterHeaters")
	private WebElement ghiNoOfWaterHeaters;
	@FindBy(id = "ctl00_Work_objHOAddressGI_txtNoOfRefrigerators")
	private WebElement ghiNoOfRefrigerators;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbProgThermoStat")
	private WebElement ghiDoYouHaveProgThermoStat;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbInternet")
	private WebElement ghiDoYouHaveInternetAccess;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmbWiFi")
	private WebElement ghiIsInternetWIFIEnabled;
	@FindBy(id = "ctl00_Work_objHOAddressGI_cmdBuySelling")
	private WebElement ghiBuySellingHome;
	@FindBy(id = "ctl00_Work_btnContinue")
	private WebElement ghiContinueBtn;
	@FindBy(id = "ctl00_Work_objHOAddressGI_chkCOBox")
	private WebElement ghiCheckBox;
	// ******************Schedule and Assigning********************************
	@FindBy(id = "ctl00_Work_uxClose")
	private WebElement callLogCloseBtn;
	@FindBy(id = "ctl00_Work_btnAssignAdv")
	private WebElement assignBtn;
	@FindBy(id = "ctl00_Work_uxAdvisorList")
	private WebElement assignSelectAdvisor;
	@FindBy(id = "ctl00_Work_uxAppointmentDate_dateInput")
	private WebElement assignAppoinmentDate;
	@FindBy(id = "ctl00_Work_uxAppointmentTime_dateInput")
	private WebElement assignAppoinmentTime;
	@FindBy(id = "ctl00_Work_chkovertime")
	private WebElement assignIncludeOverTimeHours;
	@FindBy(id = "ctl00_Work_chkNotifyCustomer")
	private WebElement assignDoNotNotifyCustomer;
	@FindBy(id = "ctl00_Work_uxSave")
	private WebElement assignSaveBtn;
	@FindBy(id = "ctl00_Work_uxPayMeth")
	private WebElement assignPaymentMethod;
	@FindBy(id = "ctl00_Work_uxContinue_input")
	private WebElement assignContinueBtn;
	@FindBy(id = "ctl00_Work_uxPrjInfo_cmbRefAppointmentType")
	private WebElement assignAppointmentType;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxPrjInfo_uxAppointmentType\"]")
	private WebElement assigAppointmentSaveBtn;
	@FindBy(id = "ctl00_Work_uxClose")
	private WebElement assignAppointmentCloseBtn;
	@FindBy(xpath = "//button[normalize-space()='Ok']")
	private WebElement assignCalllogDialogOk;

	public RsScheduleAssignByAdminPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void rsRegistredCustomerSelecting(String selectedProgarm, String evalID) throws InterruptedException {
		action.JSClick(getDriver(), selectedProgramDrop);
		action.selectByVisibleText(selectedProgarm, selectedProgramDrop);
		action.explicitWait(getDriver(), evalutionDrop);
		action.mouseover(getDriver(), evalutionDrop);
		action.explicitWait(getDriver(), evalutionDropRequest);
		action.JSClick(getDriver(), evalutionDropRequest);
		action.switchToFrameByIndex(getDriver(), 0);
		action.type(evalIDSearch, evalID);
		getDriver()
				.findElement(
						By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_ProjectUniqueID\"]"))
				.sendKeys(Keys.ENTER);

	}

	public void rsScheduledCustomerDataValidation(String selectedProgarm, String evalID) throws InterruptedException {
		action.JSClick(getDriver(), selectedProgramDrop);
		action.selectByVisibleText(selectedProgarm, selectedProgramDrop);
		action.explicitWait(getDriver(), evalutionDrop);
		action.mouseover(getDriver(), evalutionDrop);
		action.explicitWait(getDriver(), evalutionDropscheduled);
		action.JSClick(getDriver(), evalutionDropscheduled);
		action.switchToFrameByIndex(getDriver(), 0);
		action.type(evalIDSearch, evalID);
		getDriver()
				.findElement(
						By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_ProjectUniqueID\"]"))
				.sendKeys(Keys.ENTER);

	}

	public void rsRegisterdCustomerGeneralHomeInformation(String account, String meter, String homeType,
			String doYouOwn, String rentalproperty, String yearBuilt, String sqrFootage, String occupants,
			String bedrooms, String foundation, String orientation, String primaryHeatingType, String typeOfHeating,
			String HVACUnits, String waterHeatingType, String waterHeaters, String refrigerators, String progThermoStat,
			String internetAccess, String WIFIEnabled, String buySellingHome) throws InterruptedException {
		action.click(getDriver(), sheduleNow);
		action.switchToFrameByName(getDriver(), "RadpaneWork");
		try {
			action.selectByVisibleText("Manual", schedulingTypeDrp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		action.click(getDriver(), scheduleNowContinueBtn);
		action.type(ghiAccount, account);
		action.type(ghiMeter, meter);
		action.selectByVisibleText(homeType, ghiHomeType);
		action.selectByVisibleText(doYouOwn, ghiDoYouOwnIt);
		action.selectByVisibleText(rentalproperty, ghiIsThisRentalProperty);
		action.type(ghiYeareBuilt, yearBuilt);
		action.type(ghiSqrFootage, sqrFootage);
		action.type(ghiNoofOccupants, occupants);
		action.type(ghiNoOfBedrooms, bedrooms);
		action.selectByVisibleText(foundation, ghiFoundation);
		action.selectByVisibleText(orientation, ghiOrientation);
		action.selectByVisibleText(primaryHeatingType, ghiPrimaryHeatingType);
		action.selectByVisibleText(typeOfHeating, ghiTypeOfHeating);
		action.type(ghiNoOfHVACUnits, HVACUnits);
		action.selectByVisibleText(waterHeatingType, ghiWaterHeatingType);
		action.type(ghiNoOfWaterHeaters, waterHeaters);
		action.type(ghiNoOfRefrigerators, refrigerators);
		action.selectByVisibleText(progThermoStat, ghiDoYouHaveProgThermoStat);
		action.selectByVisibleText(internetAccess, ghiDoYouHaveInternetAccess);
		action.selectByVisibleText(WIFIEnabled, ghiIsInternetWIFIEnabled);
		action.selectByVisibleText(buySellingHome, ghiBuySellingHome);
//		String chek = getDriver().findElement(By.id("ctl00_Work_objHOAddressGI_chkCOBox")).getAttribute("checked");
//		if (chek.matches("true")) {
//			action.click(getDriver(), ghiCheckBox);
//		}
		action.click(getDriver(), ghiCheckBox);
		action.click(getDriver(), ghiContinueBtn);
	}

	public void rsRegisterdCustomerScheduleAssign(String selectAdvisor, String paymentMethod, String appointmentType,
			String date, String time) throws InterruptedException {
//		action.JSClick(getDriver(), callLogCloseBtn);
//		getDriver().findElement(By.xpath("//button[normalize-space()='Ok']")).sendKeys(Keys.ENTER);
		action.click(getDriver(), assignBtn);
		action.switchToFrameByName(getDriver(), "eScoreDialog4");
		action.selectByVisibleText(selectAdvisor, assignSelectAdvisor);
		action.type(assignAppoinmentDate, date);
		action.type(assignAppoinmentTime, time);
		action.click(getDriver(), assignIncludeOverTimeHours);
		action.click(getDriver(), assignDoNotNotifyCustomer);
		action.click(getDriver(), assignSaveBtn);
		Thread.sleep(5000);
//	action.switchToFrameById(getDriver(),"dialog-confirm");
		action.JSClick(getDriver(), assignCalllogDialogOk);
		Thread.sleep(2000);
//		Alert alert = getDriver().switchTo().alert();
//
//		String alertText = alert.getText();
//
//		System.out.println("Alert text: " + alertText);
//
//		alert.accept();
		action.switchToFrameByName(getDriver(), "RadpaneWork");
		action.selectByValue(assignPaymentMethod, paymentMethod);
		action.click(getDriver(), assignContinueBtn);
		action.selectByVisibleText(appointmentType, assignAppointmentType);
		action.click(getDriver(), assigAppointmentSaveBtn);
		action.click(getDriver(), assignAppointmentCloseBtn);

	}

//	public boolean rsscheduleValidation(WebDriver driver) throws Throwable {
//		boolean rsschedule = action.isDisplayed(driver, paymentmethoddropdown);
//		return rsschedule;
//	}
//	public boolean rspaymentValidation(WebDriver driver) {
//		boolean rspaymentvalidation=action.isDisplayed(driver, yourappoinmentissettext);
//		return rspaymentvalidation;
//	}

}
