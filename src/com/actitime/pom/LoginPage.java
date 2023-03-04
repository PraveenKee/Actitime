package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage {
	
	@FindBy(id = "headerContainer")
	private WebElement header;
	
	@FindBy(xpath = "//div[@class='atLogoImg']")
	private WebElement logo;
	
	@FindBy(xpath = "//div[@class='atProductName']")
	private WebElement brandName; 
	
	@FindBy(id = "username")
	private WebElement unTbx;
	
	@FindBy(name = "pwd")
	private WebElement pwTbx;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un, String pw) {
		
		Reporter.log("Title of the login="+header.getText(), true);
		Reporter.log("Logo image is present="+logo.isDisplayed(), true);
		Reporter.log("Brand Name is"+brandName.getText(), true);
		brandName.getText();
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pw);
		lgBtn.click();
	}
}
