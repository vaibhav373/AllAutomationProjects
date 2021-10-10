package pomClass_MerchantDashboard_ordering;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTO_MerchantDashboard {
	
	@FindBy(xpath = "//input[@id='outlined-helperText']") private WebElement loginId;
	@FindBy(xpath = "//input[@id='outlined-adornment-password']") private WebElement pass;
	@FindBy(xpath = "//button[text()='Login']") private WebElement loginButton;
	@FindBy(xpath = "//div[@class='logout-button-navigation cursor']") private WebElement logoutbutton;
	
	public LoginTO_MerchantDashboard(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void SetLogin_Credential() throws InterruptedException
	{
		Thread.sleep(2000);
//		loginId.sendKeys("7045311293");
//		pass.sendKeys("Sid@123");
//		loginButton.click();
//		Thread.sleep(6000);
//		Thread.sleep(2000);
		loginId.sendKeys("8308328268");
		pass.sendKeys("Hh@123");
		loginButton.click();
		Thread.sleep(3000);
	}
	
	public void logout_Merchant() throws InterruptedException
	{
		Thread.sleep(2000);
		logoutbutton.click();
	}

}
