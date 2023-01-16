package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase{
	@FindBy(xpath = "//span[@class='title']") private WebElement cartLabel;
//	@FindBy(xpath = "") private WebElement ;
	@FindBy(xpath = "//div[@class='cart_quantity_label']") private WebElement cartQualityLabel;
	@FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement cartDescLabel;
	@FindBy(xpath = "//button[@id='continue-shopping']") private WebElement continueShoppingBtn;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement checkoutBtn;
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCartLabel()
	{
		return cartLabel.getText();
	}
	public String verifyCartQualityLabel()
	{
		return cartQualityLabel.getText();
	}
	public String verifyCartDescLabel()
	{
		return cartDescLabel.getText();
	}
	public String verifyContinueShoppingBtn()
	{
		continueShoppingBtn.click();
		return driver.getCurrentUrl();
	}
	public String verifyCheckoutBtn() throws Exception
	{
		Thread.sleep(2000);
		checkoutBtn.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
}
