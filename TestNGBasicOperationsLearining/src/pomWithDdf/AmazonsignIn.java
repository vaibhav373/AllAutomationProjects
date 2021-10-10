package pomWithDdf;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsignIn {
	
	@FindBy(xpath = "//input[@id='ap_email']")  private	WebElement un;	
	@FindBy(xpath = "//input[@id='continue']")  private    WebElement lgn;
	@FindBy(xpath = "//input[@id='ap_password']")  private    WebElement pwd;
	@FindBy(xpath = "//input[@id='signInSubmit']")  private    WebElement sign;

	//Initilization
	
	public AmazonsignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\Untitled spreadsheet (1).xlsx");
	
	public void SetAmazonSignIn() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("");
		Sheet sheet = WorkbookFactory.create(file).getSheet("sheet1");
		
		
		un.sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		lgn.click();
		pwd.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		sign.click();
	}
	
//	public void enterPwd() {
//		
//		
//		pwd.sendKeys("Vijay@123");
//	
//	}
//	
//	public void loginBtn() {
//		
//		lgn.click();
//	}
//	

}
