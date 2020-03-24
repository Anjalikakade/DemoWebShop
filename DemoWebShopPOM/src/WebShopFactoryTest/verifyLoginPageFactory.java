package WebShopFactoryTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import WebShopPageFactory.LoginPageFactory;

public class verifyLoginPageFactory
{
	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();//to maximize the window
		
		LoginPageFactory login=PageFactory.initElements(driver, LoginPageFactory.class);
		login.sendemail("anjalik2997@gmail.com");
		login.sendpassword("Anjali");
		login.login();
		login.logout();
		driver.close();
	}
	
}
