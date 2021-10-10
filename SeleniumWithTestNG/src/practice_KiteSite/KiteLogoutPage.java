package practice_KiteSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogoutPage {
	
	
	@FindBy(xpath="//span[text()='KV']") private WebElement profilebtn;
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logoutbtn;
	
	public KiteLogoutPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}

	public void clickOnProfilebtn() {
		profilebtn.click();
	}
	

	public void clickonLogoutbtn() {
		logoutbtn.click();
	}

}
