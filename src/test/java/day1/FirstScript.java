package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstScript {
	
	@Test
	void open_page()
	{
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
		
	}
	}
