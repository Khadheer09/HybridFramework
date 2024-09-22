package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.Homepage;
import testBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verify_account_registration() 
	{
		
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		logger.debug("This is a debug log message");
		try {
		logger.info("satarting of TC001_AccountRegistrationTest");
		Homepage hp=new Homepage(driver);
		hp.clickaccount();
		hp.clickregister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName(randomeString());
		regpage.setLastName(randomeString());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		logger.info("validating TC001_AccountRegistrationTest");
		String confmsg=regpage.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			logger.debug("Debugs");
			Assert.fail();
		}
		logger.info("test fineshed");
	}
	
}
