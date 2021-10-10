package popWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAcc {

	@FindBy(xpath = "//a[text() = 'Create New Account']")
	private WebElement createAcc;
	@FindBy(xpath = "//input[@name= 'firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@name= 'lastname']")
	private WebElement surName;
	@FindBy(xpath = "//input[@name= 'reg_email__']")
	private WebElement mobileNo;
	
	
	@FindBy(xpath = "//select[@id= 'day']")private WebElement day;
	

	@FindBy(xpath = "//select[@id= 'month']")
	private WebElement month;
	

	@FindBy(xpath = "//select[@id= 'year']")
	private WebElement year;
	
	@FindBy(xpath = "//input[@id= 'u_m_2_Gp']") private WebElement genderFemale;
	
	@FindBy(xpath = "//input[@id= 'u_m_4_+f']") private WebElement custom;
	@FindBy(xpath = "//select[@id= 'js_3']")private WebElement pronoun;

	
	@FindBy(xpath = "//button[text() = 'Sign Up']") private WebElement signup;
	
	FacebookCreateAcc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnCreateAccBtn() {
		createAcc.click();
	}

	public void setFirstName(String Firstname) {
		firstName.sendKeys(Firstname);
	}

	public void setSurName(String surname) {
		surName.sendKeys(surname);
	}

	public void setMobileNo(String mobileno) {
		mobileNo.sendKeys(mobileno);
	}

	public void setDay(String daya) {
		Select selectday = new Select(day);
		selectday.selectByVisibleText(daya);
	}

	public void setMonth(String months) {
		Select selectmonth = new Select(month);
		selectmonth.selectByVisibleText(months);
	}

		public void setYear(String years) {
			Select selectyear = new Select(year);
			selectyear.selectByVisibleText(years);
		}
	
	public void setGender() {
		genderFemale.click();
	}
	public void setCustom() {
		custom.click();
		Select setpronoun = new Select(pronoun);
		setpronoun.selectByIndex(2);	
	}
	
	public void signup() {
		signup.click();
	}

	
	
}
