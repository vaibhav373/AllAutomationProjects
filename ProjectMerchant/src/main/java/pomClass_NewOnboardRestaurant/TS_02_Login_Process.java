package pomClass_NewOnboardRestaurant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS_02_Login_Process{
	
	@FindBy(xpath = "//input[@id='outlined-helperText']") private WebElement loginId;
	@FindBy(xpath = "//input[@id='outlined-adornment-password']") private WebElement pass;
	@FindBy(xpath = "//button[text()='Login']") private WebElement loginButton;
	@FindBy(xpath = "//div[@class='logout-button-navigation cursor']") private WebElement logoutbutton;
	
	public TS_02_Login_Process(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void SetUserId(String ID) 
	{
		loginId.sendKeys(ID);
	}
	
	public void SetPassword(String Pass1)
	{
		pass.sendKeys(Pass1);
		loginButton.click();
	}
	
	public void logout_Merchant() 
	{
		
		logoutbutton.click();
	}
}
