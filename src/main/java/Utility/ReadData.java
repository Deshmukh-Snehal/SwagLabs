package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	// Retrieve Data from Property file
	public static String readPropertyFile(String val) throws Exception
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("E:/Velocity_Testing/Testing_Project_1/TestData/config.properties");
		p.load(file);
		p.getProperty(val); 
		return p.getProperty(val); 
	}
	// Retrieve Data From Excel File
	public static String readExcelFile(int row,int col) throws Exception
	{
		FileInputStream file = new FileInputStream("E:/Velocity_Testing/Testing_Project_1/TestData/CheckoutData.xlsx");
		Sheet excelFile = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excelFile.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
}