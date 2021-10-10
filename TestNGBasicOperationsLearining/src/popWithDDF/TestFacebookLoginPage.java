package popWithDDF;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebookLoginPage {
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();

			// driver.get("https://www.facebook.com");
			FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\dummydata2.xlsx");
		    Sheet exeldata = WorkbookFactory.create(file).getSheet("Sheet1");
		    driver.get("https://www.facebook.com");
		    Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			FacebookCreateAcc createacc = new FacebookCreateAcc(driver);
			createacc.clickOnCreateAccBtn();
		createacc.setFirstName(exeldata.getRow(0).getCell(0).getStringCellValue());
			createacc.setSurName(exeldata.getRow(0).getCell(1).getStringCellValue());
			createacc.setMobileNo(exeldata.getRow(0).getCell(2).getStringCellValue());
			
			createacc.setDay(exeldata.getRow(0).getCell(3).getStringCellValue());
			createacc.setMonth(exeldata.getRow(0).getCell(4).getStringCellValue());
			createacc.setYear(exeldata.getRow(0).getCell(5).getStringCellValue());
		}
}
