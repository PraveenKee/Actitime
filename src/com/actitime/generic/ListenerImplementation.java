package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Welcome the ACTITIME PROJECT created By Parveen QA", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testSuccess = result.getName();
		Reporter.log("Success="+testSuccess, true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/"+res+".png");
	try {
		 FileUtils.copyFile(src, des);
	} 
	catch(IOException e) {
		
	}
}

	@Override
	public void onTestSkipped(ITestResult result) {	
		String sk = result.getName();
		Reporter.log("Skipped="+sk, true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {	
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("I completed FIRST TASK...next...", true);
	}
}
