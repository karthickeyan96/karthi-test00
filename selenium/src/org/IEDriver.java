package org;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEDriver {
	public static void main(String[] args) {
	//set property
		System.setProperty("webdriver.ie.driver", "D:\\eclips\\New folder\\eclipse\\karthik\\selenium\\lib\\driver\\IEDriverServer.exe");
		//launch browser
		WebDriver karthi=new InternetExplorerDriver();
		//get url
		karthi.get("https://www.google.com");
		//quit
		karthi.quit();
		
	}

}
