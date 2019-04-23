package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowscreen {
	
	public static void main(String[] args) {
		System.setProperty("weebdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//WebElement sign = driver.findElement(By.className("nav-line-1"));
		//sign.click();
	}

}
