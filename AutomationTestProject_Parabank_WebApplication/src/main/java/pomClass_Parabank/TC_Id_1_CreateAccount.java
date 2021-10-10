package pomClass_Parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_Id_1_CreateAccount {
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement reg;
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	private WebElement firstName;
	
	@FindBy(id="customer.lastName")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='customer.address.street']")
	private WebElement addr;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='customer.address.state']")
	private WebElement state;
	
	@FindBy(xpath="//input[id='customer.address.zipCode']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[id='customer.phoneNumber']")
	private WebElement phoneNo;
	
	@FindBy(xpath="//input[id='customer.ssn']")
	private WebElement ssn;
	
	@FindBy(xpath="//input[@id='customer.username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='customer.password']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@id='repeatedPassword']")
	private WebElement confirm;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

}
