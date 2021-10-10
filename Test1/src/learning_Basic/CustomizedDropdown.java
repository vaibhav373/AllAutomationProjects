package learning_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		driver.findElement(By.cssSelector("button[id='menu1']")).click();

		List<WebElement> dropDownList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

		for (int i = 0; i < dropDownList.size(); i++) {
			if (dropDownList.get(i).equals("CSS")) {
				dropDownList.get(i).click();
				break;
			}
		}
	}
}
