package pomClassOfFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_3_SearchItem {
	
	@FindBy(xpath = "//input[@type='text']") private WebElement searchBar;
	@FindBy(xpath = "//button[@type='submit']") private WebElement searchBtn;
	//@FindBy(xpath ="//ul[contains(@class,'col-12-12 _1MRYA1')]") private WebElement searchlist;
	
	public TC_3_SearchItem(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setSearchProduct(String product)
	{
		searchBar.sendKeys(product);
		searchBtn.click();
	}
}
