import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample2 {
  public static void main(String[] args) {
	//set the property
   System.setProperty("webdriver.gecko.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\geckodriver.exe");
   //launch browser
    WebDriver driver=new FirefoxDriver();
    //enter url
    driver.get("https://en-gb.facebook.com/");
    driver.get("https://www.amazon.in/");
   //quit
    driver.quit();
    
	  			
}
}

