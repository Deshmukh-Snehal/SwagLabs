package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ReadData;

public class LoginPageTest extends TestBase{
	LoginPage login;
	@BeforeTest
	public void setUp() throws Exception
	{
		initialization();
		login = new	LoginPage();
	}
	@Test(enabled = false)
	public void verifyLoginLogoTest()
	{
		boolean	result	= login.verifyLoginLogo();
		Assert.assertEquals(result,	true);
	}
	@Test(enabled = false)
	public void verifyBotLogo()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
//	@Test
	public void verifyTitleTest()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
	}
	@Test(enabled = false)
	public void verifyURLTest() throws Exception
	{
		String expURL = ReadData.readPropertyFile("url");
		String actURL = login.verifyURL();
		Assert.assertEquals(expURL, actURL);
	}
	@Test
	public void verifyLoginToAppTest() throws Exception
	{
		String	expResult = ReadData.readPropertyFile("inventoryurl");
		String	actResult = login.verifyLoginToApp();
		Assert.assertEquals(expResult,actResult);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}