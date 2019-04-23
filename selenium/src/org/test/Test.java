package org.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fcard%3Fie%3DUTF8%26ref_%3Dcust_rec_intestitial_signin&prevRID=VE6XZHXBKBZQSKKQWE32&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&failedSignInCount=0&pageId=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement txtmail = driver.findElement(By.id("ap_email"));
		txtmail.sendKeys("karthick");
		WebElement txtpas = driver.findElement(By.id("ap_password"));
		txtpas.sendKeys("karthicksuburaj");
		String title =driver.getTitle();
		System.out.println("title");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.quit();  
		
		   
		
		 
		
		
		

	}

}
