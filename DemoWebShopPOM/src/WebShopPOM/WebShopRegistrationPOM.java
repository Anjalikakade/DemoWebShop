package WebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebShopRegistrationPOM 
{
	WebDriver driver;
	By gender=By.id("gender-female");
	By firstname=By.name("FirstName");
	By lastname= By.name("LastName");
	By email=By.id("Email");
	By password=By.id("Password");
	By confirmPassword=By.id("ConfirmPassword");
	By register=By.xpath("//input[@id='register-button']");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	public WebShopRegistrationPOM (WebDriver driver)
	{
		this.driver=driver;
	}
	public void gender()
	{
		driver.findElement(gender).click();
	}
	
	public void firstname(String fname)
	{
		driver.findElement(firstname).sendKeys(fname);
	}
	public void lastname(String lname)
	{
		driver.findElement(lastname).sendKeys(lname);
	}
	public void enteremail(String emailid)
	{
		driver.findElement(email).sendKeys(emailid);
	}
	public void enterpassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void confirmpassword(String cpass)
	{
		driver.findElement(confirmPassword).sendKeys(cpass);
	}
	
	public void clickregister()
	{
		driver.findElement(register).click();;
	}
	public void logout()
	{
		driver.findElement(logout).click();;
	}
}
