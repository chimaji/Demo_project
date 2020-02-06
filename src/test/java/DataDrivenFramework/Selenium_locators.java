package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_locators {
	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com/m/register?URL=https://www.firstcry.com");
		
		driver.findElement(By.id("usrname")).sendKeys("chimaji jagannath kolekar");
		driver.findElement(By.name("usrmb")).sendKeys("9021208323");
		driver.findElement(By.name("usremail")).sendKeys("chimajikolekar@gmail.com");
		driver.findElement(By.id("usrpass")).sendKeys("Chimaji23@");
		driver.findElement(By.className("chk-box show-password")).click();
		driver.findElement(By.id("continueid")).click();
	    
	    
		
		
	}

}
