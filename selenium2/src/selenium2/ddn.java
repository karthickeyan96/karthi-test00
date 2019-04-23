package selenium2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddn {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement ddnbtn = d.findElement(By.id("month"));
		Select s=new Select(ddnbtn);
		
		//enhanced for loop
		System.out.println();System.out.println("enhanced for loop");
		List<WebElement>emp=s.getOptions();
		
		for (WebElement v : emp) {
			String name=v.getAttribute("value");
			System.out.println(name);
			
			
			
		}
			
		}
			
		
		
				
	}


