package com.edm_dsm_web.testcases;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.edm_dsm_web.base.BaseEDM;
import com.edm_dsm_web.dataprovider.DataProviderEDM;
import com.edm_dsm_web.pageobjects.AdminAccountLoginPage;
import com.edm_dsm_web.pageobjects.RsContractorProjectSubmit;
import com.edm_dsm_web.utility.Log;

public class RSContractorProjectSubmitTest extends BaseEDM {
	private RsContractorProjectSubmit rsContractorProjecSub;
	private AdminAccountLoginPage adminlogin;

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

//	@Test(priority = 1, groups = { "Smoke", "Sanity",
//			"Regression" }, dataProvider = "RS_ContractorProject", dataProviderClass = DataProviderEDM.class)
//	public void rsContractorProjectSubmitcase1(HashMap<String, String> hashMapValue) throws InterruptedException, IOException {
//		getDriver().get(prop.getProperty("dev_contractor_url"));//Air,Attic, Duct only
//		Log.startTestCase("rsContractorProjectSubmitcase");
//		rsContractorProjecSub = new RsContractorProjectSubmit();
//		rsContractorProjecSub.rsContractorLogin(hashMapValue.get("ContValidLoginID"),
//				hashMapValue.get("ContValidPass"));
//		rsContractorProjecSub.rsContractorCustomerSearch(hashMapValue.get("HouseNo"), hashMapValue.get("LastName"),
//				hashMapValue.get("ZipCode"));
//		rsContractorProjecSub.rsContractorCustomerNewProject(hashMapValue.get("AirSealing"),
//				hashMapValue.get("AtticInsulation"), hashMapValue.get("DuctSystem"), hashMapValue.get("WaterHeating"),
//				hashMapValue.get("FloorInsulation"), hashMapValue.get("WallInsulation"),
//				hashMapValue.get("StormWindow"), hashMapValue.get("Window"), hashMapValue.get("GeothermalHeatPump"),
//				hashMapValue.get("CentralAirConditioning"), hashMapValue.get("TuneUp"),
//				hashMapValue.get("DualFuelHeatPump"), hashMapValue.get("AirSourceHeatPump"),
//				hashMapValue.get("MiniSplit"), hashMapValue.get("TVAPreferredAirSource"));
//		rsContractorProjecSub.rsContractorCustomerProjectDetails_AtticInsulation(hashMapValue.get("AtticInstalDate"),
//				hashMapValue.get("AtticInstalCost"), hashMapValue.get("AtticFinanced"),
//				hashMapValue.get("AtticFinancedAmount"), hashMapValue.get("AtticFinancedBy"),
//				hashMapValue.get("AtticIntialR"), hashMapValue.get("AtticFinalR"), hashMapValue.get("AtticCoverage"),
//				hashMapValue.get("AtticTypeInsulation"));
//		rsContractorProjecSub.rsContractorCustomerProjectDetails_AirSealing(hashMapValue.get("AirInstalDate"),
//				hashMapValue.get("AirInstalCost"), hashMapValue.get("AirFinanced"),
//				hashMapValue.get("AirFinancedAmount"), hashMapValue.get("AirFinancedBy"),
//				hashMapValue.get("AirLeakage"), hashMapValue.get("AirCeilingSealed"),
//				hashMapValue.get("AirBasementSealed"), hashMapValue.get("AirAttachGarage"),
//				hashMapValue.get("AirWalls"));
//		rsContractorProjecSub.rsContractorCustomerProjectDetails_DuctSystem(hashMapValue.get("DuctInstalDate"),
//				hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//				hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//				hashMapValue.get("DuctCondition"), hashMapValue.get("DuctInsulationCondition"),
//				hashMapValue.get("DuctLocationWork"), hashMapValue.get("DuctSealed"),
//				hashMapValue.get("DuctSealingMaterial"), hashMapValue.get("DuctSystemSize"));
//
//		rsContractorProjecSub.rsContractorCustomerProjectSubmitConfirmation();
//		Log.endTestCase("rsContractorProjectSubmitcase");
//	}

//	@Test(priority = 2, groups = { "Smoke", "Sanity",
//			"Regression" }, dataProvider = "RS_ContractorProject", dataProviderClass = DataProviderEDM.class)
//	public void rsContractorProjectSubmitcase(HashMap<String, String> hashMapValue)
//			throws InterruptedException, IOException {
//		getDriver().get(prop.getProperty("dev_contractor_url"));
//		Log.startTestCase("rsContractorProjectSubmitcase");
//		rsContractorProjecSub = new RsContractorProjectSubmit();
//		rsContractorProjecSub.rsContractorLogin(hashMapValue.get("ContValidLoginID"),
//				hashMapValue.get("ContValidPass"));
//		rsContractorProjecSub.rsContractorCustomerSearch(hashMapValue.get("HouseNo"), hashMapValue.get("LastName"),
//				hashMapValue.get("ZipCode"));
//		rsContractorProjecSub.rsContractorCustomerNewProject(hashMapValue.get("AirSealing"),
//				hashMapValue.get("AtticInsulation"), hashMapValue.get("DuctSystem"), hashMapValue.get("WaterHeating"),
//				hashMapValue.get("FloorInsulation"), hashMapValue.get("WallInsulation"),
//				hashMapValue.get("StormWindow"), hashMapValue.get("Window"), hashMapValue.get("GeothermalHeatPump"),
//				hashMapValue.get("CentralAirConditioning"), hashMapValue.get("TuneUp"),
//				hashMapValue.get("DualFuelHeatPump"), hashMapValue.get("AirSourceHeatPump"),
//				hashMapValue.get("MiniSplit"), hashMapValue.get("TVAPreferredAirSource"));
//		Log.info("rsContractorCustomerNewProject");
//		if (hashMapValue.get("AtticInsulation").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_AtticInsulation(hashMapValue.get("DuctInstalDate"),
//					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//					hashMapValue.get("AtticIntialR"), hashMapValue.get("AtticFinalR"),
//					hashMapValue.get("AtticCoverage"), hashMapValue.get("AtticTypeInsulation"));
//			Log.info("rsContractorCustomerProjectDetails_AtticInsulation");
//		}
//		if (hashMapValue.get("AirSealing").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_AirSealing(hashMapValue.get("DuctInstalDate"),
//					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//					hashMapValue.get("AirLeakage"), hashMapValue.get("AirCeilingSealed"),
//					hashMapValue.get("AirBasementSealed"), hashMapValue.get("AirAttachGarage"),
//					hashMapValue.get("AirWalls"));
//			Log.info("rsContractorCustomerProjectDetails_AirSealing");
//		}
//		if (hashMapValue.get("DuctSystem").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_DuctSystem(hashMapValue.get("DuctInstalDate"),
//					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//					hashMapValue.get("DuctCondition"), hashMapValue.get("DuctInsulationCondition"),
//					hashMapValue.get("DuctLocationWork"), hashMapValue.get("DuctSealed"),
//					hashMapValue.get("DuctSealingMaterial"), hashMapValue.get("DuctSystemSize"));
//			Log.info("rsContractorCustomerProjectDetails_DuctSystem");
//		}
//		if (hashMapValue.get("GeothermalHeatPump").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_GeothermalHeatPump(
//					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
//					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
//					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("OldSystemType"),
//					hashMapValue.get("DuctSystemSize"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("SystemRating"),
//					hashMapValue.get("OldSystemAge"), hashMapValue.get("SEER/EER"), hashMapValue.get("Packaged"),
//					hashMapValue.get("SEER/EER"), hashMapValue.get("NewSystemBrand"), hashMapValue.get("COP"),
//					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("IndoorModelNumber"),
//					hashMapValue.get("Btu"));
//			Log.info("rsContractorCustomerProjectDetails_GeothermalHeatPump");
//		}
//		if (hashMapValue.get("CentralAirConditioning").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_CentralAirConditioning(
//					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
//					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
//					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("AHRICertificateNumber"),
//					hashMapValue.get("Packaged"), hashMapValue.get("NewSystemBrand"),
//					hashMapValue.get("IndoorModelNumber"), hashMapValue.get("OutdoorModelNumber"),
//					hashMapValue.get("COP"), hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("SystemRating"), hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"),
//					hashMapValue.get("OldSystemAge"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("OldSystemType"));
//			Log.info("rsContractorCustomerProjectDetails_CentralAirConditioning");
//		}
//		if (hashMapValue.get("TuneUp").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_TuneUp(hashMapValue.get("DuctInstalDate"),
//					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
//					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("OldSystemAge"),
//					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("COP"), hashMapValue.get("COP"),
//					hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("DuctInsulationCondition"), hashMapValue.get("DuctInsulationCondition"));
//			Log.info("rsContractorCustomerProjectDetails_TuneUp");
//		}
//		if (hashMapValue.get("WaterHeating").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_HeatPumpWaterHeater(
//					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
//					hashMapValue.get("ReplacementType"), hashMapValue.get("OldSystemAge"),
//					hashMapValue.get("Replacement Size"), hashMapValue.get("Replacement Space"),
//					hashMapValue.get("DuctLocationWork"), hashMapValue.get("ReplacementType"),
//					hashMapValue.get("Replacement Size"));
//			Log.info("rsContractorCustomerProjectDetails_HeatPumpWaterHeater");
//		}
//		if (hashMapValue.get("StormWindow").equalsIgnoreCase("yes")) {
////		rsContractorProjecSub.rsContractorCustomerProjectDetails_StormWindow(hashMapValue.get("DuctInstalDate"),
////				hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
////				hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
////				hashMapValue.get("SquareFootageInstalled"), hashMapValue.get("QuantityInstalled"));//Remove storm window submeasure this is not an eligible measure
//		}
//		if (hashMapValue.get("Window").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_Window(hashMapValue.get("DuctInstalDate"),
//					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//					hashMapValue.get("OldWindowType"), hashMapValue.get("QuantityInstalled"), hashMapValue.get("COP"),
//					hashMapValue.get("COP"));
//			Log.info("rsContractorCustomerProjectDetails_Window");
//		}
//		if (hashMapValue.get("DualFuelHeatPump").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_DualFuelHeatPump(
//					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
//					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
//					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("OldSystemAge"), hashMapValue.get("OldSystemType"),
//					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("Packaged"),
//					hashMapValue.get("NewSystemBrand"), hashMapValue.get("IndoorModelNumber"),
//					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("SystemRating"),
//					hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"), hashMapValue.get("COP"),
//					hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"));
//			Log.info("rsContractorCustomerProjectDetails_DualFuelHeatPump");
//		}
//		if (hashMapValue.get("AirSourceHeatPump").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_AirSourceHeatPump(
//					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
//					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
//					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("OldSystemType"),
//					hashMapValue.get("Packaged"), hashMapValue.get("NewSystemBrand"),
//					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("IndoorModelNumber"),
//					hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"), hashMapValue.get("SystemRating"),
//					hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"), hashMapValue.get("COP"),
//					hashMapValue.get("DuctSystemSize"), hashMapValue.get("OldSystemAge"),
//					hashMapValue.get("OldSystemType"));
//			Log.info("rsContractorCustomerProjectDetails_AirSourceHeatPump");
//		}
//		if (hashMapValue.get("MiniSplit").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_MiniSplit(hashMapValue.get("DuctInstalDate"),
//					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("Packaged"),
//					hashMapValue.get("DuctLocationWork"), hashMapValue.get("DuctSealed"),
//					hashMapValue.get("DuctSealingMaterial"), hashMapValue.get("NewSystemBrand"),
//					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("IndoorModelNumber"),
//					hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"), hashMapValue.get("SystemRating"),
//					hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("OldSystemAge"), hashMapValue.get("OldSystemType"));
//			Log.info("rsContractorCustomerProjectDetails_MiniSplit");
//		}
//		if (hashMapValue.get("TVAPreferredAirSource").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_TVAPreferredAirSourceHeatPump(
//					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
//					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
//					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("AHRICertificateNumber"),
//					hashMapValue.get("Packaged"), hashMapValue.get("DuctType"), hashMapValue.get("NewSystemBrand"),
//					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("IndoorModelNumber"),
//					hashMapValue.get("Btu"), hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"),
//					hashMapValue.get("SystemRating"), hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"),
//					hashMapValue.get("SEER/EER"), hashMapValue.get("DuctSystemSize"), hashMapValue.get("OldSystemAge"),
//					hashMapValue.get("OldSystemType"));
//			Log.info("rsContractorCustomerProjectDetails_TVAPreferredAirSourceHeatPump");
//		}
//		if (hashMapValue.get("FloorInsulation").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_FloorInsulation(hashMapValue.get("DuctInstalDate"),
//					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//					hashMapValue.get("AtticIntialR"), hashMapValue.get("AtticCoverage"),
//					hashMapValue.get("AtticTypeInsulation"), hashMapValue.get("AtticFinalR"));
//			Log.info("rsContractorCustomerProjectDetails_FloorInsulation");
//		}
//		if (hashMapValue.get("WallInsulation").equalsIgnoreCase("yes")) {
//			rsContractorProjecSub.rsContractorCustomerProjectDetails_WallInsulation(hashMapValue.get("DuctInstalDate"),
//					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//					hashMapValue.get("DuctSealed"), hashMapValue.get("SquareFootageInstalled"));
//			Log.info("rsContractorCustomerProjectDetails_WallInsulation");
//		}
//		rsContractorProjecSub.rsContractorCustomerProjectSubmitConfirmation();
//		Log.endTestCase("rsContractorProjectSubmitcase");
//	}

	@Test(priority = 3, groups = { "Smoke", "Sanity",
			"Regression" }, dataProvider = "RS_ContractorProject", dataProviderClass = DataProviderEDM.class)
	public void rsCustomerRegistration_ContractorProjectSubmitcase(HashMap<String, String> hashMapValue)
			throws InterruptedException, IOException {
		getDriver().get(prop.getProperty("dev_contractor_url"));
		Log.startTestCase("rsCustomerRegistration_ContractorProjectSubmitcase");
		rsContractorProjecSub = new RsContractorProjectSubmit();
		rsContractorProjecSub.rsContractorLogin(hashMapValue.get("ContValidLoginID"),
				hashMapValue.get("ContValidPass"));
		if (hashMapValue.get("CustomerRegistration").equalsIgnoreCase("new")) {
		rsContractorProjecSub.rsContractorCustomerRegistration(hashMapValue.get("CustomerEmail"), hashMapValue.get("CustomerHomeAddress"),
				hashMapValue.get("FirstName"), hashMapValue.get("LastName"), hashMapValue.get("PhoneNo"));}
		else {rsContractorProjecSub.rsContractorCustomerSearch(hashMapValue.get("HouseNo"), hashMapValue.get("LastName_R"),
			hashMapValue.get("ZipCode"));}
		rsContractorProjecSub.rsContractorCustomerNewProject(hashMapValue.get("AirSealing"),
				hashMapValue.get("AtticInsulation"), hashMapValue.get("DuctSystem"), hashMapValue.get("WaterHeating"),
				hashMapValue.get("FloorInsulation"), hashMapValue.get("WallInsulation"),
				hashMapValue.get("StormWindow"), hashMapValue.get("Window"), hashMapValue.get("GeothermalHeatPump"),
				hashMapValue.get("CentralAirConditioning"), hashMapValue.get("TuneUp"),
				hashMapValue.get("DualFuelHeatPump"), hashMapValue.get("AirSourceHeatPump"),
				hashMapValue.get("MiniSplit"), hashMapValue.get("TVAPreferredAirSource"));
		Log.info("rsContractorCustomerNewProject");
		if (hashMapValue.get("AtticInsulation").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_AtticInsulation(hashMapValue.get("DuctInstalDate"),
					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
					hashMapValue.get("AtticIntialR"), hashMapValue.get("AtticFinalR"),
					hashMapValue.get("AtticCoverage"), hashMapValue.get("AtticTypeInsulation"));
			Log.info("rsContractorCustomerProjectDetails_AtticInsulation");
		}
		if (hashMapValue.get("AirSealing").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_AirSealing(hashMapValue.get("DuctInstalDate"),
					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
					hashMapValue.get("AirLeakage"), hashMapValue.get("AirCeilingSealed"),
					hashMapValue.get("AirBasementSealed"), hashMapValue.get("AirAttachGarage"),
					hashMapValue.get("AirWalls"));
			Log.info("rsContractorCustomerProjectDetails_AirSealing");
		}
		if (hashMapValue.get("DuctSystem").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_DuctSystem(hashMapValue.get("DuctInstalDate"),
					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
					hashMapValue.get("DuctCondition"), hashMapValue.get("DuctInsulationCondition"),
					hashMapValue.get("DuctLocationWork"), hashMapValue.get("DuctSealed"),
					hashMapValue.get("DuctSealingMaterial"), hashMapValue.get("DuctSystemSize"));
			Log.info("rsContractorCustomerProjectDetails_DuctSystem");
		}
		if (hashMapValue.get("GeothermalHeatPump").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_GeothermalHeatPump(
					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("OldSystemType"),
					hashMapValue.get("DuctSystemSize"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("SystemRating"),
					hashMapValue.get("OldSystemAge"), hashMapValue.get("SEER/EER"), hashMapValue.get("Packaged"),
					hashMapValue.get("SEER/EER"), hashMapValue.get("NewSystemBrand"), hashMapValue.get("COP"),
					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("IndoorModelNumber"),
					hashMapValue.get("Btu"));
			Log.info("rsContractorCustomerProjectDetails_GeothermalHeatPump");
		}
		if (hashMapValue.get("CentralAirConditioning").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_CentralAirConditioning(
					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("AHRICertificateNumber"),
					hashMapValue.get("Packaged"), hashMapValue.get("NewSystemBrand"),
					hashMapValue.get("IndoorModelNumber"), hashMapValue.get("OutdoorModelNumber"),
					hashMapValue.get("COP"), hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("SystemRating"), hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"),
					hashMapValue.get("OldSystemAge"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("OldSystemType"));
			Log.info("rsContractorCustomerProjectDetails_CentralAirConditioning");
		}
		if (hashMapValue.get("TuneUp").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_TuneUp(hashMapValue.get("DuctInstalDate"),
					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("OldSystemAge"),
					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("COP"), hashMapValue.get("COP"),
					hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("DuctInsulationCondition"), hashMapValue.get("DuctInsulationCondition"));
			Log.info("rsContractorCustomerProjectDetails_TuneUp");
		}
		if (hashMapValue.get("WaterHeating").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_HeatPumpWaterHeater(
					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
					hashMapValue.get("ReplacementType"), hashMapValue.get("OldSystemAge"),
					hashMapValue.get("Replacement Size"), hashMapValue.get("Replacement Space"),
					hashMapValue.get("DuctLocationWork"), hashMapValue.get("ReplacementType"),
					hashMapValue.get("Replacement Size"));
			Log.info("rsContractorCustomerProjectDetails_HeatPumpWaterHeater");
		}
		if (hashMapValue.get("StormWindow").equalsIgnoreCase("yes")) {
//rsContractorProjecSub.rsContractorCustomerProjectDetails_StormWindow(hashMapValue.get("DuctInstalDate"),
//		hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
//		hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
//		hashMapValue.get("SquareFootageInstalled"), hashMapValue.get("QuantityInstalled"));//Remove storm window submeasure this is not an eligible measure
		}
		if (hashMapValue.get("Window").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_Window(hashMapValue.get("DuctInstalDate"),
					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
					hashMapValue.get("OldWindowType"), hashMapValue.get("QuantityInstalled"), hashMapValue.get("COP"),
					hashMapValue.get("COP"));
			Log.info("rsContractorCustomerProjectDetails_Window");
		}
		if (hashMapValue.get("DualFuelHeatPump").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_DualFuelHeatPump(
					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("OldSystemAge"), hashMapValue.get("OldSystemType"),
					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("Packaged"),
					hashMapValue.get("NewSystemBrand"), hashMapValue.get("IndoorModelNumber"),
					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("SystemRating"),
					hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"), hashMapValue.get("COP"),
					hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"));
			Log.info("rsContractorCustomerProjectDetails_DualFuelHeatPump");
		}
		if (hashMapValue.get("AirSourceHeatPump").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_AirSourceHeatPump(
					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("OldSystemType"),
					hashMapValue.get("Packaged"), hashMapValue.get("NewSystemBrand"),
					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("IndoorModelNumber"),
					hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"), hashMapValue.get("SystemRating"),
					hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"), hashMapValue.get("COP"),
					hashMapValue.get("DuctSystemSize"), hashMapValue.get("OldSystemAge"),
					hashMapValue.get("OldSystemType"));
			Log.info("rsContractorCustomerProjectDetails_AirSourceHeatPump");
		}
		if (hashMapValue.get("MiniSplit").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_MiniSplit(hashMapValue.get("DuctInstalDate"),
					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
					hashMapValue.get("AHRICertificateNumber"), hashMapValue.get("Packaged"),
					hashMapValue.get("DuctLocationWork"), hashMapValue.get("DuctSealed"),
					hashMapValue.get("DuctSealingMaterial"), hashMapValue.get("NewSystemBrand"),
					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("IndoorModelNumber"),
					hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"), hashMapValue.get("SystemRating"),
					hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("OldSystemAge"), hashMapValue.get("OldSystemType"));
			Log.info("rsContractorCustomerProjectDetails_MiniSplit");
		}
		if (hashMapValue.get("TVAPreferredAirSource").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_TVAPreferredAirSourceHeatPump(
					hashMapValue.get("DuctInstalDate"), hashMapValue.get("DuctInstalCost"),
					hashMapValue.get("DuctFinanced"), hashMapValue.get("DuctFinancedAmount"),
					hashMapValue.get("DuctFinancedBy"), hashMapValue.get("AHRICertificateNumber"),
					hashMapValue.get("Packaged"), hashMapValue.get("DuctType"), hashMapValue.get("NewSystemBrand"),
					hashMapValue.get("OutdoorModelNumber"), hashMapValue.get("IndoorModelNumber"),
					hashMapValue.get("Btu"), hashMapValue.get("Btu"), hashMapValue.get("DuctSystemSize"),
					hashMapValue.get("SystemRating"), hashMapValue.get("SEER/EER"), hashMapValue.get("SEER/EER"),
					hashMapValue.get("SEER/EER"), hashMapValue.get("DuctSystemSize"), hashMapValue.get("OldSystemAge"),
					hashMapValue.get("OldSystemType"));
			Log.info("rsContractorCustomerProjectDetails_TVAPreferredAirSourceHeatPump");
		}
		if (hashMapValue.get("FloorInsulation").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_FloorInsulation(hashMapValue.get("DuctInstalDate"),
					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
					hashMapValue.get("AtticIntialR"), hashMapValue.get("AtticCoverage"),
					hashMapValue.get("AtticTypeInsulation"), hashMapValue.get("AtticFinalR"));
			Log.info("rsContractorCustomerProjectDetails_FloorInsulation");
		}
		if (hashMapValue.get("WallInsulation").equalsIgnoreCase("yes")) {
			rsContractorProjecSub.rsContractorCustomerProjectDetails_WallInsulation(hashMapValue.get("DuctInstalDate"),
					hashMapValue.get("DuctInstalCost"), hashMapValue.get("DuctFinanced"),
					hashMapValue.get("DuctFinancedAmount"), hashMapValue.get("DuctFinancedBy"),
					hashMapValue.get("DuctSealed"), hashMapValue.get("SquareFootageInstalled"));
			Log.info("rsContractorCustomerProjectDetails_WallInsulation");
		}
		rsContractorProjecSub.rsContractorCustomerProjectSubmitConfirmation();
		Log.endTestCase("rsCustomerRegistration_ContractorProjectSubmitcase");
	}

//	@Test(priority = 4, groups = { "Smoke", "Sanity",
//			"Regression" }, dataProvider = "RS_ContractorProject", dataProviderClass = DataProviderEDM.class)
//	public void rsContractorProjectSubmit_RequestToInProcesscase(HashMap<String, String> hashMapValue)
//			throws Throwable {
//		getDriver().get(prop.getProperty("dev_admin_url"));
//		Log.startTestCase("rsContractorProjectSubmitToReadyForInspectioncase");
//		adminlogin = new AdminAccountLoginPage();
//		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
//		rsContractorProjecSub = new RsContractorProjectSubmit();
//		rsContractorProjecSub.rsContractorCustomerProjectSubmitToRequest(hashMapValue.get("SelectedProgram"),
//				hashMapValue.get("UpgradeID"));
//		rsContractorProjecSub.rsContractorCustomerProjctRequest_UserListDialog();
//		Log.endTestCase("rsContractorProjectSubmitToReadyForInspectioncase");
//		Thread.sleep(10000);
//	}
//
//	@Test(priority = 5, groups = { "Smoke", "Sanity",
//			"Regression" }, dataProvider = "RS_ContractorProject", dataProviderClass = DataProviderEDM.class)
//	public void rsContractorProjectSubmitToReadyForInspectioncase(HashMap<String, String> hashMapValue)
//			throws Throwable {
//		getDriver().get(prop.getProperty("dev_admin_url"));
//		Log.startTestCase("rsContractorProjectSubmitToReadyForInspectioncase");
//		adminlogin = new AdminAccountLoginPage();
//		adminlogin.login(hashMapValue.get("ValidLoginID"), hashMapValue.get("ValidPass"));
//		rsContractorProjecSub = new RsContractorProjectSubmit();
//		rsContractorProjecSub.rsContractorCustomerProjectSubmitToInProcess(hashMapValue.get("SelectedProgram"),
//				hashMapValue.get("UpgradeID"));
//		rsContractorProjecSub.rsContractorCustomerProjctInProcess_UserListDialog();
//		Log.endTestCase("rsContractorProjectSubmitToReadyForInspectioncase");
//		Thread.sleep(10000);
//	}
}