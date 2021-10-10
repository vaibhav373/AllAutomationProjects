package kiteSiteProj_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {

	//intialization 
	
	
	@FindBy(xpath="//span[text()='KV']") private WebElement profilebtn;
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logoutbtn;

	//Declartion 
	
	public Logoutpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProfileBtn() {
		profilebtn.click();
	}
	
	public void clickOnLogoutBtn() {
		logoutbtn.click();
	}
}
	
	
