/**
 * 
 */
package com.edm_dsm_web.testcases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.edm_dsm_web.base.BaseEDM;
import com.edm_dsm_web.dataprovider.DataProviderEDM;
import com.edm_dsm_web.pageobjects.AdminAccountLoginPage;
import com.edm_dsm_web.utility.Log;

public class AdminAccountLoginPageTest extends BaseEDM{
	
	private AdminAccountLoginPage loginPage;
	
	@Parameters("browser")
	@BeforeMethod (groups = {"Smoke","Sanity","Regression"})
	public void setup(String browser) throws InterruptedException {
		launchApp(browser); 
		getDriver().get(prop.getProperty("dev_admin_url"));
		//Thread.sleep(3000);
	}
	
	@AfterMethod  (groups = {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
	@Test(priority=1,groups = {"Smoke","Sanity"},dataProvider="loginDetailsData",dataProviderClass=DataProviderEDM.class)
	public void loginWithOutLoginID_WithOutPass(HashMap<String,String> hashMapValue) throws Throwable {
		Log.startTestCase("Account login Test");
		Log.info("Without Valid Login ID and valid Password");
	    //loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage=new AdminAccountLoginPage();
		loginPage.login(hashMapValue.get("NoLoginID"),hashMapValue.get("NoPass"));
	    String actualurl=loginPage.getCurrUrl(getDriver());
	    String expectedurl="https://esadmin.energydatametrics.com/Index.aspx";
	    //Log.info("The system should open Home page.");
	    Assert.assertEquals(actualurl, expectedurl);
	    Log.endTestCase("Account login Test");
	}
	
	@Test(priority=2,groups = {"Smoke","Sanity"},dataProvider="loginDetailsData",dataProviderClass=DataProviderEDM.class)
	public void loginWithValidLoginID_InvalidPass(HashMap<String,String> hashMapValue) throws Throwable {
		Log.startTestCase("Account login Test");
		Log.info("Enter Valid Login ID and Invalid Password");
	    //loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage=new AdminAccountLoginPage();
		loginPage.login(hashMapValue.get("ValidLoginID"),hashMapValue.get("InValidPass"));
	    String actualurl=loginPage.getCurrUrl(getDriver());
	    String expectedurl="https://esadmin.energydatametrics.com/Index.aspx";
	    //Log.info("The system should open Home page.");
	    Assert.assertTrue(loginPage.LoginFailedMsg(getDriver()));
	    Log.endTestCase("Account login Test");
	}
	@Test(priority=3,groups = {"Smoke","Sanity"},dataProvider="loginDetailsData",dataProviderClass=DataProviderEDM.class)
	public void loginWithInValidLoginID_validPass(HashMap<String,String> hashMapValue) throws Throwable {
		Log.startTestCase("Account login Test");
		Log.info("Enter InValid Login ID and Valid Password");
	    //loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage=new AdminAccountLoginPage();
		loginPage.login(hashMapValue.get("InValidLoginID"),hashMapValue.get("ValidPass"));
	    String actualurl=loginPage.getCurrUrl(getDriver());
	    String expectedurl="https://esadmin.energydatametrics.com/Index.aspx";
	    //Log.info("The system should open Home page.");
	    Assert.assertTrue(loginPage.LoginFailedMsg(getDriver()));
	    //Log.info("Login is Successful,The system opens Index page.");
	    Log.endTestCase("Account login Test");
	}
	@Test(priority=4,groups = {"Smoke","Sanity"},dataProvider="loginDetailsData",dataProviderClass=DataProviderEDM.class)
	public void loginWithInValidLoginID_InvalidPass(HashMap<String,String> hashMapValue) throws Throwable {
		Log.startTestCase("Account login Test");
		Log.info("Enter InValid Login ID and Invalid Password");
	    //loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage=new AdminAccountLoginPage();
		loginPage.login(hashMapValue.get("InValidLoginID"),hashMapValue.get("InValidPass"));
	    String actualurl=loginPage.getCurrUrl(getDriver());
	    String expectedurl="https://esadmin.energydatametrics.com/Index.aspx";
	    //Log.info("The system should open Home page.");
	    Assert.assertTrue(loginPage.LoginFailedMsg(getDriver()));
	    //Log.info("Login is Successful,The system opens Index page.");
	    Log.endTestCase("Account login Test");
	}
	@Test(priority=5,groups = {"Smoke","Sanity"},dataProvider="loginDetailsData",dataProviderClass=DataProviderEDM.class)
	public void loginWithValidLoginID_validPass(HashMap<String,String> hashMapValue) throws Throwable {
		Log.startTestCase("Account login Test");
		Log.info("Enter Valid Login ID and valid Password");
	    //loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage=new AdminAccountLoginPage();
		loginPage.login(hashMapValue.get("ValidLoginID"),hashMapValue.get("ValidPass"));
	    String actualurl=loginPage.getCurrUrl(getDriver());
	    String expectedurl="https://esadmin.energydatametrics.com/Index.aspx";
	    //Log.info("The system should open Home page.");
	    Assert.assertEquals(actualurl, expectedurl);
	    //Log.info("Login is Successful,The system opens Index page.");
	    Log.endTestCase("Account login Test");
	}
}
