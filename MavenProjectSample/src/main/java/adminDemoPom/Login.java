package adminDemoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(xpath = "//input[@id='Email']") private WebElement emailid;
	@FindBy(xpath = "//input[@id='Password']") private WebElement password;
	@FindBy(xpath = "//button[text()='Log in']") private WebElement loginBtn;
	
	public Login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setEmailId() throws InterruptedException {
		emailid.clear();
		emailid.sendKeys("admin@yourstore.com");
	}
	
	public void setPassword() {
		password.clear();
		password.sendKeys("admin");
	}
	
	public void clickOnLoginButton() {
		loginBtn.click();
	}
	
}
