package pomClass_NewOnboardRestaurant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS_06_BusinessDetails1 {
	
	@FindBy(xpath = "//textarea[@name='restaurant_description']") private WebElement description;
	@FindBy(xpath = "//input[@name='keywordsText']") private WebElement keyword;
	@FindBy(xpath = "(//button[contains(@class,'add-button')])") private WebElement addKeyword;
	@FindBy(xpath = "//textarea[@name='things_nearby']") private WebElement nearby;
	@FindBy(xpath = "//button[text()='Next']") private WebElement next_Btn;
	
	public TS_06_BusinessDetails1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_BusinessDetails1()
	{
		description.sendKeys("");
		keyword.sendKeys("");
		addKeyword.click();
		nearby.sendKeys("");
		next_Btn.click();
		next_Btn.click();
	}

}
