package com.edm_dsm_web.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edm_dsm_web.actiondriver.ActionDrivers;
import com.edm_dsm_web.base.BaseEDM;

public class HupWorkOrderUptoApprove extends BaseEDM {
	ActionDrivers action = new ActionDrivers();
	@FindBy(id = "drpProgramList")
	private WebElement selectedProgramDrop;
	@FindBy(xpath = "//span[@class='rmText rmExpandDown'][normalize-space()='Work Orders']")
	private WebElement workOrdersDrop;
	@FindBy(xpath = "(//span[@class='rmText'][normalize-space()='Open'])[1]")
	private WebElement workOrdersDrop_Open;
	@FindBy(xpath = "(//span[@class='rmText'][normalize-space()='Approved'])[2]")
	private WebElement workOrdersDrop_Approved;
	@FindBy(id = "ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_CustomerSAUniqueID")
	private WebElement siteIDSearch;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_uxRadGrid_ctl00_ctl04_uxCustSAUniqueId\"]")
	private WebElement clickWorkOrderUsingSiteID;
	@FindBy(id = "ctl00_Work_lblWorkOrderTitleCount")
	private WebElement workOrderCount;
	@FindBy(id = "ctl00_Work_uxWOPnl_ctl00_ctl04_lnkName")
	private WebElement firstWorkOrderID;
//	*******************Measures Available for Upgrade-Labor*********************
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[1]")
	private WebElement laborRepairHupText;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_Work_uxRadGrid1_ctl00_Labor_tblabor")
	private WebElement laborText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[2]")
	private WebElement laborWallInsulationText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[3]")
	private WebElement laborWindowsDoorsText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[4]")
	private WebElement laborRefrigeratorsText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[5]")
	private WebElement laborWaterHeatingText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[6]")
	private WebElement laborHVACSystemText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[7]")
	private WebElement laborDuctSystemText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[8]")
	private WebElement laborAtticInsulationText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='1'])[9]")
	private WebElement laborAirSealingText;
//	**************Measures Available for Upgrade-Materials**************************
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[1]")
	private WebElement materialsRepairHupText;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_Work_uxRadGrid1_ctl00_Material_tblMaterial")
	private WebElement materialsText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[2]")
	private WebElement materialsWallInsulationText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[3]")
	private WebElement materialsWindowsDoorsText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[4]")
	private WebElement materialsRefrigeratorsText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[5]")
	private WebElement materialsWaterHeatingText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[6]")
	private WebElement materialsHVACSystemText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[7]")
	private WebElement materialsDuctSystemText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[8]")
	private WebElement materialsAtticInsulationText;
	@FindBy(xpath = "(//a[normalize-space()='Labor']//following::span[@tabindex='2'])[9]")
	private WebElement materialsAirSealingText;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_Work_uxRadGrid1_ctl00_Labor_tblabor")
	private WebElement laborAirSealingText1;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl03_ctl01_lnkSaveButtonChanges")
	private WebElement measureAvailableForChangesSaveButtonChanges;
//	************Measures Available for Upgrade-EditFunding*******************************
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl04_lnkFundingSource")
	private WebElement editFundingRepairHUP;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl05_lnkFundingSource")
	private WebElement editFundingWallInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl06_lnkFundingSource")
	private WebElement editFundingWindowsDoors;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl07_lnkFundingSource")
	private WebElement editFundingRefrigerators;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl08_lnkFundingSource")
	private WebElement editFundingWaterHeating;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl09_lnkFundingSource")
	private WebElement editFundingHVACSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl10_lnkFundingSource")
	private WebElement editFundingDuctSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl11_lnkFundingSource")
	private WebElement editFundingAtticInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl12_lnkFundingSource")
	private WebElement editFundingAirSealing;
//	*******************FundingSource*******************************
	@FindBy(id = "ctl00_Work_uxFundingSource")
	private WebElement editFundingFundingSource;
	@FindBy(id = "ctl00_Work_uxAmount")
	private WebElement editFundingAmount;
	@FindBy(id = "ctl00_Work_uxComments")
	private WebElement editFundingComments;
	@FindBy(id = "ctl00_Work_uxSave")
	private WebElement editFundingAddFundingBtn;
	@FindBy(id = "ctl00_Work_uxCancel")
	private WebElement editFundingCloseBtn;
//	**********ContractorSelect************************
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl04_uxContractor")
	private WebElement contractorRepairHUP;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl05_uxContractor")
	private WebElement contractorWallInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl06_uxContractor")
	private WebElement contractorWindowsDoors;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl07_uxContractor")
	private WebElement contractorRefrigerators;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl08_uxContractor")
	private WebElement contractorWaterHeating;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl09_uxContractor")
	private WebElement contractorHVACSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl10_uxContractor")
	private WebElement contractorDuctSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl11_uxContractor")
	private WebElement contractorAtticInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl12_uxContractor")
	private WebElement contractorAirSealing;
// *************Upgrade Sub Measure*************************************
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl04_uxSubMeasure")
	private WebElement upgradeSubMeasureRepairHUP;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl05_uxSubMeasure")
	private WebElement upgradeSubMeasureWallInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl06_uxSubMeasure")
	private WebElement upgradeSubMeasureWindowsDoors;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl07_uxSubMeasure")
	private WebElement upgradeSubMeasureRefrigerators;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl08_uxSubMeasure")
	private WebElement upgradeSubMeasureWaterHeating;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl09_uxSubMeasure")
	private WebElement upgradeSubMeasureHVACSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl10_uxSubMeasure")
	private WebElement upgradeSubMeasureDuctSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl11_uxSubMeasure")
	private WebElement upgradeSubMeasureAtticInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl12_uxSubMeasure")
	private WebElement upgradeSubMeasureAirSealing;
//	*************************InstallDate*****************************************
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl04_InstallDatePicker1_dateInput")
	private WebElement installDateRepairHUP;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl05_InstallDatePicker1_dateInput")
	private WebElement installDateWallInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl06_InstallDatePicker1_dateInput")
	private WebElement installDateWindowsDoors;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl07_InstallDatePicker1_dateInput")
	private WebElement installDateRefrigerators;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl08_InstallDatePicker1_dateInput")
	private WebElement installDateWaterHeating;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl09_InstallDatePicker1_dateInput")
	private WebElement installDateHVACSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl10_InstallDatePicker1_dateInput")
	private WebElement installDateDuctSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl11_InstallDatePicker1_dateInput")
	private WebElement installDateAtticInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl12_InstallDatePicker1_dateInput")
	private WebElement installDateAirSealing;
//	****************************InstallTime*****************************************
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl04_RadTimePicker1_dateInput")
	private WebElement installTimeRepairHUP;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl05_RadTimePicker1_dateInput")
	private WebElement installTimeWallInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl06_RadTimePicker1_dateInput")
	private WebElement installTimeWindowsDoors;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl07_RadTimePicker1_dateInput")
	private WebElement installTimeRefrigerators;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl08_RadTimePicker1_dateInput")
	private WebElement installTimeWaterHeating;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl09_RadTimePicker1_dateInput")
	private WebElement installTimeHVACSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl10_RadTimePicker1_dateInput")
	private WebElement installTimeDuctSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl11_RadTimePicker1_dateInput")
	private WebElement installTimeAtticInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl12_RadTimePicker1_dateInput")
	private WebElement installTimeAirSealing;
//	****************Target Completion Date********************************************
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl04_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateRepairHUP;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl05_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateWallInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl06_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateWindowsDoors;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl07_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateRefrigerators;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl08_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateWaterHeating;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl09_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateHVACSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl10_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateDuctSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl11_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateAtticInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl12_TargetCompletionDatePicker1_dateInput")
	private WebElement targetCompletionDateAirSealing;
//	***********************Target Completion Time*********************************************
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl04_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeRepairHUP;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl05_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeWallInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl06_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeWindowsDoors;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl07_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeRefrigerators;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl08_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeWaterHeating;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl09_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeHVACSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl10_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeDuctSystem;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl11_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeAtticInsulation;
	@FindBy(id = "ctl00_Work_uxRadGrid1_ctl00_ctl12_RadTimePicker2_dateInput")
	private WebElement targetCompletionTimeAirSealing;
//*******************ChangeStatusOpenToApprove******************************************
	@FindBy(id = "ctl00_Work_uxLeftNavMenu_uxLeftNavMenu_ctl04_hypNavUrl")
	private WebElement changeStatusMenu;
	@FindBy(id = "ctl00_Work_cmbRefStatus")
	private WebElement changeStatusStatusDrp;
	@FindBy(id = "ctl00_Work_uxNotes")
	private WebElement changeStatusNotesText;
	@FindBy(id = "ctl00_Work_btnSave")
	private WebElement changeStatusSaveBtn;
//	****************************Work Order Approved*********************************
	@FindBy(id = "ctl00_Work_uxRadGridContractorSummary_ctl00_ctl04_imgConInstallDateEmail")
	private WebElement clickToSendEmailNotificationToContractor;
	@FindBy(id = "ctl00_Work_uxCreateUpgradeApplication")
	private WebElement clickToCreateUpgradeApplication;
	@FindBy(xpath = "//span[@class='rwInnerSpan'][normalize-space()='OK']")
	private WebElement clickOnEmailConfirmationOK;
	@FindBy(xpath = "//h1[contains(normalize-space(),'Upgrades')]//following::span[starts-with(normalize-space(),'Air Sealing - HUP')]")
	private WebElement upgardesAirSealingHUP;
//	************************************************************************************
	@FindBy(xpath = "//span[normalize-space()='Accounting']")
	private WebElement accountingDrop;
	@FindBy(xpath = "//span[@class='rmText rmExpandRight'][normalize-space()='Projects']")
	private WebElement accountingDropProjects;
	@FindBy(xpath = "(//span[@class='rmText'][normalize-space()='Requests'])[2]")
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

	public HupWorkOrderUptoApprove() {
		PageFactory.initElements(getDriver(), this);
	}

	public void workOrderSearchInAdminFromEvalution(String selectedProgarm, String siteID) {
		action.explicitWait(getDriver(), selectedProgramDrop);
		action.selectByVisibleText(selectedProgarm, selectedProgramDrop);
		action.mouseover(getDriver(), workOrdersDrop);
		action.JSClick(getDriver(), workOrdersDrop_Open);
		action.switchToFrameByIndex(getDriver(), 0);
		action.type(siteIDSearch, siteID);
		getDriver().findElement(By.id("ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_CustomerSAUniqueID"))
				.sendKeys(Keys.ENTER);
	}

	public void verifyWorkOrderInAdminFromEvalution() throws InterruptedException {
		action.explicitWait(getDriver(), clickWorkOrderUsingSiteID);
		// action.moveToElement(getDriver(), clickWorkOrderUsingSiteID);
		action.JSClick(getDriver(), clickWorkOrderUsingSiteID);
		action.switchToFrameByName(getDriver(), "eScoreDialog1");
		action.click(getDriver(), workOrderCount);
		action.explicitWait(getDriver(), firstWorkOrderID);
		action.JSClick(getDriver(), firstWorkOrderID);
		action.switchToFrameByName(getDriver(), "eScoreDialog");

	}

	public void hupAddLabor_MaterialsCost_Verify(String labor1, String measure1) {
		action.JSClick(getDriver(), laborRepairHupText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), laborWallInsulationText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), laborWindowsDoorsText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), laborRefrigeratorsText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), laborWaterHeatingText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), laborHVACSystemText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), laborDuctSystemText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), laborAtticInsulationText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), laborAirSealingText);
		action.type(laborText, labor1);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

		action.JSClick(getDriver(), materialsRepairHupText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), materialsWallInsulationText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), materialsWindowsDoorsText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), materialsRefrigeratorsText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), materialsWaterHeatingText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), materialsHVACSystemText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), materialsDuctSystemText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), materialsAtticInsulationText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), materialsAirSealingText);
		action.type(materialsText, measure1);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

//*******************Details_RepairHUP******************************************************************
	public void measuresAvailableforUpgradeDetails_RepairHUP(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborRepairHupText);
		action.JSClick(getDriver(), laborRepairHupText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsRepairHupText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingRepairHUP);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorRepairHUP);
		action.selectByVisibleText(contractor, contractorRepairHUP);
		action.type(installDateRepairHUP, installDate);
		action.type(installTimeRepairHUP, installTime);
		action.type(targetCompletionDateRepairHUP, targetComDate);
		action.type(targetCompletionTimeRepairHUP, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	// *******************Details_WallInsulation******************************************************************
	public void measuresAvailableforUpgradeDetails_WallInsulation(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborWallInsulationText);
		action.JSClick(getDriver(), laborWallInsulationText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsWallInsulationText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingWallInsulation);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorWallInsulation);
		action.selectByVisibleText(contractor, contractorWallInsulation);
		action.type(installDateWallInsulation, installDate);
		action.type(installTimeWallInsulation, installTime);
		action.type(targetCompletionDateWallInsulation, targetComDate);
		action.type(targetCompletionTimeWallInsulation, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	// *******************Details_WindosDoors******************************************************************
	public void measuresAvailableforUpgradeDetails_WindosDoors(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborWindowsDoorsText);
		action.JSClick(getDriver(), laborWindowsDoorsText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsWindowsDoorsText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingWindowsDoors);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorWindowsDoors);
		action.selectByVisibleText(contractor, contractorWindowsDoors);
		action.type(installDateWindowsDoors, installDate);
		action.type(installTimeWindowsDoors, installTime);
		action.type(targetCompletionDateWindowsDoors, targetComDate);
		action.type(targetCompletionTimeWindowsDoors, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	// *******************Details_Refrigerators******************************************************************
	public void measuresAvailableforUpgradeDetails_Refrigerators(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborRefrigeratorsText);
		action.JSClick(getDriver(), laborRefrigeratorsText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsRefrigeratorsText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingRefrigerators);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorRefrigerators);
		action.selectByVisibleText(contractor, contractorRefrigerators);
		action.type(installDateRefrigerators, installDate);
		action.type(installTimeRefrigerators, installTime);
		action.type(targetCompletionDateRefrigerators, targetComDate);
		action.type(targetCompletionTimeRefrigerators, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	// *******************Details_WaterHeating******************************************************************
	public void measuresAvailableforUpgradeDetails_WaterHeating(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborWaterHeatingText);
		action.JSClick(getDriver(), laborWaterHeatingText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsWaterHeatingText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingWaterHeating);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorWaterHeating);
		action.selectByVisibleText(contractor, contractorWaterHeating);
		action.type(installDateWaterHeating, installDate);
		action.type(installTimeWaterHeating, installTime);
		action.type(targetCompletionDateWaterHeating, targetComDate);
		action.type(targetCompletionTimeWaterHeating, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	// *******************Details_HVACSystem******************************************************************
	public void measuresAvailableforUpgradeDetails_HVACSystem(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborHVACSystemText);
		action.JSClick(getDriver(), laborHVACSystemText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsHVACSystemText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingHVACSystem);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorHVACSystem);
		action.selectByVisibleText(contractor, contractorHVACSystem);
		action.type(installDateHVACSystem, installDate);
		action.type(installTimeHVACSystem, installTime);
		action.type(targetCompletionDateHVACSystem, targetComDate);
		action.type(targetCompletionTimeHVACSystem, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	// *******************Details_DuctSystem******************************************************************
	public void measuresAvailableforUpgradeDetails_DuctSystem(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborDuctSystemText);
		action.JSClick(getDriver(), laborDuctSystemText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsDuctSystemText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingDuctSystem);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorDuctSystem);
		action.selectByVisibleText(contractor, contractorDuctSystem);
		action.type(installDateDuctSystem, installDate);
		action.type(installTimeDuctSystem, installTime);
		action.type(targetCompletionDateDuctSystem, targetComDate);
		action.type(targetCompletionTimeDuctSystem, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	// *******************Details_AtticInsulation******************************************************************
	public void measuresAvailableforUpgradeDetails_AtticInsulation(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborAtticInsulationText);
		action.JSClick(getDriver(), laborAtticInsulationText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsAtticInsulationText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingAtticInsulation);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorAtticInsulation);
		action.selectByVisibleText(contractor, contractorAtticInsulation);
		action.type(installDateAtticInsulation, installDate);
		action.type(installTimeAtticInsulation, installTime);
		action.type(targetCompletionDateAtticInsulation, targetComDate);
		action.type(targetCompletionTimeAtticInsulation, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	// *******************Details_AirSealing******************************************************************
	public void measuresAvailableforUpgradeDetails_AirSealing(String labor1, String measure1, String fundSource,
			String fundAmount, String fundComments, String contractor, String installDate, String installTime,
			String targetComDate, String targetComTime) throws InterruptedException {
		action.explicitWait(getDriver(), laborAirSealingText);
		action.JSClick(getDriver(), laborAirSealingText);
		action.type(laborText, labor1);
		action.JSClick(getDriver(), materialsAirSealingText);
		action.type(materialsText, measure1);
		action.JSClick(getDriver(), editFundingAirSealing);
		action.switchToFrameByName(getDriver(), "2000");
		action.explicitWait(getDriver(), editFundingFundingSource);
		action.selectByVisibleText(fundSource, editFundingFundingSource);
		action.type(editFundingAmount, fundAmount);
		action.moveToElement(getDriver(), editFundingComments);
		action.type(editFundingComments, fundComments);
		action.JSClick(getDriver(), editFundingAddFundingBtn);
		action.explicitWait(getDriver(), editFundingCloseBtn);
		action.JSClick(getDriver(), editFundingCloseBtn);
		getDriver().switchTo().parentFrame();
		action.explicitWait(getDriver(), contractorAirSealing);
		action.selectByVisibleText(contractor, contractorAirSealing);
		action.type(installDateAirSealing, installDate);
		action.type(installTimeAirSealing, installTime);
		action.type(targetCompletionDateAirSealing, targetComDate);
		action.type(targetCompletionTimeAirSealing, targetComTime);
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	public void upgradeSubMeasureSelection(String subMeasRepairHUP, String subMeasWallInsulation,
			String subMeasWindowsDoors, String subMeasRefrigerators, String subMeasWaterHeating,
			String subMeasHVACSystem, String subMeasDuctSystem, String subMeasAtticInsulation,
			String subMeasAirSealing) {
		try {
			action.selectByVisibleText(subMeasRepairHUP, upgradeSubMeasureRepairHUP);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			action.selectByVisibleText(subMeasWallInsulation, upgradeSubMeasureWallInsulation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			action.selectByVisibleText(subMeasWindowsDoors, upgradeSubMeasureWindowsDoors);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			action.selectByVisibleText(subMeasRefrigerators, upgradeSubMeasureRefrigerators);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			action.selectByVisibleText(subMeasWaterHeating, upgradeSubMeasureWaterHeating);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			action.selectByVisibleText(subMeasHVACSystem, upgradeSubMeasureHVACSystem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			action.selectByVisibleText(subMeasDuctSystem, upgradeSubMeasureDuctSystem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			action.selectByVisibleText(subMeasAtticInsulation, upgradeSubMeasureAtticInsulation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			action.selectByVisibleText(subMeasAirSealing, upgradeSubMeasureAirSealing);
		} catch (Exception e) {
			e.printStackTrace();
		}
		action.click(getDriver(), measureAvailableForChangesSaveButtonChanges);

	}

	public void hupWorkOrderChangeStatusOpenToApproved(String approve) {
		action.explicitWait(getDriver(), changeStatusMenu);
		action.JSClick(getDriver(), changeStatusMenu);
		action.selectByVisibleText(approve, changeStatusStatusDrp);
		action.type(changeStatusNotesText, "Approved");
		action.click(getDriver(), changeStatusSaveBtn);

	}

	public void workOrderSearchInAdminFromEvalution_Approved(String selectedProgarm, String siteID) {
		action.explicitWait(getDriver(), selectedProgramDrop);
		action.selectByVisibleText(selectedProgarm, selectedProgramDrop);
		action.mouseover(getDriver(), workOrdersDrop);
		action.JSClick(getDriver(), workOrdersDrop_Approved);
		action.switchToFrameByIndex(getDriver(), 0);
		action.type(siteIDSearch, siteID);
		getDriver().findElement(By.id("ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_CustomerSAUniqueID"))
				.sendKeys(Keys.ENTER);
	}

	public void createUpgradeApplication() throws InterruptedException {
		action.explicitWait(getDriver(), clickWorkOrderUsingSiteID);
		// action.moveToElement(getDriver(), clickWorkOrderUsingSiteID);
		action.JSClick(getDriver(), clickWorkOrderUsingSiteID);
		action.switchToFrameByName(getDriver(), "eScoreDialog1");
		action.click(getDriver(), workOrderCount);
		action.explicitWait(getDriver(), firstWorkOrderID);
		action.JSClick(getDriver(), firstWorkOrderID);
		action.switchToFrameByName(getDriver(), "eScoreDialog");
		action.click(getDriver(), clickToSendEmailNotificationToContractor);
		action.JSClick(getDriver(), clickOnEmailConfirmationOK);
		Thread.sleep(10000);
		action.click(getDriver(), clickToCreateUpgradeApplication);

	}
	public void hupContractorCustomerProjectSubmitToRequest(String selectedProgarm, String projectsID) {
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

	public void hupContractorCustomerProjctRequest_UserListDialog() {

		action.JSClick(getDriver(), clickOnSelectedproject);
		action.JSClick(getDriver(), accountinProjectInProcessChangeStatusBtn);
		action.switchToFrameByName(getDriver(), "UserListDialog");
		action.selectByVisibleText("In Process", userListDialogStatus); //In Process
		action.selectByVisibleText("Yes", userListDialogDocumentPass);
		action.click(getDriver(), userListDialogSave);

	}

	public void hupContractorCustomerProjectSubmitToInProcess(String selectedProgarm, String projectsID) {
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

	public void hupContractorCustomerProjctInProcess_UserListDialog() {

		action.JSClick(getDriver(), clickOnSelectedproject);
		action.JSClick(getDriver(), accountinProjectInProcessChangeStatusBtn);
		action.switchToFrameByName(getDriver(), "UserListDialog");
		action.selectByVisibleText("Ready For Inspection", userListDialogStatus); //Ready For Inspection
		action.selectByVisibleText("Yes", userListDialogDocumentPass);
		action.click(getDriver(), userListDialogSave);

	}
}
