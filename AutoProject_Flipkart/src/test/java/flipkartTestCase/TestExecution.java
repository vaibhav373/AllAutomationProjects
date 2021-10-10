package flipkartTestCase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import baseClass.Browser;
import pomClassOfFlipkart.TC_1_LoginCredentials;
import pomClassOfFlipkart.TC_2_VerifyFlikartTitleBar;
import pomClassOfFlipkart.TC_3_SearchItem;
import utility_Class.utility_flipkart;

public class TestExecution extends Browser{
	
	TC_1_LoginCredentials login;
	TC_2_VerifyFlikartTitleBar titleName;
	TC_3_SearchItem productName;
	
	@BeforeClass
	public void Browser_1() throws IOException
	{
		open_Browser(utility_flipkart.getPropertyfiledata("url_1"));
		
		login = new TC_1_LoginCredentials(driver);
		titleName = new TC_2_VerifyFlikartTitleBar(driver);
		productName = new TC_3_SearchItem(driver);
		
	}
	
	@BeforeMethod
	public void setLoginCreadentialsMethod() throws IOException
	{
		login.SetloginCredentials(utility_flipkart.getPropertyfiledata("user_Id"),utility_flipkart.getPropertyfiledata("password"));
		//login.pwdmethod(utility_flipkart.getPropertyfiledata("password"));
		
	}

}
