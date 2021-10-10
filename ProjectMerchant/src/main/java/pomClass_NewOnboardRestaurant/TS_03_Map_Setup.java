package pomClass_NewOnboardRestaurant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS_03_Map_Setup {
	
	@FindBy(xpath = "//button[text()='Yes']") private WebElement yesBtn;
	@FindBy(xpath = "//img[@title='Auto Detect Location']") private WebElement autolocation;
	@FindBy(xpath = "//button[text()='Next']") private WebElement nextBtn;

	public TS_03_Map_Setup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Mapsetup()
	{
		yesBtn.click();
		autolocation.click();
		nextBtn.click();
	}
	
}