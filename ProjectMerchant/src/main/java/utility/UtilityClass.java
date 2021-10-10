package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	
	
	public static void SelectValueFromDropdown(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	
	public static String Test_Data(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\Untitled spreadsheet (5).xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("SignUp");
		 String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue(); 
		 return value;
	} 
	
	public static String Test_Data1(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\Untitled spreadsheet (5).xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Login");
		 String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue(); 
		 return value;
	} 

}
