package pomClassOfFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_1_LoginCredentials {
	
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement UN;
	@FindBy(xpath = "//input[@type='password']") private WebElement PW;
	@FindBy(xpath = "(//span[text()='Login'])[2]") private WebElement loginBtn;
	
	public  TC_1_LoginCredentials(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SetloginCredentials(String UserID, String Pwd)
	{
		UN.sendKeys(UserID);
		PW.sendKeys(Pwd);
		loginBtn.click();
		
	}
//	public void pwdmethod(String pwd)
//	{
//		PW.sendKeys(pwd);
//		loginBtn.click();
//	}
}
