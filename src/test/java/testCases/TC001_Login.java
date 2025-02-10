package testCases;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
public class TC001_Login extends BaseClass{
	
	@Test
	public void AccountLogin() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.enterUserName(p.getProperty("username"));
		hp.entertxtpassword(p.getProperty("pass"));
		hp.clickchkRemUsername();
		hp.clickchkPrivacy();
		hp.clickbtnSignIn();
		Thread.sleep(1000);
		if(hp.msgIncorrectUsernameOrPasswod().equals("* Incorrect username or password"))
		{
			hp.clickbtnForgotYourPassword();
			Thread.sleep(1000);
			hp.entertxtName(p.getProperty("username"));
			hp.entertxtEmail(p.getProperty("email"));
			hp.txtPhoneNumber(p.getProperty("phn"));
			hp.clickbtnResetLogin();
			Thread.sleep(1000);
			String password=hp.getmsgTemporaryPassword();
			hp.clickbtnGoToLogin();
			Thread.sleep(1000);
			hp.enterUserName(p.getProperty("username"));
			hp.entertxtpassword(password);
			hp.clickchkRemUsername();
			hp.clickchkPrivacy();
			hp.clickbtnSignIn();
		}
		//System.out.println(hp.msgrec());
		Assert.assertEquals(p.getProperty("username"),hp.msgrec() );
		hp.logOut();
	}

}
