package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class CheckoutPage extends TestBase{
	@FindBy(xpath = "//span[@class='title']") private WebElement title;
	@FindBy(xpath = "//input[@id='first-name']") private WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement zipCode;
	@FindBy(xpath = "//input[@id='continue']") private WebElement continueBtn;
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return title.getText();
	}
	public String verifyCheckoutData() throws Exception
	{
		firstName.sendKeys(ReadData.readExcelFile(0, 0));
		lastName.sendKeys(ReadData.readExcelFile(0, 1));
		zipCode.sendKeys(ReadData.readExcelFile(0, 2));
		continueBtn.click();
		return driver.getCurrentUrl();
	}
}
