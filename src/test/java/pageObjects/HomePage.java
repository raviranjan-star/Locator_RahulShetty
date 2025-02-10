package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//locators
		@FindBy(xpath="//input[@id='inputUsername']") 
		@CacheLookup
		WebElement txtUsername;
		
		@FindBy(xpath="//input[@placeholder='Password']") 
		@CacheLookup
		WebElement txtpassword;
		
		@FindBy(xpath="//input[@id='chkboxOne']") 
		@CacheLookup
		WebElement chkRemUsername;
		
		@FindBy(xpath="//input[@id='chkboxTwo']") 
		@CacheLookup
		WebElement chkPrivacy;
		
		@FindBy(xpath="//a[normalize-space()='Forgot your password?']") 
		@CacheLookup
		WebElement btnForgotYourPassword;
		
		@FindBy(xpath="//button[normalize-space()='Sign In']") 
		@CacheLookup
		WebElement btnSignIn;
		
		@FindBy(xpath="//p[@class='error']") 
		@CacheLookup
		WebElement msgIncorrectUsernameOrPasswod;
		
		@FindBy(xpath="//input[@placeholder='Name']") 
		@CacheLookup
		WebElement txtName;
		
		@FindBy(xpath="//input[@placeholder='Email']") 
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(xpath="//input[@placeholder='Phone Number']") 
		@CacheLookup
		WebElement txtPhoneNumber;
		
		@FindBy(xpath="//button[normalize-space()='Reset Login']") 
		@CacheLookup
		WebElement btnResetLogin;
		
		@FindBy(xpath="//button[normalize-space()='Go to Login']") 
		@CacheLookup
		WebElement btnGoToLogin;
		
		@FindBy(xpath="//p[@class='infoMsg']") 
		@CacheLookup
		WebElement msgTemporaryPassword;
		
		@FindBy(xpath="//h2[contains(text(), 'Hello')]") 
		@CacheLookup
		WebElement msgreceved;
		
		@FindBy(xpath="//h2[contains(text(), 'Hello')]") 
		@CacheLookup
		WebElement logout;
		
		//methods
		public void enterUserName(String name)
		{
			txtUsername.sendKeys(name);
		}
		
		public void entertxtpassword(String password)
		{
			txtpassword.sendKeys(password);
		}
		
		public void clickchkRemUsername()
		{
			if(!chkRemUsername.isSelected())
			chkRemUsername.click();
		}
		
		public void clickchkPrivacy()
		{
			if(!chkPrivacy.isSelected())
				chkPrivacy.click();
		}
		
		public void clickbtnSignIn()
		{
			btnSignIn.click();
		}
		
		public void clickbtnForgotYourPassword()
		{
			btnForgotYourPassword.click();
		}
		
		public String msgIncorrectUsernameOrPasswod()
		{
			String msg=msgIncorrectUsernameOrPasswod.getText();
			return msg;
		}
		
		public void entertxtName(String name)
		{
			txtName.sendKeys(name);
		}
		
		public void entertxtEmail(String email)
		{
			txtEmail.sendKeys(email);
		}
		
		public void txtPhoneNumber(String phn)
		{
			txtPhoneNumber.sendKeys(phn);
		}
		
		public void clickbtnResetLogin()
		{
			btnResetLogin.click();
		}
		
		public String getmsgTemporaryPassword()
		{
			String msg=msgTemporaryPassword.getText().split("'")[1];
			return msg;
		}
		
		public void clickbtnGoToLogin()
		{
			btnGoToLogin.click();
		}
		
		public String msgrec()
		{
			String name =msgreceved.getText().substring(6).replace(",", "");
			return name;
		}
		
		public void logOut()
		{
			logout.click();
		}
}
