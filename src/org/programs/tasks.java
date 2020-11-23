package org.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class tasks {
		

	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Ganesan\\eclipse-workspace\\Selenium\\drivers\\IEDriverServer.exe");

	WebDriver driver = new InternetExplorerDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
			
			
			}
	
}
