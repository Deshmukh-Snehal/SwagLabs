package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class InventoryPageTest extends TestBase{
	LoginPage login;
	InventoryPage invent;
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		login = new	LoginPage();
		invent = new InventoryPage();
		login.verifyLoginToApp();
	}
	@Test(enabled = false)
	public void verifyAppLogoTest()
	{
		boolean result = invent.verifyAppLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyPageLabelTest()
	{
		boolean result = invent.verifyPageLabel();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void addProductTest() throws Exception
	{
		String result = invent.addProduct();
		Assert.assertEquals(result, "2");
	}
	@Test(enabled = false)
	public void verifyTwitterLinkTest()
	{
		boolean result = invent.verifyTwitterLink();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyFacebookLinkTest()
	{
		boolean result = invent.verifyFacebookLink();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyLinkedInLinkTest()
	{
		boolean result = invent.verifyLinkedInLink();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyFooterLogoTest()
	{
		boolean result = invent.verifyFooterLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyCartLink() throws Exception
	{
		String	expResult = ReadData.readPropertyFile("cartUrl");
		String	actResult = invent.verifyCartLink();
		Assert.assertEquals(expResult,actResult);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
