package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class Gettext {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ddn =driver.findElement(By.id("month"));
		Select s=new Select(ddn);
		System.out.println();
		System.out.println("enhanced for loop");
		List<WebElement>emp=s.getOptions();
		for (WebElement v : emp) {
		String name=v.getAttribute("values");
		System.out.println("name");
			
			
			
		}
			
			
			
		}
		
	}


