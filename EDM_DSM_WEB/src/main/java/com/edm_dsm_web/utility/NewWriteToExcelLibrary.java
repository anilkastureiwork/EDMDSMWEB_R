package com.edm_dsm_web.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewWriteToExcelLibrary {
	private XSSFWorkbook wb;
	private XSSFSheet sheet;
	private XSSFRow row;
	private XSSFCell cell;

	public void setValues(int rowno, int cellno, String cellval) throws IOException {
		// Create an object of File class to open xlsx file
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		// creating workbook instance that refers to .xls file
		wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		sheet = wb.getSheet("Admin");

		// Create a row object to retrieve row at index 3
		row = sheet.getRow(rowno);
		// CellAddress cell=sheet.getActiveCell();

		// create a cell object to enter value in it using cell Index
		row.createCell(cellno).setCellValue(cellval);// 1126178
		// write the data in excel using output stream
		FileOutputStream outputStream = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx");
		wb.write(outputStream);
		wb.close();

	}

	public void setValuesInCustomer(int rowno, int cellno, String cellval) throws IOException {
		// Create an object of File class to open xlsx file
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		sheet = wb.getSheet("Customer");

		// Create a row object to retrieve row at index 3
		row = sheet.getRow(rowno);
		// CellAddress cell=sheet.getActiveCell();

		// create a cell object to enter value in it using cell Index
		row.createCell(cellno).setCellValue(cellval);// 1126178
		// write the data in excel using output stream
		FileOutputStream outputStream = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx");
		wb.write(outputStream);
		wb.close();
	}

	public void setValuesInHUP_Customer(int rowno, int cellno, String cellval) throws IOException {
		// Create an object of File class to open xlsx file
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		sheet = wb.getSheet("HUP_Customer");

		// Create a row object to retrieve row at index 3
		row = sheet.getRow(rowno);
		// CellAddress cell=sheet.getActiveCell();

		// create a cell object to enter value in it using cell Index
		row.createCell(cellno).setCellValue(cellval);// 1126178
		// write the data in excel using output stream
		FileOutputStream outputStream = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx");
		wb.write(outputStream);
		wb.close();
	}

	public void setValuesInRS_CustomerReadyForInspection(int rowno, int cellno, String cellval) throws IOException {
		// Create an object of File class to open xlsx file
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		sheet = wb.getSheet("RS_Contractor");

		// Create a row object to retrieve row at index 3
		row = sheet.getRow(rowno);
		// CellAddress cell=sheet.getActiveCell();

		// create a cell object to enter value in it using cell Index
		row.createCell(cellno).setCellValue(cellval);// 1126178
		// write the data in excel using output stream
		FileOutputStream outputStream = new FileOutputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx");
		wb.write(outputStream);
		wb.close();
	}
}
