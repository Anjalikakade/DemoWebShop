package WebShopPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory 
{
	WebDriver driver;
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement login;
	
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement logout;
	public LoginPageFactory (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void sendemail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void sendpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void login()
	{
		login.click();
	}
	public void logout()
	{
		logout.click();
	}

}
