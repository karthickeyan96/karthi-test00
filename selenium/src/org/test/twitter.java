package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login?lang=en");
		WebElement txtname = driver.findElement(By.name("session[username_or_email]"));
		txtname.sendKeys("karthik");
		WebElement txtpass = driver.findElement(By.name("session[password]"));
		txtpass.sendKeys("karthikeyan");
		driver.quit();
		
		
	}
	
}
