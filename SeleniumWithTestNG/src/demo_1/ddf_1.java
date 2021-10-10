package demo_1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddf_1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\New folder1\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();

    
    driver.get("https://kite.zerodha.com/");
    Thread.sleep(1000);
    
    
    
    FileInputStream file= new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\zerodha.xlsx");
  //  String UN = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
    
    
    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
    Thread.sleep(1000);
    
 //  String pass = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   
   Thread.sleep(1000);
 //  String pin = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();
   driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   
   
   


}

}