package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotationandpriority {
	
	WebDriver driver;
	
	@Test
	void Openapp()
	{
		driver =new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/v4");
	}

}
