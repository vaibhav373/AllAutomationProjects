package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromExcel {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// "C:\Users\Vaibhav\Downloads\dummydata.xlsx"

		// import the chromedrivers

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// open Site
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);

		driver.manage().window().maximize();

		// get the Excelsheet file and test data
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\dummydata.xlsx");
		Sheet excelData = WorkbookFactory.create(file).getSheet("Sheet1");

		// enter userName
		driver.findElement(By.xpath("//input[@id=\"userid\"]"))
				.sendKeys(excelData.getRow(0).getCell(0).getStringCellValue());

		// enter userName
		driver.findElement(By.xpath("//input[@id=\"password\"]"))
				.sendKeys(excelData.getRow(0).getCell(1).getStringCellValue());

		// click on login
		driver.findElement(By.xpath("//button[text()= 'Login ']")).click();

		// Enter Pin
		driver.findElement(By.xpath("//input[@id='pin']"))
				.sendKeys(excelData.getRow(0).getCell(2).getStringCellValue());

		// click on continue button

		driver.findElement(By.xpath("//button[text() = 'Continue ']")).click();

		// Verify user is valid or not

		String actualUserName = driver.findElement(By.xpath("//div[@class=\"avatar\"]/span")).getText();

		String expecteUserName = "KV";

		if (actualUserName.equals(expecteUserName)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		Thread.sleep(1000);
		driver.close();

	}

}
