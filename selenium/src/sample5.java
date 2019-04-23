
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sample5 {

	
	public static void main(String[] args) {
		//set the property
		System.setProperty("webdriver.ie.driver","D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\IEDriverServer.exe");
		//launch browser
		WebDriver driver=new InternetExplorerDriver();
	// enter url
		driver.get("https://en-gb.facebook.com/");
		//quit
		driver.quit();
	}
}
