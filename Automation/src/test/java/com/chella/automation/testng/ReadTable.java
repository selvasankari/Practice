package com.chella.automation.testng;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ReadTable {

	WebDriver driver = new FirefoxDriver();
	Logger log;

	@BeforeTest
	public void setup() {
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
	}

	@AfterTest
	public void exit() {
		driver.quit();
	}

	@Test(priority = 1)
	public void readtable() {
		// Get the number of rows in the table
		int row_count;
		row_count = driver
				.findElements(
						By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr"))
				.size();
		log.getLogger(ReadTable.class);
		// Get the number of cols in the table
		log.info("table row count" + row_count);
		int cols;
		cols = driver
				.findElements(
						By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td"))
				.size();
		log.info("table col count" + cols);

		String first_part = "/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[";
		String second_part = "]/td[";
		String third_part = "]";
		for (int i = 1; i <= row_count; i++) {
			// Used for loop for number of columns.
			for (int j = 1; j <= cols; j++) {
				// Prepared final xpath of specific cell as per values of i and
				// j.
				String final_xpath = first_part + i + second_part + j
						+ third_part;
				// Will retrieve value from located cell and print It.
				String Table_data = driver.findElement(By.xpath(final_xpath))
						.getText();
				System.out.print(Table_data + "  ");
			}
		}
	}

}
