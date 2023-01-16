package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethod {
	public static void selectClass(WebElement ele, String options)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(options);
	}
}
