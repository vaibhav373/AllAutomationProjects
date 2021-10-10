package adminDemoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	//Declaration
	@FindBy(xpath = "//ul//a[text()='Logout']") private WebElement logoutBtn;
	
	//Initialization
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Implementation
	
	public void clickonLogoutBtn() {
		logoutBtn.click();
	}
	
}
