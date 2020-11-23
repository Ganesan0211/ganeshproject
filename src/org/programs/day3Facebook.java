package org.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day3Facebook {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesan\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
						
			WebDriver driver = new  ChromeDriver();
			driver.get("https://www.flipkart.com/");
				
			WebElement logIn  = driver.findElement(By.xpath("//a[@class='_3Ep39l']"));
			logIn.click();
			
			WebElement phNum = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		
			phNum.sendKeys("123455678");
			
				
					
					
				}
		
		
}
