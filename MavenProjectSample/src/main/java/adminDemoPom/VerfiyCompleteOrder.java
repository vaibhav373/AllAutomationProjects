package adminDemoPom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import utility.ScrollUpPage;
import utility.WaitHelper;

public class VerfiyCompleteOrder {
	
	
	WebDriver dd;
	//Declaration 
	int rowsize;
	int colsize;
	WaitHelper wait;
	ScrollUpPage scroll;
	
	@FindBy (xpath = "//a[@href='#']//p[contains(text(),'Sales')]") private WebElement salesTab;
	@FindBy(xpath = "//ul/li//p[text()=' Orders']") private WebElement ordersTab;
	@FindBy(xpath = "//table[@id='orders-grid']") private WebElement table;
	@FindBy(xpath = "//table[@id='orders-grid']//tbody//tr") private List<WebElement> tablerows;
	@FindBy(xpath = "//table[@id='orders-grid']//tbody//tr//td") private List<WebElement> tablecols;
	//Initialization
	public VerfiyCompleteOrder(WebDriver driver) {
		dd = driver;
		PageFactory.initElements(dd, this);
		wait = new WaitHelper(dd);
		scroll = new ScrollUpPage(dd);
		
	}
	
	//implementation
	
	public void clickOnSalesTab() throws InterruptedException {
		
		Reporter.log("inside the sales tab method");
		Thread.sleep(2000);		
		salesTab.click();
	}
	
	public void clickOnOrdersTab() throws InterruptedException {
		Thread.sleep(2000);		
		ordersTab.click();
		String pagetitle =  dd.getTitle();
		Assert.assertEquals(pagetitle, "Orders / nopCommerce administration");
	}
	
	public void getTableRowsAndCols() {
	   rowsize = tablerows.size();
	   colsize = tablecols.size();
	}
	
	public void verifyAndGetAllPendingOrders() {
		
		wait.waitForElement(table, 10);
		scroll.ScrollupPage(table);
		int pendingStatusCount = 0;
		
		for(int i = 1; i<rowsize; i++) {
			 String status = dd.findElement(By.xpath("//table[@id='orders-grid']//tbody//tr["+ i +"]//td[3]")).getText();
			 if(status.equals("Pending")) {
				pendingStatusCount++;
			 }
		}
		System.out.println("Count of pending status  = " +pendingStatusCount);
	}
	
}
