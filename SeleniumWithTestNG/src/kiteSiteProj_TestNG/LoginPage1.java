package kiteSiteProj_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	//Declaration 
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement userName;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement loginBtn;
	
	//Initialization
	
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Implementation
	public void setUserName(String UN) {
		userName.sendKeys(UN);
	}
	
	public void setPassword(String pss) {
		password.sendKeys(pss);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
}
