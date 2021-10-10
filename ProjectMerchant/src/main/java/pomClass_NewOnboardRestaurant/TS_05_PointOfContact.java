package pomClass_NewOnboardRestaurant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.tools.javac.util.List;

import utility.UtilityClass;

public class TS_05_PointOfContact extends UtilityClass {
	
	@FindBy(xpath = "//input[@name='firstName']") private WebElement firstName;
	@FindBy(xpath = "//input[@name='lastName']") private WebElement lastName;
	@FindBy(xpath = "//div[@aria-haspopup='listbox']") private WebElement position1;
	@FindBy(xpath = "(//ul[@role=\"listbox\"])//li") private List<WebElement> list;
	@FindBy(xpath = "//input[@name='enquiry_emails']") private WebElement e_mails;
	@FindBy(xpath = "//input[@name='mobile_no']") private WebElement mobilenos;
	@FindBy(xpath = "//button[text()='Next']") private WebElement p_nextBtn;
	
	public TS_05_PointOfContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Set_ThePointOfContact(WebDriver driver)
	{
		String position  = "Delivery";
		int next = 0;
		//Actions obj = new Actions(driver);
		firstName.sendKeys("");
		lastName.sendKeys("");
		//obj.click(position1).perform();
		position1.click();
		
		for(WebElement ele : list)
		{
			String Newposition = ele.getText();
			
			if(Newposition.contains(position))
			{
				ele.click();
				break;
			}
		}
		e_mails.sendKeys("");
		mobilenos.sendKeys("");
		p_nextBtn.click();
	}
	
}
