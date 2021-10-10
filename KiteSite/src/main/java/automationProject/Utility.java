	package automationProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
//	public static String Test_Data(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
//	{
//		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\dummydata5.xlsx");
//		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
//		 String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
//		 
//		 return value;
//	}
	
	public static void captureScreenshot(WebDriver driver , int tcid) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("C:\\Users\\Vaibhav\\Desktop\\screenshoot\\kitesite_"+tcid+".jpg");
		 
		 FileHandler.copy(src, dest);
	}
	
	public static String getPropertyfiledata(String key) throws IOException
	{
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\testdata_1.properties");
		obj.load(objfile);
		String sh = obj.getProperty(key);
		return sh;
	}
	
}
