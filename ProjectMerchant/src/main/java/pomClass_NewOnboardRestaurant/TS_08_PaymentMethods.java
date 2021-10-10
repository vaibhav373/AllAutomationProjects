package pomClass_NewOnboardRestaurant;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS_08_PaymentMethods {
	
	@FindBy(xpath = "//div[@class='cuisine-main-padding-border']//span") private List<WebElement> paymentList;
	@FindBy(xpath = "") private WebElement next;
	
	public TS_08_PaymentMethods(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_paymentMethod()
	{
		String pay[] = {"", ""};  //available payment service
		
		for(String pay1 : pay)
		{
			for(WebElement payment: paymentList)  // payment list
			{
				System.out.println(payment.getText());  //print all payment list
				if(payment.getText().contains(pay1))
				{
					payment.click();  //click on payment method
				}
			}
		}
		
		next.click();
	}

}
