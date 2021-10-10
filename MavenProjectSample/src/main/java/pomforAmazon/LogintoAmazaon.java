package pomforAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogintoAmazaon {
		
	@FindBy(xpath="//input[@placeholder='First Name']") private WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement lastName;

	
	public LogintoAmazaon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterFirstName() {
		firstName.sendKeys("Vaibhav");
	}
	
	public void EnterLastName() {
		lastName.sendKeys("More");
		
	}
}
