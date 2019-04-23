package dropdown;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.xpath;

public class WindowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement btn = driver.findElement(By.xpath("//a[text()='New User Activation']"));
		btn.click();
		String pwd=driver.getWindowHandle();
		System.out.println(pwd);
		
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		for (String eachwindowid : allwindows) {
			if(!pwd.equals(eachwindowid)) {
			driver.switchTo().window(eachwindowid);
			WebElement txtusename=driver.findElement(By.id("fldUId"));
			txtusename.sendKeys("kaerthik");
			}
			
			
		}
			
		}
			
		}				


