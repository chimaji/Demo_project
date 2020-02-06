package sanidhyademo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDemo {
public	WebDriver driver ;

	public void setupTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
	}

	public void runGoogleSearchPage() {
		// GoogleSearchPageAdvanced page=new GoogleSearchPageAdvanced(driver);
		// page.inputSearchText();
		// page.selectTextFromSuggestion();
	}

	public void closeTest(){
	{
		driver.close();
		driver.quit();
	}
	

//	WebDriverManager.chromedriver().setup();

//		WebElement text = driver.findElement(By.name("q"));
	// text.sendKeys("irctc");

	// List<WebElement> option =
	// driver.findElements(By.xpath("//ul/li/div/div[@role='option']"));
	

		/*
		 * WebElement current = option.get(i); System.out.println(current.getText()); if
		 * (current.getText().equals("irctc customer care")) { current.click(); } }
		 */
		// driver.quit();

	
}
}