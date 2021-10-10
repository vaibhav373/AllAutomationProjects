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

public class WithDataDrivenF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Vaibhav\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\Untitled spreadsheet(2).xlsx");
	  Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
	  
		
		driver.get("https://amazon.com");
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("");
		
		
		
		
		
		
	}
}
