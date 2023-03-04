package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generic.FileLib;

public class TaskListPage {
	
	/**
	 * This code is for create New Customer in TaskListPage
	 */
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustBtn;
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath = "//textarea[@placeholder ='Enter Customer Description']")
	private WebElement enterCustDescriptionTbx;
	
	@FindBy(xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath = "//div[text()='Our company' and contains(@class,'itemRow')]")
	private WebElement selectOurCompanyTx;
	
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']//div[@class='title']")
	private WebElement actualCustomer;
	
	/**
	 *  end the Declaration part of create customer
	 *  and below start the create new Project
	 */
	
	@FindBy(xpath = "//div[@class='item createNewProject']")
	private WebElement newProjectBtn;
	
	@FindBy(xpath = "//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterNewProjectTbx;
	
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement enterProjectDescTbx;
	
	//@FindBy(xpath = "//div[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer notSelected']")
	@FindBy(xpath = "(//div[contains(@class,'selectorWithPlaceholderContainer')])[1]")
	private WebElement custProjectDD;
	
	@FindBy(xpath = "(//div[text()='Our company' and contains(@class,'')])[10]")
	private WebElement ourCompanyProjectTx;
	
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	/**
	 *  end the Declaration part of create Project in TaskListPage
	 *  and below start the create New Task in TaskListPage
	 */
	
	@FindBy(xpath = "//div[@class='item createNewTasks']")
	private WebElement newTaskBtn;
	
	@FindBy(xpath = "(//div[contains(@class,'selectorWithPlaceholderContainer')])[1]")
	private WebElement selectTaskDD;
	
	@FindBy(xpath = "//div[text()='Our company' and contains(@class,'itemRow')]")
	private WebElement selectOurCompanyTaskTx;
	
	@FindBy(xpath = "(//div[contains(@class,'selectorWithPlaceholderContainer')])[2]")
	private WebElement selectProjectTaskDD;
	
	@FindBy(xpath = "//div[@class='searchItemList']/div[text()='Accounting' and contains(@class,'itemRow')]")
	private WebElement selectProjectTaskTx;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name' and @class='inputFieldWithPlaceholder'])[1]")
	private WebElement enterTaskNameTbx;
	
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createTaskBtn;
	
	/**
	 * This part code is initialization the WebElement
	 */
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This part of code Utilizing all methods for Create New Customer in TaskListPage
	 */
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	
	public WebElement getNewCustBtn() {
		return newCustBtn;
	}
	
	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}
	
	public WebElement getEnterCustDescriptionTbx() {
		return enterCustDescriptionTbx;
	}
	
	public WebElement getSelectCustDD() {
		return selectCustDD;
	}
	
	public WebElement getSelectOurCompanyTx() {
		return selectOurCompanyTx;
	}
	
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	public WebElement getActualCustomer() {
		return actualCustomer;	
	}
	
	/**
	 * This part of code Utilizing all methods for Create New Project in TaskListPage
	 */
	
	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}
	
	public WebElement getEnterNewProjectTbx() {
		return enterNewProjectTbx;
	}
	
	public WebElement getEnterProjectDescTbx() {
		return enterProjectDescTbx;
	}
	
	public WebElement getCustProjectDD() {
		return custProjectDD;
	}
	
	public WebElement getOurCompanyProjectTx() {
		return ourCompanyProjectTx;	
	}
	
	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}
	
	/**
	 * This part of code Utilizing all methods for Create New Task in TaskListPage
	 */

	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}
	
	public WebElement getSelectTaskDD() {
		return selectTaskDD;
	}
	
	public WebElement getSelectOurCompanyTaskTx() {
		return selectOurCompanyTaskTx;	
	}
	
	public WebElement getSelectProjectTaskDD() {
		return selectProjectTaskDD;	
	}
	
	public WebElement getSelectProjectTaskTx() {
		return selectProjectTaskTx;	
	}
	
	public WebElement getEnterTaskNameTbx() {
		return enterTaskNameTbx;
	}

	public WebElement getCreateTaskBtn() {
		return createTaskBtn;	
	}
}
			