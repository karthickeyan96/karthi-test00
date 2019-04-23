package selenium2;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement btn = driver.findElement(By.name("proceed"));
		btn.click();
		org.openqa.selenium.Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
			
		

}
}
