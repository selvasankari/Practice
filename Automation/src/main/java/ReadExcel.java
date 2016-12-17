
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.common.collect.Table.Cell;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		ReadExcel objreadexcel = new ReadExcel();

		String filePath = "C:\\workspace\\Selenium\\myproject\\src\\testData.xls";
		objreadexcel.writeExcel(filePath, "testData.xls", "Data");
		objreadexcel.readExcel(filePath, "testData.xls", "Data");

	}

	public void readExcel(String filePath, String filename, String sheetName)
			throws IOException {
		File file = new File(filePath);

		FileInputStream fs = new FileInputStream(file);

		Workbook wb = null;

		String extension = filename.substring(filename.indexOf("."));

		if (extension.equals(".xlsx")) {
			wb = new XSSFWorkbook(fs);

		}

		else if (extension.equals(".xls")) {
			wb = new HSSFWorkbook(fs);
		}
		Sheet sht = wb.getSheet(sheetName);
		int rowCount = sht.getLastRowNum() - sht.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it

		for (int i = 0; i < rowCount + 1; i++) {

			Row row = sht.getRow(i);

			// Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print excel data in console

				System.out.print(row.getCell(j).getStringCellValue() + "|| ");

			}

			System.out.println();
		}

	}

	public void writeExcel(String filePath, String filename, String sheetName)
			throws IOException {
		File file = new File(filePath);

		FileInputStream fs = new FileInputStream(file);

		Workbook ws = null;

		String fileExtn = filename.substring(filename.indexOf("."));

		if (fileExtn.equalsIgnoreCase(".xlsx")) {
			ws = new XSSFWorkbook(fs);
		} else if (fileExtn.equals(".xls")) {
			ws = new HSSFWorkbook(fs);
		}

		Sheet sht = ws.getSheet(sheetName);

		String[] text = { "ho", "bii", "vii" };

		Row row = sht.getRow(0);
		int rowcount = sht.getLastRowNum() - sht.getFirstRowNum();

		Row newrow = sht.createRow(rowcount + 1);
		for (int j = 0; j < row.getLastCellNum(); j++) {

			Cell cell = newrow.createCell(j);
			cell.setCellValue(text[j]);
		}
		fs.close();
		FileOutputStream fo = new FileOutputStream(file);
		ws.write(fo);
		fo.close();

	}

}
