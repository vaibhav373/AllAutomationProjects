package demo_1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToCHildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		//click on new tab from main page
		//driver.findElement(By.xpath("//input[@value='New Window']")).click();
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();

		
		Thread.sleep(10000);
		driver.manage().window().maximize();
		   
		//String mainPageid = driver.getWindowHandle();
		
		Set<String> ids = driver.getWindowHandles();   //["mainPage", "childwindow"]
		ArrayList<String> al=new ArrayList<String>(ids); //["mainPage", "childwindow"]
		
		String childWindowId = al.get(1);
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		driver.manage().window().maximize();
		//click on training from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		String childWindowId1 = al.get(0);
		System.out.println(childWindowId1);
		driver.switchTo().window(childWindowId1);

		
	}
}
