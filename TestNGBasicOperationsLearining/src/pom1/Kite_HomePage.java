package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage {
	
	@FindBy(xpath = "//div[@class='avatar']/span") private WebElement name;
	
	public Kite_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userName()
	{
		String user = name.getText();
		String exptuser = "KV";
		
		if(exptuser.endsWith(user))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
