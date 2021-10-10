package practice_KiteSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyProfileName {
	
	@FindBy(xpath = "//div[@class='avatar']/span")  private WebElement PN;
	
	public VerifyProfileName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyPN()
	{
		String actPN = PN.getText();
		
		return actPN;
	}

}
