package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class CheckoutPageTest extends TestBase{
	
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutPage check;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		login.verifyLoginToApp();
		invent.verifyCartLink();
		cart = new CartPage();
		cart.verifyCheckoutBtn();
		check = new CheckoutPage();
	}
	@Test(enabled = false)
	public void verifyTitleTest()
	{
		String expTitle = "CHECKOUT: YOUR INFORMATION";
		String actTitle = check.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
	}
	@Test
	public void verifyCheckoutDataTest() throws Exception
	{
		String expResult = ReadData.readPropertyFile("checkOutStepTwoURL");
		String actResult = check.verifyCheckoutData();
		Assert.assertEquals(expResult, actResult);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}