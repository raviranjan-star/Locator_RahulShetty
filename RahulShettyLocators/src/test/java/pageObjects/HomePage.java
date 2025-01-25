package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//constructor
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//locators
		@FindBy(xpath="//input[@id='inputUsername']") WebElement txtUsername;
		@FindBy(xpath="//input[@placeholder='Password']") WebElement txtpassword;
		@FindBy(xpath="//input[@id='chkboxOne']") WebElement chkRemUsername;
		@FindBy(xpath="//input[@id='chkboxTwo']") WebElement chkPrivacy;
		@FindBy(xpath="//a[normalize-space()='Forgot your password?']") WebElement btnForgotYourPassword;
		@FindBy(xpath="//button[normalize-space()='Sign In']") WebElement btnSignIn;
		@FindBy(xpath="//p[@class='error']") WebElement msgIncorrectUsernameOrPasswod;
		@FindBy(xpath="//input[@placeholder='Name']") WebElement txtName;
		@FindBy(xpath="//input[@placeholder='Email']") WebElement txtEmail;
		@FindBy(xpath="//input[@placeholder='Phone Number']") WebElement txtPhoneNumber;
		@FindBy(xpath="//button[normalize-space()='Reset Login']") WebElement btnResetLogin;
		@FindBy(xpath="//button[normalize-space()='Go to Login']") WebElement btnGoToLogin;
		@FindBy(xpath="//p[@class='infoMsg']") WebElement msgTemporaryPassword;
		@FindBy(xpath="//h2[contains(text(), 'Hello')]") WebElement msgreceved;
		@FindBy(xpath="//h2[contains(text(), 'Hello')]") WebElement logout;
		
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
		//
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
