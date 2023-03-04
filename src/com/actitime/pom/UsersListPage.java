package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neilalexander.jnacl.crypto.xsalsa20;

public class UsersListPage {

	@FindBy(xpath = "//div[text()='New User']")
	private WebElement addNewUser;

	@FindBy(id = "createUserPanel_firstNameField")
	private WebElement userFirstName;
	
	@FindBy(id = "createUserPanel_lastNameField")
	private WebElement userLastName;
	
	@FindBy(id = "createUserPanel_emailField")
	private WebElement uesrEmailId;
	
	//@FindBy(xpath = "//div[@class='simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty active']")
	@FindBy(xpath = "(//div[@class='selector'])[2]")
	private WebElement ueserDepartmentDD;
	
	@FindBy(xpath = "//div[@class='itemsContainer']//div[text()='Quality Control' and @class='item']")
	private WebElement selectDepartmentTbx;
	
	@FindBy(xpath = "(//button[@class='x-btn-text'])[4]")
	private WebElement ueserHireDate;
	
	@FindBy(xpath = "(//button[@class='x-btn-text'])[5]")
	private WebElement calenderBtn;
	
	@FindBy(xpath = "//a[text()='Nov']")
	private WebElement selectMonthDD;
	
	@FindBy(xpath = "//a[text()='2021']")
	private WebElement selectYearDD;
	
	@FindBy(xpath = "//button[@class='x-date-mp-ok']")
	private WebElement okBtn;
	
	@FindBy(xpath = "(//div[@class='selectorPlaceholder'])[2]")
	private WebElement selectDateDD;
	
	@FindBy(xpath = "//div[text()='Save & Send Invitation']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "(//span[text()='Close'])[1]")
	private WebElement closeBtn;
	
	@FindBy(xpath = "(//span[text()='All Users' and @class=' ellipsis'])[1]")
	private WebElement allUserFilterOpt;
	
	@FindBy(xpath = "(//label[text()='Selected users' and @class='x-form-cb-label'])")
	private WebElement selectedUserRadioBtn;
	
	@FindBy(xpath = "//div[@class=' x-btn at-icon-button filterButton ']")
	private WebElement selectDeptFilterOpt;
	
	@FindBy(xpath = "//span[text()='Quality Control']")
	private WebElement selectDeptDDOpt;
	
	@FindBy(xpath = "(//span[text()='Apply'])[2]")
	private WebElement applyBtn;
	
	@FindBy(xpath = "//div[@class='userGroups']")
	private WebElement allQualityControlUsers;
	
	@FindBy(xpath = "(//span[@class='userNameSpan'])[1]")
	private WebElement selectModifyUserName;
	
	@FindBy(xpath = "//div[@class='components_switcher small off animated']")
	private WebElement timeTrackRequiresApprovalBtn;
	
	@FindBy(xpath = "(//span[text()='Use corporate settings'])[2]")
	private WebElement useCorporateSettingsChkBox;
	
	@FindBy(xpath = "//span[text()='New Schedule']")
	private WebElement newScheduleBtn;
	
	@FindBy(xpath = "(//td[@class='first'])[2]")
	private WebElement workScheduleNOvertimeTrackingBtn;
	
	
	@FindBy(xpath = "((//td[@class='first'])[2]/..//td/..//td)")
	private WebElement textBtn;
	
	
	public UsersListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getAddNewUser() {
		return addNewUser;	
	}
	
	public WebElement getUserFirstName() {
		return userFirstName;
	}
	
	public WebElement getUserLastName() {
		return userLastName;
	}
	
	public WebElement getUesrEmailId() {
		return uesrEmailId;	
	}

	public WebElement getUeserDepartmentDD() {
		return ueserDepartmentDD;
	}
	
	public WebElement getSelectDepartmentTbx() {
		return selectDepartmentTbx;
	}
	
	public WebElement getUeserHireDate() {
		return ueserHireDate;	
	}
	
	public WebElement getCalenderBtn() {
		return calenderBtn;
	}
	
	public WebElement getSelectMonthDD() {
		return selectMonthDD;
	}

	public WebElement getSelectYearDD() {
		return selectYearDD;
	}
	
	public WebElement getOkBtn() {
		return okBtn;
	}
	
	public WebElement getSelectDateDD() {
		return selectDateDD;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
	public WebElement getAllUserFilterOpt() {
		return allUserFilterOpt;
	}
	
	public WebElement getSelectedUserRadioBtn() {
		return selectedUserRadioBtn;	
	}
	
	public WebElement getSelectDeptDDOpt() {
		return selectDeptDDOpt;	
	}
	
	public WebElement getSelectDeptFilterOpt() {
		return selectDeptFilterOpt;
	}
	
	public WebElement getApplyBtn() {
		return applyBtn;
	}
	
	public WebElement getAllQualityControlUsers() {
		return allQualityControlUsers;	
	}
	
	public WebElement getSelectModifyUserName() {
		return selectModifyUserName;
	}
	
	public WebElement getTimeTrackRequiresApprovalBtn() {
		return timeTrackRequiresApprovalBtn;
	}
	
	public WebElement getUseCorporateSettingsChkBox() {
		return useCorporateSettingsChkBox;
	}
	
	public WebElement getNewScheduleBtn() {
		return newScheduleBtn;
	}
	
	public WebElement getWorkScheduleNOvertimeTrackingBtn() {
		return workScheduleNOvertimeTrackingBtn;
	}
	
	public WebElement getTextBtn() {
		return textBtn;
	}
	
}
