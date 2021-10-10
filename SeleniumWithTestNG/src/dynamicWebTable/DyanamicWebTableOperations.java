package dynamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicWebTableOperations {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();

		username.sendKeys("demo");

		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();

		password.sendKeys("demo");

		driver.findElement(By.xpath("//button[text()=' Login']")).click();

		driver.findElement(By.xpath("//a[text()=' Sales']")).click();

		driver.findElement(By.xpath("//a[text()='Orders']")).click();

		//1) Find total no of pages in webTable
		
		String text = driver.findElement(By.xpath("//div[text()='Showing 1 to 20 of 8573 (429 Pages)']")).getText();
		System.out.println(Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1 )));
		int total_page = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1 ));
		
		
		//2) Find how many row exist in each page
		for(int i = 1 ; i<total_page ; i++) {
			
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active pageNo = "+active_page.getText());
			active_page.click();
			
			int Rowsize = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println(Rowsize);
			
			
			//3) Read all the row each page
			
			for(int p = 1 ; p<Rowsize; p++) {
				
				String orderId = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+p+"]//td[2]")).getText();
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+p+"]//td[3]")).getText();
				String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+p+"]//td[4]")).getText();				
			
				System.out.println(orderId +"          "+ customerName+ "         " +Status);
			}
			
			String pageNo = Integer.toString(i+1);
		System.out.println("pagenoooooooooooooooooooo=     "+pageNo);	
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageNo+"']")).click();
			
		}
		Thread.sleep(2000);
		driver.quit();

	}
}
