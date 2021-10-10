package TestExecution_NewOnboardRestaurant;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.OpenBrowser;
import pomClass_NewOnboardRestaurant.TS_01_SignUp_Process;
import utility.UtilityClass;

public class TS_01_TestSignUp extends OpenBrowser {
	
	TS_01_SignUp_Process Signup;
	
	@BeforeClass
	public void openBrowser()
	{
		open_browser();
		Signup = new TS_01_SignUp_Process(driver);
		
	}
	
	@Test
	public void Set_SignUpCredentials() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Signup.SetSignUp();
		Signup.SetphoneNo(UtilityClass.Test_Data(1, 0));
		Signup.SetEmailId(UtilityClass.Test_Data(1, 1));
		Signup.SetEnterPassword(UtilityClass.Test_Data(1, 2));
		Signup.SetCofirmPassword(UtilityClass.Test_Data(1, 3));
		//Signup.ClickOnBtn();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}

}
