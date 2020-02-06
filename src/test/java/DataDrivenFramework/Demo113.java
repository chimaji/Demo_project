package DataDrivenFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo113 {
	WebDriver driver;

	@Test(dataProvider = "ChimajiData")
	public void testdata(String search, String result) {
		System.out.println(search + "          ||      " + result);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.com");
		WebElement test = driver.findElement(By.name("q"));
		test.sendKeys(search);
		List<WebElement> test1 = driver.findElements(By.xpath("//ul/li/div/div[@role='option']"));
		for (int i = 0; i < test1.size(); i++) {
			WebElement test2 = test1.get(i);
			test2.click();
		}
	}

	@DataProvider(name = "ChimajiData")
	public Object[][] getdata() {
		String path = System.getProperty("user.dir");
		Object[][] data = readexceldata(path + "/ecxcel/ChimajiExcel.xlsx", "Sheet1");
		return data;
	}

	public Object[][] readexceldata(String excelpath, String sheetname) {
		Demo112 demo112 = new Demo112(excelpath, sheetname);
		int rowcount = demo112.getrowcount();
		int coloumncount = demo112.getcoloumncount();
		Object[][] data = new Object[rowcount][coloumncount];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < coloumncount; j++) {
				data[i][j] = demo112.getcelldatavalue(i, j);
			}
		}
		return data;
	}
}
