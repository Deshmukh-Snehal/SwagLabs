package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import Base.TestBase;
import Utility.UtilityMethod;

public class InventoryPage extends TestBase{
	//Object Repository
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement appLogo;
	@FindBy(xpath = "//span[text()='Products']") private WebElement pageLabel;
	@FindBy(xpath = "//div[@class='peek']") private WebElement peekLogo;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement bagPack;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight;
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") private WebElement fleeceJacket;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortProducts;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement cartProductsCount;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']") private WebElement removebBackpPack;
	@FindBy(xpath ="//a[text()='Twitter']") private WebElement twitterLink;
	@FindBy(xpath ="//a[text()='Facebook']") private WebElement facebookLink;
	@FindBy(xpath ="//a[text()='LinkedIn']") private WebElement linkedInLink;
	@FindBy(xpath ="//img[@class='footer_robot']") private WebElement footerLogo;
	@FindBy(xpath ="//a[@class='shopping_cart_link']") private WebElement cartLink;
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyAppLogo()
	{
		return appLogo.isDisplayed();
	}
	public boolean verifyPageLabel()
	{
		return pageLabel.isDisplayed();
	}
	public boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	public String addProduct() throws Exception
	{
		UtilityMethod.selectClass(sortProducts, "Name (Z to A)");
//		Select s = new Select(sortProducts);
//		s.selectByVisibleText("Name (Z to A)");
		Thread.sleep(2000);
		bagPack.click();
		bikeLight.click();
		fleeceJacket.click();
		removebBackpPack.click();
		Thread.sleep(5000);
		cartProductsCount.click();
		return cartProductsCount.getText();
	}
	public boolean verifyTwitterLink()
	{
		return twitterLink.isDisplayed();		
	}
	public boolean verifyFacebookLink()
	{
		return facebookLink.isDisplayed();		
	}
	public boolean verifyLinkedInLink()
	{
		return linkedInLink.isDisplayed();		
	}
	public boolean verifyFooterLogo()
	{
		return footerLogo.isDisplayed();		
	}
	public String verifyCartLink() throws Exception
	{
		cartLink.click();
//		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
}
