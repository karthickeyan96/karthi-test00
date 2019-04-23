package selenium2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClasss {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karthik");
		Actions acc=new Actions(driver);
		acc.doubleClick(email).perform();
		
		Robot r=new Robot();
		
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		
		WebElement pas = driver.findElement(By.id("pass"));	
			pas.click();
			
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
				
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
			
		}
		
		
	


