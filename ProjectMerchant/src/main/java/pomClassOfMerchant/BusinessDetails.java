package pomClassOfMerchant;

import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import baseclass.OpenBrowser;

public class BusinessDetails {

	@FindBy(xpath = "//button[text()='Continue Subscription']") private WebElement Subscription;
	@FindBy(xpath = "//i[@class='fa fa-bars']") private WebElement b_details;
	@FindBy(xpath = "//div[@id='mySidenav']//div//h3[text()='Business Details']") private WebElement clickDetails;
	@FindBy(xpath = "//div[@id='mySidenav']//div//h4[text()='Update Business Details']") private WebElement updatedetails;
	@FindBy(xpath = "(//input[@type='text'])[1]") private WebElement Name;
	//@FindBy(xpath = "(//input[@id='outlined-error-helper-text'])[1]") private WebElement Name;
	@FindBy(xpath = "(//textarea[@id='outlined-error-helper-text'])") private WebElement address;
	@FindBy(xpath = "(//input[@id='outlined-error-helper-text'])[2]") private WebElement area;
	@FindBy(xpath = "(//input[@id='outlined-error-helper-text'])[3]") private WebElement city;
	@FindBy(xpath = "(//input[@id='outlined-error-helper-text'])[4]") private WebElement code;
	@FindBy(xpath = "//input[@name='enquiry_email']") private WebElement email;
	@FindBy(xpath = "//input[@name='mobile_no']") private WebElement mobile;
	@FindBy(xpath = "(//div[@id=\"demo-simple-select-outlined\"])[1]") private WebElement country;
	@FindBy(xpath = "//ul[@role=\"listbox\"]") private List <WebElement> CountryNameList;
	
	
	
	
	//@FindBy(xpath = "")

	
	public BusinessDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_Subscription() throws InterruptedException
	{
		Thread.sleep(2000);
		Subscription.click();
	}
	
	public void Set_Details() throws InterruptedException
	{
		b_details.click();
		Thread.sleep(2000);
	}
	
	public void Set_ClickDetails() throws InterruptedException
	{	Thread.sleep(2000);
		clickDetails.click();
	}
	
	public void Set_Updatedetails()
	{
		updatedetails.click();
	}
	
	public void getAllCountries() {
		

		Select s = new Select(country);
		java.util.List<WebElement> abc = s.getOptions();
		System.out.println(abc);
		CountryNameList.size();
		
	}
	
	public CharSequence[] clearFiledsData(WebElement element) {
	
	 new Actions(OpenBrowser.driver).click(element).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).sendKeys("").perform();
	 return null;
	}
	
	public void Set_Business_Details() throws InterruptedException
	{
		Thread.sleep(2000);
		//Name.click();
		Name.sendKeys(clearFiledsData(Name));
		Thread.sleep(1000);
		Name.sendKeys("Shivam Restaurant1");
//		Thread.sleep(1000);
		address.sendKeys(clearFiledsData(address));
		address.sendKeys("Kohinoor Grandeur, Shop no.45, Mukai Chowk, Ravet, Pimpri-Chinchwad, Maharashtra 412101, India1");
//		Thread.sleep(1000);
//		area.
//		area.sendKeys("Ravet");
//		Thread.sleep(1000);
//		city.clear();
//		city.sendKeys("pune");
//		code.clear();
//		code.sendKeys("412101");
//		email.clear();
//		email.sendKeys("shivam@gmail.com");
//		mobile.clear();
//		mobile.sendKeys("8669664700");
	}
}
