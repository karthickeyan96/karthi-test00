package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		WebElement btn = driver.findElement(By.xpath("//p['Sign In']"));
		btn.click();
		WebElement btntxt = driver.findElement(By.className("auth-content "));
		
		WebElement btnclk = driver.findElement(By.name("USER"));
		btnclk.sendKeys("karthik");
		WebElement btnc = driver.findElement(By.id("loginHeaderPassword"));
		btnc.sendKeys("karthi");
		driver.quit();
		
		
		
		
		
	}

}

