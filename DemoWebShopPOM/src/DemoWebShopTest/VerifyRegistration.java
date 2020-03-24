package DemoWebShopTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import WebShopPOM.WebShopRegistrationPOM;

public class VerifyRegistration 
{
	@Test
	public void checkregistration()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		
		driver.manage().window().maximize();//to maximize the window
		WebShopRegistrationPOM reg=new WebShopRegistrationPOM(driver);
		reg.gender();
		reg.firstname("Anjali");
		reg.lastname("kakade");
		reg.enteremail("anjalik5@gmail.com");
		reg.enterpassword("Anjali");
		reg.confirmpassword("Anjali");
		reg.clickregister();
		reg.logout();
		driver.close();
	}
}
