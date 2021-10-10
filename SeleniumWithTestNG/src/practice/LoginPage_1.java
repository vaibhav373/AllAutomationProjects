package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.RandomString;

public class LoginPage_1 {
	
	
//	public static void m_1( WebDriver driver, int random) throws IOException
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//System.out.println(src);
//		
//		//String random = RandomString.make(3);
//		
//		File dest = new File("C:\\Users\\Vaibhav\\Desktop\\screenshoot\\image"+random+".jpg");
//		FileHandler.copy(src, dest);
//	}
	
	
	
	@FindBy(xpath = "//input[@id='userid']")  private	WebElement un;	
	@FindBy(xpath = "//input[@id='password']")  private    WebElement pwd;
	@FindBy(xpath = "//button[text()='Login ']")  private    WebElement lgn;

	//Initilization
	
	public LoginPage_1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUn(String userID)
	{
		un.sendKeys(userID);
	}
	
	public void enterPwd(String userPwd) {
		
		pwd.sendKeys(userPwd);
	
	}
	
	public void loginBtn() {
		
		lgn.click();
	}
	
	
	
	
	
	

}
