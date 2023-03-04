package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.ReportsDashboardPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)

public class createReports extends BaseClass {

	
	//Department of AllStaff Chart Reports
	
	@Test
	public void testCreateDeptChartReport() throws InterruptedException {
		
		HomePage h = new HomePage(driver);
		ReportsDashboardPage rs = new ReportsDashboardPage(driver);
		
		h.setReports();
		
		rs.getCreateChartBtn().click();
		Thread.sleep(2000);
		rs.getCreateChartOptBy().click();
		Thread.sleep(2000);
		rs.getSelectDepChartOpt().click();
		Thread.sleep(2000);
		rs.getExportToPdfChartReport().click();
		Thread.sleep(2000);
		rs.getDownloadPdfChartReport().click();
		Thread.sleep(2000);
		rs.getCloseDownloadBtn().click();
	}
	
	//Customer related Quality Control Chart Report
	
	@Test
	public void testCreateCustQualityControlChartReport() throws InterruptedException {
		
		HomePage h = new HomePage(driver);
		ReportsDashboardPage rs = new ReportsDashboardPage(driver);
		
		h.setReports();
		
		rs.getCreateChartBtn().click();
		Thread.sleep(2000);
		rs.getCreateChartOptBy().click();
		Thread.sleep(2000);
		rs.getSelectCustChartOpt().click();
		Thread.sleep(2000);
		rs.getAllStaffDDOpt().click();
		Thread.sleep(2000);
		rs.getSelectedStaffOpt().click();
		Thread.sleep(2000);
		rs.getSelectQualityControlChkBox().click();
		Thread.sleep(2000);
		rs.getChartApplyBtn().click();
		Thread.sleep(2000);
		rs.getExportToPdfChartReport().click();
		Thread.sleep(2000);
		rs.getDownloadPdfChartReport().click();
		Thread.sleep(2000);
		rs.getCloseDownloadBtn().click();
		
	}
}
