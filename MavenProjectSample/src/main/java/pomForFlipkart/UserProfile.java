package pomForFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.OpenBrowsers;

public class UserProfile extends OpenBrowsers {
	@FindBy(xpath = "//div[text()='Vaibhav']") private WebElement UserName;
	@FindBy(xpath = "(//div[@class='ZEl_b_ _1J9ow0 _2ogGYG _23xUYh _3pAV4E']//ul//li//a)[1]") private WebElement myProfile;
	@FindBy(xpath= "//div[text()='Vaibhav More']") private WebElement profileName;
	
	
 	public UserProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
 	
	public void VerifyUserProfile() throws InterruptedException {
		Actions	actionObj = new Actions(driver);
//		UserName.click();
//		actionObj.contextClick(UserName).perform();
		actionObj.moveToElement(UserName).perform();
		Thread.sleep(3000);
		actionObj.moveToElement(myProfile).click().build().perform();
		 String actualNameProfileName = profileName.getText();	
		 String xpectedNameProfileName = "Vaibhav More";
		 Assert.assertEquals(actualNameProfileName, xpectedNameProfileName);
	}
}
