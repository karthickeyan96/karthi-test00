package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		login.click();
		WebElement frm1 = driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
		WebElement logfrm = driver.findElement(By.xpath("//span[user-actions='login_clicked']"));
		driver.switchTo().frame(logfrm);
		logfrm.click();
		
	}
}
