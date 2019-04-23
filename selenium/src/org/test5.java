package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement btnlogin = driver.findElement(By.xpath("//span[contains(text(),'Create')]"));
		String name=btnlogin.getText();
		System.out.println("Create an account");
		driver.quit();
		
		
		
	}
	
}
