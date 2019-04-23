  
package sample3;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {
public static void main(String[] args) {
	//set the property
	System.setProperty("webdriver.chrome.driver","D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\chromedriver.exe");
	//launch browser
	ChromeDriver driver =new ChromeDriver();
	//enter url
	driver.get("https://en-gb.facebook.com/");
	
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	driver.quit();
			

}

}
