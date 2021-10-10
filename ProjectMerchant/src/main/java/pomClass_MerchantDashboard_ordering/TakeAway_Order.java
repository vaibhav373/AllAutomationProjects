package pomClass_MerchantDashboard_ordering;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeAway_Order {
	
	
	//@FindBy(xpath = "//li[@class='selected']") private WebElement clickOnOrder;
	@FindBy(xpath = "(//ul[@class='navigation-order-list vendorMenu']//li)[4]") private WebElement clickOnOrder;
	
	@FindBy(xpath = "//button[text()='+ Create Order']") private WebElement clickOnCreateOrder;
	@FindBy(xpath = "//input[@id='mobile_number']") private WebElement enterMobileNo;
	@FindBy(xpath = "//input[@id='first_name']") private WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']") private WebElement lastName;
	@FindBy(xpath = "//div[text()='Takeaway']") private WebElement takeawayOrder;
	@FindBy(xpath = "//button[text()='Now']") private WebElement nowOrder;
	@FindBy(xpath = "//button[text()='Next']") private WebElement nextButton;
	@FindBy(xpath = "(//button[@type=\"button\"])[5]") private WebElement addOneItem;
	@FindBy(xpath = "//button[text()='Continue']") private WebElement addItem;
	@FindBy(xpath = "//button[text()='Proceed']") private WebElement proceedButton;
	@FindBy(xpath = "//input[@value=\"Cash\"]") private WebElement cashButton;
	@FindBy(xpath = "//button[text()='Proceed']") private WebElement proceedButton1;
	@FindBy(xpath = "//button[text()='Done']") private WebElement doneButton;
	@FindBy(xpath = "//p[text()='Pending']") private WebElement pendingTab;
	@FindBy(xpath = "//button[text()='Accept']") private WebElement acceptButton;
	@FindBy(xpath = "//p[text()='Take Away']") private WebElement takeAwayTab;
	@FindBy(xpath = "//button[text()='Getting Prep']") private WebElement prepButton;
	@FindBy(xpath = "//button[text()='Packing']") private WebElement packingButton;
	@FindBy(xpath = "//button[text()=' Take Away']") private WebElement readyForTakeaway;
	@FindBy(xpath = "//button[text()='Delivered']") private WebElement deliveredButton;
	@FindBy(xpath = "//button[text()='Complete']") private WebElement completeButton;
	 
	public TakeAway_Order(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void CreateTakeAway_Order() throws InterruptedException 
	{
		clickOnOrder.click();
		Thread.sleep(2000);
		clickOnCreateOrder.click();
		enterMobileNo.sendKeys("9175338049");
		firstName.sendKeys("Hrishikesh");
		lastName.sendKeys("Malge");
		takeawayOrder.click();
		nowOrder.click();
		nextButton.click();
		Thread.sleep(5000);
		addOneItem.click();
		Thread.sleep(2000);
		addItem.click();
		Thread.sleep(1000);
		proceedButton.click();
		Thread.sleep(2000);
		cashButton.click();
		proceedButton1.click();
		doneButton.click();
	}
	
	public void CompleteTakeaway_order() throws InterruptedException 
	{
		clickOnOrder.click();
		Thread.sleep(2000);
		pendingTab.click();
		Thread.sleep(2000);
		acceptButton.click();
		Thread.sleep(2000);
		takeAwayTab.click();
		Thread.sleep(2000);
		prepButton.click();
		Thread.sleep(2000);
		packingButton.click();
		Thread.sleep(2000);
		readyForTakeaway.click();
		Thread.sleep(2000);
		deliveredButton.click();
		completeButton.click();
	}
}
	
//	public void CreateTakeAway_Order() throws InterruptedException
//	{
//		Thread.sleep(8000);
//		clickOnOrder.click();
//		Thread.sleep(5000);
//		clickOnCreateOrder.click();
//		Thread.sleep(5000);
//		enterMobileNo.sendKeys("9175338049");
//		Thread.sleep(5000);
//		firstName.sendKeys("Hrishikesh");
//		Thread.sleep(5000);
//		lastName.sendKeys("Malge");
//		Thread.sleep(5000);
//		takeawayOrder.click();
//		Thread.sleep(5000);
//		nowOrder.click();
//		Thread.sleep(5000);
//		nextButton.click();
//		Thread.sleep(10000);
//		Thread.sleep(2000);
//		addOneItem.click();
//		Thread.sleep(5000);
//		addItem.click();
//		Thread.sleep(5000);
//		proceedButton.click();
//		Thread.sleep(8000);
//		cashButton.click();
//		proceedButton1.click();
//		Thread.sleep(8000);
//		doneButton.click();
//	}
//	
//	public void CompleteTakeaway_order() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		clickOnOrder.click();
//		Thread.sleep(8000);
//		pendingTab.click();
//		Thread.sleep(8000);
//		acceptButton.click();
//		Thread.sleep(8000);
//		takeAwayTab.click();
//		Thread.sleep(8000);
//		prepButton.click();
//		Thread.sleep(8000);
//		packingButton.click();
//		Thread.sleep(10000);
//		readyForTakeaway.click();
//		Thread.sleep(12000);
//		deliveredButton.click();
//		Thread.sleep(10000);
//		completeButton.click();
//		Thread.sleep(10000);
//	}
//}
