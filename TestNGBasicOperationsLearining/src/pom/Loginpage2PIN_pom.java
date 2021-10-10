package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2PIN_pom {

	// step1 :Declartion
	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;
	@FindBy(xpath = "//button[text()='Continue ']")
	private WebElement continuebtn;

	// step2 : initialization
	public Loginpage2PIN_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// usage

	public void enterPin() {
		pin.sendKeys("959594");
	}

	public void clickOnContinueBtn() {
		continuebtn.click();
	}
}
