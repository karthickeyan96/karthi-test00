package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		//type cast
		JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript(arguments, arg1)		
			}
		
	}

