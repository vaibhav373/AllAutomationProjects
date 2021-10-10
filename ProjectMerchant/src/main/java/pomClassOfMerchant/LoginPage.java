package pomClassOfMerchant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='outlined-helperText']") private WebElement UserName;
	@FindBy(xpath = "//input[@id='outlined-adornment-password']") private WebElement Password;
	@FindBy(xpath = "//button[@type='Submit']") private WebElement Loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void SetUserName()
	{
		UserName.sendKeys("8669664700");
	}
	
	public void SetPassword()
	{
		Password.sendKeys("Shivam@123");
	}
	
	public void SetloginButton()
	{
		Loginbutton.click();
	}
}
