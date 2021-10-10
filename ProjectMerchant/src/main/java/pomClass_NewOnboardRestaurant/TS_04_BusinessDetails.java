package pomClass_NewOnboardRestaurant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS_04_BusinessDetails {
	
	@FindBy(xpath = "(//input[@id='outlined-error-helper-text'])[1]") private WebElement busName;
	@FindBy(xpath = "//input[@name='area']") private WebElement area;
	@FindBy(xpath = "//input[@name='city']") private WebElement city;
	@FindBy(xpath = "//input[@name='pinCode']") private WebElement pinCode;
	@FindBy(xpath = "//input[@name='enquiry_email']") private WebElement e_mail;
	@FindBy(xpath = "//input[@name='mobile_no']") private WebElement mobileno;
	@FindBy(xpath = "(//div[@id=\"demo-simple-select-outlined\"])[1]") private WebElement country;
	@FindBy(xpath = "(//div[@id=\"demo-simple-select-outlined\"])21]") private WebElement currency;
	@FindBy(xpath = "(//div[@id=\"demo-simple-select-outlined\"])[3]") private WebElement timeZone;
	@FindBy(xpath = "//button[text()='Next']") private WebElement B_nextbtn;
	
	public TS_04_BusinessDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_BusinessDetails() 
	{
		busName.sendKeys("");
		e_mail.sendKeys("");
		mobileno.sendKeys("");
		//B_nextbtn.click();
	}
}
