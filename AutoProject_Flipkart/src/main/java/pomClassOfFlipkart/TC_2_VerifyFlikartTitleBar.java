package pomClassOfFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_2_VerifyFlikartTitleBar {
	
	@FindBy(xpath = "//img[@title='Flipkart']") private WebElement title;
	
	public TC_2_VerifyFlikartTitleBar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle()
	{
		String actTileName = title.getText();
		return actTileName;
	}

}
