package automationProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kiteTestProperties extends OpenBrowser{
	
	LoginPage_1 login_1;
	LoginPage2 login_2;
	VerifyProfileName profile;
	Sheet sheet;
	KiteLogoutPage logout_1;
	int tcid;
	
	
	@BeforeClass
	public void Open_Browser_1() throws InterruptedException
	{
		open_Browser();
	
		login_1 = new LoginPage_1(driver);
		login_2 = new LoginPage2(driver);
		profile = new VerifyProfileName(driver);
		logout_1 = new KiteLogoutPage(driver);
		
	}
	
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException
	{
		login_1.setUserName(Utility.getPropertyfiledata("userName"));
		login_1.setPassword(Utility.getPropertyfiledata("password"));
		login_1.clickOnLoginBtn();
		//Utility.captureScreenshot(driver, 1);
		login_2.setPin(Utility.getPropertyfiledata("pin"));
		login_2.clickOnContinueBtn();
		Utility.captureScreenshot(driver, 1);
	}
	
	@Test
	public void verifyProfile_Name() throws EncryptedDocumentException, IOException
	{
		tcid = 010;
		String actPn = profile.verifyProfileName();
		String expPn = Utility.getPropertyfiledata("profileName");//KV
		
		Assert.assertEquals(actPn, expPn,"act and exp are diff");
	}
	
	@AfterMethod
	public void logoutPage(ITestResult result) throws IOException {
		
		if(result.getStatus() == ITestResult.FAILURE)
		{
			Utility.captureScreenshot(driver, tcid);
		}
		
		logout_1.clickOnProfilebtn();
		logout_1.clickonLogoutbtn();
		
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		
		driver.close();
	}
	

}
