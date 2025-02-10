package testBase;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	protected static WebDriver driver;
	WebDriverWait mywait;
	protected static Properties p;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) throws IOException
	{
		FileInputStream file=new FileInputStream("./src//test//resources//Config.properties");
		p=new Properties();
		p.load(file);
		
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		case "edge":driver=new EdgeDriver();break;
		default:System.out.println("Invallid Browser");return;
		}
		
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
