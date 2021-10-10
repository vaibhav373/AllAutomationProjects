package automationProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LoginPage2 {
		
		// DECLARTION
		@FindBy(xpath= "//input[@id='pin']") private WebElement pin;
		@FindBy(xpath = "//button[text()='Continue ']" ) private WebElement continueBtn;
		
		//Initalization
		
		public LoginPage2(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		//Implementation
		
		public void setPin(String pinno) {
			pin.sendKeys(pinno);
		}
		
		public void clickOnContinueBtn() {
			continueBtn.click();
		}
		
	



}
