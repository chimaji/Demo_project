package screenshotExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.Utility;

public class ItestResult_Example {
WebDriver driver;
@Test
public void takeScreenshot() throws Exception
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.firstcry.com/");
Utility.captureScreenShot(driver, "mainpage");
driver.findElement(By.id("ShipFirstName")).sendKeys("chimaji kolekar");
}

@AfterMethod
public void failedTestCapture(ITestResult result) throws Exception
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		Utility.captureScreenShot(driver, result.getName());
	}
	driver.close();
	}
}
