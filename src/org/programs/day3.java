package org.programs;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {
		
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesan\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				
				WebDriver driver = new  ChromeDriver();
				driver.get("http://toolsqa.com/automation-practice-form/");
				
				WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
				firstName.sendKeys("Gaensh");
				
				WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
				lastName.sendKeys("moorthi");
				
				WebElement eMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
				eMail.sendKeys("moorthi@gmail");
				
				WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
				gender.click();
				
				
				
				
			}
}
