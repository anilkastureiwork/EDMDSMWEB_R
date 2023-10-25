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

public class HupCustomerApplicationSubmit extends BaseEDM {
	private NewWriteToExcelLibrary newWriteToExcelLibrary;
	Actions act = new Actions(getDriver());
	ActionDrivers action = new ActionDrivers();
	// *********Find out if Home Uplift is available in your area.*********
	@FindBy(xpath = "(//input[@placeholder='Zip code'])[1]")
	private WebElement zipCode;
	@FindBy(id = "Radio11")
	private WebElement ownOrRentRadioBtn;
	@FindBy(id = "ddlLPC")
	private WebElement preferedLanguageDrp;
	@FindBy(id = "btnContinue")
	private WebElement nextBtn1of3;
	@FindBy(xpath = "//*[@name=\"LPCID\"]")
	private WebElement selectLPCDrp;
	@FindBy(id = "ddlCounty")
	private WebElement selectCountryDrp;
	@FindBy(id = "ddlHomeTypeSelection")
	private WebElement homeConsidredDrp;
	@FindBy(id = "btnSubmit")
	private WebElement nextBtn2of3;
	@FindBy(id = "btnContinue")
	private WebElement nextBtn3of3;
// ****************Let's get started**************************************
	@FindBy(id = "btncontinue")
	private WebElement startApplicationBtn;
	@FindBy(id = "firstname")
	private WebElement firstName;
	@FindBy(id = "lastname")
	private WebElement lastName;
	@FindBy(id = "txtAddress1")
	private WebElement homeAddress;
	@FindBy(id = "phone1input")
	private WebElement phoneNumber1;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "SecondaryContactPhone")
	private WebElement phoneNumber2;
	@FindBy(id = "ddlHowDidYouHear")
	private WebElement hearAbout;
	@FindBy(id = "AnyMemberDisabilityRadio2")
	private WebElement anyMemberDisabilityRadio;
	@FindBy(id = "FemaleHeadedHouseholdRadio2")
	private WebElement femaleHeadedHouseholdRadio;
	@FindBy(id = "Radio11")
	private WebElement mailingAddressSameAsHomeRadio;
	@FindBy(id = "ReceiveSMSCheck")
	private WebElement receiveSMSCheck;
	@FindBy(id = "ReceiveEmailCheck")
	private WebElement receiveEmailCheck;
	@FindBy(id = "btncontinue")
	private WebElement letStrartContinueBtn;
//	***********Property Information*************************************

	@FindBy(id = "HomeSquareFootage")
	private WebElement homeSquareFootage;
	@FindBy(id = "HomeBuiltYear")
	private WebElement homeBuiltYear;
	@FindBy(id = "NumberofOccupants")
	private WebElement numberofOccupants;
	@FindBy(id = "ElectricGasAccountNumber")
	private WebElement electricGasAccountNumber;
	@FindBy(id = "PrimaryHeatSourceRadio1")
	private WebElement primaryHeatSourceRadio;
	@FindBy(id = "WaterHeatFuelSourceRadio1")
	private WebElement waterHeatFuelSourceRadio;
	@FindBy(id = "FoundationTypeRadio1")
	private WebElement foundationTypeRadio;
	@FindBy(id = "HasParticipatedinPastTVAProgramRadio2")
	private WebElement hasParticipatedinPastTVAProgramRadio;
	@FindBy(id = "btnPropertyContinue")
	private WebElement propertyContinueBtn;
//	******************Applicant Information*********************
	@FindBy(id = "HouseholdMemberAnnualIncome")
	private WebElement householdMemberAnnualIncome;
	@FindBy(id = "HouseholdMemberBirthdate")
	private WebElement householdMemberBirthdate;
	@FindBy(id = "HouseholdMemberMaritalStatus")
	private WebElement householdMemberMaritalStatus;
	@FindBy(id = "HouseholdMemberGender")
	private WebElement householdMemberGender;
	@FindBy(id = "HouseholdMemberRace")
	private WebElement householdMemberRace;
	@FindBy(id = "HouseholdMemberVeteran")
	private WebElement householdMemberVeteran;
	@FindBy(xpath = "//select[@id=\"HouseholdMemberVeteran\"]/following:: input[1]")
	private WebElement applicantInformationContinueBtn;
//	******************Applicant Member Information1*********************
	@FindBy(id = "HouseholdMemberFirstName_1")
	private WebElement householdMemberFirstName_1;
	@FindBy(id = "HouseholdMemberLastName_1")
	private WebElement householdMemberLastName_1;
	@FindBy(id = "HouseholdMemberAnnualIncome_1")
	private WebElement householdMemberAnnualIncome_1;
	@FindBy(id = "HouseholdMemberGender_1")
	private WebElement householdMemberGender_1;
	@FindBy(id = "HouseholdMemberMaritalStatus_1")
	private WebElement householdMemberMaritalStatus_1;
	@FindBy(id = "HouseholdMemberBirthdate_1")
	private WebElement householdMemberBirthdate_1;
	@FindBy(id = "HouseholdMemberRace_1")
	private WebElement householdMemberRace_1;
	@FindBy(id = "HouseholdMemberVeteran_1")
	private WebElement householdMemberVeteran_1;
//	@FindBy(xpath = "(//*[@id=\"HouseholdMemberVeteran_1\"]/following::button)[2]")
	@FindBy(id = "btnUpdate")
	private WebElement householdMember_1UpdateBtn;
	@FindBy(id = "btncontinue")
	private WebElement applicantInformationContinueBtn1;
//	*************************Almost Done*********************************************
	@FindBy(id = "AuthorizeTVAasLPCRadio1")
	private WebElement authorizeTVAasLPCRadio1;
	@FindBy(id = "ApprovedforSharedDocumentsRadio1")
	private WebElement approvedforSharedDocumentsRadio1;
	@FindBy(id = "btnPropertyContinue")
	private WebElement almostDoneContinueBtn;
//	*********************************************************************************
	@FindBy(xpath = "//label[@for='disclosureAccepted']")
	private WebElement disclosureAcceptedCheckBox;
	@FindBy(id = "action-bar-btn-continue")
	private WebElement signatureDiscloserContinueBtn;
	@FindBy(xpath = "//i[@class='sign-arrow']")
	private WebElement applicantsignatureArrow;
	@FindBy(xpath = "//img[@data-qa=\"adopt-signature-img\"]")
	private WebElement selectSignature;
	@FindBy(xpath = "//button[normalize-space()='Adopt and Sign']")
	private WebElement adoptSignBtn;
	// @FindBy(id = "action-bar-btn-finish")
	@FindBy(id = "slide-up-bar-finish-button")
	private WebElement DocumentViewCompleteFinishBtn;
	@FindBy(id = "action-bar-btn-view-complete")
	private WebElement DocumentViewCompleteCloseBtn;
//	**************Document Upload******************************************************
	@FindBy(id = "customFile")
	private WebElement customFileChooseFileBtn;
	@FindBy(id = "save")
	private WebElement customFileChooseFileSubmitBtn;
	@FindBy(id = "btnContinue2")
	private WebElement DocumentUploadSuceessfullContinueBtn;
//	*************Admin Login data Validation***************
	@FindBy(id = "drpProgramList")
	private WebElement selectedProgramDrop;
	@FindBy(xpath = "//*[@id=\"Menu1_uxRadMenu\"]/ul/li[2]/a/span")
	private WebElement applicationDrop;
	@FindBy(xpath = "//*[@id=\"Menu1_uxRadMenu\"]/ul/li[3]/a/span")
	private WebElement evalutionDrop;
	@FindBy(xpath = "(//span[normalize-space()='Received'])[1]")
	private WebElement applicationDropReceived;
	@FindBy(xpath = "(//span[normalize-space()='Received'])[1]")
	private WebElement evalutionDropRequest;
	@FindBy(id = "ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_ApplicationID")
	private WebElement evalIDSearch;
	@FindBy(id = "ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_CustomerSAUniqueID")
	private WebElement siteIDSearch;
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

	public HupCustomerApplicationSubmit() {
		PageFactory.initElements(getDriver(), this);
	}

	public void hupIsAvailableInYourArea(String zip, String langu, String lpc, String coun, String homConsi,
			String firstNam, String lastNam, String homeAdd, String phoneNum1, String emai, String phoneNum2,
			String hear, String SqrFootage, String builtYear, String occupants, String gasAccount)
			throws InterruptedException {
		action.type(zipCode, zip);
		action.click(getDriver(), ownOrRentRadioBtn);
		action.selectByValue(preferedLanguageDrp, langu);
		action.click(getDriver(), nextBtn1of3);
		action.selectByVisibleText(lpc, selectLPCDrp);
		action.selectByVisibleText(coun, selectCountryDrp);
		action.selectByVisibleText(homConsi, homeConsidredDrp);
		action.JSClick(getDriver(), nextBtn2of3);
		action.JSClick(getDriver(), nextBtn3of3);
//		********************************************************************
		action.JSClick(getDriver(), startApplicationBtn);
		action.type(firstName, firstNam);
		action.type(lastName, lastNam);
		action.type(homeAddress, homeAdd);
		action.type(phoneNumber1, phoneNum1);
		action.type(email, emai);
		action.type(phoneNumber2, phoneNum2);
		action.selectByVisibleText(hear, hearAbout);
		action.JSClick(getDriver(), anyMemberDisabilityRadio);
		action.JSClick(getDriver(), femaleHeadedHouseholdRadio);
		action.JSClick(getDriver(), mailingAddressSameAsHomeRadio);
		action.JSClick(getDriver(), receiveSMSCheck);
		action.JSClick(getDriver(), receiveEmailCheck);
		action.JSClick(getDriver(), letStrartContinueBtn);
//		*******************************************************************
		action.explicitWait(getDriver(), homeSquareFootage);
		action.type(homeSquareFootage, SqrFootage);
		action.type(homeBuiltYear, builtYear);
		action.type(numberofOccupants, occupants);
		action.type(electricGasAccountNumber, gasAccount);
		action.JSClick(getDriver(), primaryHeatSourceRadio);
		action.JSClick(getDriver(), waterHeatFuelSourceRadio);
		action.JSClick(getDriver(), foundationTypeRadio);
		action.JSClick(getDriver(), hasParticipatedinPastTVAProgramRadio);
		action.JSClick(getDriver(), propertyContinueBtn);
		Thread.sleep(2000);
	}

	public void hupApplicantInformation(String annualIncome, String mariStatus, String gender, String race,
			String veteran, String birtDate) {
		try {

			action.type(householdMemberAnnualIncome, annualIncome);
			action.type(householdMemberBirthdate, birtDate);
			action.selectByVisibleText(mariStatus, householdMemberMaritalStatus);
			action.selectByVisibleText(gender, householdMemberGender);
			action.selectByVisibleText(race, householdMemberRace);
			action.selectByVisibleText(veteran, householdMemberVeteran);
			action.JSClick(getDriver(), applicantInformationContinueBtn);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Application Information already Filled");
		}

	}

	public void hupApplicantMemberInformation_1(String firstName_1, String lastName_1, String annualIncome_1,
			String mariStatus_1, String gender_1, String race_1, String veteran_1, String birtDate_1)
			throws InterruptedException {
		action.type(householdMemberFirstName_1, firstName_1);
		action.type(householdMemberLastName_1, lastName_1);
		action.type(householdMemberAnnualIncome_1, annualIncome_1);
		action.type(householdMemberBirthdate_1, birtDate_1);
		action.selectByVisibleText(mariStatus_1, householdMemberMaritalStatus_1);
		action.selectByVisibleText(gender_1, householdMemberGender_1);
		action.selectByVisibleText(race_1, householdMemberRace_1);
		action.selectByVisibleText(veteran_1, householdMemberVeteran_1);

		action.JSClick(getDriver(), householdMember_1UpdateBtn);
		Thread.sleep(2000);
		action.JSClick(getDriver(), applicantInformationContinueBtn1);
		action.click(getDriver(), authorizeTVAasLPCRadio1);
		action.click(getDriver(), approvedforSharedDocumentsRadio1);
		action.JSClick(getDriver(), almostDoneContinueBtn);

	}

	public void applicantSignature() throws InterruptedException, IOException {
		if (getDriver().findElement(By.xpath("//label[@for='disclosureAccepted']")).isDisplayed()) {
			action.click(getDriver(), disclosureAcceptedCheckBox);
		} else {
			System.out.println("Disclosure Accepted CheckBox already selected");
		}
		try {
			action.JSClick(getDriver(), signatureDiscloserContinueBtn);
			Thread.sleep(3000);
			action.JSClick(getDriver(), applicantsignatureArrow);
			Thread.sleep(3000);
			action.JSClick(getDriver(), selectSignature);
			Thread.sleep(3000);
			action.JSClick(getDriver(), adoptSignBtn);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Applicant Signature already done");
		}
		try {
			action.explicitWait(getDriver(), DocumentViewCompleteFinishBtn);
			action.JSClick(getDriver(), DocumentViewCompleteFinishBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// action.explicitWait(getDriver(), DocumentViewCompleteCloseBtn);
			//action.click(getDriver(), DocumentViewCompleteCloseBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String evalid = getDriver().findElement(By.cssSelector("label[for='inputEmail'] span b")).getText();
		System.out.println(evalid);
		newWriteToExcelLibrary = new NewWriteToExcelLibrary();
		newWriteToExcelLibrary.setValuesInHUP_Customer(1, 30, evalid);
		action.moveToElement(getDriver(), customFileChooseFileBtn);
		action.type(customFileChooseFileBtn, "C:/Users/anil.k/Desktop/EDM_Documents/Customer_document.pdf");
		action.JSClick(getDriver(), customFileChooseFileSubmitBtn);
		action.JSClick(getDriver(), DocumentUploadSuceessfullContinueBtn);
		Thread.sleep(2000);
	}

	public void hupCustomerApplicationSubmitDataValidation(String selectedProgarm, String evalID) throws InterruptedException {
		action.JSClick(getDriver(), selectedProgramDrop);
		action.selectByVisibleText(selectedProgarm, selectedProgramDrop);
		action.mouseover(getDriver(), applicationDrop);
		action.JSClick(getDriver(), applicationDropReceived);
		action.switchToFrameByIndex(getDriver(), 0);
		action.type(evalIDSearch, evalID);
		getDriver()
				.findElement(
						By.id("ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_ApplicationID"))
				.sendKeys(Keys.ENTER);
	}
	public void hupCustomerApplicationApprovedDataValidation(String selectedProgarm, String evalID) throws InterruptedException {
		action.JSClick(getDriver(), selectedProgramDrop);
		action.selectByVisibleText(selectedProgarm, selectedProgramDrop);
		action.mouseover(getDriver(), evalutionDrop);
		action.JSClick(getDriver(), evalutionDropRequest);
		action.switchToFrameByIndex(getDriver(), 0);
		action.type(siteIDSearch, evalID);
		getDriver()
				.findElement(
						By.id("ctl00_Work_uxRadGrid_ctl00_ctl02_ctl02_FilterTextBox_CustomerSAUniqueID"))
				.sendKeys(Keys.ENTER);
	}
}
