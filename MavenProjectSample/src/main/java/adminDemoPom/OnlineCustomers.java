package adminDemoPom;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// Print the all table data of online Customers page and verified the page opened after clicked on Online customers(new Page/Window) 
 

public class OnlineCustomers {

	//Declarations
	int rowSize;
	int colSize;
	WebDriver dd;
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers' )]") private WebElement customersTab;
	@FindBy(xpath = "//ul//li//a//p[text() = ' Online customers']") private WebElement onlineCustomerTab ;
	@FindBy(xpath ="//table[@id='onlinecustomers-grid']" ) private List<WebElement> table;
	@FindBy(xpath ="//table[@id='onlinecustomers-grid']//tbody//tr" ) private List<WebElement> rowCount;
	@FindBy(xpath ="//table[@id='onlinecustomers-grid']//tbody//tr[1]//td" ) private List<WebElement> colCount;
	@FindBy(xpath = "//span//a[text()='online customers']") private WebElement onlineCustomerLink;
	
	
	//Initialization
	public OnlineCustomers(WebDriver driver) {
		dd = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Implementation
	
	public void clickOncustomersTab() {
		customersTab.click();
	}
	
	public void clickOnonlineCustomertab() {
		onlineCustomerTab.click();
	}
	
	public void getTableDetails() {
			rowSize = rowCount.size();
			colSize = colCount.size();
	}
	
	public void fetchAllTableData() {
		for(int i = 1 ; i <= rowSize; i++) {
			for(int j = 1 ; j <=colSize; j++) {
				String TableData = dd.findElement(By.xpath("//table[@id='onlinecustomers-grid']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.println("table data= "+TableData);
			}		
		}
	}
	
	public void onlineCustomerLink() throws InterruptedException {
		onlineCustomerLink.click();
		String ParentWindow = dd.getWindowHandle();
		
		Set<String> IDs = dd.getWindowHandles();
		for (String newOpenWIndows : IDs) {
			dd.switchTo().window(newOpenWIndows);
		}
		Thread.sleep(2000);
		String NewpageTitle = dd.getTitle();
		System.out.println(NewpageTitle);
		Assert.assertEquals(NewpageTitle, "Online customers");
		
		System.out.println("Assesrt verfiedd");
		dd.close();
		dd.switchTo().window(ParentWindow);
	}
}
