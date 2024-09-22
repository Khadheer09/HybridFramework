package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage
{
	
	public Homepage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkmyaccout;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	public void clickaccount() 
	{
		lnkmyaccout.click();
	}
	public void clickregister() 
	{
		lnkRegister.click();
	}
}
