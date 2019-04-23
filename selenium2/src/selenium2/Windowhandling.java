package selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Windowhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement btnnew = driver.findElement(By.xpath("//a[text()='New User Activation']"));
		btnnew.click();
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		for (String eachwindowid : allwindows) {
			if(!pwid.equals(eachwindowid)) {
				driver.switchTo().window(eachwindowid);
				
				
				
			WebElement username = driver.findElement(By.name("fldUId"));
			username.sendKeys("karthik");
			
			
		}
			
		}
		
		
	}}