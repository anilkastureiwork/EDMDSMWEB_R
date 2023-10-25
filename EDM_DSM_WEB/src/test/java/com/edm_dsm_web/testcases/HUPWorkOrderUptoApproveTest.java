package com.edm_dsm_web.testcases;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.edm_dsm_web.base.BaseEDM;
import com.edm_dsm_web.dataprovider.DataProviderEDM;
import com.edm_dsm_web.pageobjects.AdminAccountLoginPage;
import com.edm_dsm_web.pageobjects.HupWorkOrderUptoApprove;
import com.edm_dsm_web.pageobjects.RsContractorProjectSubmit;
import com.edm_dsm_web.utility.Log;

public class HUPWorkOrderUptoApproveTest extends BaseEDM {
	private HupWorkOrderUptoApprove hupWorkOrder;
	private AdminAccountLoginPage adminlogin;

	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void setup(String browser) throws InterruptedException {
		launchApp(browser);
	}

	@AfterMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void tearDown() {
		getDriver().quit();
	}

	@Test(priority = 1, groups = { "Smoke", "Sanity",
			"Regression" }, dataProvider = "HUP_WorkOrderDetails", dataProviderClass = DataProviderEDM.class)
	public void hupVerifyWorkOrderDataInAdminFromEvalutionCase(HashMap<String, String> hashMapValue) throws Throwable {
		getDriver().get(prop.getProperty("dev_admin_url"));
		Log.startTestCase("hupVerifyWorkOrderInAdminFromEvalutionCase");
		adminlogin = new AdminAccountLoginPage();
		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
		hupWorkOrder = new HupWorkOrderUptoApprove();
		hupWorkOrder.workOrderSearchInAdminFromEvalution(hashMapValue.get("SelectedProgram"),
				hashMapValue.get("SiteID"));
		hupWorkOrder.verifyWorkOrderInAdminFromEvalution();
		String repairHup = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl04_lnkName")).getText();
		System.out.println(repairHup);
		String wallInsulation = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl05_lnkName")).getText();
		String windowsDoors = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl06_lnkName")).getText();
		String refrigerators = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl07_lnkName")).getText();
		String waterHeating = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl08_lnkName")).getText();
		String HVACSystem = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl09_lnkName")).getText();
		String ductSystem = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl10_lnkName")).getText();
		String atticInsulation = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl11_lnkName")).getText();
		String airSelling = getDriver().findElement(By.id("ctl00_Work_uxRadGrid1_ctl00_ctl12_lnkName")).getText();
		assertEquals(hashMapValue.get("Measure1"), repairHup);
		assertEquals(hashMapValue.get("Measure2"), wallInsulation);
		assertEquals(hashMapValue.get("Measure3"), windowsDoors);
		assertEquals(hashMapValue.get("Measure4"), refrigerators);
		assertEquals(hashMapValue.get("Measure5"), waterHeating);
		assertEquals(hashMapValue.get("Measure6"), HVACSystem);
		assertEquals(hashMapValue.get("Measure7"), ductSystem);
		assertEquals(hashMapValue.get("Measure8"), atticInsulation);
		assertEquals(hashMapValue.get("Measure9"), airSelling);

		Log.endTestCase("hupVerifyWorkOrderInAdminFromEvalutionCase");
	}

	@Test(priority = 2, groups = { "Smoke", "Sanity",
			"Regression" }, dataProvider = "HUP_WorkOrderDetails", dataProviderClass = DataProviderEDM.class)
	public void hupAddLabor_MaterialsCost_VerifyCase(HashMap<String, String> hashMapValue) throws Throwable {
		getDriver().get(prop.getProperty("dev_admin_url"));
		Log.startTestCase("hupAddLabor_MaterialsCost_VerifyCase");
		adminlogin = new AdminAccountLoginPage();
		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
		hupWorkOrder = new HupWorkOrderUptoApprove();
		hupWorkOrder.workOrderSearchInAdminFromEvalution(hashMapValue.get("SelectedProgram"),
				hashMapValue.get("SiteID"));
		hupWorkOrder.verifyWorkOrderInAdminFromEvalution();
		hupWorkOrder.hupAddLabor_MaterialsCost_Verify(hashMapValue.get("Labor1"), hashMapValue.get("Measure1"));
		String laborTotal = getDriver().findElement(By.xpath("(//td[normalize-space()='Total']//following::td)[1]"))
				.getText();
		String materialTotal = getDriver().findElement(By.xpath("(//td[normalize-space()='Total']//following::td)[2]"))
				.getText();
		String totalTotal = getDriver().findElement(By.xpath("(//td[normalize-space()='Total']//following::td)[3]"))
				.getText();
		assertEquals(hashMapValue.get("LabourTotal"), laborTotal);
		assertEquals(hashMapValue.get("MeasureTotal"), materialTotal);
		assertEquals(hashMapValue.get("TotalTotal"), totalTotal);
		Thread.sleep(5000);
		Log.endTestCase("hupAddLabor_MaterialsCost_VerifyCase");
	}

	@Test(priority = 3, groups = { "Smoke", "Sanity",
			"Regression" }, dataProvider = "HUP_WorkOrderDetails", dataProviderClass = DataProviderEDM.class)
	public void hupMeasuresAvailableforUpgradeDetailsCase(HashMap<String, String> hashMapValue) throws Throwable {
		getDriver().get(prop.getProperty("dev_admin_url"));
		Log.startTestCase("hupMeasuresAvailableforUpgradeDetailsCase");
		adminlogin = new AdminAccountLoginPage();
		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
		hupWorkOrder = new HupWorkOrderUptoApprove();
		hupWorkOrder.workOrderSearchInAdminFromEvalution(hashMapValue.get("SelectedProgram"),
				hashMapValue.get("SiteID"));
		hupWorkOrder.verifyWorkOrderInAdminFromEvalution();
		hupWorkOrder.measuresAvailableforUpgradeDetails_RepairHUP(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.measuresAvailableforUpgradeDetails_WallInsulation(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.measuresAvailableforUpgradeDetails_WindosDoors(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.measuresAvailableforUpgradeDetails_Refrigerators(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.measuresAvailableforUpgradeDetails_WaterHeating(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.measuresAvailableforUpgradeDetails_HVACSystem(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.measuresAvailableforUpgradeDetails_DuctSystem(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.measuresAvailableforUpgradeDetails_AtticInsulation(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.measuresAvailableforUpgradeDetails_AirSealing(hashMapValue.get("Labor1"),
				hashMapValue.get("Measure1"), hashMapValue.get("FundingSource"), hashMapValue.get("FundAmount"),
				hashMapValue.get("FundComment"), hashMapValue.get("Contractor"), hashMapValue.get("InstallDate"),
				hashMapValue.get("InstallTime"), hashMapValue.get("TargetInstallDate"),
				hashMapValue.get("TargetInstallTime"));
		hupWorkOrder.upgradeSubMeasureSelection(hashMapValue.get("SubMeasRepairHUP"),
				hashMapValue.get("SubMeasWallInsulation"), hashMapValue.get("SubMeasWindowsDoors"),
				hashMapValue.get("SubMeasRefrigerators"), hashMapValue.get("SubMeasWaterHeating"),
				hashMapValue.get("SubMeasHVACSystem"), hashMapValue.get("SubMeasDuctSystem"),
				hashMapValue.get("SubMeasAtticInsulation"), hashMapValue.get("SubMeasAirSealing"));
		hupWorkOrder.hupWorkOrderChangeStatusOpenToApproved(hashMapValue.get("StatusApprove"));

		Log.endTestCase("hupMeasuresAvailableforUpgradeDetailsCase");
	}

	@Test(priority = 4, groups = { "Smoke", "Sanity",
			"Regression" }, dataProvider = "HUP_WorkOrderDetails", dataProviderClass = DataProviderEDM.class)
	public void hupWorkOrder_CreateUpgradeAplicationCase(HashMap<String, String> hashMapValue) throws Throwable {
		getDriver().get(prop.getProperty("dev_admin_url"));
		Log.startTestCase("hupWorkorder_CreateUpgradeAplicationCase");
		adminlogin = new AdminAccountLoginPage();
		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
		hupWorkOrder = new HupWorkOrderUptoApprove();
		hupWorkOrder.workOrderSearchInAdminFromEvalution_Approved(hashMapValue.get("SelectedProgram"),
				hashMapValue.get("SiteID"));
		hupWorkOrder.createUpgradeApplication();
		Log.endTestCase("hupWorkorder_CreateUpgradeAplicationCase");
	}

	@Test(priority = 5, groups = { "Smoke", "Sanity",
			"Regression" }, dataProvider = "HUP_WorkOrderDetails", dataProviderClass = DataProviderEDM.class)
	public void hupWorkOrder_VerifyProjectDataAndChangeProjectStatusCase(HashMap<String, String> hashMapValue) throws Throwable {
		getDriver().get(prop.getProperty("dev_admin_url"));
		Log.startTestCase("hupWorkorder_CreateUpgradeAplicationCase");
		adminlogin = new AdminAccountLoginPage();
		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
		hupWorkOrder = new HupWorkOrderUptoApprove();
		hupWorkOrder.hupContractorCustomerProjectSubmitToRequest(hashMapValue.get("SelectedProgram"), hashMapValue.get("ProjectID"));
//		String installCost=getDriver().findElement(By.xpath("//h1[normalize-space()='Snapshot']//following::span[@id='ctl00_Work_uxInstallCost']")).getText();
//		assertEquals(hashMapValue.get("TotalTotal"), installCost);
		hupWorkOrder.hupContractorCustomerProjctRequest_UserListDialog();
		hupWorkOrder.hupContractorCustomerProjectSubmitToInProcess(hashMapValue.get("SelectedProgram"), hashMapValue.get("ProjectID"));
		hupWorkOrder.hupContractorCustomerProjctInProcess_UserListDialog();
		Log.endTestCase("hupWorkorder_CreateUpgradeAplicationCase");
	}
}
