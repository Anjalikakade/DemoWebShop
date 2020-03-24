package DemoWebShopTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import WebShopPOM.WebShopLoginPOM;

public class VerifyLogin
{
	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.manage().window().maximize();//to maximize the window
		
		WebShopLoginPOM log= new WebShopLoginPOM(driver);
		log.enteremail("anjalik2997@gmail.com");
		log.enterpassword("Anjali");
		log.clicklogin();
		driver.close();
	}

}
