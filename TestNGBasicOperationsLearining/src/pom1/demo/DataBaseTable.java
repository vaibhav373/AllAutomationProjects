package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataBaseTable {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://datatables.net/examples/api/multi_filter.html");
		Thread.sleep(2000);
		
		 int dataTable = driver.findElements(By.xpath("//table[@id='example']//tr")).size();
		 int dataTablecolsize = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th")).size();	
	
		
		 System.out.println(dataTable);
		
//		List<WebElement> dataTable_1 = driver.findElements(By.xpath("//table[@id='example']//tr"));
//		
//		System.out.println(dataTable_1.size());
//		
//		for(WebElement dataTables_1:dataTable_1)
//		{
//			System.out.println(dataTables_1.getText());
//		}
		
		
		for(int i=1; i<dataTable-1; i++)
		{
			for(int j=1; j<= dataTablecolsize; j++ )
			{
			if(i==1)
			{
				 String row_1 = driver.findElement(By.xpath("//table[@id='example']/thead/tr["+i+"]/th["+j+"]")).getText();
				 System.out.print(row_1 + " ");
				 
			}	
			
			else
			{
			String row_2 = driver.findElement(By.xpath("//table[@id='example']//tr["+i+"]/td["+j+"]")).getText();
			System.out.print(row_2+" ");
			}
		   }
			System.out.println();
		
		
		}
		
		
		
// another way to print header		
		
		
//		List<WebElement> row_1 = driver.findElements(By.xpath("//tr[@role='row']/th"));
//		for(int i=0; i<row_1.size() ; i++)
//		{
//			 String row_h = row_1.get(i).getText();
//			 System.out.println(row_h);
//		}
//		
		
	}

	}
