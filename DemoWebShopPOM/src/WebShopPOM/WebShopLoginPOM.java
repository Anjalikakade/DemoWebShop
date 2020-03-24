package WebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebShopLoginPOM
{
	WebDriver driver;
	By email=By.id("Email");
	By password=By.name("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
	
	public WebShopLoginPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enteremail(String emailid)
	{
		driver.findElement(email).sendKeys(emailid);
	}
	
	public void enterpassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}

}
