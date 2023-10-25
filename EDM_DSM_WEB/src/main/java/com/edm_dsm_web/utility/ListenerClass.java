/**
 * 
 */
package com.edm_dsm_web.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.edm_dsm_web.actiondriver.ActionDrivers;
import com.edm_dsm_web.base.BaseEDM;

public class ListenerClass extends ExtentManager implements ITestListener {

	ActionDrivers action = new ActionDrivers();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			//test.log(Status.PASS, "Pass Test case is: " + result.getName());
			test.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + " - Test Case Pass", ExtentColor.GREEN));
			//test.log(Status.PASS,MarkupHelper.createLabel(result.getThrowable() + " - Test Case Pass", ExtentColor.GREEN));
			String imgPath = action.screenShot(BaseEDM.getDriver(), result.getName());
			test.pass("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());

		}

	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			String imgPath = action.screenShot(BaseEDM.getDriver(), result.getName());

			test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
		}
	}

	public void onTestSkipped(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
}
