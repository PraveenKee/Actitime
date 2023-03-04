package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id = "logoutLink")
	private WebElement lgOutBtn;
	
	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement tasksTab;
	
	@FindBy(id = "container_users")
	private WebElement usersTab;
	
	@FindBy(id = "container_reports")
	private WebElement reportsTab;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[4]")
	private WebElement helpNSupportDDOpt;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogOut() {
		lgOutBtn.click();
	}
	
	public void setTask() {
		tasksTab.click();
	}
	
	public void setUsers() {
		usersTab.click();
	}
	
	public void setReports() {
		reportsTab.click();
	}
	
	public void setHelpNSupport() {
		helpNSupportDDOpt.click();
	}

}
