package selenium2;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class select {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement btn = driver.findElement(By.xpath("//input[@value='2']"));
		btn.click();
	boolean b=btn.isSelected();
	System.out.println(b);
	
		
		
		

}
}