package testroomsoom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.I1;

public class Masterclas implements I1 {
	
	WebDriver driver;
	@BeforeTest
	void open_browser()
	{
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
	
	@Test
	void to_verifypage() {
	WebElement we = driver.findElement(xpath_verify);
	System.out.println(we.getText());
	if(we.getText().equals("FEATURES ITEMS")) 
	{
		System.out.println("Test case pass");
	}
		
	else 
	{
		System.out.println("Test case fail");
	}
	}
	
	@Test
	void features_item_button()
	{
		driver.findElement(xpath_button).click();
	}}