package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutOverviewPage extends TestBase{
	@FindBy(xpath = "//span[@class='title']") private WebElement checkoutLabel;
	@FindBy(xpath = "//div[@class='summary_value_label'][1]") private WebElement paymentInfoLabel;
	@FindBy(xpath = "//div[@class='summary_value_label'][2]") private WebElement shippingInfoLabel;
	@FindBy(xpath = "//div[@class='summary_total_label']") private WebElement totalAmmountLabel;
	@FindBy(xpath = "//button[@id='finish']") private WebElement finishBtn;
	public CheckoutOverviewPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCheckoutLabel()
	{
		return checkoutLabel.getText();
	}
	public String verifyPaymentInfoLabel()
	{
		return paymentInfoLabel.getText();
	}
	public String verifyShippingInfoLabel()
	{
		return shippingInfoLabel.getText();
	}
	public String verifyTotalAmmountLabel()
	{
		return totalAmmountLabel.getText();
	}
	public void verifyFinishBtn()
	{
		finishBtn.click();
	}
}
