package org;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotSample {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions curser=new Actions(driver);
		curser.contextClick(gmail).perform();
		Robot r=new Robot() ;
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
			
		
		}
		
		

		
				
		

}
