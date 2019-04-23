package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclips\\New folder\\eclipse\\karthik\\selenium2\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String niri=driver.getTitle();
		System.out.println(niri);
		String current=driver.getCurrentUrl();
		System.out.println(current);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
