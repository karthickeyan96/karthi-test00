package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtmail=driver.findElement(By.id("u_0_o"));
		txtmail.sendKeys("karthik");
		WebElement txtpas=driver.findElement(By.id("u_0_v"));
		txtpas.sendKeys("karthikeyan");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@value='2']"));
		btnlogin.click();
		driver.quit();
		
		
		
		
		
		
		
	}
}
