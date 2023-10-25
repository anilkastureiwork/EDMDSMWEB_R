package com.edm_dsm_web.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edm_dsm_web.actiondriver.ActionDrivers;
import com.edm_dsm_web.base.BaseEDM;
import com.edm_dsm_web.utility.NewWriteToExcelLibrary;

public class RsContractorProjectSubmit extends BaseEDM {
	ActionDrivers action = new ActionDrivers();
	private NewWriteToExcelLibrary newWriteToExcel;
//	************Login**************************
	@FindBy(id = "btnRes")
	private WebElement selectProgramResidentialServices;
	@FindBy(id = "username")
	private WebElement residentialServicesContractorUsername;
	@FindBy(id = "password")
	private WebElement residentialServicesContractorPassword;
	@FindBy(id = "Signin")
	private WebElement residentialServicesContractorSignin;
	@FindBy(xpath = "//img[@src=\"/Images/Icons/plus-icon.svg\"]")
//	************SearchCustomer**************************************
	private WebElement newProjectApplication;
	@FindBy(id = "houseno")
	private WebElement houseNo;
	@FindBy(id = "lastname")
	private WebElement lastname;
	@FindBy(id = "zipcode")
	private WebElement zipCode;
	@FindBy(xpath = "//input[@value=\"Search\"]")
	private WebElement customerSearchBtn;
	@FindBy(xpath = "//a[normalize-space()=\"Select\"]")
	private WebElement customerSelectBtn;
//	****************RegisterCustomer***********************
	@FindBy(xpath = "//u[normalize-space()='Register Customer.']")
	private WebElement registerCustomer;
	@FindBy(id = "txtEmail")
	private WebElement registerCustomerEmail;
	@FindBy(id = "submitBTN")
	private WebElement registerCustomerEmailContinueBtn;
	@FindBy(id = "txtAddress1")
	private WebElement registerCustomerHomeAddress;
	@FindBy(id = "Button1")
	private WebElement registerCustomerHomeAddressContinueBtn;
	@FindBy(xpath = "(//label[starts-with(normalize-space(),'Select')]//following::input)[1]")
	private WebElement registerCustomerUtilitySelect;
	@FindBy(id = "btnSubmit")
	private WebElement registerCustomerUtilitySelectContinueBtn;
	@FindBy(id = "firstnameinput")
	private WebElement registerCustomerFirstName;
	@FindBy(id = "lastnameinput")
	private WebElement registerCustomerLastname;
	@FindBy(id = "phone1input")
	private WebElement registerCustomerPhoneNo;
	@FindBy(id = "Radio1")
	private WebElement registerCustomerMailingAddressSame;
	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement utilityCreateAccountBtn;
	@FindBy(xpath = "//a[normalize-space()='Create Upgrade']")
	private WebElement registerCustomerCreateUpgradeBtn;
//	*************New Project Add****************************
	@FindBy(xpath = "//a[normalize-space()='+ New Project']")
	private WebElement newProjectBtn;
	@FindBy(id = "cb_36")
	private WebElement airSealingSelect;
	@FindBy(id = "cb_1")
	private WebElement atticInsulationSelect;
	@FindBy(id = "cb_37")
	private WebElement ductSystemSelect;
	@FindBy(id = "cb_43")
	private WebElement waterHeatingSelect;
	@FindBy(id = "cb_59")
	private WebElement floorInsulationSelect;
	@FindBy(id = "cb_110")
	private WebElement wallInsulationSelect;
	@FindBy(id = "cb_44")
	private WebElement stormWindowSelect;
	@FindBy(id = "cb_46")
	private WebElement windowSelect;
	@FindBy(id = "cb_40")
	private WebElement geothermalHeatPumpSelect;
	@FindBy(id = "cb_41")
	private WebElement centralAirConditioningSelect;
	@FindBy(id = "cb_42")
	private WebElement TuneUpSelect;
	@FindBy(id = "cb_49")
	private WebElement DualFuelHeatPumpSelect;
	@FindBy(id = "cb_56")
	private WebElement airSourceHeatPumpSelect;
	@FindBy(id = "cb_57")
	private WebElement miniSplitSelect;
	@FindBy(id = "cb_58")
	private WebElement TVAPreferredAirSourceSelect;
	@FindBy(id = "btnSubmit")
	private WebElement measuresSelectContinueBtn;
//	********ATTIC INSULATION******************
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Attic')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement atticInsulationInstallDate;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Attic')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement atticInsulationCost;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Attic')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement atticInsulationFinanced;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Attic')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement atticInsulationFinanceAmount;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Attic')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement atticInsulationFinancedBy;
	@FindBy(id = "m_2_sm_1_unit_0_dt_2001")
	private WebElement atticInsulationIntialRValue;
	@FindBy(id = "m_2_sm_1_unit_0_dt_2004")
	private WebElement atticInsulationFinalRValue;
	@FindBy(id = "m_2_sm_1_unit_0_dt_2002")
	private WebElement atticInsulationCoverageArea;
	@FindBy(id = "m_2_sm_1_unit_0_dt_2003")
	private WebElement atticInsulationtypesOfInsulationinstalled;
	@FindBy(id = "m_2_sm_1_unit_0_dt_5021_1")
	private WebElement atticInsulationKneeWallesYes;
	@FindBy(id = "m_2_sm_1_unit_0_dt_5022_2")
	private WebElement atticInsulationKneeWallInsulationLessThanR11No;
//	***************************AIR SEALING******************************
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Sealing')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement airSealingInstallationDate;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Sealing')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement airSealingInstallationCost;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Sealing')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement airSealingFinanced;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Sealing')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement airSealingFinancedAmount;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Sealing')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement airSealingFinancedBy;
	@FindBy(id = "m_1_sm_36_unit_0_dt_14257")
	private WebElement airSealingPreInstallationAirLeakage;
	@FindBy(id = "m_1_sm_36_unit_0_dt_14258")
	private WebElement airSealingMajorCeilingPentrationSealed;
	@FindBy(id = "m_1_sm_36_unit_0_dt_14260")
	private WebElement airSealingMajorBasementPentrationSealed;
	@FindBy(id = "m_1_sm_36_unit_0_dt_14259")
	private WebElement airSealingAttachedGarageSealed;
	@FindBy(id = "m_1_sm_36_unit_0_dt_14261")
	private WebElement airSealingWalls_WindowsSealed;
//	***************************DUCT SYSTEM******************************
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Duct')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement ductSystemInstalledDate;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Duct')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement ductSystemInstalledCost;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Duct')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement ductSystemFinanced;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Duct')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement ductSystemFinancedAmount;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Duct')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement ductSystemFinancedBy;
	@FindBy(id = "m_3_sm_37_unit_0_dt_14262")
	private WebElement ductSystemPreInstallationDuctCondition;
	@FindBy(id = "m_3_sm_37_unit_0_dt_14263")
	private WebElement ductSystemPreInstallationInsulationCondition;
	@FindBy(id = "m_3_sm_37_unit_0_dt_14264_3")
	private WebElement ductSystemTypeOfWorkPerformed_Replace;
	@FindBy(id = "m_3_sm_37_unit_0_dt_14265")
	private WebElement ductSystemLocationOfWork;
	@FindBy(id = "m_3_sm_37_unit_0_dt_14266")
	private WebElement ductSystemDuctSealed;
	@FindBy(id = "m_3_sm_37_unit_0_dt_14267")
	private WebElement ductSystemDuctSealingmaterials;
	@FindBy(id = "m_3_sm_37_unit_0_dt_15811")
	private WebElement ductSystemSystemSize;
//	****************GEOTHERMAL HEAT PUMP*****************************
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Geothermal')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement geothermalHeatPumpInstallDate;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Geothermal')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement geothermalHeatPumpInstallCost;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Geothermal')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement geothermalHeatPumpFinanced;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Geothermal')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement geothermalHeatPumpFinancedAmount;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Geothermal')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement geothermalHeatPumpFinancedBy;
	@FindBy(xpath = "(//input[@name='m_5_sm_40_unit_0_question'])[2]")
	private WebElement geothermalHeatAHRICertificateNumber_NO;
	@FindBy(id = "m_5_sm_40_unit_0_dt_14292")
	private WebElement geothermalHeatAHRIOldSystemType;
	@FindBy(id = "m_5_sm_40_unit_0_dt_14299")
	private WebElement geothermalHeatAHRISystemSize;
	@FindBy(id = "m_5_sm_40_unit_0_dt_15997")
	private WebElement geothermalHeatAHRICertificateNumber;
	@FindBy(id = "m_5_sm_40_unit_0_dt_16097")
	private WebElement geothermalHeatAHRISystemRating;
	@FindBy(id = "m_5_sm_40_unit_0_dt_16144")
	private WebElement geothermalHeatAHRIOldSystemSize;
	@FindBy(id = "m_5_sm_40_unit_0_dt_14291")
	private WebElement geothermalHeatAHRIOldSystemAge;
	@FindBy(id = "m_5_sm_40_unit_0_dt_16098")
	private WebElement geothermalHeatAHRISystemRatingSEER;
	@FindBy(id = "m_5_sm_40_unit_0_dt_14293")
	private WebElement geothermalHeatAHRIPakage;
	@FindBy(id = "m_5_sm_40_unit_0_dt_14297")
	private WebElement geothermalHeatAHRISystemRatingEER;
	@FindBy(id = "m_5_sm_40_unit_0_dt_14294")
	private WebElement geothermalHeatAHRINewSystemBrand;
	@FindBy(id = "m_5_sm_40_unit_0_dt_14298")
	private WebElement geothermalHeatAHRICOP;
	@FindBy(id = "m_5_sm_40_unit_0_dt_14295")
	private WebElement geothermalHeatAHRIOutdoorModelNo;
	@FindBy(xpath = "(//input[@id='m_5_sm_40_unit_0_dt_14296'])[1]")
	private WebElement geothermalHeatAHRIIndoorModelNo;
	@FindBy(id = "m_5_sm_40_unit_0_dt_16116")
	private WebElement geothermalHeatAHRIBtu;
//	*********************CENTRAL AIR CONDITIONING************************
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Central')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement centralAirCondInstallDate;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Central')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement centralAirCondInstallCost;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Central')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement centralAirCondFinanced;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Central')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement centralAirCondfinancedAmount;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Central')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement centralAirCondFinancedBy;
	@FindBy(xpath = "(//input[@name='m_5_sm_41_unit_0_question'])[2]")
	private WebElement centralAirCondAHRICertificateNumber_NO;
	@FindBy(id = "m_5_sm_41_unit_0_dt_15999")
	private WebElement centralAirCondAHRICertificateNumber;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14303")
	private WebElement centralAirCondAHRIPakage;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14304")
	private WebElement centralAirCondAHRINewSystemBrand;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14305")
	private WebElement centralAirCondAHRIOutdoorModelNum;
	@FindBy(xpath = "(//input[@id='m_5_sm_41_unit_0_dt_16048'])[1]")
	private WebElement centralAirCondAHRIIndoorModelNum;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14306")
	private WebElement centralAirCondAHRIEvaporatorCoilNum;
	@FindBy(id = "m_5_sm_41_unit_0_dt_16117")
	private WebElement centralAirCondAHRIBtu;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14309")
	private WebElement centralAirCondAHRISystemSize;
	@FindBy(id = "m_5_sm_41_unit_0_dt_16095")
	private WebElement centralAirCondAHRISystemRating;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14307")
	private WebElement centralAirCondAHRISystemRatingSEER;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14308")
	private WebElement centralAirCondAHRISystemRatingEER;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14301")
	private WebElement centralAirCondAHRIOldSystemAge;
	@FindBy(id = "m_5_sm_41_unit_0_dt_16051")
	private WebElement centralAirCondAHRIOldSystemSize;
	@FindBy(id = "m_5_sm_41_unit_0_dt_14302")
	private WebElement centralAirCondAHRIOldSystemType;
//	****TUNE UP FOR EXISTING HEAT PUMP OR CENTRAL AIR CONDITIONING SYSTEM****
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Tune')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement TuneUpInstallDate;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Tune')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement TuneUpInstallCost;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Tune')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement TuneUpFinanced;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Tune')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement TuneUpFinancedAmount;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Tune')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement TuneUpFinancedBy;
	@FindBy(xpath = "//label[normalize-space()='No']")
	private WebElement TuneUpAHRICertificateNumber_No;
	@FindBy(id = "m_5_sm_42_unit_0_dt_14310")
	private WebElement TuneUpAHRINoOfUnitsTunedUp;
	@FindBy(id = "m_5_sm_42_unit_0_dt_14311")
	private WebElement TuneUpAHRIApproxAgeOfSystem;
	@FindBy(id = "m_5_sm_42_unit_0_dt_16001")
	private WebElement TuneUpAHRICertificateNumber;
	@FindBy(id = "m_5_sm_42_unit_0_dt_14313")
	private WebElement TuneUpAHRIMake;
	@FindBy(id = "m_5_sm_42_unit_0_dt_14314")
	private WebElement TuneUpAHRIModel;
	@FindBy(id = "m_5_sm_42_unit_0_dt_16118")
	private WebElement TuneUpAHRIBtu;
	@FindBy(id = "m_5_sm_42_unit_0_dt_14315")
	private WebElement TuneUpAHRISystemSize;
	@FindBy(id = "m_5_sm_42_unit_0_dt_14312")
	private WebElement TuneUpAHRIPreTuneUpCondition;
	@FindBy(id = "m_5_sm_42_unit_0_dt_14316")
	private WebElement TuneUpAHRIConditionOfDuctSystem;
//	***********HEAT PUMP WATER HEATER******************
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Heat')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement heatPumpWaterHeaterInstallDate;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Heat')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement heatPumpWaterHeaterInstallCost;
	@FindBy(id = "m_7_sm_43_unit_0_dt_14317")
	private WebElement heatPumpWaterHeaterPreReplacementType;
	@FindBy(id = "m_7_sm_43_unit_0_dt_14318")
	private WebElement heatPumpWaterHeaterPreReplacementAge;
	@FindBy(id = "m_7_sm_43_unit_0_dt_14319")
	private WebElement heatPumpWaterHeaterPreReplacementSize;
	@FindBy(id = "m_7_sm_43_unit_0_dt_14323")
	private WebElement heatPumpWaterHeaterPreReplacementSpace;
	@FindBy(id = "m_7_sm_43_unit_0_dt_14320")
	private WebElement heatPumpWaterHeaterPreReplacementLocation;
	@FindBy(id = "m_7_sm_43_unit_0_dt_14321")
	private WebElement heatPumpWaterHeaterReplacementType;
	@FindBy(id = "m_7_sm_43_unit_0_dt_14322")
	private WebElement heatPumpWaterHeaterReplacementSize;
//	**********************DUAL FUEL HEAT PUMP***************************
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Dual')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement dualFuelHeatPumpInstallDate;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Dual')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement dualFuelHeatPumpInstallCost;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Dual')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement dualFuelHeatPumpFinanced;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Dual')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement dualFuelHeatPumpFinancedAmount;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Dual')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement dualFuelHeatPumpFinancedBy;
	@FindBy(xpath = "(//input[@name='m_5_sm_49_unit_0_question'])[2]")
	private WebElement dualFuelHeatPumpAHRICertificateNumber_No;
	@FindBy(id = "m_5_sm_49_unit_0_dt_16121")
	private WebElement dualFuelHeatPumpAHRIOldSystemSize;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14345")
	private WebElement dualFuelHeatPumpAHRIOldSystemAge;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14346")
	private WebElement dualFuelHeatPumpAHRIOldSystemType;
	@FindBy(id = "m_5_sm_49_unit_0_dt_16003")
	private WebElement dualFuelHeatPumpAHRICertificateNumber;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14347")
	private WebElement dualFuelHeatPumpAHRIPakage;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14348")
	private WebElement dualFuelHeatPumpAHRINewSytemBrand;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14349")
	private WebElement dualFuelHeatPumpAHRIOutDoorModelNumber;
	@FindBy(xpath = "(//input[@id='m_5_sm_49_unit_0_dt_14350'])[1]")
	private WebElement dualFuelHeatPumpAHRIIndoorModelNumber;
	@FindBy(id = "m_5_sm_49_unit_0_dt_16096")
	private WebElement dualFuelHeatPumpAHRISystemRating;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14351")
	private WebElement dualFuelHeatPumpAHRISystemRatingSEER;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14352")
	private WebElement dualFuelHeatPumpAHRISystemRatingEER;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14353")
	private WebElement dualFuelHeatPumpAHRIHSPF;
	@FindBy(id = "m_5_sm_49_unit_0_dt_16119")
	private WebElement dualFuelHeatPumpAHRIBtu;
	@FindBy(id = "m_5_sm_49_unit_0_dt_14354")
	private WebElement dualFuelHeatPumpAHRISystemSize;
//	**************AIR SOURCE HEAT PUMP*********************************
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Source')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement airSourceHeatPumpInstallDate;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Source')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement airSourceHeatPumpInstallCost;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Source')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement airSourceHeatPumpFinanced;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Source')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement airSourceHeatPumpFinancedAmount;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Air Source')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement airSourceHeatPumpFinancedBy;
	@FindBy(xpath = "(//input[@name='m_5_sm_56_unit_0_question'])[2]")
	private WebElement airSourceHeatPumpAHRICertificateNumber_No;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16030")
	private WebElement airSourceHeatPumpAHRINoOfSystem;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16046")
	private WebElement airSourceHeatPumpAHRICertificateNumber;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16031")
	private WebElement airSourceHeatPumpAHRIType;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16032")
	private WebElement airSourceHeatPumpAHRIPakage;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16033")
	private WebElement airSourceHeatPumpAHRINewSytemBrand;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16034")
	private WebElement airSourceHeatPumpAHRIOutDoorModelNumber;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16035")
	private WebElement airSourceHeatPumpAHRIIndoorModelNumber;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16113")
	private WebElement airSourceHeatPumpAHRIBtu;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16036")
	private WebElement airSourceHeatPumpAHRISystemSize;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16092")
	private WebElement airSourceHeatPumpAHRISystemRating;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16037")
	private WebElement airSourceHeatPumpAHRISystemRatingSEER;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16039")
	private WebElement airSourceHeatPumpAHRISystemRatingEER;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16041")
	private WebElement airSourceHeatPumpAHRISystemRatingHSPF;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16043")
	private WebElement airSourceHeatPumpAHRIOldSystemAge;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16044")
	private WebElement airSourceHeatPumpAHRIOldSystemSize;
	@FindBy(id = "m_5_sm_56_unit_0_dt_16045")
	private WebElement airSourceHeatPumpAHRIOldSystemType;
//	****************MINI-SPLIT**********************************************
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Mini')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement miniSplitInstallDate;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Mini')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement miniSplitInstallCost;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Mini')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement miniSplitFinanced;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Mini')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement miniSplitFinancedAmount;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Mini')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement miniSplitFinancedBy;
	@FindBy(xpath = "(//input[@name='m_5_sm_57_unit_0_question'])[2]")
	private WebElement miniSplitAHRICertificateNumber_No;

	@FindBy(id = "m_5_sm_57_unit_0_dt_16057")
	private WebElement miniSplitAHRICertificateNumber;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16059")
	private WebElement miniSplitAHRIPakage;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16060")
	private WebElement miniSplitAHRILocation;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16061")
	private WebElement miniSplitAHRIDuctSealed;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16062")
	private WebElement miniSplitAHRIDuctSeallingMaterials;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16063")
	private WebElement miniSplitAHRINewSytemBrand;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16064")
	private WebElement miniSplitAHRIOutDoorModelNumber;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16065")
	private WebElement miniSplitAHRIIndoorModelNumber;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16114")
	private WebElement miniSplitAHRIBtu;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16066")
	private WebElement miniSplitAHRISystemSize;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16093")
	private WebElement miniSplitAHRISystemRating;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16067")
	private WebElement miniSplitAHRISystemRatingSEER;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16069")
	private WebElement miniSplitAHRISystemRatingEER;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16071")
	private WebElement miniSplitAHRIOldSystemAge;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16072")
	private WebElement miniSplitAHRIOldSystemSize;
	@FindBy(id = "m_5_sm_57_unit_0_dt_16073")
	private WebElement miniSplitAHRIOldSystemType;
//	*****************TVA PREFERRED AIR SOURCE HEAT PUMP*******************
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'TVA Preferred Air')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement TVAPreferredAirInstallDate;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'TVA Preferred Air')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement TVAPreferredAirInstallCost;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'TVA Preferred Air')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement TVAPreferredAirFinanced;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'TVA Preferred Air')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement TVAPreferredAirFinancedAmount;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'TVA Preferred Air')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement TVAPreferredAirFinancedBy;
	@FindBy(xpath = "(//input[@name='m_5_sm_58_unit_0_question'])[2]")
	private WebElement TVAPreferredAirAHRICertificateNumber_No;

	@FindBy(id = "m_5_sm_58_unit_0_dt_16075")
	private WebElement TVAPreferredAirAHRICertificateNumber;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16077")
	private WebElement TVAPreferredAirAHRIPakage;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16145")
	private WebElement TVAPreferredAirAHRIDuctType;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16078")
	private WebElement TVAPreferredAirAHRINewSytemBrand;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16079")
	private WebElement TVAPreferredAirAHRIOutDoorModelNumber;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16080")
	private WebElement TVAPreferredAirAHRIIndoorModelNumber;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16166")
	private WebElement TVAPreferredAirAHRIHeatingCapacityAt17D;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16115")
	private WebElement TVAPreferredAirAHRIBtu;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16081")
	private WebElement TVAPreferredAirAHRISystemSize;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16094")
	private WebElement TVAPreferredAirAHRISystemRating;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16082")
	private WebElement TVAPreferredAirAHRISystemRatingSEER;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16084")
	private WebElement TVAPreferredAirAHRISystemRatingEER;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16086")
	private WebElement TVAPreferredAirAHRIHSPF;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16088")
	private WebElement TVAPreferredAirAHRIOldSystemAge;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16089")
	private WebElement TVAPreferredAirAHRIOldSystemSize;
	@FindBy(id = "m_5_sm_58_unit_0_dt_16090")
	private WebElement TVAPreferredAirAHRIOldSystemType;
//	*************************FLOOR INSULATION*******************
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Floor Insulation')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement floorInsulationInstallDate;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Floor Insulation')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement floorInsulationInstallCost;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Floor Insulation')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement floorInsulationFinanced;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Floor Insulation')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement floorInsulationFinancedAmount;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Floor Insulation')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement floorInsulationFinancedBy;
	@FindBy(id = "m_10_sm_59_unit_0_dt_16053")
	private WebElement floorInsulationInitialRValue;
	@FindBy(id = "m_10_sm_59_unit_0_dt_16054")
	private WebElement floorInsulationCoverageArea;
	@FindBy(id = "m_10_sm_59_unit_0_dt_16055")
	private WebElement floorInsulationTypeOfInsulationInstalled;
	@FindBy(id = "m_10_sm_59_unit_0_dt_16056")
	private WebElement floorInsulationFinalRValue;
//	***********************WALL INSULATION***************************
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Wall')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement wallInsulationInstallDate;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Wall')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement wallInsulationInstallCost;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Wall')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement wallInsulationFinanced;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Wall')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement wallInsulationFinancedAmount;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Wall')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement wallInsulationFinancedBy;
	@FindBy(id = "m_10_sm_110_unit_0_dt_2183")
	private WebElement wallInsulationExists;
	@FindBy(id = "m_10_sm_110_unit_0_dt_16052")
	private WebElement wallInsulationCoverageArea;
//	************************STORM WINDOW ADDED TO SINGLE PANED WINDOW****************
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Storm')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement stormWindowInstallDate;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Storm')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement stormWindowInstallCost;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Storm')]//following::input[contains(@id,'InstallInformations_0__InstallQuantity')])[1]")
	private WebElement stormWindowInstallQuantity;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Storm')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement stormWindowFinanced;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Storm')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement stormWindowFinancedAmount;
	@FindBy(xpath = "(//h4[contains(normalize-space(),'Storm')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement stormWindowFinancedBy;
	@FindBy(id = "m_9_sm_44_unit_0_dt_14325")
	private WebElement stormWindowTotalSquared;
//	***********************WINDOW*****************************************************
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Window')]//following::input[contains(@id,'InstallInformations_0__InstallDate')])[1]")
	private WebElement windowInstallDate;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Window')]//following::input[contains(@id,'InstallInformations_0__InstallCost')])[1]")
	private WebElement windowInstallCost;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Window')]//following::input[contains(@id,'InstallInformations_0__InstallQuantity')])[1]")
	private WebElement windowInstallQuantity;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Window')]//following::select[contains(@id,'Financed')])[1]")
	private WebElement windowFinanced;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Window')]//following::input[contains(@id,'financeAmount')])[1]")
	private WebElement windowFinancedAmount;
	@FindBy(xpath = "(//h4[starts-with(normalize-space(),'Window')]//following::select[contains(@id,'FinancedBy')])[1]")
	private WebElement windowFinancedBy;
	@FindBy(id = "m_9_sm_46_unit_0_dt_14329")
	private WebElement windowOldWindowType;
	@FindBy(id = "m_9_sm_46_unit_0_dt_14326")
	private WebElement windowReplacementUFactor;
	@FindBy(id = "m_9_sm_46_unit_0_dt_14327")
	private WebElement windowReplacementSHGC;
//	**************************ProjectSubmitConfirmation**************************
	@FindBy(id = "btnSaveAsDraft")
	private WebElement projectSaveDraftBtn;
	@FindBy(id = "btnContnue")
	private WebElement projectDetailsContinueBtn;
	@FindBy(name = "ProgramIncentiveDocTypeList[0].files")
	private WebElement projectDocumentUploadBtn;
	@FindBy(id = "btnSubmit")
	private WebElement projectSubmitBtn;
//	****************
	@FindBy(id = "drpProgramList")
	private WebElement selectedProgramDrop;
	@FindBy(xpath = "//span[normalize-space()='Accounting']")
	private WebElement accountingDrop;
	@FindBy(xpath = "//span[@class='rmText rmExpandRight'][normalize-space()='Projects']")
	private WebElement accountingDropProjects;
	@FindBy(xpath = "(//span[@class='rmText'][normalize-space()='Requests'])[3]")
	private WebElement accounting_ProjectsDropRequest;
	@FindBy(xpath = "(//span[@class='rmText'][normalize-space()='In Process'])[4]")
	private WebElement accounting_ProjectsDropInProcess;
	@FindBy(id = "ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_ProgramIncentiveUniqueID")
	private WebElement projectsIDSearch;
	@FindBy(id = "ctl00_Work_uxRadGrid_ctl00_ctl04_lnkName")
	private WebElement clickOnSelectedproject;
	@FindBy(id = "ctl00_Work_uxSave")
	private WebElement accountinProjectInProcessChangeStatusBtn;
	@FindBy(id = "ctl00_Work_uxUS_cmbStatus")
	private WebElement userListDialogStatus;
	@FindBy(id = "ctl00_Work_uxUS_cmbDocPass")
	private WebElement userListDialogDocumentPass;// UserListDialog'
	@FindBy(id = "ctl00_Work_uxUS_uxSave")
	private WebElement userListDialogSave;

	public RsContractorProjectSubmit() {
		PageFactory.initElements(getDriver(), this);
	}

	public void rsContractorLogin(String userna, String passw) {
		action.click(getDriver(), selectProgramResidentialServices);
		action.type(residentialServicesContractorUsername, userna);
		action.type(residentialServicesContractorPassword, passw);
		action.click(getDriver(), residentialServicesContractorSignin);
	}

	public void rsContractorCustomerSearch(String house, String lastnam, String zip) {
		action.click(getDriver(), newProjectApplication);
		action.type(houseNo, house);
		action.type(lastname, lastnam);
		action.type(zipCode, zip);
		action.click(getDriver(), customerSearchBtn);
		action.click(getDriver(), customerSelectBtn);
	}

	public void rsContractorCustomerRegistration(String customerEmail, String homeAddress, String firstName,
			String lastName, String phoneNo) {
		action.click(getDriver(), newProjectApplication);
		action.click(getDriver(), registerCustomer);
		action.type(registerCustomerEmail, customerEmail);
		action.click(getDriver(), registerCustomerEmailContinueBtn);
		action.type(registerCustomerHomeAddress, homeAddress);
		action.click(getDriver(), registerCustomerHomeAddressContinueBtn);
		action.explicitWait(getDriver(), registerCustomerUtilitySelect);
		action.click(getDriver(), registerCustomerUtilitySelect);
		action.click(getDriver(), registerCustomerUtilitySelectContinueBtn);
		action.type(registerCustomerFirstName, firstName);
		action.type(registerCustomerLastname, lastName);
		action.type(registerCustomerPhoneNo, phoneNo);
//		action.JSClick(getDriver(), registerCustomerMailingAddressSame);
		action.explicitWait(getDriver(), utilityCreateAccountBtn);
		action.JSClick(getDriver(), utilityCreateAccountBtn);
//		action.moveToElement(getDriver(), utilityCreateAccountBtn);
//		action.JSClick(getDriver(), utilityCreateAccountBtn);
		action.explicitWait(getDriver(), registerCustomerCreateUpgradeBtn);
		action.click(getDriver(), registerCustomerCreateUpgradeBtn);

	}

	public void rsContractorCustomerNewProject(Object airSealingSelec, Object atticInsulationSelec,
			Object ductSystemSelec, Object waterHeatingSelec, Object floorInsulationSelec, Object wallInsulationSelec,
			Object stormWindowSelec, Object windowSelec, Object geothermalHeatPumpSelec,
			Object centralAirConditioningSelec, Object TuneUpSelec, Object DualFuelHeatPumpSelec,
			Object airSourceHeatPumpSelec, Object miniSplitSelec, Object TVAPreferredAirSourceSelec) {
		action.click(getDriver(), newProjectBtn);
		action.explicitWait(getDriver(), airSealingSelect);
		if (airSealingSelec.equals("yes")) {
			action.click(getDriver(), airSealingSelect);
		}
		if (atticInsulationSelec.equals("yes")) {
			action.click(getDriver(), atticInsulationSelect);
		}
		if (ductSystemSelec.equals("yes")) {
			action.click(getDriver(), ductSystemSelect);
		}
		if (waterHeatingSelec.equals("yes")) {
			action.click(getDriver(), waterHeatingSelect);
		}
		if (floorInsulationSelec.equals("yes")) {
			action.click(getDriver(), floorInsulationSelect);// other insulation
		}
		if (wallInsulationSelec.equals("yes")) {
			action.click(getDriver(), wallInsulationSelect);// other insulation
		}
		if (stormWindowSelec.equals("yes")) {
			action.click(getDriver(), stormWindowSelect);// it removed from Application.
		}
		if (windowSelec.equals("yes")) {
			action.JSClick(getDriver(), windowSelect);
		}
		if (geothermalHeatPumpSelec.equals("yes")) {
			action.explicitWait(getDriver(), geothermalHeatPumpSelect);
		}
		if (geothermalHeatPumpSelec.equals("yes")) {

			action.JSClick(getDriver(), geothermalHeatPumpSelect);// HVAC System
		}
		if (centralAirConditioningSelec.equals("yes")) {
			action.JSClick(getDriver(), centralAirConditioningSelect);// HVAC System
		}
		if (TuneUpSelec.equals("yes")) {
			action.JSClick(getDriver(), TuneUpSelect);// HVAC System
		}
		if (DualFuelHeatPumpSelec.equals("yes")) {
			action.JSClick(getDriver(), DualFuelHeatPumpSelect);// HVAC System
		}
		if (airSourceHeatPumpSelec.equals("yes")) {
			action.JSClick(getDriver(), airSourceHeatPumpSelect);// HVAC System
		}
		if (miniSplitSelec.equals("yes")) {
			action.JSClick(getDriver(), miniSplitSelect);// HVAC System
		}
		if (TVAPreferredAirSourceSelec.equals("yes")) {
			action.JSClick(getDriver(), TVAPreferredAirSourceSelect);// HVAC System
		}
		action.moveToElement(getDriver(), measuresSelectContinueBtn);
		action.JSClick(getDriver(), measuresSelectContinueBtn);
		action.fluentWait(getDriver(), projectDetailsContinueBtn);
	}

	public void rsContractorCustomerProjectDetails_AirSealing(String installDate, String installCost, String yes,
			String financedAmount, String finaby, String airLeakage, String ceilingpentrationsealed,
			String attachedgarasealed, String basementpentrationsealed, String wallsealed) {
		action.explicitWait(getDriver(), airSealingInstallationDate);
		action.type(airSealingInstallationDate, installDate);
		action.type(airSealingInstallationCost, installCost);
		action.selectByVisibleText(yes, airSealingFinanced);
		action.type(airSealingFinancedAmount, financedAmount);
		action.selectByVisibleText(finaby, airSealingFinancedBy);
		action.explicitWait(getDriver(), airSealingPreInstallationAirLeakage);
		action.selectByVisibleText(airLeakage, airSealingPreInstallationAirLeakage);
		action.selectByVisibleText(ceilingpentrationsealed, airSealingMajorCeilingPentrationSealed);
		action.selectByVisibleText(basementpentrationsealed, airSealingMajorBasementPentrationSealed);
		action.selectByVisibleText(attachedgarasealed, airSealingAttachedGarageSealed);
		action.selectByVisibleText(wallsealed, airSealingWalls_WindowsSealed);

	}

	public void rsContractorCustomerProjectDetails_DuctSystem(String installDate, String installCost, String yes,
			String financedAmount, String finaby, String ductCondition, String insulationCondition, String locationWork,
			String ductSealed, String sealingMaterials, String systemSize) throws InterruptedException {
		action.explicitWait(getDriver(), ductSystemInstalledDate);
		action.type(ductSystemInstalledDate, installDate);
		action.type(ductSystemInstalledCost, installCost);
		action.selectByVisibleText(yes, ductSystemFinanced);
		action.type(ductSystemFinancedAmount, financedAmount);
		action.selectByVisibleText(finaby, ductSystemFinancedBy);
		action.explicitWait(getDriver(), ductSystemPreInstallationDuctCondition);
		action.selectByVisibleText(ductCondition, ductSystemPreInstallationDuctCondition);
		action.selectByVisibleText(insulationCondition, ductSystemPreInstallationInsulationCondition);
		action.click(getDriver(), ductSystemTypeOfWorkPerformed_Replace);
		action.selectByVisibleText(locationWork, ductSystemLocationOfWork);
		action.selectByVisibleText(ductSealed, ductSystemDuctSealed);
		action.selectByVisibleText(sealingMaterials, ductSystemDuctSealingmaterials);
		action.selectByVisibleText(systemSize, ductSystemSystemSize);

	}

	public void rsContractorCustomerProjectDetails_AtticInsulation(String installDate, String installCost, String yes,
			String financedAmount, String finaby, String intialRValue, String finalRValue, String coveragearea,
			String typeInsulation) {
		action.explicitWait(getDriver(), atticInsulationInstallDate);
		action.type(atticInsulationInstallDate, installDate);
		action.type(atticInsulationCost, installCost);
		action.selectByVisibleText(yes, atticInsulationFinanced);
		action.type(atticInsulationFinanceAmount, financedAmount);
		action.selectByVisibleText(finaby, atticInsulationFinancedBy);
		action.explicitWait(getDriver(), atticInsulationIntialRValue);
		action.type(atticInsulationIntialRValue, intialRValue);
		action.type(atticInsulationCoverageArea, coveragearea);
		action.selectByVisibleText(typeInsulation, atticInsulationtypesOfInsulationinstalled);
		action.type(atticInsulationFinalRValue, finalRValue);
		action.JSClick(getDriver(), atticInsulationKneeWallesYes);
		action.explicitWait(getDriver(), atticInsulationKneeWallInsulationLessThanR11No);
		action.JSClick(getDriver(), atticInsulationKneeWallInsulationLessThanR11No);

	}

	public void rsContractorCustomerProjectDetails_GeothermalHeatPump(String installDate, String installCost,
			String yes, String financedAmount, String finby, String oldSystemType, String oldSystemSize,
			String systemSize, String certificateNo, String systemRating, String oldSystemAge, String seer,
			String pakage, String eer, String newSystemBrand, String cop, String outdoorModel, String indoorModel,
			String btu) {
		action.explicitWait(getDriver(), geothermalHeatPumpInstallDate);
		action.type(geothermalHeatPumpInstallDate, installDate);
		action.type(geothermalHeatPumpInstallCost, installCost);
		action.selectByVisibleText(yes, geothermalHeatPumpFinanced);
		action.type(geothermalHeatPumpFinancedAmount, financedAmount);
		action.selectByVisibleText(finby, geothermalHeatPumpFinancedBy);

		action.JSClick(getDriver(), geothermalHeatAHRICertificateNumber_NO);
//		action.fluentWait(getDriver(), geothermalHeatAHRICertificateNumber);
		action.explicitWait(getDriver(), geothermalHeatAHRICertificateNumber);
		action.type(geothermalHeatAHRICertificateNumber, certificateNo);
		action.selectByVisibleText(oldSystemType, geothermalHeatAHRIOldSystemType);
		action.selectByVisibleText(oldSystemSize, geothermalHeatAHRIOldSystemSize);
		action.selectByVisibleText(oldSystemAge, geothermalHeatAHRIOldSystemAge);
		action.selectByVisibleText(pakage, geothermalHeatAHRIPakage);
//		action.fluentWait(getDriver(), geothermalHeatAHRINewSystemBrand);
		action.explicitWait(getDriver(), geothermalHeatAHRINewSystemBrand);
		action.type(geothermalHeatAHRINewSystemBrand, newSystemBrand);
		action.type(geothermalHeatAHRIOutdoorModelNo, outdoorModel);
		action.type(geothermalHeatAHRIIndoorModelNo, indoorModel);
		action.type(geothermalHeatAHRIBtu, btu);
		action.selectByVisibleText(systemSize, geothermalHeatAHRISystemSize);
		action.selectByVisibleText(systemRating, geothermalHeatAHRISystemRating);
		action.fluentWait(getDriver(), geothermalHeatAHRISystemRatingSEER);
		action.explicitWait(getDriver(), geothermalHeatAHRISystemRatingSEER);
		action.type(geothermalHeatAHRISystemRatingSEER, seer);
		action.type(geothermalHeatAHRISystemRatingEER, eer);
		action.type(geothermalHeatAHRICOP, cop);
		action.JSClick(getDriver(), projectSaveDraftBtn);

	}

	public void rsContractorCustomerProjectDetails_CentralAirConditioning(String installDate, String installCost,
			String yes, String financedAmount, String finby, String certificateNum, String pakage,
			String newSystemBrand, String indoor, String outdoor, String coilNum, String btu, String systemSize,
			String systemRating, String seer, String eer, String oldAge, String oldSize, String oldType) {
		action.explicitWait(getDriver(), centralAirCondInstallDate);
		action.type(centralAirCondInstallDate, installDate);
		action.type(centralAirCondInstallCost, installCost);
		action.selectByVisibleText(yes, centralAirCondFinanced);
		action.type(centralAirCondfinancedAmount, financedAmount);
		action.selectByVisibleText(finby, centralAirCondFinancedBy);

		action.JSClick(getDriver(), centralAirCondAHRICertificateNumber_NO);
		action.fluentWait(getDriver(), centralAirCondAHRICertificateNumber);
		action.explicitWait(getDriver(), centralAirCondAHRICertificateNumber);
		action.type(centralAirCondAHRICertificateNumber, certificateNum);
		action.selectByVisibleText(pakage, centralAirCondAHRIPakage);
		action.fluentWait(getDriver(), centralAirCondAHRINewSystemBrand);
		action.pageLoadTimeOut(getDriver());
		action.type(centralAirCondAHRINewSystemBrand, newSystemBrand);
		action.type(centralAirCondAHRIOutdoorModelNum, outdoor);
		action.type(centralAirCondAHRIIndoorModelNum, indoor);
		// action.type(centralAirCondAHRIEvaporatorCoilNum, coilNum);
		action.type(centralAirCondAHRIBtu, btu);
		action.selectByVisibleText(systemSize, centralAirCondAHRISystemSize);
		action.selectByVisibleText(systemRating, centralAirCondAHRISystemRating);
		action.fluentWait(getDriver(), centralAirCondAHRISystemRatingSEER);
		action.pageLoadTimeOut(getDriver());
		action.type(centralAirCondAHRISystemRatingSEER, seer);
		action.type(centralAirCondAHRISystemRatingEER, eer);
		action.selectByVisibleText(oldAge, centralAirCondAHRIOldSystemAge);
		action.selectByVisibleText(oldSize, centralAirCondAHRIOldSystemSize);
		action.selectByVisibleText(oldType, centralAirCondAHRIOldSystemType);
		action.JSClick(getDriver(), projectSaveDraftBtn);

	}

	public void rsContractorCustomerProjectDetails_TuneUp(String installDate, String installCost, String noOfUnits,
			String yes, String financedAmount, String finby, String approxAge, String certificateNum, String make,
			String model, String btu, String systemSize, String preTuneUpCon, String conditionOfductSystem) {
		action.explicitWait(getDriver(), TuneUpInstallDate);
		action.type(TuneUpInstallDate, installDate);
		action.type(TuneUpInstallCost, installCost);
//		action.selectByVisibleText(yes, TuneUpFinanced);
//		action.type(TuneUpFinancedAmount, financedAmount);
//		action.selectByVisibleText(finby, TuneUpFinancedBy);
//		action.JSClick(getDriver(), TuneUpAHRICertificateNumber_No);
		action.explicitWait(getDriver(), TuneUpAHRIApproxAgeOfSystem);
		action.selectByVisibleText(noOfUnits, TuneUpAHRINoOfUnitsTunedUp);
		action.selectByVisibleText(approxAge, TuneUpAHRIApproxAgeOfSystem);
//		action.type(TuneUpAHRICertificateNumber, certificateNum);
		action.type(TuneUpAHRIMake, make);
		action.type(TuneUpAHRIModel, model);
		action.type(TuneUpAHRIBtu, btu);
		action.selectByVisibleText(systemSize, TuneUpAHRISystemSize);
		action.selectByVisibleText(preTuneUpCon, TuneUpAHRIPreTuneUpCondition);
		action.selectByVisibleText(conditionOfductSystem, TuneUpAHRIConditionOfDuctSystem);
	}

	public void rsContractorCustomerProjectDetails_HeatPumpWaterHeater(String installDate, String installcost,
			String preRepType, String preRepAge, String preRepSize, String preRepSpace, String preReplocation,
			String repType, String repSize) {
		action.explicitWait(getDriver(), heatPumpWaterHeaterInstallDate);
		action.type(heatPumpWaterHeaterInstallDate, installDate);
		action.type(heatPumpWaterHeaterInstallCost, installcost);
		action.selectByVisibleText(preRepType, heatPumpWaterHeaterPreReplacementType);
		action.selectByVisibleText(preRepAge, heatPumpWaterHeaterPreReplacementAge);
		action.selectByVisibleText(preRepSize, heatPumpWaterHeaterPreReplacementSize);
		action.selectByVisibleText(preRepSpace, heatPumpWaterHeaterPreReplacementSpace);
		action.selectByVisibleText(preReplocation, heatPumpWaterHeaterPreReplacementLocation);
		action.selectByVisibleText(repType, heatPumpWaterHeaterReplacementType);
		action.selectByVisibleText(repSize, heatPumpWaterHeaterReplacementSize);

	}

	public void rsContractorCustomerProjectDetails_StormWindow(String installDate, String installCost, String yes,
			String financedAmount, String finby, String totalsqr, String installquantity) {
		action.type(stormWindowInstallDate, installDate);// storm window measure removed from LIST
		action.type(stormWindowInstallCost, installCost);
		action.selectByVisibleText(yes, stormWindowFinanced);
		action.type(stormWindowFinancedAmount, financedAmount);
		action.selectByVisibleText(finby, stormWindowFinancedBy);
		action.type(stormWindowTotalSquared, totalsqr);
		action.type(stormWindowInstallQuantity, installquantity);
	}

	public void rsContractorCustomerProjectDetails_Window(String installDate, String installCost, String yes,
			String financedAmount, String finby, String oldWindowtype, String installquantity, String ufactor,
			String shgc) {
		action.explicitWait(getDriver(), windowInstallDate);
		action.type(windowInstallDate, installDate);
		action.type(windowInstallCost, installCost);
//		action.selectByVisibleText(yes, windowFinanced);
//		action.type(windowFinancedAmount, financedAmount);
//		action.selectByVisibleText(finby, windowFinancedBy);
		action.selectByVisibleText(oldWindowtype, windowOldWindowType);
		action.type(windowInstallQuantity, installquantity);
		action.type(windowReplacementUFactor, ufactor);
		action.type(windowReplacementSHGC, shgc);
	}

	public void rsContractorCustomerProjectDetails_DualFuelHeatPump(String installDate, String installCost, String yes,
			String financedAmount, String finby, String oldSize, String oldAge, String oldType, String certificatNum,
			String pakage, String brand, String indoor, String outdoor, String systemrating, String seer, String eer,
			String hspf, String btu, String size) {
		action.explicitWait(getDriver(), dualFuelHeatPumpInstallDate);
		action.type(dualFuelHeatPumpInstallDate, installDate);
		action.type(dualFuelHeatPumpInstallCost, installCost);
		action.selectByVisibleText(yes, dualFuelHeatPumpFinanced);
		action.type(dualFuelHeatPumpFinancedAmount, financedAmount);
		action.selectByVisibleText(finby, dualFuelHeatPumpFinancedBy);

		action.JSClick(getDriver(), dualFuelHeatPumpAHRICertificateNumber_No);
		action.fluentWait(getDriver(), dualFuelHeatPumpAHRICertificateNumber);
		action.explicitWait(getDriver(), dualFuelHeatPumpAHRICertificateNumber);
		action.type(dualFuelHeatPumpAHRICertificateNumber, certificatNum);
		action.selectByVisibleText(oldSize, dualFuelHeatPumpAHRIOldSystemSize);
		action.selectByVisibleText(oldAge, dualFuelHeatPumpAHRIOldSystemAge);
		action.selectByVisibleText(oldType, dualFuelHeatPumpAHRIOldSystemType);
		action.selectByVisibleText(pakage, dualFuelHeatPumpAHRIPakage);
		action.fluentWait(getDriver(), dualFuelHeatPumpAHRINewSytemBrand);
		action.explicitWait(getDriver(), dualFuelHeatPumpAHRINewSytemBrand);
		action.type(dualFuelHeatPumpAHRINewSytemBrand, brand);
		action.type(dualFuelHeatPumpAHRIOutDoorModelNumber, outdoor);
		action.type(dualFuelHeatPumpAHRIIndoorModelNumber, indoor);
		action.type(dualFuelHeatPumpAHRIBtu, btu);
		action.selectByVisibleText(size, dualFuelHeatPumpAHRISystemSize);
		action.selectByVisibleText(systemrating, dualFuelHeatPumpAHRISystemRating);
		action.fluentWait(getDriver(), dualFuelHeatPumpAHRISystemRatingSEER);
		action.explicitWait(getDriver(), dualFuelHeatPumpAHRISystemRatingSEER);
		action.type(dualFuelHeatPumpAHRISystemRatingSEER, seer);
		action.type(dualFuelHeatPumpAHRISystemRatingEER, eer);
		action.type(dualFuelHeatPumpAHRIHSPF, hspf);

	}

	public void rsContractorCustomerProjectDetails_AirSourceHeatPump(String installDate, String installCost, String yes,
			String financedAmount, String finby, String noOfSystem, String certificatNum, String type, String pakage,
			String brand, String outdoor, String indoor, String btu, String size, String systemrating, String seer,
			String eer, String hspf, String oldSize, String oldAge, String oldType) {
		action.explicitWait(getDriver(), airSourceHeatPumpInstallDate);
		action.type(airSourceHeatPumpInstallDate, installDate);
		action.type(airSourceHeatPumpInstallCost, installCost);
		action.selectByVisibleText(yes, airSourceHeatPumpFinanced);
		action.type(airSourceHeatPumpFinancedAmount, financedAmount);
		action.selectByVisibleText(finby, airSourceHeatPumpFinancedBy);
		action.JSClick(getDriver(), airSourceHeatPumpAHRICertificateNumber_No);
		action.fluentWait(getDriver(), airSourceHeatPumpAHRINoOfSystem);
		action.explicitWait(getDriver(), airSourceHeatPumpAHRINoOfSystem);
		action.type(airSourceHeatPumpAHRINoOfSystem, noOfSystem);
		action.type(airSourceHeatPumpAHRICertificateNumber, certificatNum);
		action.selectByVisibleText(type, airSourceHeatPumpAHRIType);
		action.selectByVisibleText(pakage, airSourceHeatPumpAHRIPakage);
		action.fluentWait(getDriver(), airSourceHeatPumpAHRINewSytemBrand);
		action.explicitWait(getDriver(), airSourceHeatPumpAHRINewSytemBrand);
		action.type(airSourceHeatPumpAHRINewSytemBrand, brand);
		action.type(airSourceHeatPumpAHRIOutDoorModelNumber, outdoor);
		action.type(airSourceHeatPumpAHRIIndoorModelNumber, indoor);
		action.type(airSourceHeatPumpAHRIBtu, btu);
		action.selectByVisibleText(size, airSourceHeatPumpAHRISystemSize);
		action.selectByVisibleText(systemrating, airSourceHeatPumpAHRISystemRating);
		action.fluentWait(getDriver(), airSourceHeatPumpAHRISystemRatingSEER);
		action.explicitWait(getDriver(), airSourceHeatPumpAHRISystemRatingSEER);
		action.type(airSourceHeatPumpAHRISystemRatingSEER, seer);
		action.type(airSourceHeatPumpAHRISystemRatingEER, eer);
		action.type(airSourceHeatPumpAHRISystemRatingHSPF, hspf);
		action.selectByVisibleText(oldSize, airSourceHeatPumpAHRIOldSystemSize);
		action.selectByVisibleText(oldAge, airSourceHeatPumpAHRIOldSystemAge);
		action.selectByVisibleText(oldType, airSourceHeatPumpAHRIOldSystemType);
	}

	public void rsContractorCustomerProjectDetails_MiniSplit(String installDate, String installCost, String yes,
			String financedAmount, String finby, String certificatNum, String pakage, String location,
			String ductSealed, String ductSealeMate, String brand, String outdoor, String indoor, String btu,
			String size, String systemrating, String seer, String eer, String oldSize, String oldAge, String oldType)
			throws InterruptedException {
		action.explicitWait(getDriver(), miniSplitInstallDate);
		action.type(miniSplitInstallDate, installDate);
		action.type(miniSplitInstallCost, installCost);
		action.selectByVisibleText(yes, miniSplitFinanced);
		action.type(miniSplitFinancedAmount, financedAmount);
		action.selectByVisibleText(finby, miniSplitFinancedBy);
		action.JSClick(getDriver(), miniSplitAHRICertificateNumber_No);
		Thread.sleep(10000);
//		action.fluentWait(getDriver(), miniSplitAHRICertificateNumber);
		action.explicitWait(getDriver(), miniSplitAHRICertificateNumber);
		action.type(miniSplitAHRICertificateNumber, certificatNum);
		action.selectByVisibleText(pakage, miniSplitAHRIPakage);
		Thread.sleep(10000);
//		action.fluentWait(getDriver(), miniSplitAHRILocation);
		action.explicitWait(getDriver(), miniSplitAHRILocation);
		action.selectByVisibleText(location, miniSplitAHRILocation);
		action.selectByVisibleText(ductSealed, miniSplitAHRIDuctSealed);
		action.selectByVisibleText(ductSealeMate, miniSplitAHRIDuctSeallingMaterials);
		action.type(miniSplitAHRINewSytemBrand, brand);
		action.type(miniSplitAHRIOutDoorModelNumber, outdoor);
		action.type(miniSplitAHRIIndoorModelNumber, indoor);
		action.type(miniSplitAHRIBtu, btu);
		action.selectByVisibleText(size, miniSplitAHRISystemSize);
		action.selectByVisibleText(systemrating, miniSplitAHRISystemRating);
		action.fluentWait(getDriver(), miniSplitAHRISystemRatingSEER);
		action.explicitWait(getDriver(), miniSplitAHRISystemRatingSEER);
		action.type(miniSplitAHRISystemRatingSEER, seer);
		action.type(miniSplitAHRISystemRatingEER, eer);
		action.selectByVisibleText(oldSize, miniSplitAHRIOldSystemSize);
		action.selectByVisibleText(oldAge, miniSplitAHRIOldSystemAge);
		action.selectByVisibleText(oldType, miniSplitAHRIOldSystemType);
	}

	public void rsContractorCustomerProjectDetails_TVAPreferredAirSourceHeatPump(String installDate, String installCost,
			String yes, String financedAmount, String finby, String certificatNum, String pakage, String ductType,
			String brand, String outdoor, String indoor, String at17degree, String btu, String size,
			String systemrating, String seer, String eer, String hspf, String oldSize, String oldAge, String oldType)
			throws InterruptedException {
		action.explicitWait(getDriver(), TVAPreferredAirInstallDate);
		action.type(TVAPreferredAirInstallDate, installDate);
		action.type(TVAPreferredAirInstallCost, installCost);
		action.selectByVisibleText(yes, TVAPreferredAirFinanced);
		action.type(TVAPreferredAirFinancedAmount, financedAmount);
		action.selectByVisibleText(finby, TVAPreferredAirFinancedBy);
		action.JSClick(getDriver(), TVAPreferredAirAHRICertificateNumber_No);
		Thread.sleep(10000);
//		action.fluentWait(getDriver(), TVAPreferredAirAHRICertificateNumber);
		action.explicitWait(getDriver(), TVAPreferredAirAHRICertificateNumber);
		action.type(TVAPreferredAirAHRICertificateNumber, certificatNum);
		action.selectByVisibleText(pakage, TVAPreferredAirAHRIPakage);
		Thread.sleep(10000);
//		action.fluentWait(getDriver(), TVAPreferredAirAHRIDuctType);
		action.explicitWait(getDriver(), TVAPreferredAirAHRIDuctType);
		action.selectByVisibleText(ductType, TVAPreferredAirAHRIDuctType);
		action.type(TVAPreferredAirAHRINewSytemBrand, brand);
		action.type(TVAPreferredAirAHRIOutDoorModelNumber, outdoor);
		action.type(TVAPreferredAirAHRIIndoorModelNumber, indoor);
		action.type(TVAPreferredAirAHRIHeatingCapacityAt17D, at17degree);
		action.type(TVAPreferredAirAHRIBtu, btu);
		action.selectByVisibleText(size, TVAPreferredAirAHRISystemSize);
		action.selectByVisibleText(systemrating, TVAPreferredAirAHRISystemRating);
		action.fluentWait(getDriver(), TVAPreferredAirAHRISystemRatingSEER);
		action.explicitWait(getDriver(), TVAPreferredAirAHRISystemRatingSEER);
		action.type(TVAPreferredAirAHRISystemRatingSEER, seer);
		action.type(TVAPreferredAirAHRISystemRatingEER, eer);
		action.type(TVAPreferredAirAHRIHSPF, hspf);
		action.selectByVisibleText(oldSize, TVAPreferredAirAHRIOldSystemSize);
		action.selectByVisibleText(oldAge, TVAPreferredAirAHRIOldSystemAge);
		action.selectByVisibleText(oldType, TVAPreferredAirAHRIOldSystemType);
	}

	public void rsContractorCustomerProjectDetails_FloorInsulation(String installDate, String installCost, String yes,
			String financedAmount, String finby, String initialRValue, String coverageArea, String typeOfInsulation,
			String finalRValue) {
		action.explicitWait(getDriver(), floorInsulationInstallDate);
		action.type(floorInsulationInstallDate, installDate);
		action.type(floorInsulationInstallCost, installCost);
		action.selectByVisibleText(yes, floorInsulationFinanced);
		action.type(floorInsulationFinancedAmount, financedAmount);
		action.selectByVisibleText(finby, floorInsulationFinancedBy);
		action.type(floorInsulationInitialRValue, initialRValue);
		action.type(floorInsulationCoverageArea, coverageArea);
		action.selectByVisibleText(typeOfInsulation, floorInsulationTypeOfInsulationInstalled);
		action.type(floorInsulationFinalRValue, finalRValue);
	}

	public void rsContractorCustomerProjectDetails_WallInsulation(String installDate, String installCost, String yes,
			String financedAmount, String finby, String insulation, String coverageArea) {
		action.explicitWait(getDriver(), wallInsulationInstallDate);
		action.type(wallInsulationInstallDate, installDate);
		action.type(wallInsulationInstallCost, installCost);
		action.selectByVisibleText(yes, wallInsulationFinanced);
		action.type(wallInsulationFinancedAmount, financedAmount);
		action.selectByVisibleText(finby, wallInsulationFinancedBy);
		action.selectByVisibleText(insulation, wallInsulationExists);
		action.type(wallInsulationCoverageArea, coverageArea);
	}

	public void rsContractorCustomerProjectSubmitConfirmation() throws InterruptedException, IOException {
		action.JSClick(getDriver(), projectSaveDraftBtn);
		action.explicitWait(getDriver(), projectDetailsContinueBtn);
		action.JSClick(getDriver(), projectDetailsContinueBtn);
		Thread.sleep(3000);
//		String upgradID = getDriver()
//				.findElement(By.xpath("(//label[normalize-space()='Upgrade ID']//following::label)[1]")).getText();
//		System.out.println("ProjectID:" + upgradID);
//		newWriteToExcel = new NewWriteToExcelLibrary();
//		newWriteToExcel.setValuesInRS_CustomerReadyForInspection(1, 50, upgradID);
//		action.moveToElement(getDriver(), projectDocumentUploadBtn);
//		action.type(projectDocumentUploadBtn, "C:/Users/anil.k/Desktop/EDM_Documents/Project_document.pdf");
//		Thread.sleep(3000);
//
//		action.explicitWait(getDriver(), projectSubmitBtn);
//		action.JSClick(getDriver(), projectSubmitBtn);
//		action.click(getDriver(), projectSubmitBtn);// same id for OK and project submit

	}

	public void rsContractorCustomerProjectSubmitToRequest(String selectedProgarm, String projectsID) {
		action.JSClick(getDriver(), selectedProgramDrop);
		action.selectByVisibleText(selectedProgarm, selectedProgramDrop);
		action.mouseover(getDriver(), accountingDrop);
		action.JSClick(getDriver(), accountingDropProjects);
		action.JSClick(getDriver(), accounting_ProjectsDropRequest);
		action.click(getDriver(), selectedProgramDrop);
		action.switchToFrameByIndex(getDriver(), 0);
		action.type(projectsIDSearch, projectsID);
		getDriver().findElement(By.id("ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_ProgramIncentiveUniqueID"))
				.sendKeys(Keys.ENTER);

	}

	public void rsContractorCustomerProjctRequest_UserListDialog() {

		action.JSClick(getDriver(), clickOnSelectedproject);
		action.JSClick(getDriver(), accountinProjectInProcessChangeStatusBtn);
		action.switchToFrameByName(getDriver(), "UserListDialog");
		action.selectByVisibleText("In Process", userListDialogStatus); // In Process
		action.selectByVisibleText("Yes", userListDialogDocumentPass);
		action.click(getDriver(), userListDialogSave);

	}

	public void rsContractorCustomerProjectSubmitToInProcess(String selectedProgarm, String projectsID) {
		action.JSClick(getDriver(), selectedProgramDrop);
		action.selectByVisibleText(selectedProgarm, selectedProgramDrop);
		action.mouseover(getDriver(), accountingDrop);
		action.JSClick(getDriver(), accountingDropProjects);
		action.JSClick(getDriver(), accounting_ProjectsDropInProcess);
		action.click(getDriver(), selectedProgramDrop);
		action.switchToFrameByIndex(getDriver(), 0);
		action.type(projectsIDSearch, projectsID);
		getDriver().findElement(By.id("ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_ProgramIncentiveUniqueID"))
				.sendKeys(Keys.ENTER);

	}

	public void rsContractorCustomerProjctInProcess_UserListDialog() {

		action.JSClick(getDriver(), clickOnSelectedproject);
		action.JSClick(getDriver(), accountinProjectInProcessChangeStatusBtn);
		action.switchToFrameByName(getDriver(), "UserListDialog");
		action.selectByVisibleText("Ready For Inspection", userListDialogStatus); // Ready For Inspection
		action.selectByVisibleText("Yes", userListDialogDocumentPass);
		action.click(getDriver(), userListDialogSave);

	}
}
