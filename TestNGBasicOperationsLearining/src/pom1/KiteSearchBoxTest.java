package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteSearchBoxTest {
	
	@FindBy(xpath = "//input[@id='search-input']") private WebElement input;
	@FindBy(xpath = "//li[contains(@class,'search-result-item selected ')]")  private WebElement movearrow;
	@FindBy(xpath = "(//button[@class='button-blue'])[1]") private WebElement buy;
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement qty;
	@FindBy(xpath = "//button[@class='submit']") private WebElement buyQty;
	
	//WebDriver driver;
	public KiteSearchBoxTest (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void kiteSearchInput() {
		input.sendKeys("INFY");
	}
	
	Actions actionobj = new Actions(KiteBuyTest.driver);
	
	public void MoveOnFirstElement()
	{
		actionobj.moveToElement(movearrow).perform();
	}
	
	public void ClickBuyBtn()
	{
		actionobj.moveToElement(buy).click().perform();;
	}
	
	public void enterQty()
	{
		qty.sendKeys("10");
	}
	
	public void ClickOnBuyQty() 
	{
		buyQty.click();
	}
}
