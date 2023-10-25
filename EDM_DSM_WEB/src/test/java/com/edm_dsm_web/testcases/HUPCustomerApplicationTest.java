package com.edm_dsm_web.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.edm_dsm_web.base.BaseEDM;
import com.edm_dsm_web.dataprovider.DataProviderEDM;
import com.edm_dsm_web.pageobjects.AdminAccountLoginPage;
import com.edm_dsm_web.pageobjects.HupCustomerApplicationApproveScheduleAssign;
import com.edm_dsm_web.pageobjects.HupCustomerApplicationSubmit;
import com.edm_dsm_web.pageobjects.RsScheduleAssignByAdminPage;
import com.edm_dsm_web.utility.Log;
import com.edm_dsm_web.utility.NewWriteToExcelLibrary;

public class HUPCustomerApplicationTest extends BaseEDM {
	private HupCustomerApplicationSubmit hupCustomerAppSubmit;
	private HupCustomerApplicationApproveScheduleAssign hupCustomerAppApproveScheduleAssign;
	private NewWriteToExcelLibrary newWriteToExcelLibrary;
	private AdminAccountLoginPage adminlogin;
	private RsScheduleAssignByAdminPage rsScheduleAssignByAdmin;

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

	@Test(priority = 1, groups = { "Smoke", "Sanity",
			"Regression" }, dataProvider = "HUP_CustomerApplication", dataProviderClass = DataProviderEDM.class)
	public void hupCustomerApplicationSubmissioncase(HashMap<String, String> hashMapValue)
			throws InterruptedException, IOException {
		getDriver().get(prop.getProperty("dev_hup_url"));
		Log.startTestCase("hupCustomerApplicationSubmissioncase");
		hupCustomerAppSubmit = new HupCustomerApplicationSubmit();
		hupCustomerAppSubmit.hupIsAvailableInYourArea(hashMapValue.get("ZIPCode"),
				hashMapValue.get("Preferred Language"), hashMapValue.get("LPCUtility"), hashMapValue.get("County"),
				hashMapValue.get("HomeConsidered"), hashMapValue.get("FirstName"), hashMapValue.get("LastName"),
				hashMapValue.get("HomeAddress"), hashMapValue.get("PhoneNo1"), hashMapValue.get("Email"),
				hashMapValue.get("PhoneNo2"), hashMapValue.get("HearAboutProgram"), hashMapValue.get("SqrFootage"),
				hashMapValue.get("YearBuilt"), hashMapValue.get("Occupantas"), hashMapValue.get("ElectricAccountNo"));
		hupCustomerAppSubmit.hupApplicantInformation(hashMapValue.get("AnnualIncome"),
				hashMapValue.get("Maritalstatus"), hashMapValue.get("Gender"), hashMapValue.get("Race"),
				hashMapValue.get("VetarnStatus"), hashMapValue.get("BirthDate"));
		hupCustomerAppSubmit.hupApplicantMemberInformation_1(hashMapValue.get("FirstName_1"),
				hashMapValue.get("LastName_1"), hashMapValue.get("AnnualIncome_1"), hashMapValue.get("MariStatus_1"),
				hashMapValue.get("Gender_1"), hashMapValue.get("Race_1"), hashMapValue.get("Veteran_1"),
				hashMapValue.get("BirthDate_1"));
		hupCustomerAppSubmit.applicantSignature();

		Log.endTestCase("hupCustomerApplicationSubmissioncase");

	}
//	@Test(priority = 2, groups = { "Smoke", "Sanity",
//			"Regression" }, dataProvider = "HUP_CustomerApplication", dataProviderClass = DataProviderEDM.class)
//	public void hupCustomerApplicationSubmitDataValidationCase(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_admin_url"));
//		Log.startTestCase("hupCustomerApplicationSubmitDataValidationCase");
//		adminlogin = new AdminAccountLoginPage();
//		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
//		hupCustomerAppSubmit = new HupCustomerApplicationSubmit();
//		hupCustomerAppSubmit.hupCustomerApplicationSubmitDataValidation(hashMapValue.get("SelectedProgram"),
//				hashMapValue.get("EvalID"));
//		String appname = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[2]"))
//				.getText();
//		String apputility = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[12]"))
//				.getText();
//		String appphone = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[3]"))
//				.getText();// replaceAll("-","" );
//		String appaddress = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[5]"))
//				.getText();
//		assertEquals(appname, (hashMapValue.get("FirstName") + " " + hashMapValue.get("LastName")));
//		assertEquals(apputility, hashMapValue.get("LPCUtility"));
//		assertEquals(appphone, hashMapValue.get("PhoneNo1"));
//		assertEquals(appaddress, hashMapValue.get("HomeAddress").substring(0, 21));
//		Log.endTestCase("hupCustomerApplicationSubmitDataValidationCase");
//	}

	@Test(priority = 3, groups = { "Smoke", "Sanity",
			"Regression" }, dataProvider = "HUP_CustomerApplication", dataProviderClass = DataProviderEDM.class)
	public void hupCustomerApplicationStatusChangeToApproveCase(HashMap<String, String> hashMapValue) throws Throwable {
		getDriver().get(prop.getProperty("dev_admin_url"));
		Log.startTestCase("hupCustomerApplicationStatusChangeToApproveCase");
		adminlogin = new AdminAccountLoginPage();
		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
		hupCustomerAppSubmit = new HupCustomerApplicationSubmit();
		hupCustomerAppSubmit.hupCustomerApplicationSubmitDataValidation(hashMapValue.get("SelectedProgram"),
				hashMapValue.get("EvalID"));
		hupCustomerAppApproveScheduleAssign = new HupCustomerApplicationApproveScheduleAssign();
		hupCustomerAppApproveScheduleAssign.HupCustomerApplicationApprove();
		Log.endTestCase("hupCustomerApplicationStatusChangeToApproveCase");
	}

//	@Test(priority = 4, groups = { "Smoke", "Sanity",
//			"Regression" }, dataProvider = "HUP_CustomerApplication", dataProviderClass = DataProviderEDM.class)
//	public void hupCustomerApplicationApprovedDataValidationCase(HashMap<String, String> hashMapValue) throws Throwable {
//		getDriver().get(prop.getProperty("dev_admin_url"));
//		Log.startTestCase("hupCustomerApplicationApprovedDataValidationCase");
//		adminlogin = new AdminAccountLoginPage();
//		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
//		hupCustomerAppSubmit = new HupCustomerApplicationSubmit();
//		hupCustomerAppSubmit.hupCustomerApplicationApprovedDataValidation(hashMapValue.get("SelectedProgram"),
//				hashMapValue.get("EvalID"));
//		String appname = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[2]"))
//				.getText();
//		String apputility = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[7]"))
//				.getText();
//		String appphone = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[5]"))
//				.getText();// replaceAll("-","" );
//		String appaddress = getDriver().findElement(By.xpath("//*[@id=\"ctl00_Work_uxRadGrid_ctl00__0\"]/td[8]"))
//				.getText();
//		assertEquals(appname, (hashMapValue.get("FirstName") + " " + hashMapValue.get("LastName")));
//		assertEquals(apputility, hashMapValue.get("LPCUtility"));
//		assertEquals(appphone, hashMapValue.get("PhoneNo1"));
//		assertEquals(appaddress, hashMapValue.get("HomeAddress").substring(0, 21));
//		Log.endTestCase("hupCustomerApplicationApprovedDataValidationCase");
//	}
}
