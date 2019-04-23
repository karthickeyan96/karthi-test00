package selenium2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ss=(TakesScreenshot)driver;
		File s=ss.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File take=new File("D:\\eclips\\screenshot\\facebookscreen.png");
		FileUtils.copyFile(s, take);
		driver.quit();
	}

}
