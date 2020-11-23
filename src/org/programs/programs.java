package org.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class programs {
	
		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesan\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				
			WebDriver driver = new  ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			List<WebElement> tbl = driver.findElements(By.xpath("//table//tr"));
			for (int i = 0; i < tbl.size(); i++) {
				WebElement element = tbl.get(i);
				String text = element.getText();
				System.out.println(text);
			}}

			
	

