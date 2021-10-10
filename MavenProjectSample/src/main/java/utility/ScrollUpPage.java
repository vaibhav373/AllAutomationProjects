package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUpPage {
	WebDriver driver;
	
	public ScrollUpPage(WebDriver driver) {
		this.driver = driver;
	}

//Custom Page scroll	
	
//	public void ScrollupPage(int up, int down) {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript(("scroll("+down+", "+up+")"));
//	}
	
	//scroll towards the element
	
	public void ScrollupPage(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",element);
	}
}
