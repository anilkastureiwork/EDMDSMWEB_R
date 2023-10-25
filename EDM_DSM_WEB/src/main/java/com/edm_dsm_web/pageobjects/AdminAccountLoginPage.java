/**
 * 
 */
package com.edm_dsm_web.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edm_dsm_web.actiondriver.ActionDrivers;
import com.edm_dsm_web.base.BaseEDM;

public class AdminAccountLoginPage extends BaseEDM {
	ActionDrivers action = new ActionDrivers();

	@FindBy(id = "uxLoginId")
	private WebElement loginID;

	@FindBy(id = "uxPassword")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"uxLogin\"]")
	private WebElement LogInBtn;

	@FindBy(id = "uxForgotPwd")
	private WebElement forgetPassword;
	@FindBy(id = "uxClear")
	private WebElement clearBtn;
	@FindBy(id = "uxMsg")
	private WebElement LoginFaildMsg;


	public AdminAccountLoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void login(String uname, String pasd) throws Throwable {
		//action.scrollByVisibilityOfElement(getDriver(), loginID);
		action.type(loginID, uname);
		action.type(password, pasd);
		action.JSClick(getDriver(), LogInBtn);

	}

	public String getCurrTitle(WebDriver driver) throws Throwable {
		String homePageTitle = action.getTitle(driver);
		return homePageTitle;
	}
	public boolean LoginFailedMsg(WebDriver driver) throws Throwable {
		boolean loginFailedMesg = action.isDisplayed(driver, LoginFaildMsg);
		return loginFailedMesg;
		}
	public String getCurrUrl(WebDriver driver) throws Throwable {
		String indexPageTitle = action.getCurrentURL(driver);
		return indexPageTitle;
	}
}