package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement btn = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btn).perform();
		WebElement btnacc = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		
		btnacc.click();
		
		
		
	}

}
