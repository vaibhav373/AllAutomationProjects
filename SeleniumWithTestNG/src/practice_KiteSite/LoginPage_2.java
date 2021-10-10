package practice_KiteSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_2 {
	
	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;
	@FindBy(xpath = "//button[text()='Continue ']")
	private WebElement continuebtn;

	// step2 : initialization
	public LoginPage_2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	// usage

	public void enterPin(String userPin) {
		pin.sendKeys(userPin);
	}

	public void clickOnContinueBtn() {
		continuebtn.click();
	}

}
