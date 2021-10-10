package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1_pom {


	// step1: Declartion

	@FindBy(xpath = "//input[@id='userid']")
	private WebElement un;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement pwd;

	@FindBy(xpath = "//button[text()= 'Login ']")
	private WebElement loginbtn;

	// step2: Intialization

	public Loginpage1_pom(WebDriver driver) {

		PageFactory.initElements(driver, this);
		
	}

//usage

	public void enterUN() {
		un.sendKeys("DV1510");
	}

	public void enterPWD() {
		pwd.sendKeys("Vijay@123");
	}

	public void clickOnLoginbtn() {
		loginbtn.click();
	}
	
}
