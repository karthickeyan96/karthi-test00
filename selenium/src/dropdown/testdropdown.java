package dropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testdropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement  dDnmonths= driver.findElement(By.id("month"));
		Select s=new Select(dDnmonths);
		List<WebElement> emp=s.getOptions();
			String name = emp.getattrib
			System.out.println(name);
			driver.quit();
			
		
		
	}

}
