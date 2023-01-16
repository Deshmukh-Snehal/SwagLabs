package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class CartPageTest extends TestBase{
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		login.verifyLoginToApp();
		invent.verifyCartLink();
		cart = new CartPage();
	}
	@Test(enabled = false)
	public void verifyCartLabelTest()
	{
		String expResult = "YOUR CART";
		String actResult = cart.verifyCartLabel();
		Assert.assertEquals(expResult, actResult);
	}
	@Test(enabled = false)
	public void verifyCartQualityLabelTest()
	{
		String expResult = "QTY";
		String actResult = cart.verifyCartQualityLabel();
		Assert.assertEquals(expResult, actResult);
	}
	@Test(enabled = false)
	public void verifyCartDescLabelTest()
	{
		String expResult = "DESCRIPTION";
		String actResult = cart.verifyCartDescLabel();
		Assert.assertEquals(expResult, actResult);
	}
	@Test(enabled = false)
	public void verifyContinueShoppingBtnTest() throws Exception
	{
		String expResult = ReadData.readPropertyFile("inventoryurl");
		String actResult = cart.verifyContinueShoppingBtn();
		Assert.assertEquals(expResult, actResult);
	}
	@Test
	public void verifyCheckoutBtnTest() throws Exception
	{
		String expResult = ReadData.readPropertyFile("checkOutURL");
		String actResult = cart.verifyCheckoutBtn();
		Assert.assertEquals(expResult, actResult);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
