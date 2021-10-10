package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata {
	
	
	
	public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(2000);
	
	LoginPage_1 login_1 = new LoginPage_1(driver);
	login_1.enterUn(excel.m1(0, 0));

}
}