package TestClassesAdminDemo;
// Test and verify and find the pending orders from sales

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import adminDemoPom.Login;
import adminDemoPom.Logout;
import adminDemoPom.OnlineCustomers;
import adminDemoPom.VerfiyCompleteOrder;
import baseClass.OpenBrowsers;


public class AdminDemoTestCase1 extends OpenBrowsers{
	
	Login login;
	Logout logout;
	VerfiyCompleteOrder verfiyCompleteOrder;
	OnlineCustomers onlineCustomers;
	@BeforeClass
	 void OpenBroser() throws InterruptedException {
		String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		open_Browser(url);
		login = new Login(driver); 
		logout = new Logout(driver);
		verfiyCompleteOrder = new VerfiyCompleteOrder(driver);
		onlineCustomers = new OnlineCustomers(driver);  
	}
	
	@BeforeMethod
	void loginToAdminDemo() throws InterruptedException {
		login.setEmailId();
		login.setPassword();
		login.clickOnLoginButton();
	}
	
	@Test
	void verifyPendingOrders() throws InterruptedException {
		Thread.sleep(2000);
		verfiyCompleteOrder.clickOnSalesTab();		
		verfiyCompleteOrder.clickOnOrdersTab();
		verfiyCompleteOrder.getTableRowsAndCols();
		verfiyCompleteOrder.verifyAndGetAllPendingOrders();
	}
	
	@Test
	void printTabledata() throws InterruptedException {
		onlineCustomers.clickOncustomersTab();
		onlineCustomers.clickOnonlineCustomertab();
		onlineCustomers.getTableDetails();
		onlineCustomers.fetchAllTableData();
		onlineCustomers.onlineCustomerLink();
	}
	
	
	@AfterMethod
	 void logout() throws InterruptedException {
		Thread.sleep(3000);
		logout.clickonLogoutBtn();
	}
	
	@AfterClass
	void application() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
	
}
