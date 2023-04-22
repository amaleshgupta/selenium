package org.allinone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void windowmaximize() {
		driver.manage().window().maximize();

	}

	public static void launchurl(String url) {
		driver.get(url);

	}

	public static String pagetitle() {
		String title = driver.getTitle();
		return(title);

	}

	public static void pageurl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void passtext(String txt, WebElement ele) {
		ele.sendKeys(txt);

	}

	public static void closeentirebrowser() {
		driver.quit();

	}

	public static void clickbtn(WebElement ele) {
		ele.click();

	}

	public static void screenshot(String imgname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imagename.png");
		FileUtils.copyFile(img, f);

	}

	public static Actions a;

	public static void movethecursor(WebElement targertElement) {
		a = new Actions(driver);
		a.moveToElement(targertElement).perform();

	}

	public static void draganddrop(WebElement drageleElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(drageleElement, dropElement).perform();

	}

	public static JavascriptExecutor js;

	public static void scrollthepage(WebElement tarwebele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoview(true)", tarwebele);

	}

	public static void scrollpage(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoview(true)", ele);

	}

	public static void excelread(String sheetname, int rownum, int cellnum) throws IOException {

		File f = new File("excelfilepath.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("datas");

		Row row = sheet.getRow(rownum);
		Cell c = row.getCell(cellnum);
		int cellType = c.getCellType();
		String value = " ";
		if (cellType == 1) {
			String stringCellValue = c.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-mm-yy");
			String format = s.format(dd);

		} else {
			double numericCellValue = c.getNumericCellValue();
			Long l = (long) numericCellValue;
			String value1 = String.valueOf(l);

		}
	}

	public static void createnewexcelfilename(int rownum, int cellnum, String writedata) throws IOException {
		File f = new File("excelfilepath.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.createSheet("datas");

		Row row = sheet.createRow(rownum);
		Cell c = row.createCell(cellnum);
		c.setCellValue(writedata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void createnewcell(int getrow, int crecell, String writedata) throws IOException {
		File f = new File("excelfilepath.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("datas");

		Row row = sheet.getRow(getrow);
		Cell c = row.createCell(crecell);
		c.setCellValue(writedata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void createnewrow(int crerow, int crecell, String writedata) throws IOException {
		File f = new File("excelfilepath.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("datas");

		Row row = sheet.getRow(crerow);
		Cell c = row.createCell(crecell);
		c.setCellValue(writedata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void updateparticukarcell(int gettherow, int getthecell, String existingvalue, String writenewdata)
			throws IOException {
		File f = new File("excelfilepath.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("datas");

		Row row = sheet.getRow(gettherow);
		Cell c = row.createCell(getthecell);
		String str = c.getStringCellValue();
		if (str.equals(existingvalue))
			;
		{
			c.setCellValue(writenewdata);

		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}
}
