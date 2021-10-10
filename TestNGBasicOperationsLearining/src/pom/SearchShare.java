package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchShare {

		@FindBy(xpath="//input[@id='search-input']") private WebElement searchShare;
		@FindBy(xpath="//div[@class='info']") private WebElement moveCursorOnFirstElement;
		@FindBy(xpath = "(//button[@class='button-blue'])[1]") private WebElement buyshare;
		
		
		
		public SearchShare(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		Actions actionsobj = new Actions(KiteLoginTest.driver);
		
		public void clickOnSearchShare(){
			searchShare.sendKeys("SBIN");
		}
		
		public void moverCursorOnFirstSearch() {
			actionsobj.moveToElement(moveCursorOnFirstElement).perform();	
		}
		public void clickOnBuyshareBtn(){
			
			buyshare.click();
		}
}
//(//button[@class='button-blue'])[1]