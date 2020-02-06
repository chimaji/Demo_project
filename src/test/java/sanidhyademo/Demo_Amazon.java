package sanidhyademo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Amazon {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.firstcry.com/?&ref=SEM_GSN_Brand_FirstCry_India&gclid=Cj0KCQjwrMHsBRCIARIsAFgSeI2pJlfyPkB-kMG9K1EXHeJulAiuyCQgTS4Ue8yhYvxCTHOgxAeNR9EaAr4cEALw_wcB");
         WebElement text=driver.findElement(By.xpath("//input[@type='search']"));
                   text.sendKeys("baby");
	List<WebElement> t=driver.findElements(By.xpath("//ul/li/child::span[@class='edittext']"));
	for (int i = 0; i < t.size(); i++) {
    WebElement current=t.get(i);
    System.out.println(current.getText());
    
    if(current.getText().equals("kids clothes")) {
    	current.click();
    }
    	
	}		
		
}

}
