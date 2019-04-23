package selenium2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMIjfbV_P7H4QIVQaaWCh3TlA1TEAAYASAAEgKcsvD_BwE_k_&gclid=EAIaIQobChMIjfbV_P7H4QIVQaaWCh3TlA1TEAAYASAAEgKcsvD_BwE");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 7 plus");
		WebElement iphone = driver.findElement(By.className("nav-input"));
		iphone.click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		String single = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String eachid : all) {
			if(!single.equals(eachid)) {
				driver.switchTo().window(eachid);
				driver.manage().window().maximize();
		
				
				
			}
			
		}
	
	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		WebElement g = driver.findElement(By.xpath("//span[@style='text-decoration: inherit; white-space: nowrap;']"));
		String text = g.getText();
		System.out.println(text);
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		
			
		}
		
	}

