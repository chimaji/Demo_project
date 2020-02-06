package sanidhyademo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo11 {
	WebDriver driver;
@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}
@org.testng.annotations.Test
	public void autosuugestion() {
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("selenium");
		text.sendKeys(Keys.ENTER);
		List<WebElement> text1 = driver.findElements(By.xpath("//cite"));
		for (int i = 0; i < text1.size(); i++) {
			WebElement current = text1.get(i);
			System.out.println(current.getText());
			if (current.getText().equals("selenium maven dependency")) {
				current.click();
			}
		}

	}
@AfterTest
	public void closetest() {
		driver.close();
		driver.quit();
	}
}
 