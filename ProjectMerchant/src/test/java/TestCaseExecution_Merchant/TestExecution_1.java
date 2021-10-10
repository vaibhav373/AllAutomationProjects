package TestCaseExecution_Merchant;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.OpenBrowser;
import pomClassOfMerchant.BusinessDetails;
import pomClassOfMerchant.LoginPage;

public class TestExecution_1 extends OpenBrowser {
	
	LoginPage loginDashboard;
	BusinessDetails details;
	@BeforeClass
	public void Set_OpenBrowser()
	{
		open_browser();
		loginDashboard = new LoginPage(driver);
		details = new BusinessDetails(driver);
	}
	
	@BeforeMethod
	public void SetloginDashboard()
	{
		loginDashboard.SetUserName();
		loginDashboard.SetPassword();
		loginDashboard.SetloginButton();
		
	}
	
	@Test
	public void Set_BusinessDetails() throws InterruptedException
	{
		details.Set_Subscription();
		details.Set_Details();
		details.Set_ClickDetails();
		details.Set_Updatedetails();
		Thread.sleep(1000);
		details.Set_Business_Details();
		//details.getAllCountries();
	}

}
