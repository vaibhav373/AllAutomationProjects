package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excel {
	
	public static String m1(int rowindex , int colIndex) throws EncryptedDocumentException, IOException
	{
		//FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\kiteCredentials (1).xlsx");
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\kiteCredentials (1).xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String sh = sheet.getRow(rowindex).getCell(colIndex).getStringCellValue();
		return sh;
	}
	

}
