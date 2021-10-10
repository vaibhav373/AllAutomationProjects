package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// step:1 Declaration

	@FindBy(xpath = "//div[@class='avatar']/span")
	private WebElement user;

	// step2: Initilization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyUser() {
		String actuser = user.getText();
		String exptuser = "KV";

		if (exptuser.equals(actuser)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}
}
