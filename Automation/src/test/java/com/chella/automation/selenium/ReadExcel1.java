package com.chella.automation.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.testng.annotations.Test;

public class ReadExcel1 {

	public void readExcel(String filepath, String filename, String sheetName)
			throws IOException {
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb = null;

		String extension = filename.substring(filename.indexOf("."));
		System.out.println(filename.indexOf("."));
		System.out.println(extension);
		if (extension.equals(".xlsx")) {
			wb = new XSSFWorkbook(inputStream);
		} else {
			wb = new HSSFWorkbook(inputStream);
		}

		Sheet sh = wb.getSheet(sheetName);

		int row_count = sh.getLastRowNum() - sh.getFirstRowNum();
		System.out.println("Row Count" + row_count);

		for (int i = 0; i < row_count; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out
						.println(row.getCell(j).getStringCellValue() + " || ");
			}
			System.out.println();
			

		}

	}
	
	public static void main(String args) throws IOException
	{
		ReadExcel1 re= new ReadExcel1();
		String filepath = "C:\\GitRepo\\Practice\\Automation\\src\\main\\java\\com\\chella\\automation\\selenium\\testData.xls";
		String filename = "testData.xls";
		String sheetName= "Data";
		re.readExcel(filepath, filename, sheetName);
		
	}

}
