package pomWithDdf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcelSheet {
	
	//public Object sheet;

	public void excelSheetData() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("");
		Sheet sheet = WorkbookFactory.create(file).getSheet("sheet1");
	}

}
