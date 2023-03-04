package com.actitime.testscript;

import java.io.IOException;

import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

/**
 * This test method for Create Customer in TaskListPage
 */

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {

	@Test
		public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateCustomer", true);
		
		FileLib f = new FileLib();
		HomePage h = new HomePage(driver);
		TaskListPage t = new TaskListPage(driver);
		
		String custName = f.getExcelData("createCustomer", 1, 5);
		String custDesc = f.getExcelData("createCustomer", 1, 6);
		
		h.setTask();
		
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		Thread.sleep(2000);
		t.getEnterCustNameTbx().sendKeys(custName);
		t.getEnterCustDescriptionTbx().sendKeys(custDesc);
		Thread.sleep(2000);
		t.getSelectCustDD().click();
		Thread.sleep(2000);
		t.getSelectOurCompanyTx().click();
		Thread.sleep(2000);
		t.getCreateCustomerBtn().click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer(), custName));
		String actualText = t.getActualCustomer().getText();
		Assert.assertEquals(actualText, custName);   
	}
	
	@Test
	public void testCreateCustomer1() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("CreateCustomer1", true);
	
	FileLib f = new FileLib();
	HomePage h = new HomePage(driver);
	TaskListPage t = new TaskListPage(driver);
	
	String custName = f.getExcelData("createCustomer", 2, 5);
	String custDesc = f.getExcelData("createCustomer", 2, 6);
	
	h.setTask();
	
	t.getAddNewBtn().click();
	t.getNewCustBtn().click();
	Thread.sleep(2000);
	t.getEnterCustNameTbx().sendKeys(custName);
	t.getEnterCustDescriptionTbx().sendKeys(custDesc);
	Thread.sleep(2000);
	t.getSelectCustDD().click();
	Thread.sleep(2000);
	t.getSelectOurCompanyTx().click();
	Thread.sleep(2000);
	t.getCreateCustomerBtn().click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer(), custName));
	String actualText = t.getActualCustomer().getText();
	Assert.assertEquals(actualText, custName);   
}
	
	
}
	