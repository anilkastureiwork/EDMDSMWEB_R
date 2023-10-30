package com.edm_dsm_web.testcases;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.edm_dsm_web.base.BaseEDM;
import com.edm_dsm_web.dataprovider.DataProviderEDM;
import com.edm_dsm_web.pageobjects.AdminAccountLoginPage;
import com.edm_dsm_web.pageobjects.RsCustomerRegistrationSteps;
import com.edm_dsm_web.pageobjects.RsScheduleAssignByAdminPage;
import com.edm_dsm_web.pageobjects.RsScheduleByCustomer;
import com.edm_dsm_web.utility.Log;
import com.edm_dsm_web.utility.NewWriteToExcelLibrary;

public class RSRegistrationScheduleAssignByCustomerTest extends BaseEDM {
	private RsCustomerRegistrationSteps rsreg;
	private RsScheduleByCustomer rssched;
	private AdminAccountLoginPage adminlogin;
	private RsScheduleAssignByAdminPage rsScheduleAssignByAdmin;
	private NewWriteToExcelLibrary newWriteToExcel;

	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void setup(String browser) throws InterruptedException {
		launchApp(browser);
		// getDriver().get(prop.getProperty("rs_url"));
		// Thread.sleep(3000);
	}

	@AfterMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void tearDown() {
		getDriver().quit();
	}

//	@Test(priority = 1, groups = { "Smoke", "Sanity" })
//	public void nullDataValidationRsRegistrationStep1Case() throws Throwable {
//		getDriver().get(prop.getProperty("dev_customer_url"));
//		Log.startTestCase("RsRegistrationtest Test");
//		Log.info("nullDataValidationRsRegistrationStep1");
//		rsreg = new RsCustomerRegistrationSteps();
//		rsreg.nullDataValidationRsRegistrationStep1();
//		Assert.assertTrue(rsreg.nullDataAddressValidationMsgRsRegistrationStep1(getDriver()));
//		Log.endTestCase("RsRegistrationtest Test");
//	}
//
//	@Test(priority = 2, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Customer", dataProviderClass = DataProviderEDM.class)
//	public void addressValidationRsRegistrationStep1Case(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_customer_url"));
//		Log.startTestCase("RsRegistrationtest Test");
//		Log.info("addressValidationRsRegistrationStep1");
//		rsreg = new RsCustomerRegistrationSteps();
//		rsreg.addressValidationRsRegistrationStep1(hashMapValue.get("HomeAddress"));
//		Assert.assertTrue(rsreg.addressValidationMsgRsRegistrationStep1(getDriver()));
//		Log.endTestCase("RsRegistrationtest Test");
//	}
//
//	@Test(priority = 3, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Customer", dataProviderClass = DataProviderEDM.class)
//	public void rsRegistrationStep1CompleteCase(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_customer_url"));
//		Log.startTestCase("rsRegistrationStep1Complete");
//		rsreg = new RsCustomerRegistrationSteps();
//		rsreg.RsRegistrationStep1Complete(hashMapValue.get("HomeAddress"), hashMapValue.get("CompanyName"));
//		Assert.assertTrue(rsreg.rsRegistrationStep1CompleteValidation(getDriver()));
//		Log.endTestCase("rsRegistrationStep1Complete");
//	}

//	********************Use for complete registration************************************************************
//	@Test(priority = 4, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Customer", dataProviderClass = DataProviderEDM.class)
//	public void rsRegistrationCompleteCase(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_customer_url"));
//		Log.startTestCase("rsRegistrationtest Test");
//		rsreg = new RsCustomerRegistrationSteps();
//		rsreg.RsRegistrationStep1_Step2Complete(hashMapValue.get("HomeAddress"), hashMapValue.get("CompanyName"),
//				hashMapValue.get("FirstName"), hashMapValue.get("LastName"), hashMapValue.get("PhoneNo"),
//				hashMapValue.get("Email"));
//		String evalid = getDriver().findElement(By.xpath("//span[@style=\"font-weight:600\"]")).getText();
//		newWriteToExcel = new NewWriteToExcelLibrary();
//		newWriteToExcel.setValuesInCustomer(1, 24, evalid);
//		Assert.assertTrue(rsreg.rsRegistrationValidation(getDriver()));
//		Log.endTestCase("rsRegistrationtest Test");
//	}
//*********************************Double scheduling creating Aoid****************************************************
//	@Test(priority = 5, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Customer", dataProviderClass = DataProviderEDM.class)
//	public void rsRegistrationSchedulingCase(HashMap<String, String> hashMapValue) throws Throwable {
//		Log.startTestCase("rsRegistrationSchedulingCase");
//		rsreg = new RsCustomerRegistrationSteps();
//		rsreg.RsRegistrationStep2Complete(hashMapValue.get("HomeAddress"), hashMapValue.get("CompanyName"),
//				hashMapValue.get("FirstName"), hashMapValue.get("LastName"), hashMapValue.get("PhoneNo"),
//				hashMapValue.get("Email"));
//		rssched = new RsScheduleByCustomer();
//		rssched.rsSchedule(hashMapValue.get("OwnerSelect"), hashMapValue.get("RentalPSelect"),
//				hashMapValue.get("SqFoot"));
//		rssched.rsScheduleInPerson(hashMapValue.get("FromDate"), hashMapValue.get("ToDate"));
//		Assert.assertTrue(rssched.rsscheduleValidation(getDriver()));
//		Log.endTestCase("rsRegistrationSchedulingCase");
//	}

	@Test(priority = 6, groups = { "Smoke",
			"Sanity" }, dataProvider = "RS_Registration_Customer", dataProviderClass = DataProviderEDM.class)
	public void rsRegistrationCompleteInPersonPaymentCase(HashMap<String, String> hashMapValue) throws Throwable {
		getDriver().get(prop.getProperty("dev_customer_url"));
		Log.startTestCase("rsRegistrationCompleteInPersonPayment");
		rsreg = new RsCustomerRegistrationSteps();
		rsreg.RsRegistrationStep1_Step2Complete(hashMapValue.get("HomeAddress"), hashMapValue.get("CompanyName"),
				hashMapValue.get("FirstName"), hashMapValue.get("LastName"), hashMapValue.get("PhoneNo"),
				hashMapValue.get("Email"));
		String evalid = getDriver().findElement(By.xpath("//span[@style=\"font-weight:600\"]")).getText();
		newWriteToExcel = new NewWriteToExcelLibrary();
		newWriteToExcel.setValuesInCustomer(1, 24, evalid);
		System.out.println(evalid);
		rssched = new RsScheduleByCustomer();
		rssched.rsSchedule(hashMapValue.get("OwnerSelect"), hashMapValue.get("RentalPSelect"),
				hashMapValue.get("SqFoot"));
//		rssched.rsNewScheduleInPersonAppoinment(hashMapValue.get("Month"), hashMapValue.get("Date"), hashMapValue.get("Time"));
		rssched.rsNewScheduleVirtualAppoinment(hashMapValue.get("Month"), hashMapValue.get("Date"), hashMapValue.get("Time"));
		rssched.rsPayment(hashMapValue.get("PaymentMethod"), hashMapValue.get("CreditcardNumber"),
				hashMapValue.get("CVV"), hashMapValue.get("ExpiryMonth"), hashMapValue.get("ExpiryYeare"),
				hashMapValue.get("NameOnCreditCard"), hashMapValue.get("BillingAddress"), hashMapValue.get("City"),
				hashMapValue.get("State"), hashMapValue.get("ZipCode"));
		Assert.assertTrue(rssched.rspaymentValidation(getDriver()));
		Log.endTestCase("rsRegistrationCompleteInPersonPayment");
	}

//	@Test(priority = 7, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Customer", dataProviderClass = DataProviderEDM.class)
//	public void rsRegistred_ScheduledCustomerDataValidationCase(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_admin_url"));
//		Log.startTestCase("rsRegistredCustomerDataValidationCase");
//		adminlogin = new AdminAccountLoginPage();
//		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
//		rsScheduleAssignByAdmin = new RsScheduleAssignByAdminPage();
//		rsScheduleAssignByAdmin.rsScheduledCustomerDataValidation(hashMapValue.get("SelectedProgram"),
//				hashMapValue.get("EvalID"));
//		String appname = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[2]"))
//				.getText();
//		String apputility = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[6]"))
//				.getText();
//		String appphone = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[3]"))
//				.getText();// replaceAll("-","" );
//		String appaddress = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[7]"))
//				.getText();
//		String siteid = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[5]")).getText();
//		newWriteToExcel = new NewWriteToExcelLibrary();
//		newWriteToExcel.setValuesInCustomer(1, 25, siteid);
//		assertEquals(appname, (hashMapValue.get("FirstName") + " " + hashMapValue.get("LastName")));
//		assertEquals(apputility, hashMapValue.get("CompanyName"));
//		assertEquals(appphone, hashMapValue.get("PhoneNo"));
//		assertEquals(appaddress, hashMapValue.get("HomeAddress").substring(0, 16));
//		Log.endTestCase("rsRegistredCustomerDataValidationCase");
//	}
}
