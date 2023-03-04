package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsDashboardPage {
	
	@FindBy(xpath = "//span[text()='Create Chart']")
	private WebElement createChartBtn;
	
	@FindBy(xpath = "//button[@class='x-btn-text' and text()='Users']")
	private WebElement createChartOptBy;
	
	@FindBy(xpath = "//a[text()='Departments']")
	private WebElement selectDepChartOpt;
	
	@FindBy(xpath = "//span[text()='Export to PDF']") 
	private WebElement exportToPdfChartReport;

	@FindBy(xpath = "//span[text()='Download PDF']")
	private WebElement downloadPdfChartReport;
	
	@FindBy(id = "closeCreateChartLightboxButton")
	private WebElement closeDownloadBtn;
	
	@FindBy(xpath = "//a[text()='Customers' and @class='x-menu-item']")
	private WebElement selectCustChartOpt;
	
	@FindBy(xpath = "(//span[text()='All Staff' and @class=' hierarchySelectorButton'])[1]")
	private WebElement allStaffDDOpt;
	
	@FindBy(xpath = "//label[text()='Selected Staff']")
	private WebElement selectedStaffOpt;
	
	@FindBy(xpath = "//span[@class='checkbox']/..//span[@title='Quality Control']")
	private WebElement selectQualityControlChkBox;
	
	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement chartApplyBtn;
	
	
	
	
	
	public ReportsDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateChartBtn() {
		return createChartBtn;
		}
	
	public WebElement getCreateChartOptBy() {
		return createChartOptBy;
	}
	
	public WebElement getSelectDepChartOpt() {
		return selectDepChartOpt;
	}
	
	public WebElement getExportToPdfChartReport() {
		return exportToPdfChartReport;
	}
	
	public WebElement getDownloadPdfChartReport() {
		return downloadPdfChartReport;
	}
	
	public WebElement getCloseDownloadBtn() {
		return closeDownloadBtn;
	}
	
	public WebElement getSelectCustChartOpt() {
		return selectCustChartOpt;
	}
	
	public WebElement getAllStaffDDOpt() {
		return allStaffDDOpt;
	}
	
	public WebElement getSelectedStaffOpt() {
		return selectedStaffOpt;
	}
	
	public WebElement getSelectQualityControlChkBox() {
		return selectQualityControlChkBox;
	}
	
	public WebElement getChartApplyBtn() {
		return chartApplyBtn;
	}
	
}
