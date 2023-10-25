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

public class RSRegistration_ScheduleAssignByAdminTest extends BaseEDM {
	private RsCustomerRegistrationSteps rsreg;
	private RsScheduleByCustomer rssched;
	private AdminAccountLoginPage adminlogin;
	private RsScheduleAssignByAdminPage rsScheduleAssignByAdmin;
	private NewWriteToExcelLibrary newWriteToExcelLibrary;

	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void setup(String browser) throws InterruptedException {
		launchApp(browser);

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
//		rsreg = new RsRegistrationSteps();
//		rsreg.nullDataValidationRsRegistrationStep1();
//		Assert.assertTrue(rsreg.nullDataAddressValidationMsgRsRegistrationStep1(getDriver()));
//		Log.endTestCase("RsRegistrationtest Test");
//	}
//
//	@Test(priority = 2, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Admin", dataProviderClass = DataProviderEDM.class)
//	public void addressValidationRsRegistrationStep1Case(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_customer_url"));
//		Log.startTestCase("RsRegistrationtest Test");
//		Log.info("addressValidationRsRegistrationStep1");
//		rsreg = new RsRegistrationSteps();
//		rsreg.addressValidationRsRegistrationStep1(hashMapValue.get("HomeAddress"));
//		Assert.assertTrue(rsreg.addressValidationMsgRsRegistrationStep1(getDriver()));
//		Log.endTestCase("RsRegistrationtest Test");
//	}
//
//	@Test(priority = 3, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Admin", dataProviderClass = DataProviderEDM.class)
//	public void rsRegistrationStep1CompleteCase(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_customer_url"));
//		Log.startTestCase("rsRegistrationStep1");
//		rsreg = new RsRegistrationSteps();
//		rsreg.RsRegistrationStep1Complete(hashMapValue.get("HomeAddress"), hashMapValue.get("CompanyName"));
//		Assert.assertTrue(rsreg.rsRegistrationStep1CompleteValidation(getDriver()));
//		Log.endTestCase("rsRegistrationStep1");
//	}
//
	@Test(priority = 4, groups = { "Smoke",
			"Sanity" }, dataProvider = "RS_Registration_Admin", dataProviderClass = DataProviderEDM.class)
	public void rsRegistrationCompleteCase(HashMap<String, String> hashMapValue) throws Throwable {
		getDriver().get(prop.getProperty("dev_customer_url"));
		Log.startTestCase("rsRegistrationtest Test");
		rsreg = new RsCustomerRegistrationSteps();
		rsreg.RsRegistrationStep1_Step2Complete(hashMapValue.get("HomeAddress"), hashMapValue.get("CompanyName"),
				hashMapValue.get("FirstName"), hashMapValue.get("LastName"), hashMapValue.get("PhoneNo"),
				hashMapValue.get("Email"));
//		String evalid = getDriver().findElement(By.xpath("//span[@style=\"font-weight:600\"]")).getText();
//		System.out.println(evalid);
//		newWriteToExcelLibrary = new NewWriteToExcelLibrary();
//		newWriteToExcelLibrary.setValues(1, 24, evalid);
//		Assert.assertTrue(rsreg.rsRegistrationValidation(getDriver()));
		Log.endTestCase("rsRegistrationtest Test");
	}

//	@Test(priority = 5, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Admin", dataProviderClass = DataProviderEDM.class)
//	public void rsRegistredCustomerDataValidationCase(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_admin_url"));
//		Log.startTestCase("rsRegistredCustomerDataValidationCase");
//		adminlogin = new AdminAccountLoginPage();
//		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
//		rsScheduleAssignByAdmin = new RsScheduleAssignByAdminPage();
//		rsScheduleAssignByAdmin.rsRegistredCustomerSelecting(hashMapValue.get("SelectedProgram"),
//				hashMapValue.get("EvalID"));
//		String appname = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[2]"))
//				.getText();
//		String apputility = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[6]"))
//				.getText();
//		String appphone = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[3]"))
//				.getText();// replaceAll("-","" );
//		String appaddress = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[7]"))
//				.getText();
//		assertEquals(appname, (hashMapValue.get("FirstName") + " " + hashMapValue.get("LastName")));
//		assertEquals(apputility, hashMapValue.get("CompanyName"));
//		assertEquals(appphone, hashMapValue.get("PhoneNo"));
//		assertEquals(appaddress, hashMapValue.get("HomeAddress").substring(0, 14));
//		Log.endTestCase("rsRegistredCustomerDataValidationCase");
//	}
//
//	@Test(priority = 6, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Admin", dataProviderClass = DataProviderEDM.class)
//	public void rsRegistredCustomerScheduleAssignByAdminCase(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_admin_url"));
//		Log.startTestCase("rsRegistredCustomerScheduleAssignByAdminCase");
//		adminlogin = new AdminAccountLoginPage();
//		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
//		rsScheduleAssignByAdmin = new RsScheduleAssignByAdminPage();
//		rsScheduleAssignByAdmin.rsRegistredCustomerSelecting(hashMapValue.get("SelectedProgram"),
//				hashMapValue.get("EvalID"));
//		rsScheduleAssignByAdmin.rsRegisterdCustomerGeneralHomeInformation(hashMapValue.get("Account"), hashMapValue.get("Meter"),
//				hashMapValue.get("HomeType"), hashMapValue.get("DoYouOwn"), hashMapValue.get("RenatalProperty"),
//				hashMapValue.get("YearBuilt"), hashMapValue.get("SqrFootage"), hashMapValue.get("Occupants"),
//				hashMapValue.get("Bedrooms"), hashMapValue.get("Foundation"), hashMapValue.get("Orientation"),
//				hashMapValue.get("PrimaryHeatingType"), hashMapValue.get("TypeOfHeating"),
//				hashMapValue.get("HVACUnits"), hashMapValue.get("WaterHeatingType"), hashMapValue.get("WaterHeaters"),
//				hashMapValue.get("Refrigerators"), hashMapValue.get("ProgThermoStat"),
//				hashMapValue.get("InternetAccess"), hashMapValue.get("WIFIEnabled"),
//				hashMapValue.get("BuySellingHome"));
////		rsScheduleAssignByAdmin.rsRegisterdCustomerScheduleAssign(hashMapValue.get("SelectAdvisor"), hashMapValue.get("PaymentMethod"), hashMapValue.get("AppoinmentType"), hashMapValue.get("ScheduledDate"), hashMapValue.get("ScheduledTime"));
//		Log.endTestCase("rsRegistredCustomerScheduleAssignByAdminCase");
//	}
//	***************if Evaluation is in Scheduled***************************************
//	@Test(priority = 7, groups = { "Smoke",
//			"Sanity" }, dataProvider = "RS_Registration_Admin", dataProviderClass = DataProviderEDM.class)
//	public void rsScheduledCustomerDataValidationCase(HashMap<String, String> hashMapValue) throws Throwable {
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
//		assertEquals(appname, (hashMapValue.get("FirstName") + " " + hashMapValue.get("LastName")));
//		assertEquals(apputility, hashMapValue.get("CompanyName"));
//		assertEquals(appphone, hashMapValue.get("PhoneNo"));
//		assertEquals(appaddress, hashMapValue.get("HomeAddress").substring(0, 14));
//		Log.endTestCase("rsRegistredCustomerDataValidationCase");
//	}

}
