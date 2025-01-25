package testCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	WebDriverWait mywait;
	Properties p;
	@BeforeClass
	public void setup() throws IOException
	{
		FileInputStream file=new FileInputStream("./src//test//resources//Config.properties");
		p=new Properties();
		p.load(file);
		
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		
		mywait=new WebDriverWait(driver, Duration.ofSeconds(2));
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
