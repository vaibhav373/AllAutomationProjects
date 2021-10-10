package kiteSiteProj_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	
	
	public static String getTestData(int rowIndex, int colmnIndex) throws EncryptedDocumentException, IOException {
			
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\dummydata5.xlsx");
		 Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String	value = sheet.getRow(rowIndex).getCell(colmnIndex).getStringCellValue();
		return value;
	}
}
