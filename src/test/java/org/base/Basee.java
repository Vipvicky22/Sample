package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.page.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basee {
	public static WebDriver driver;

	public void getdriver(String a) {
		if (a.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (a.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	public void maxwin() {
		driver.manage().window().maximize();
	}

	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void selectByIndex(WebElement element, int a) {
		Select s = new Select(element);
		s.selectByIndex(a);
	}

	public String readexcel(int rownum, int cellnum) throws IOException {
		File file = new File("C:\\Users\\user\\OneDrive\\Documents\\Book1.xlsx");
		FileInputStream inp = new FileInputStream(file);
		Workbook boook = new XSSFWorkbook(inp);
		Sheet sheet = boook.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();

		String value = null;

		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();

			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				value = simple.format(dateCellValue);
			} else {

				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				value = valueOf.toString();

			}
			break;

		default:
			System.out.println("In Valid Cell Type");
			break;
		}
		return value;

	}

	public void Sleep(int millis) throws InterruptedException {
		Thread.sleep(millis);
	}

}
