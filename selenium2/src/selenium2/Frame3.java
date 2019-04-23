package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement btnclick = driver.findElement(By.className("login_button"));
		btnclick.click();
		//WebElement w = driver.findElement(By.className("col-lg-6 col-md-6 col-sm-6 user_details"));
		WebElement txt = driver.findElement(By.className("form-control"));
		txt.sendKeys("karthiok");
		WebElement pwdd = driver.findElement(By.id("label2"));
		pwdd.sendKeys("11235");
		
		
		
	}

}
