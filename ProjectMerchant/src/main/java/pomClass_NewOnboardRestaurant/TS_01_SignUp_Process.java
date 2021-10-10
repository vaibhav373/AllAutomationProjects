 package pomClass_NewOnboardRestaurant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.OpenBrowser;

public class TS_01_SignUp_Process {
	
	@FindBy(xpath = "//a[text()='Sign Up']") private WebElement signup;
	@FindBy(xpath = "//input[@name='number']") private WebElement phoneno;
	@FindBy(xpath = "//input[@name='email']") private WebElement emailadd;
	@FindBy(xpath = "//input[@name='password']") private WebElement entpass;
	@FindBy(xpath = "//div//input[@name='confirm_password']") private WebElement entpass1;
	@FindBy(xpath = "//button[text()='Sign Up']") private WebElement btnSignup;
	WebDriver dd;
	
	public TS_01_SignUp_Process(WebDriver driver)
	{	dd = driver;
		PageFactory.initElements(driver, this);	
	}
	public void SetSignUp() throws InterruptedException
	{
		Thread.sleep(2000);
		signup.click();
	}
	
	public void SetphoneNo(String phone)
	{
		phoneno.sendKeys(phone);
	}
	public void SetEmailId(String Email)
	{
		emailadd.sendKeys(Email);
	}
	public void SetEnterPassword(String Pass)
	{
		entpass.sendKeys(Pass);
	}
	public void SetCofirmPassword(String Repass)
	{	
		entpass1.sendKeys(Repass);	
	}
	public void ClickOnBtn() {
		btnSignup.click();
	}


}
