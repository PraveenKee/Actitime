package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerProject extends BaseClass {
	
	/**
	 * This test method is Create New Project in TaskListPage
	 */
	
	@Test
		public void testCreateProject() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("CreateProject", true);
		
		FileLib f = new FileLib();
		HomePage h = new HomePage(driver);
		TaskListPage t = new TaskListPage(driver);
		
		String projectName = f.getExcelData("createProject", 1, 5);
		String projectDesc = f.getExcelData("createProject", 1, 6);
		
		h.setTask();
		
		t.getAddNewBtn().click();
		t.getNewProjectBtn().click();
		Thread.sleep(2000);
		t.getEnterNewProjectTbx().sendKeys(projectName);
		t.getEnterProjectDescTbx().sendKeys(projectDesc);
		Thread.sleep(1000);
		t.getCustProjectDD().click();
		Thread.sleep(1000);
		t.getOurCompanyProjectTx().click();
		Thread.sleep(1000);
		t.getCreateProjectBtn().click();
	}
}
