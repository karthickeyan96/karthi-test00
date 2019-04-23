package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://twitter.com/login?lang=en");
WebElement txtmail = driver.findElement(By.name("session[username_or_email]"));
txtmail.sendKeys("monizraj96@gmail.com");
WebElement txtpass = driver.findElement(By.name("session[password]"));
txtpass.sendKeys("ardmoniz");
WebElement btnlogin = driver.findElement(By.xpath("button[@type='submit']"));
btnlogin.click();
WebElement nick=driver.findElement(By.xpath("input[@value='1']"));	

nick.click();

}
}