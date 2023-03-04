package com.actitime.testscript;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
import com.actitime.pom.UsersListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateUsers extends BaseClass {
	
//	public static FileLib f = new FileLib();
//	public static HomePage h = new HomePage(driver);
//	public static UsersListPage u = new UsersListPage(driver);
	
	
	@Test
	public void testCreateNewUser() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateNewUser", true);
		
		FileLib f = new FileLib();
		HomePage h = new HomePage(driver);
		UsersListPage u = new UsersListPage(driver);
		
		String userFirstName = f.getExcelData("newUsers", 1, 5);
		String userLastName = f.getExcelData("newUsers", 1, 6);
		String userEmailId = f.getExcelData("newUsers", 1, 7);
		
		h.setUsers();
		
		u.getAddNewUser().click();
		Thread.sleep(2000);
		u.getUserFirstName().sendKeys(userFirstName);
		Thread.sleep(1000);
		u.getUserLastName().sendKeys(userLastName);
		Thread.sleep(1000);
		u.getUesrEmailId().sendKeys(userEmailId);
		Thread.sleep(1000);
		u.getSelectDateDD().click();
		Thread.sleep(2000);
		u.getSelectDepartmentTbx().click();
		Thread.sleep(2000);
		u.getUeserHireDate().click();
		Thread.sleep(2000);
		u.getCalenderBtn().click();
		Thread.sleep(2000);
		u.getSelectMonthDD().click();
		Thread.sleep(2000);
		u.getSelectYearDD().click();
		u.getOkBtn().click();
		Thread.sleep(1000);
		u.getSelectDateDD().click();
		Thread.sleep(1000);
		u.getSaveBtn().click();
		Thread.sleep(1000);
		u.getCloseBtn().click();
	}

	@Test
	public void testCreateNewUser1() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateNewUser", true);
		
		HomePage h = new HomePage(driver);
		UsersListPage u = new UsersListPage(driver);
		FileLib f = new FileLib();
		
		String userFirstName = f.getExcelData("newUsers", 2, 5);
		String userLastName = f.getExcelData("newUsers", 2, 6);
		String userEmailId = f.getExcelData("newUsers", 2, 7);
		
		h.setUsers();
		
		u.getAddNewUser().click();
		Thread.sleep(2000);
		u.getUserFirstName().sendKeys(userFirstName);
		u.getUserLastName().sendKeys(userLastName);
		u.getUesrEmailId().sendKeys(userEmailId);
		Thread.sleep(1000);
		u.getSelectDateDD().click();
		u.getSelectDepartmentTbx().click();
		Thread.sleep(2000);
		u.getUeserHireDate().click();
		Thread.sleep(2000);
		u.getCalenderBtn().click();
		Thread.sleep(2000);
		u.getSelectMonthDD().click();
		Thread.sleep(2000);
		u.getSelectYearDD().click();
		u.getOkBtn().click();
		Thread.sleep(1000);
		u.getSelectDateDD().click();
		Thread.sleep(1000);
		u.getSaveBtn().click();
		Thread.sleep(1000);
		u.getCloseBtn().click();
	}
	
	
	@Test
	public void testModifyingUser() throws InterruptedException, AWTException {
		Reporter.log("Modifying One User", true);
		
	FileLib f = new FileLib();
	HomePage h = new HomePage(driver);
	UsersListPage u = new UsersListPage(driver);
	
	h.setUsers();
	
	u.getAllUserFilterOpt().click();
	Thread.sleep(2000);
	u.getSelectedUserRadioBtn().click();
	Thread.sleep(2000);
	//u.getSelectDeptFilterOpt().click();
	Thread.sleep(1000);
	u.getSelectDeptDDOpt().click();
	Thread.sleep(3000);
	u.getApplyBtn().click();
	Thread.sleep(3000);
	//u.getSaveBtn().click();
	u.getSelectModifyUserName().click();
	Thread.sleep(3000);
	u.getTimeTrackRequiresApprovalBtn().click();
	Thread.sleep(3000);
	u.getNewScheduleBtn().click();
	Thread.sleep(2000);
	u.getUseCorporateSettingsChkBox().click();
	Thread.sleep(3000);
	u.getWorkScheduleNOvertimeTrackingBtn().click();
	Thread.sleep(2000);
	u.getTextBtn().click();
	Thread.sleep(2000);
	
//	u.getTextBtn(i).sendKeys(Keys.ENTER+"10");
	
	//u.getTextBtn().sendKeys("10");
	Robot r = new Robot();
	r.keyPress(KeyEvent.KEY_TYPED+10);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_TAB);
	//u.getTextBtn().sendKeys()
	
	/*
	Actions a = new Actions(driver);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(Keys.CLEAR);
	r.keyPress(Keys.INSERT+"10");
	r.keyPress(KeyEvent.VK_PASTE);	
	*/
}
}
