package screenshotExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.Utility;

public class ScreenShot {

	
	@Test
	public void captureScreenShot() throws Exception
	{   
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		Utility.captureScreenShot(driver, "Browser started");
		
		driver.findElement(By.id("email")).sendKeys("chimajikolekar23@gmail.com");
		
		Utility.captureScreenShot(driver, "type mail id");
		driver.quit();
	}
}
