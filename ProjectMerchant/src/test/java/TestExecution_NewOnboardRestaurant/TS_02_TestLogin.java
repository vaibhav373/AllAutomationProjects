package TestExecution_NewOnboardRestaurant;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.OpenBrowser;
import pomClass_NewOnboardRestaurant.TS_02_Login_Process;
import utility.UtilityClass;

public class TS_02_TestLogin extends OpenBrowser {
	
	TS_02_Login_Process login;
	
	@BeforeClass
	public void penBrowser()
	{
		open_browser();
		login = new TS_02_Login_Process(driver);
	}
	
	@Test
	public void Set_LoginCredentials() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.SetUserId(UtilityClass.Test_Data1(1,1));
		login.SetPassword(UtilityClass.Test_Data1(1, 2));
		Thread.sleep(10000);
		login.logout_Merchant();
	}
	
	@AfterClass
	public void CloseBrowser1()
	{
		driver.close();
	}

}
