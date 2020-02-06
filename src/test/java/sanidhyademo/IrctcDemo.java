package sanidhyademo;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("irctc");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> option = driver.findElements(By.xpath("//ul/li/div/div[@role='option']"));
		for (int i = 0; i < option.size(); i++) {
			WebElement current = option.get(i);
			System.out.println(current.getText());
			if (current.getText().equals("irctc customer care")) {
				current.click();
			}
		}
		driver.quit();
	}
}
