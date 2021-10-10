package TestExecution_TakeawayOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.OpenBrowser;
import pomClass_MerchantDashboard_ordering.LoginTO_MerchantDashboard;
import pomClass_MerchantDashboard_ordering.TakeAway_Order;

public class Execute_TakeawayOrder extends OpenBrowser{
	
	LoginTO_MerchantDashboard loginRestaurant;
	TakeAway_Order takeAway;
	
	@BeforeClass
	public void openMerchantDashboard()
	{
		open_browser();
		loginRestaurant = new LoginTO_MerchantDashboard(driver);
		takeAway = new TakeAway_Order(driver);
		
	}
	
	@BeforeMethod
	public void SetloginTo_MerchantDashboard() throws InterruptedException
	{
		loginRestaurant.SetLogin_Credential();
		Thread.sleep(2000);
	}	
	
	@Test 
	public void Create_TakeAway_Order() throws InterruptedException
	{
		takeAway.CreateTakeAway_Order();
	}
	
	@Test(priority = 1)
	public void CompletedTo_TakeAway_Order() throws InterruptedException 
	{
		takeAway.CompleteTakeaway_order();
	}
	
	@AfterMethod
	public void logout_MerchantDashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		loginRestaurant.logout_Merchant();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	

}
