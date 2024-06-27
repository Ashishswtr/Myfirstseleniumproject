package getreport;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Autoreport {
public static void main(String[] args) {
	
	String path = "C:\\Users\\Ashish Chauhan\\eclipse-workspace\\mavenproject\\getreport\\";
	
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	extentReports = new ExtentReports(path + "First.html");
	extentTest = extentReports.startTest("Demo project");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Google"))
	{
		extentTest.log(LogStatus.PASS, "Test case pass");
		
	}
	
	else {
		extentTest.log(LogStatus.FAIL, "Test case fail");
	}
	
	extentReports.endTest(extentTest);
	extentReports.flush();
	
}
}