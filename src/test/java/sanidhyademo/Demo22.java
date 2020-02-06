package sanidhyademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo22 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.get("https://www.flipkart.com/?gclid=Cj0KCQjwrMHsBRCIARIsAFgSeI2ZnOKmBOmLs6RXajt0kFYSsZoGPvoKaNC51UpBigIM3Z8gtroxnTcaAh3ZEALw_wcB&ef_id=Cj0KCQjwrMHsBRCIARIsAFgSeI2ZnOKmBOmLs6RXajt0kFYSsZoGPvoKaNC51UpBigIM3Z8gtroxnTcaAh3ZEALw_wcB:G:s&s_kwcid=AL!739!3!385838493336!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
	WebElement text=driver.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]"));
	text.sendKeys("9021208323");
	WebElement text1=driver.findElement(By.xpath("//input[@type='password']"));
	text1.sendKeys("9021208323");
	WebElement text3=driver.findElement(By.xpath("//button[@type='submit']"));
	text3.click();
	
}
}
