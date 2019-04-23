package selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement btn = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(btn);
		WebElement btn2 = driver.findElement(By.name("fldLoginUserId"));
		btn2.sendKeys("zgfsgsgdd");
//Thread.sleep(8000);
		WebElement btnclick = driver.findElement(By.xpath("//img[@alt='continue']"));
		btnclick.click();
		//Alert k = driver.switchTo().alert();
		//k.accept();
		WebElement lk = driver.findElement(By.name("fldPassword"));
		lk.sendKeys("karthik");
	
		
		
		
		
	}	

}
