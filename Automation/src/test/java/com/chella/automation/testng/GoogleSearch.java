package com.chella.automation.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearch {
	public WebDriver driver;
	public String filepath = "C:\\GitRepo\\Practice\\Automation\\keywords.xlsx";
	public String fileName = "keywords.xlsx";
	public String sheetName = "Sheet1";

	@BeforeTest
	public void setup() {
		driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.name("btnK")));
	}

	@Test(dataProvider = "search", priority = 1)
	public void searchGoogle(String key) {
		driver.findElement(By.id("q")).sendKeys(key);
		driver.findElement(By.name("btnG")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	public void countResults() {
		String result;
		WebElement ele = driver.findElement(By.cssSelector("div#extabar"));
		result = ele.getText();
		System.out.println(result);
		result = ele.getTagName();
		System.out.println(result);

	}

	@DataProvider(name = "Search")
	public Object[] search() throws IOException {
		Object[] keyword = readExcel(filepath, fileName, sheetName);
		return keyword;
	}

	public String[] readExcel(String filepath, String fileName, String sheetName)
			throws IOException {

		File file = new File(filepath);
		FileInputStream in = new FileInputStream(file);
		Workbook wb = null;

		String extension = fileName.substring(fileName.lastIndexOf("."));
		if (extension.equals(".xls"))
			wb = new HSSFWorkbook(in);
		else
			wb = new XSSFWorkbook(in);

		Sheet sh = wb.getSheet(sheetName);

		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
		String[] input = new String[rowcount];

		for (int i = 0; i < rowcount; i++) {
			Row row = sh.getRow(i);
			input[i] = row.getCell(i).getStringCellValue();
		}
		return input;
	}
}
