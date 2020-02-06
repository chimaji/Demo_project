package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void captureScreenShot(WebDriver driver,String screenshotName) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File img=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File("E:\\java_program\\sanidhyademo\\screenshot\\"+screenshotName+".png"));
		System.out.println("screenshot is captured");
		
	}
	
}
