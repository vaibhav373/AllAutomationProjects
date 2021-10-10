package pomForFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Login {


	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']") private WebElement userName;
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']") private WebElement password;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']") private WebElement loginbtn;
	
	
	
	public Login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(){
		userName.sendKeys("vaibhavmore805@gmail.com");
	}
	
	public void setPassword() {
		password.sendKeys("more1234");
	}
	
	public void clickOnLoginBtn() {
		Reporter.log("Inside the loginbtnclick");
		
		loginbtn.click();
		System.out.println("Inside the ");
	}
	
}
