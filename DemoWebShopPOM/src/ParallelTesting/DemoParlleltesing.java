package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class DemoParlleltesing 
{
	@Test
	public void chrome1()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Current Thread:"+Thread.currentThread().getId());
		driver.get("http://demowebshop.tricentis.com/login");
		driver.close();
		
	}
	@Test
	public void firefox()
	{
		System.setProperty("webdriver.gecko.driver","E:\\Jar files\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		System.out.println("Current Thread Name:"+Thread.currentThread().getId());
		driver1.get("http://demowebshop.tricentis.com/");
		driver1.close();
	}

	@Test
	public void chrome2()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver2=new ChromeDriver();
		System.out.println("Current Thread Name is :"+Thread.currentThread().getId());
		driver2.get("http://demowebshop.tricentis.com/register");
		driver2.close();
	}

}
