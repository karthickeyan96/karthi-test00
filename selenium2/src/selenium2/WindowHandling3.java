package selenium2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling3 {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=brand_search&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=b,%2Bsnapdeal");
		WebElement btn = driver.findElement(By.name("keyword"));
		btn.sendKeys("i phone 7");
		WebElement search = driver.findElement(By.className("searchTextSpan"));
		search.click();
		WebElement phone = driver.findElement(By.className("product-title "));
		phone.click();
		String pwd = driver.getWindowHandle();
		Set<String> cld = driver.getWindowHandles();
		for (String each : cld) {
			if (!pwd.equals(each)) {
				driver.switchTo().window(each);
				WebElement add = driver.findElement(By.className("intialtext"));
				add.click();
				WebElement findElement = driver.findElement(By.id("username"));
				findElement.sendKeys("1234567890");
				
				
			}
			
		}
			
		}
	}


