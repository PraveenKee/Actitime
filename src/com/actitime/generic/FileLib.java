package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is FileLib class is generic library for read from property
 * file and read and write to a excel file.
 * 
 * @author Praveen K - QA
 * 
 */

public class FileLib {
	
	/**
	 * This method is to read the data from common property file
	 * @param url
	 * @param uesrname
	 * @param password
	 * @param key
	 * @param data
	 * @throws IOException 
	 */
	
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		//FileInputStream fis = new FileInputStream("/Users/nakrishn/eclipse-workspace/ACTITIME/data/commondata.property");
		//FileInputStream fis = new FileInputStream("/Users/nakrishn/Desktop/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	/** 
	 * This is method is to read the data from Excel file
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	
	public String getExcelData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	/**
	 * This method is to write the data to the Excel File
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	
	public void setWriteExcel(String sheetName, int row, int cell, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
	}
}
