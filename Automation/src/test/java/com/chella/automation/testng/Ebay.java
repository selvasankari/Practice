package com.chella.automation.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ebay {
	public WebDriver driver;
	public String filepath = "C:\\GitRepo\\Practice\\Automation\\SearchItems.xlsx";
	public String fileName = "SearchItems.xlsx";
	public String sheetName = "Sheet1";

	@BeforeTest
	public void setup() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}

	@Test(dataProvider = "login")
	public void loginGmail(String loginId, String password) throws InterruptedException {
		WebElement userName = driver.findElement(By.cssSelector("input#Email"));
		WebElement next = driver.findElement(By.id("next"));
		//WebElement pwd = driver.findElement(By.cssSelector("input#Passwd"));
		//WebElement singinbutton = driver.findElement(By.id("signIn"));

		userName.sendKeys(loginId);
		System.out.println("Login Id :"  + loginId);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		next.click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#Passwd")).sendKeys(password);

		
		driver.findElement(By.id("signIn")).click();
		
		//driver.findElement(By.cssSelector("div.gb_Pa gb_Kb gb_Nd gb_R"))
				//.click();

	}

	@DataProvider(name = "login")
	public Object[][] loginData() throws IOException {
		Object[][] arrayObject = readExcel(filepath, fileName, sheetName);
		return arrayObject;
	}

	public String[][] readExcel(String filepath, String fileName,
			String sheetName) throws IOException {
		String[][] input;
		File file = new File(filepath);
		FileInputStream in = new FileInputStream(file);
		Workbook wb = null;
		String extension = fileName.substring(fileName.indexOf("."));

		if (extension.equalsIgnoreCase(".xlsx")) {
			wb = new XSSFWorkbook(in);
		} else {
			wb = new HSSFWorkbook(in);
		}
		XSSFSheet sh = (XSSFSheet) wb.getSheet(sheetName);
		System.out.println("sh.getLastRowNum()  sh.getFirstRowNum()" + sh.getLastRowNum() + " + " + sh.getFirstRowNum());
		int row_count = sh.getLastRowNum() - sh.getFirstRowNum() + 1;
		Row row;
		int col = sh.getRow(1).getLastCellNum();
		System.out.println(col);
		input = new String[row_count][col];
		System.out.println("row_count is " + row_count);

		for (int i = 0; i < row_count; i++) {
			System.out.println("i value" + i);
			row = sh.getRow(i);

			System.out.println("row.getLastCellNum()" + row.getLastCellNum());
			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.println(row.getLastCellNum());
				System.out.println("i value" + i + "j value" + j);
				if (row.getCell(j) != null) {
					input[i][j] = row.getCell(j).getStringCellValue();
		

				}
				System.out.println("The input array is" + input[i][j]
						+ "ivalue" + i + "jvalue" + j);
				System.out.println(row.getCell(j).getStringCellValue());

			}
			//break;
		}

		/*
		 * for(int k=0; k<input.length; k++){ for(int l=0; l<input[k].length;
		 * l++) { System.out.println(input[k][l]); } }
		 */

		return input;

	}
}
