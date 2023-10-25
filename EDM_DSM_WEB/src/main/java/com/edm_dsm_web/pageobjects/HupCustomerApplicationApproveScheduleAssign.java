package com.edm_dsm_web.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edm_dsm_web.actiondriver.ActionDrivers;
import com.edm_dsm_web.base.BaseEDM;
import com.edm_dsm_web.utility.NewWriteToExcelLibrary;

public class HupCustomerApplicationApproveScheduleAssign extends BaseEDM {
	Actions act = new Actions(getDriver());
	ActionDrivers action = new ActionDrivers();
	private NewWriteToExcelLibrary newWriteToExcelLibrary;
	// *********HupCustomerApplicationApprove*********
	@FindBy(id = "ctl00_Work_uxRadGrid_ctl00_ctl04_lnkName")
	private WebElement selectAppID;
	@FindBy(id = "ctl00_Work_uxLeftNavMenu_uxLeftNavMenu_ctl04_hypNavUrl")
	private WebElement houseHoldMembers;
	@FindBy(id = "ctl00_Work_uxRadGrid_ctl00_ctl04_uxCust")
	private WebElement memberFirstName;
	@FindBy(id = "ctl00_Work_uxRadGrid_ctl00_ctl06_uxCust")
	private WebElement memberSecondName;
	@FindBy(id = "ctl00_Work_chkLstHomeOwnerIdentification_0")
	private WebElement usPhotoDriverLicenseOrPhotoID;
	@FindBy(id = "ctl00_Work_chkLstProofOfIncome_0")
	private WebElement federalTaxableWages;
	@FindBy(xpath = "//*[@id=\"ctl00_Work_chkLstProofOfOwnership_0\"]")
	private WebElement deedOrTitle;
	@FindBy(id = "ctl00_Work_uxUploadfile0")
	private WebElement memberDocumentBrowseBtn;
	@FindBy(id = "ctl00_Work_btnUpload")
	private WebElement memberDocumentUploadBtn;
//	*******************Change Status To Approved***************************
	@FindBy(xpath = "//span[normalize-space()='Change Status']")
	private WebElement changeStatusBtn;
	@FindBy(id = "ctl00_Work_uxUpdateAppStatus_uxToStatus")
	private WebElement changeStatusToBtn;
	@FindBy(id = "ctl00_Work_uxUpdateAppStatus_uxNotes")
	private WebElement changeStatusToNotesText;
	@FindBy(id = "ctl00_Work_uxSave")
	private WebElement changeStatusSaveBtn;

	public HupCustomerApplicationApproveScheduleAssign() {
		PageFactory.initElements(getDriver(), this);
	}

	public void HupCustomerApplicationApprove() throws InterruptedException, IOException {
		String siteId = getDriver().findElement(By.id("ctl00_Work_uxRadGrid_ctl00_ctl04_uxCustSAUniqueId")).getText();
		System.out.println(siteId);
		newWriteToExcelLibrary = new NewWriteToExcelLibrary();
		newWriteToExcelLibrary.setValuesInHUP_Customer(1, 30, siteId);
		action.click(getDriver(), selectAppID);
		action.click(getDriver(), houseHoldMembers);
		action.click(getDriver(), memberFirstName);
		action.click(getDriver(), usPhotoDriverLicenseOrPhotoID);
		action.click(getDriver(), federalTaxableWages);
		// action.explicitWait(getDriver(), deedOrTitle);
		action.JSClick(getDriver(), deedOrTitle);
		action.moveToElement(getDriver(), memberDocumentBrowseBtn);
		action.type(memberDocumentBrowseBtn, "C:/Users/anil.k/Desktop/EDM_Documents/Customer_document.pdf");
		Thread.sleep(4000);
		action.moveToElement(getDriver(), memberDocumentUploadBtn);
		action.JSClick(getDriver(), memberDocumentUploadBtn);
		action.JSClick(getDriver(), houseHoldMembers);
		action.click(getDriver(), memberSecondName);
		action.explicitWait(getDriver(), deedOrTitle);
		action.JSClick(getDriver(), deedOrTitle);
		action.click(getDriver(), usPhotoDriverLicenseOrPhotoID);
		action.click(getDriver(), federalTaxableWages);

		action.moveToElement(getDriver(), memberDocumentBrowseBtn);
		action.type(memberDocumentBrowseBtn, "C:/Users/anil.k/Desktop/EDM_Documents/Customer_document1.pdf");
		Thread.sleep(4000);
		action.click(getDriver(), memberDocumentUploadBtn);
//		*******************Change Status To Approved***************************
		action.click(getDriver(), changeStatusBtn);
		action.selectByVisibleText("Approved", changeStatusToBtn);
		action.type(changeStatusToNotesText, "Approved");
		action.click(getDriver(), changeStatusSaveBtn);
		Thread.sleep(2000);

	}

}
