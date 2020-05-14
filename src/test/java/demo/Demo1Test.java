package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1Test {
	WebDriver d;
	@Test
	public void titletest()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.google.com");
		System.out.println("The title of the page is : "+d.getTitle());
		d.quit();
	}
}
