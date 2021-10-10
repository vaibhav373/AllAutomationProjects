package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_1 {
	
	//declaration
	
	@FindBy(xpath = "//input[@id='userid']")  private	WebElement un;	
	@FindBy(xpath = "//input[@id='password']")  private    WebElement pwd;
	@FindBy(xpath = "//button[text()='Login ']")  private    WebElement lgn;

	//Initilization
	
	public Login_page_1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUn()
	{
		un.sendKeys("DV1510");
	}
	
	public void enterPwd() {
		
		pwd.sendKeys("Vijay@123");
	
	}
	
	public void loginBtn() {
		
		lgn.click();
	}
	

}
