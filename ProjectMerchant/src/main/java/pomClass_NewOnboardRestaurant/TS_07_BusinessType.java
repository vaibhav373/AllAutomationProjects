package pomClass_NewOnboardRestaurant;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS_07_BusinessType {
	
	@FindBy(xpath = "(//div[@class='cuisine-main-padding column-2'])//span") private List<WebElement> businessList;  // list of business type
	@FindBy(xpath = "//input[@name='cost_for_two']") private WebElement cost;  // enter cost 
	@FindBy(xpath = "//div[@aria-haspopup='listbox']") private WebElement revenue;  //click on Revenue drop down
	@FindBy(xpath = "//ul[@role='listbox']//li") private List<WebElement> revenueList; // list of revenue
	@FindBy(xpath = "//button[text()='Next']") private WebElement next;
	
	public TS_07_BusinessType(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Set_BusinessType(String revenuecost)
	{
		String busType[] = {" ", " ",}; //business types
		
		for (String bus_Type : busType) 
		{
			
			for (WebElement businessType : businessList) 
			{
			   //System.out.println(businessType.getSize());
				
				System.out.println(businessType.getText()); // print all list of business type
					
				if (businessType.getText().equals(bus_Type)) 
				{
						businessType.click();  //click on business type
						break;
				}
			}
	     }
		
		cost.sendKeys("");
		revenue.click();
		
		for(WebElement reList :revenueList )   // select revenue cost
		{
			String rList = reList.getText();
			
			if(rList.contains(revenuecost))
			{
				reList.click();
				break;
			}
		}
		
		next.click(); // click on next button

	}

}
