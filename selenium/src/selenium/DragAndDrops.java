package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrops {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement soure1 = driver.findElement(By.id("fourth"));
	WebElement element = driver.findElement(By.id("amt7"));
	Actions a=new Actions(driver);
	a.dragAndDrop(soure1, element).perform();
}}
