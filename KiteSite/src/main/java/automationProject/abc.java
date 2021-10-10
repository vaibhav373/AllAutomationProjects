package automationProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class abc {

	
	public static void captureScreenshot(WebDriver driver , int id) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// System.out.println(src);
		 
		 File dest = new File("C:\\Users\\Vaibhav\\Desktop\\screenshoot\\kitesite"+id+".jpg");
		 
		 FileHandler.copy(src, dest);
	}
	
	
//	public static String m1(int rowindex , int colIndex) throws EncryptedDocumentException, IOException
//	{
//		//FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\kiteCredentials (1).xlsx");
//		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\kiteCredentials (1).xlsx");
//		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
//		String sh = sheet.getRow(rowindex).getCell(colIndex).getStringCellValue();
//		return sh;
//	}
	
	
	
	
	
}
