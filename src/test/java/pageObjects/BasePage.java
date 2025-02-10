package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected static WebDriver driver;
	
	BasePage(WebDriver driver)
	{
		BasePage.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
