package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class TestClass extends BaseClass {
	
	
	@Test
	public void testCreateTask() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("CreateTask", true);
		
		FileLib f = new FileLib();
		HomePage h = new HomePage(driver);
		TaskListPage t = new TaskListPage(driver);
		
		String taskName = f.getExcelData("createTask", 1, 5);
		h.setTask();
		
		t.getAddNewBtn().click();
		t.getNewTaskBtn().click();
		t.getSelectTaskDD().click();
		Thread.sleep(2000);
		t.getSelectOurCompanyTaskTx().click();
		t.getSelectProjectTaskDD().click();
		Thread.sleep(5000);
		t.getSelectProjectTaskTx().click();
		Thread.sleep(5000);
		
		t.getEnterTaskNameTbx().sendKeys(taskName);
		Thread.sleep(1000);
		t.getCreateTaskBtn().click();	
	} 

}