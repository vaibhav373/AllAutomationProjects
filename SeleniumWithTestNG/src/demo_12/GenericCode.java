package demo_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

public class GenericCode {

	/*public static List<String> excelSheetData() throws EncryptedDocumentException, IOException {
		List<String> data=new ArrayList<String>();
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\Untitled spreadsheet (3).xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("BusinessType");
		int rnum=sheet.getLastRowNum();
		int cnum=sheet.getRow(0).getLastCellNum();
		//System.out.println("Num of rows:"+rnum+" Num of Cols:"+cnum);
		for(int i=1;i<rnum+1;i++)
		{
			for(int j=0;j<cnum;j++)
			{
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				data.add(sheet.getRow(i).getCell(j).getStringCellValue());
				//System.out.println(data);
			}
		}
		return data;
}*/
	
	public static String[] excelsheet_data() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\Untitled spreadsheet (3).xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
		String s = sheet.getRow(0).getCell(0).getStringCellValue();
		String[] str = s.split(", ");
		for(String s1 : str)
		{
			System.out.println(s1);
		}
		return str;
	}
	
	/*public static String Test_Data(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\Untitled spreadsheet (5).xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("SignUp");
		 String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue(); 
		 return value;
	}*/ 
	//public void selectServiceFromList(List<WebElement> getlist1, List<String> availablelist1)
	public void selectServiceFromList(List<WebElement> getlist1, String [] availablelist1)
	{
		for(String list1 : availablelist1)
		{
			System.out.println(list1);
			for(WebElement serviceList : getlist1)
			{
				if(serviceList.getText().equals(list1))
				{
				serviceList.click();
				break;
				}
			}
		}
	}	
}

//System.out.println(availablelist1.size());
//for(String list2 : availablelist1)
//{
//	System.out.println(list2);
//}
//
//System.out.println();
//System.out.println(getlist1.size());
//
//for(WebElement list3: getlist1)
//{
//	System.out.println(list3.getText());
//}
//String a[]=availablelist1.toArray(new String[0]);;