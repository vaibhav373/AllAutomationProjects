package practice_KiteSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_1 {
	
	
	//declaration
	
		@FindBy(xpath = "//input[@id='userid']")  private	WebElement un;	
		@FindBy(xpath = "//input[@id='password']")  private    WebElement pwd;
		@FindBy(xpath = "//button[text()='Login ']")  private    WebElement lgn;

		//Initilization
		
		public LoginPage_1(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		public void enterUn(String userID)
		{
			un.sendKeys(userID);
		}
		
		public void enterPwd(String userPwd) {
			
			pwd.sendKeys(userPwd);
		
		}
		
		public void loginBtn() {
			
			lgn.click();
		}

}
