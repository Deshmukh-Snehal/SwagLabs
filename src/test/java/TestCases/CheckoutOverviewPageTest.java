package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutOverviewPage;
import Pages.CheckoutPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutOverviewPageTest extends TestBase{
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutPage check;
	CheckoutOverviewPage checkoverview;
	
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
		check.verifyCheckoutData();
		checkoverview = new CheckoutOverviewPage();
	}
	@Test
	public void verifyCheckoutLabelTest()
	{
		String expLabel = "CHECKOUT: OVERVIEW";
		String actLabel = checkoverview.verifyCheckoutLabel();
		Assert.assertEquals(expLabel, actLabel);
	}
//	@Test
//	public void 
//	{
//		
//	}
	@Test
	public void verifyPaymentInfoLabelTest()
	{
		String expLabel = "SauceCard #31337";
		String actLabel = checkoverview.verifyPaymentInfoLabel();
		Assert.assertEquals(expLabel, actLabel);
	}
	@Test
	public void verifyShippingInfoLabelTest()
	{
		String expLabel = "FREE PONY EXPRESS DELIVERY!";
		String actLabel = checkoverview.verifyShippingInfoLabel();
		Assert.assertEquals(expLabel, actLabel);
	}
	@Test
	public void verifyTotalAmmountLabelTest()
	{
		String expLabel = "Total: $140.34";
		String actLabel = checkoverview.verifyTotalAmmountLabel();
		Assert.assertEquals(expLabel, actLabel);
	}
//	@Test
//	public void verifyFinishBtnTest()
//	{
//		
//	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
