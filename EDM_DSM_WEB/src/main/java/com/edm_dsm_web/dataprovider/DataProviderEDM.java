package com.edm_dsm_web.dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.edm_dsm_web.utility.NewExcelLibrary;

public class DataProviderEDM {
	NewExcelLibrary obj = new NewExcelLibrary();

	// Class --> LoginPageTest,HomePageTest Test Case--> loginTest, wishListTest,
	// orderHistoryandDetailsTest

	@DataProvider(name = "credentials")
	public Object[][] getCredentials() {
		// Totals rows count
		int rows = obj.getRowCount("Sheet1");
		// Total Columns
		int column = obj.getColumnCount("Sheet1");
		int actRows = rows;
		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Sheet1", j, i + 2);
				// System.out.println("Anil : " + data[i][j]);
			}
		}
		return data;

	}

	// Class --> AccountCreationPage Test Case--> verifyCreateAccountPageTest
	@DataProvider(name = "anil")
	public Object[][] getEmail() {
		// Totals rows count
		int rows = obj.getRowCount("Sheet2");
		// Total Columns
		int column = obj.getColumnCount("Sheet2");
		int actRows = rows;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Sheet2", j, i + 2);
				System.out.println("Current working directory in Java : " + data[i][j]);
			}
		}
		return data;
	}

	// Class --> AddToCartPageTest, EndToEndTest, Test Case--> addToCartTest,
	// endToEndTest
	@DataProvider(name = "anil1")
	public Object[][] getProduct() {
		// Totals rows count
		int rows = obj.getRowCount("Sheet3");
		// Total Columns
		int column = obj.getColumnCount("Sheet3");
		int actRows = rows;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Sheet3", j, i + 2);
			}
		}
		return data;
	}

	// Class --> SearchResultPageTest, Test Case--> productAvailabilityTest
	@DataProvider(name = "searchProduct")
	public Object[][] getProductPrice() {
		// Totals rows count
		int rows = obj.getRowCount("SearchProduct");
		// Total Columns
		int column = obj.getColumnCount("SearchProduct");
		int actRows = rows;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("SearchProduct", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name = "loginDetailsData1")
	public Object[][] accountCreation() {

		// Totals rows count
		int rows = obj.getRowCount("LoginData");

		// Total Columns
		int column = obj.getColumnCount("LoginData");
		System.out.println(column);
		int actRows = rows;
		System.out.println(actRows);
		// Created an object of array to store data
		Object[][] data = new Object[column - 1][1];

		for (int i = 0; i < column - 1; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < actRows; j++) {
				hashMap.put(obj.getCellData("LoginData", i, j), obj.getCellData("LoginData", i + 1, j));
			}
			data[i][0] = hashMap;
			System.out.println(data[i][0]);
		}
		return data;
	}

	@DataProvider(name = "loginDetailsData")
	public Object[][] loginDetails() {

		// Totals rows count
		int rows = obj.getRowCount("LoginData_R");
		// Total Columns
		int column = obj.getColumnCount("LoginData_R");
		int actRows = rows;
		// Created an object of array to store data
		Object[][] data = new Object[actRows][1];

		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("LoginData_R", j, 1), obj.getCellData("LoginData_R", j, i + 2));
			}
			data[i][0] = hashMap;
			// System.out.println(data[i][0]);
		}
		return data;

	}

	@DataProvider(name = "RS_Registration_Customer")
	public Object[][] rsRegistrationDetailscustomer() {

		// Totals rows count
		int rows = obj.getRowCount("Customer");
		// Total Columns
		System.out.println(rows);
		int column = obj.getColumnCount("Customer");
		System.out.println(column);
		int actRows = rows;
		// Created an object of array to store data
		Object[][] data = new Object[actRows][1];

		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("Customer", j, 1),
						obj.getCellData("Customer", j, i + 2));
			}
			data[i][0] = hashMap;
			System.out.println(data[i][0]);
		}
		return data;

	}

	@DataProvider(name = "RS_Registration_Admin")
	public Object[][] rsRegistrationDetailsAdmin() {

		// Totals rows count
		int rows = obj.getRowCount("Admin");
		System.out.println(rows);
		// Total Columns
		int column = obj.getColumnCount("Admin");
		System.out.println(column);
		int actRows = rows;
		// Created an object of array to store data
		Object[][] data = new Object[actRows][1];

		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("Admin", j, 1),
						obj.getCellData("Admin", j, i + 2));
			}
			data[i][0] = hashMap;
			System.out.println(data[i][0]);
		}
		return data;

	}
	@DataProvider(name = "HUP_CustomerApplication")
	public Object[][] hupCustomerApplication() {

		// Totals rows count
		int rows = obj.getRowCount("HUP_Customer");
		System.out.println(rows);
		// Total Columns
		int column = obj.getColumnCount("HUP_Customer");
		System.out.println(column);
		int actRows = rows;
		// Created an object of array to store data
		Object[][] data = new Object[actRows][1];

		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("HUP_Customer", j, 1),
						obj.getCellData("HUP_Customer", j, i + 2));
			}
			data[i][0] = hashMap;
			System.out.println(data[i][0]);
		}
		return data;

	}
	@DataProvider(name = "RS_ContractorProject")
	public Object[][] rsContractorProject() {

		// Totals rows count
		int rows = obj.getRowCount("RS_Contractor");
		System.out.println(rows);
		// Total Columns
		int column = obj.getColumnCount("RS_Contractor");
		System.out.println(column);
		int actRows = rows;
		// Created an object of array to store data
		Object[][] data = new Object[actRows][1];

		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("RS_Contractor", j, 1),
						obj.getCellData("RS_Contractor", j, i + 2));
			}
			data[i][0] = hashMap;
			System.out.println(data[i][0]);
		}
		return data;

	}
	@DataProvider(name = "HUP_WorkOrderDetails")
	public Object[][] hupWorkOrder() {

		// Totals rows count
		int rows = obj.getRowCount("HUP_WorkOrder");
		System.out.println(rows);
		// Total Columns
		int column = obj.getColumnCount("HUP_WorkOrder");
		System.out.println(column);
		int actRows = rows;
		// Created an object of array to store data
		Object[][] data = new Object[actRows][1];

		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("HUP_WorkOrder", j, 1),
						obj.getCellData("HUP_WorkOrder", j, i + 2));
			}
			data[i][0] = hashMap;
			System.out.println(data[i][0]);
		}
		return data;

	}

}
